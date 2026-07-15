declare module '@apiverve/carddeckshuffler' {
  export interface carddeckshufflerOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface carddeckshufflerResponse {
    status: string;
    error: string | null;
    data: CardDeckShufflerData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface CardDeckShufflerData {
      totalCards:     number | null;
      decksUsed:      number | null;
      includesJokers: boolean | null;
      shuffleMethod:  null | string;
      cards:          BottomCard[];
      topCard:        BottomCard;
      bottomCard:     BottomCard;
      sampleHand:     BottomCard[];
  }
  
  interface BottomCard {
      rank:  null | string;
      suit:  Suit | null;
      card:  null | string;
      short: null | string;
  }
  
  enum Suit {
      Clubs = "Clubs",
      Diamonds = "Diamonds",
      Hearts = "Hearts",
      Spades = "Spades",
  }

  export default class carddeckshufflerWrapper {
    constructor(options: carddeckshufflerOptions);

    execute(callback: (error: any, data: carddeckshufflerResponse | null) => void): Promise<carddeckshufflerResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: carddeckshufflerResponse | null) => void): Promise<carddeckshufflerResponse>;
    execute(query?: Record<string, any>): Promise<carddeckshufflerResponse>;
  }
}

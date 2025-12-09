declare module '@apiverve/carddeckshuffler' {
  export interface carddeckshufflerOptions {
    api_key: string;
    secure?: boolean;
  }

  export interface carddeckshufflerResponse {
    status: string;
    error: string | null;
    data: CardDeckShufflerData;
    code?: number;
  }


  interface CardDeckShufflerData {
      totalCards:     number;
      decksUsed:      number;
      includesJokers: boolean;
      shuffleMethod:  string;
      cards:          BottomCard[];
      topCard:        BottomCard;
      bottomCard:     BottomCard;
      sampleHand:     BottomCard[];
  }
  
  interface BottomCard {
      rank:  string;
      suit:  Suit;
      card:  string;
      short: string;
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

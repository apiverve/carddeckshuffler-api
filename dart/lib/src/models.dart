/// Response models for the Card Deck Shuffler API.

/// API Response wrapper.
class CarddeckshufflerResponse {
  final String status;
  final dynamic error;
  final CarddeckshufflerData? data;

  CarddeckshufflerResponse({
    required this.status,
    this.error,
    this.data,
  });

  factory CarddeckshufflerResponse.fromJson(Map<String, dynamic> json) => CarddeckshufflerResponse(
    status: json['status'] as String? ?? '',
    error: json['error'],
    data: json['data'] != null ? CarddeckshufflerData.fromJson(json['data']) : null,
  );

  Map<String, dynamic> toJson() => {
    'status': status,
    if (error != null) 'error': error,
    if (data != null) 'data': data,
  };
}

/// Response data for the Card Deck Shuffler API.

class CarddeckshufflerData {
  int? totalCards;
  int? decksUsed;
  bool? includesJokers;
  String? shuffleMethod;
  List<CarddeckshufflerDataCardsItem>? cards;
  CarddeckshufflerDataTopCard? topCard;
  CarddeckshufflerDataBottomCard? bottomCard;
  List<CarddeckshufflerDataSampleHandItem>? sampleHand;

  CarddeckshufflerData({
    this.totalCards,
    this.decksUsed,
    this.includesJokers,
    this.shuffleMethod,
    this.cards,
    this.topCard,
    this.bottomCard,
    this.sampleHand,
  });

  factory CarddeckshufflerData.fromJson(Map<String, dynamic> json) => CarddeckshufflerData(
      totalCards: json['total_cards'],
      decksUsed: json['decks_used'],
      includesJokers: json['includes_jokers'],
      shuffleMethod: json['shuffle_method'],
      cards: (json['cards'] as List?)?.map((e) => CarddeckshufflerDataCardsItem.fromJson(e)).toList(),
      topCard: json['top_card'] != null ? CarddeckshufflerDataTopCard.fromJson(json['top_card']) : null,
      bottomCard: json['bottom_card'] != null ? CarddeckshufflerDataBottomCard.fromJson(json['bottom_card']) : null,
      sampleHand: (json['sample_hand'] as List?)?.map((e) => CarddeckshufflerDataSampleHandItem.fromJson(e)).toList(),
    );
}

class CarddeckshufflerDataCardsItem {
  String? rank;
  String? suit;
  String? card;
  String? short;

  CarddeckshufflerDataCardsItem({
    this.rank,
    this.suit,
    this.card,
    this.short,
  });

  factory CarddeckshufflerDataCardsItem.fromJson(Map<String, dynamic> json) => CarddeckshufflerDataCardsItem(
      rank: json['rank'],
      suit: json['suit'],
      card: json['card'],
      short: json['short'],
    );
}

class CarddeckshufflerDataTopCard {
  String? rank;
  String? suit;
  String? card;
  String? short;

  CarddeckshufflerDataTopCard({
    this.rank,
    this.suit,
    this.card,
    this.short,
  });

  factory CarddeckshufflerDataTopCard.fromJson(Map<String, dynamic> json) => CarddeckshufflerDataTopCard(
      rank: json['rank'],
      suit: json['suit'],
      card: json['card'],
      short: json['short'],
    );
}

class CarddeckshufflerDataBottomCard {
  String? rank;
  String? suit;
  String? card;
  String? short;

  CarddeckshufflerDataBottomCard({
    this.rank,
    this.suit,
    this.card,
    this.short,
  });

  factory CarddeckshufflerDataBottomCard.fromJson(Map<String, dynamic> json) => CarddeckshufflerDataBottomCard(
      rank: json['rank'],
      suit: json['suit'],
      card: json['card'],
      short: json['short'],
    );
}

class CarddeckshufflerDataSampleHandItem {
  String? rank;
  String? suit;
  String? card;
  String? short;

  CarddeckshufflerDataSampleHandItem({
    this.rank,
    this.suit,
    this.card,
    this.short,
  });

  factory CarddeckshufflerDataSampleHandItem.fromJson(Map<String, dynamic> json) => CarddeckshufflerDataSampleHandItem(
      rank: json['rank'],
      suit: json['suit'],
      card: json['card'],
      short: json['short'],
    );
}

class CarddeckshufflerRequest {
  int? decks;
  bool? jokers;
  String? method;

  CarddeckshufflerRequest({
    this.decks,
    this.jokers,
    this.method,
  });

  Map<String, dynamic> toJson() => {
      if (decks != null) 'decks': decks,
      if (jokers != null) 'jokers': jokers,
      if (method != null) 'method': method,
    };
}

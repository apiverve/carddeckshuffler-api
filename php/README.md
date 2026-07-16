# Card Deck Shuffler API - PHP Package

Card Deck Shuffler is a tool for shuffling standard playing card decks. It supports multiple decks, optional jokers, and different shuffling methods to generate randomized card sequences for games and simulations.

## Installation

Install via Composer:

```bash
composer require apiverve/carddeckshuffler
```

## Getting Started

Get your API key at [APIVerve](https://apiverve.com)

### Basic Usage

```php
<?php

require_once 'vendor/autoload.php';

use APIVerve\Carddeckshuffler\Client;

// Initialize the client
$client = new Client('YOUR_API_KEY');

// Make a request
$response = $client->execute([
    'decks' => 1,
    'jokers' => ,
    'method' => 'fisher-yates'
]);

// Print the response
print_r($response);
```


### Error Handling

```php
use APIVerve\Carddeckshuffler\Client;
use APIVerve\Carddeckshuffler\Exceptions\APIException;
use APIVerve\Carddeckshuffler\Exceptions\ValidationException;

try {
    $response = $client->execute(['decks' => 1, 'jokers' => , 'method' => 'fisher-yates']);
    print_r($response['data']);
} catch (ValidationException $e) {
    echo "Validation error: " . implode(', ', $e->getErrors());
} catch (APIException $e) {
    echo "API error: " . $e->getMessage();
    echo "Status code: " . $e->getStatusCode();
}
```

### Debug Mode

```php
// Enable debug logging
$client = new Client(
    apiKey: 'YOUR_API_KEY',
    debug: true
);
```

## Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "total_cards": 52,
    "decks_used": 1,
    "includes_jokers": false,
    "shuffle_method": "fisher-yates",
    "cards": [
      {
        "rank": "8",
        "suit": "Spades",
        "card": "8 of Spades",
        "short": "8♠"
      },
      {
        "rank": "2",
        "suit": "Spades",
        "card": "2 of Spades",
        "short": "2♠"
      },
      {
        "rank": "Queen",
        "suit": "Hearts",
        "card": "Queen of Hearts",
        "short": "Q♥"
      },
      {
        "rank": "7",
        "suit": "Clubs",
        "card": "7 of Clubs",
        "short": "7♣"
      },
      {
        "rank": "Queen",
        "suit": "Spades",
        "card": "Queen of Spades",
        "short": "Q♠"
      },
      {
        "rank": "King",
        "suit": "Hearts",
        "card": "King of Hearts",
        "short": "K♥"
      },
      {
        "rank": "6",
        "suit": "Spades",
        "card": "6 of Spades",
        "short": "6♠"
      },
      {
        "rank": "Queen",
        "suit": "Diamonds",
        "card": "Queen of Diamonds",
        "short": "Q♦"
      },
      {
        "rank": "King",
        "suit": "Diamonds",
        "card": "King of Diamonds",
        "short": "K♦"
      },
      {
        "rank": "4",
        "suit": "Hearts",
        "card": "4 of Hearts",
        "short": "4♥"
      },
      {
        "rank": "7",
        "suit": "Hearts",
        "card": "7 of Hearts",
        "short": "7♥"
      },
      {
        "rank": "8",
        "suit": "Clubs",
        "card": "8 of Clubs",
        "short": "8♣"
      },
      {
        "rank": "4",
        "suit": "Spades",
        "card": "4 of Spades",
        "short": "4♠"
      },
      {
        "rank": "9",
        "suit": "Hearts",
        "card": "9 of Hearts",
        "short": "9♥"
      },
      {
        "rank": "Ace",
        "suit": "Diamonds",
        "card": "Ace of Diamonds",
        "short": "A♦"
      },
      {
        "rank": "Jack",
        "suit": "Diamonds",
        "card": "Jack of Diamonds",
        "short": "J♦"
      },
      {
        "rank": "Jack",
        "suit": "Hearts",
        "card": "Jack of Hearts",
        "short": "J♥"
      },
      {
        "rank": "2",
        "suit": "Clubs",
        "card": "2 of Clubs",
        "short": "2♣"
      },
      {
        "rank": "Jack",
        "suit": "Clubs",
        "card": "Jack of Clubs",
        "short": "J♣"
      },
      {
        "rank": "Queen",
        "suit": "Clubs",
        "card": "Queen of Clubs",
        "short": "Q♣"
      },
      {
        "rank": "9",
        "suit": "Spades",
        "card": "9 of Spades",
        "short": "9♠"
      },
      {
        "rank": "8",
        "suit": "Diamonds",
        "card": "8 of Diamonds",
        "short": "8♦"
      },
      {
        "rank": "10",
        "suit": "Spades",
        "card": "10 of Spades",
        "short": "10♠"
      },
      {
        "rank": "9",
        "suit": "Clubs",
        "card": "9 of Clubs",
        "short": "9♣"
      },
      {
        "rank": "4",
        "suit": "Clubs",
        "card": "4 of Clubs",
        "short": "4♣"
      },
      {
        "rank": "Ace",
        "suit": "Clubs",
        "card": "Ace of Clubs",
        "short": "A♣"
      },
      {
        "rank": "7",
        "suit": "Diamonds",
        "card": "7 of Diamonds",
        "short": "7♦"
      },
      {
        "rank": "7",
        "suit": "Spades",
        "card": "7 of Spades",
        "short": "7♠"
      },
      {
        "rank": "5",
        "suit": "Diamonds",
        "card": "5 of Diamonds",
        "short": "5♦"
      },
      {
        "rank": "10",
        "suit": "Clubs",
        "card": "10 of Clubs",
        "short": "10♣"
      },
      {
        "rank": "10",
        "suit": "Diamonds",
        "card": "10 of Diamonds",
        "short": "10♦"
      },
      {
        "rank": "6",
        "suit": "Hearts",
        "card": "6 of Hearts",
        "short": "6♥"
      },
      {
        "rank": "King",
        "suit": "Spades",
        "card": "King of Spades",
        "short": "K♠"
      },
      {
        "rank": "Jack",
        "suit": "Spades",
        "card": "Jack of Spades",
        "short": "J♠"
      },
      {
        "rank": "Ace",
        "suit": "Hearts",
        "card": "Ace of Hearts",
        "short": "A♥"
      },
      {
        "rank": "5",
        "suit": "Hearts",
        "card": "5 of Hearts",
        "short": "5♥"
      },
      {
        "rank": "King",
        "suit": "Clubs",
        "card": "King of Clubs",
        "short": "K♣"
      },
      {
        "rank": "10",
        "suit": "Hearts",
        "card": "10 of Hearts",
        "short": "10♥"
      },
      {
        "rank": "2",
        "suit": "Diamonds",
        "card": "2 of Diamonds",
        "short": "2♦"
      },
      {
        "rank": "Ace",
        "suit": "Spades",
        "card": "Ace of Spades",
        "short": "A♠"
      },
      {
        "rank": "3",
        "suit": "Clubs",
        "card": "3 of Clubs",
        "short": "3♣"
      },
      {
        "rank": "5",
        "suit": "Clubs",
        "card": "5 of Clubs",
        "short": "5♣"
      },
      {
        "rank": "8",
        "suit": "Hearts",
        "card": "8 of Hearts",
        "short": "8♥"
      },
      {
        "rank": "3",
        "suit": "Spades",
        "card": "3 of Spades",
        "short": "3♠"
      },
      {
        "rank": "6",
        "suit": "Clubs",
        "card": "6 of Clubs",
        "short": "6♣"
      },
      {
        "rank": "4",
        "suit": "Diamonds",
        "card": "4 of Diamonds",
        "short": "4♦"
      },
      {
        "rank": "2",
        "suit": "Hearts",
        "card": "2 of Hearts",
        "short": "2♥"
      },
      {
        "rank": "3",
        "suit": "Diamonds",
        "card": "3 of Diamonds",
        "short": "3♦"
      },
      {
        "rank": "9",
        "suit": "Diamonds",
        "card": "9 of Diamonds",
        "short": "9♦"
      },
      {
        "rank": "5",
        "suit": "Spades",
        "card": "5 of Spades",
        "short": "5♠"
      },
      {
        "rank": "3",
        "suit": "Hearts",
        "card": "3 of Hearts",
        "short": "3♥"
      },
      {
        "rank": "6",
        "suit": "Diamonds",
        "card": "6 of Diamonds",
        "short": "6♦"
      }
    ],
    "top_card": {
      "rank": "8",
      "suit": "Spades",
      "card": "8 of Spades",
      "short": "8♠"
    },
    "bottom_card": {
      "rank": "6",
      "suit": "Diamonds",
      "card": "6 of Diamonds",
      "short": "6♦"
    },
    "sample_hand": [
      {
        "rank": "8",
        "suit": "Spades",
        "card": "8 of Spades",
        "short": "8♠"
      },
      {
        "rank": "2",
        "suit": "Spades",
        "card": "2 of Spades",
        "short": "2♠"
      },
      {
        "rank": "Queen",
        "suit": "Hearts",
        "card": "Queen of Hearts",
        "short": "Q♥"
      },
      {
        "rank": "7",
        "suit": "Clubs",
        "card": "7 of Clubs",
        "short": "7♣"
      },
      {
        "rank": "Queen",
        "suit": "Spades",
        "card": "Queen of Spades",
        "short": "Q♠"
      }
    ]
  }
}
```

## Requirements

- PHP 7.4 or higher
- Guzzle HTTP client

## Documentation

For more information, visit the [API Documentation](https://docs.apiverve.com/ref/carddeckshuffler?utm_source=packagist&utm_medium=readme).

## Support

- Website: [https://apiverve.com/marketplace/carddeckshuffler?utm_source=php&utm_medium=readme](https://apiverve.com/marketplace/carddeckshuffler?utm_source=php&utm_medium=readme)
- Email: hello@apiverve.com

## License

This package is available under the [MIT License](LICENSE).

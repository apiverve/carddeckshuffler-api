# Card Deck Shuffler API - Go Client

Card Deck Shuffler is a tool for shuffling standard playing card decks. It supports multiple decks, optional jokers, and different shuffling methods to generate randomized card sequences for games and simulations.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Go client for the [Card Deck Shuffler API](https://apiverve.com/marketplace/carddeckshuffler?utm_source=go&utm_medium=readme)

---

## Installation

```bash
go get github.com/apiverve/carddeckshuffler-api/go
```

---

## Configuration

Before using the Card Deck Shuffler API client, you need to obtain your API key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=go&utm_medium=readme)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart?utm_source=go&utm_medium=readme)

The Card Deck Shuffler API documentation is found here: [https://docs.apiverve.com/ref/carddeckshuffler](https://docs.apiverve.com/ref/carddeckshuffler?utm_source=go&utm_medium=readme)

---

## Usage

```go
package main

import (
    "fmt"
    "log"

    "github.com/apiverve/carddeckshuffler-api/go"
)

func main() {
    // Create a new client
    client := carddeckshuffler.NewClient("YOUR_API_KEY")

    // Set up parameters
    params := map[string]interface{}{
        "decks": 1,
        "jokers": ,
        "method": "fisher-yates"
    }

    // Make the request
    response, err := client.Execute(params)
    if err != nil {
        log.Fatal(err)
    }

    fmt.Printf("Status: %s\n", response.Status)
    fmt.Printf("Data: %+v\n", response.Data)
}
```

---

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
        "rank": "3",
        "suit": "Hearts",
        "card": "3 of Hearts",
        "short": "3♥"
      },
      {
        "rank": "Ace",
        "suit": "Hearts",
        "card": "Ace of Hearts",
        "short": "A♥"
      },
      {
        "rank": "4",
        "suit": "Hearts",
        "card": "4 of Hearts",
        "short": "4♥"
      },
      {
        "rank": "Queen",
        "suit": "Spades",
        "card": "Queen of Spades",
        "short": "Q♠"
      },
      {
        "rank": "4",
        "suit": "Diamonds",
        "card": "4 of Diamonds",
        "short": "4♦"
      },
      {
        "rank": "7",
        "suit": "Hearts",
        "card": "7 of Hearts",
        "short": "7♥"
      },
      {
        "rank": "9",
        "suit": "Spades",
        "card": "9 of Spades",
        "short": "9♠"
      },
      {
        "rank": "10",
        "suit": "Hearts",
        "card": "10 of Hearts",
        "short": "10♥"
      },
      {
        "rank": "4",
        "suit": "Clubs",
        "card": "4 of Clubs",
        "short": "4♣"
      },
      {
        "rank": "2",
        "suit": "Diamonds",
        "card": "2 of Diamonds",
        "short": "2♦"
      },
      {
        "rank": "2",
        "suit": "Hearts",
        "card": "2 of Hearts",
        "short": "2♥"
      },
      {
        "rank": "Ace",
        "suit": "Diamonds",
        "card": "Ace of Diamonds",
        "short": "A♦"
      },
      {
        "rank": "Ace",
        "suit": "Spades",
        "card": "Ace of Spades",
        "short": "A♠"
      },
      {
        "rank": "Queen",
        "suit": "Clubs",
        "card": "Queen of Clubs",
        "short": "Q♣"
      },
      {
        "rank": "Jack",
        "suit": "Hearts",
        "card": "Jack of Hearts",
        "short": "J♥"
      },
      {
        "rank": "Jack",
        "suit": "Diamonds",
        "card": "Jack of Diamonds",
        "short": "J♦"
      },
      {
        "rank": "4",
        "suit": "Spades",
        "card": "4 of Spades",
        "short": "4♠"
      },
      {
        "rank": "2",
        "suit": "Spades",
        "card": "2 of Spades",
        "short": "2♠"
      },
      {
        "rank": "King",
        "suit": "Spades",
        "card": "King of Spades",
        "short": "K♠"
      },
      {
        "rank": "Queen",
        "suit": "Hearts",
        "card": "Queen of Hearts",
        "short": "Q♥"
      },
      {
        "rank": "Jack",
        "suit": "Spades",
        "card": "Jack of Spades",
        "short": "J♠"
      },
      {
        "rank": "6",
        "suit": "Clubs",
        "card": "6 of Clubs",
        "short": "6♣"
      },
      {
        "rank": "8",
        "suit": "Hearts",
        "card": "8 of Hearts",
        "short": "8♥"
      },
      {
        "rank": "6",
        "suit": "Spades",
        "card": "6 of Spades",
        "short": "6♠"
      },
      {
        "rank": "3",
        "suit": "Clubs",
        "card": "3 of Clubs",
        "short": "3♣"
      },
      {
        "rank": "King",
        "suit": "Clubs",
        "card": "King of Clubs",
        "short": "K♣"
      },
      {
        "rank": "10",
        "suit": "Spades",
        "card": "10 of Spades",
        "short": "10♠"
      },
      {
        "rank": "6",
        "suit": "Hearts",
        "card": "6 of Hearts",
        "short": "6♥"
      },
      {
        "rank": "7",
        "suit": "Diamonds",
        "card": "7 of Diamonds",
        "short": "7♦"
      },
      {
        "rank": "Ace",
        "suit": "Clubs",
        "card": "Ace of Clubs",
        "short": "A♣"
      },
      {
        "rank": "3",
        "suit": "Spades",
        "card": "3 of Spades",
        "short": "3♠"
      },
      {
        "rank": "King",
        "suit": "Diamonds",
        "card": "King of Diamonds",
        "short": "K♦"
      },
      {
        "rank": "5",
        "suit": "Clubs",
        "card": "5 of Clubs",
        "short": "5♣"
      },
      {
        "rank": "Jack",
        "suit": "Clubs",
        "card": "Jack of Clubs",
        "short": "J♣"
      },
      {
        "rank": "8",
        "suit": "Diamonds",
        "card": "8 of Diamonds",
        "short": "8♦"
      },
      {
        "rank": "9",
        "suit": "Diamonds",
        "card": "9 of Diamonds",
        "short": "9♦"
      },
      {
        "rank": "5",
        "suit": "Hearts",
        "card": "5 of Hearts",
        "short": "5♥"
      },
      {
        "rank": "Queen",
        "suit": "Diamonds",
        "card": "Queen of Diamonds",
        "short": "Q♦"
      },
      {
        "rank": "8",
        "suit": "Clubs",
        "card": "8 of Clubs",
        "short": "8♣"
      },
      {
        "rank": "6",
        "suit": "Diamonds",
        "card": "6 of Diamonds",
        "short": "6♦"
      },
      {
        "rank": "8",
        "suit": "Spades",
        "card": "8 of Spades",
        "short": "8♠"
      },
      {
        "rank": "5",
        "suit": "Diamonds",
        "card": "5 of Diamonds",
        "short": "5♦"
      },
      {
        "rank": "7",
        "suit": "Spades",
        "card": "7 of Spades",
        "short": "7♠"
      },
      {
        "rank": "King",
        "suit": "Hearts",
        "card": "King of Hearts",
        "short": "K♥"
      },
      {
        "rank": "7",
        "suit": "Clubs",
        "card": "7 of Clubs",
        "short": "7♣"
      },
      {
        "rank": "5",
        "suit": "Spades",
        "card": "5 of Spades",
        "short": "5♠"
      },
      {
        "rank": "3",
        "suit": "Diamonds",
        "card": "3 of Diamonds",
        "short": "3♦"
      },
      {
        "rank": "2",
        "suit": "Clubs",
        "card": "2 of Clubs",
        "short": "2♣"
      },
      {
        "rank": "10",
        "suit": "Diamonds",
        "card": "10 of Diamonds",
        "short": "10♦"
      },
      {
        "rank": "9",
        "suit": "Clubs",
        "card": "9 of Clubs",
        "short": "9♣"
      },
      {
        "rank": "10",
        "suit": "Clubs",
        "card": "10 of Clubs",
        "short": "10♣"
      },
      {
        "rank": "9",
        "suit": "Hearts",
        "card": "9 of Hearts",
        "short": "9♥"
      }
    ],
    "top_card": {
      "rank": "3",
      "suit": "Hearts",
      "card": "3 of Hearts",
      "short": "3♥"
    },
    "bottom_card": {
      "rank": "9",
      "suit": "Hearts",
      "card": "9 of Hearts",
      "short": "9♥"
    },
    "sample_hand": [
      {
        "rank": "3",
        "suit": "Hearts",
        "card": "3 of Hearts",
        "short": "3♥"
      },
      {
        "rank": "Ace",
        "suit": "Hearts",
        "card": "Ace of Hearts",
        "short": "A♥"
      },
      {
        "rank": "4",
        "suit": "Hearts",
        "card": "4 of Hearts",
        "short": "4♥"
      },
      {
        "rank": "Queen",
        "suit": "Spades",
        "card": "Queen of Spades",
        "short": "Q♠"
      },
      {
        "rank": "4",
        "suit": "Diamonds",
        "card": "4 of Diamonds",
        "short": "4♦"
      }
    ]
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=go&utm_medium=readme).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=go&utm_medium=readme), [Privacy Policy](https://apiverve.com/privacy?utm_source=go&utm_medium=readme), and [Refund Policy](https://apiverve.com/refund?utm_source=go&utm_medium=readme).

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

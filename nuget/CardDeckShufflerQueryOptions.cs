using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.CardDeckShuffler
{
    /// <summary>
    /// Query options for the Card Deck Shuffler API
    /// </summary>
    public class CardDeckShufflerQueryOptions
    {
        /// <summary>
        /// Number of decks to shuffle
        /// </summary>
        [JsonProperty("decks")]
        public string Decks { get; set; }

        /// <summary>
        /// Include jokers in the deck
        /// </summary>
        [JsonProperty("jokers")]
        public string Jokers { get; set; }

        /// <summary>
        /// Shuffling method
        /// </summary>
        [JsonProperty("method")]
        public string Method { get; set; }
    }
}

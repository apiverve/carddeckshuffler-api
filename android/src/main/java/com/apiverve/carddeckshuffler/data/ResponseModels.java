// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     CardDeckShufflerData data = Converter.fromJsonString(jsonString);

package com.apiverve.carddeckshuffler.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static CardDeckShufflerData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(CardDeckShufflerData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(CardDeckShufflerData.class);
        writer = mapper.writerFor(CardDeckShufflerData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// CardDeckShufflerData.java

package com.apiverve.carddeckshuffler.data;

import com.fasterxml.jackson.annotation.*;

public class CardDeckShufflerData {
    private long totalCards;
    private long decksUsed;
    private boolean includesJokers;
    private String shuffleMethod;
    private BottomCard[] cards;
    private BottomCard topCard;
    private BottomCard bottomCard;
    private BottomCard[] sampleHand;

    @JsonProperty("total_cards")
    public long getTotalCards() { return totalCards; }
    @JsonProperty("total_cards")
    public void setTotalCards(long value) { this.totalCards = value; }

    @JsonProperty("decks_used")
    public long getDecksUsed() { return decksUsed; }
    @JsonProperty("decks_used")
    public void setDecksUsed(long value) { this.decksUsed = value; }

    @JsonProperty("includes_jokers")
    public boolean getIncludesJokers() { return includesJokers; }
    @JsonProperty("includes_jokers")
    public void setIncludesJokers(boolean value) { this.includesJokers = value; }

    @JsonProperty("shuffle_method")
    public String getShuffleMethod() { return shuffleMethod; }
    @JsonProperty("shuffle_method")
    public void setShuffleMethod(String value) { this.shuffleMethod = value; }

    @JsonProperty("cards")
    public BottomCard[] getCards() { return cards; }
    @JsonProperty("cards")
    public void setCards(BottomCard[] value) { this.cards = value; }

    @JsonProperty("top_card")
    public BottomCard getTopCard() { return topCard; }
    @JsonProperty("top_card")
    public void setTopCard(BottomCard value) { this.topCard = value; }

    @JsonProperty("bottom_card")
    public BottomCard getBottomCard() { return bottomCard; }
    @JsonProperty("bottom_card")
    public void setBottomCard(BottomCard value) { this.bottomCard = value; }

    @JsonProperty("sample_hand")
    public BottomCard[] getSampleHand() { return sampleHand; }
    @JsonProperty("sample_hand")
    public void setSampleHand(BottomCard[] value) { this.sampleHand = value; }
}

// BottomCard.java

package com.apiverve.carddeckshuffler.data;

import com.fasterxml.jackson.annotation.*;

public class BottomCard {
    private String rank;
    private Suit suit;
    private String card;
    private String bottomCardShort;

    @JsonProperty("rank")
    public String getRank() { return rank; }
    @JsonProperty("rank")
    public void setRank(String value) { this.rank = value; }

    @JsonProperty("suit")
    public Suit getSuit() { return suit; }
    @JsonProperty("suit")
    public void setSuit(Suit value) { this.suit = value; }

    @JsonProperty("card")
    public String getCard() { return card; }
    @JsonProperty("card")
    public void setCard(String value) { this.card = value; }

    @JsonProperty("short")
    public String getBottomCardShort() { return bottomCardShort; }
    @JsonProperty("short")
    public void setBottomCardShort(String value) { this.bottomCardShort = value; }
}

// Suit.java

package com.apiverve.carddeckshuffler.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CLUBS: return "Clubs";
            case DIAMONDS: return "Diamonds";
            case HEARTS: return "Hearts";
            case SPADES: return "Spades";
        }
        return null;
    }

    @JsonCreator
    public static Suit forValue(String value) throws IOException {
        if (value.equals("Clubs")) return CLUBS;
        if (value.equals("Diamonds")) return DIAMONDS;
        if (value.equals("Hearts")) return HEARTS;
        if (value.equals("Spades")) return SPADES;
        throw new IOException("Cannot deserialize Suit");
    }
}
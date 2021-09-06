package controller

import model.Card
import model.Deck
import org.json.JSONArray
import org.json.JSONObject
import service.HttpService

class DeckController() {
    val deck : Deck

    constructor() {
//        val resposta = khttp.get("http://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
        val resposta = HttpService.getJson("http://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
        this.deck = Deck(resposta.jsonObject["deck_id"] as String)
    }

    public fun drawCard() : Card {
//        val cards_resposta = khttp.get("http://deckofcardsapi.com/api/deck/${this.deck.deckId}/draw/?count=1")
        val card_resposta = HttpService.getJson("http://deckofcardsapi.com/api/deck/${this.deck.deckId}/draw/?count=1")
        val valores_das_cartas = cards_resposta["cards"] as JSONArray
        val primeira_carta = valores_das_cartas[0] as JSONObject
        return  Card(primeira_carta["suit"] as String, primeira_carta["value"] as String, primeira_carta["image"] as String)
    }

}
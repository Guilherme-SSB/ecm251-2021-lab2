import org.json.JSONArray
import org.json.JSONObject

fun main() {
    val resposta = khttp.get("https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")
    val baralho_id = resposta.jsonObject["deck_id"]
    val cards_resposta = khttp.get("https://deckofcardsapi.com/api/deck/$baralho_id/draw/?count=1")
    val cartas = cards_resposta.jsonObject["cards"] as JSONArray
    val valor_carta : JSONObject = cartas[0] as JSONObject

    print(valor_carta["value"])
}
fun main(args: Array<String>) {
    val resposta = khttp.get("http://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1")

    val baralhoId = resposta.jsonObject["deck_id"]

    val cards_resposta = khttp.get("http://deckofcardsapi.com/api/deck/$baralhoId/draw/?count=1")

    val valor_carta = cards_resposta.jsonObject["cards"]

    println(valor_carta)


}
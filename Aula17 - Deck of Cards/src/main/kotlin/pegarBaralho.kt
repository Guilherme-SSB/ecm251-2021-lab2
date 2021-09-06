import controller.DeckController
import model.Card
import org.json.JSONArray

fun main(args: Array<String>) {
    val deckController = DeckController()
    val carta = deckController.drawCard()
    println(carta)


}

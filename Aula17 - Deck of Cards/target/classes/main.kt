//import khttp.get

fun main(args: Array<String>) {
    val r = khttp.get("http://viacep.com.br/ws/09580900/json/")
    println(r.statusCode)
//    200
//    developer.mozilla.org/pt-br/docs/Web/HTTP/Status

    println(r.headers["Content-Type"])
//    "application/json; charset=utf-8"

    println(r.text)
//    """{"type": "User"..."""

    println(r.jsonObject)
//     org.json.JSONObject
    println(r.jsonObject["logradouro"])

//    println(r.url)
//    Retorna a url usada

//      println(r.connection)

}
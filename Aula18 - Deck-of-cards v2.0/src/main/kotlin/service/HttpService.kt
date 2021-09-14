package service

import org.json.JSONObject

class HttpService {
    companion object { // companion object => método estatico => não preciso instanciar HttpService() para usa-lo
        fun getJson(url: String): JSONObject {
            return khttp.get(url).jsonObject
        }
    }
}

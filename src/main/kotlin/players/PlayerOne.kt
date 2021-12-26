package players

class PlayerOne : InputPlayer("pemain 1") {
    override fun inputPlayerHand(): String {
        return readLine()?.lowercase() ?: ""
    }
}
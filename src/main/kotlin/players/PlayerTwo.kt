package players

class PlayerTwo : InputPlayer("pemain 2") {
    override fun inputPlayerHand(): String {
        return readLine()?.lowercase() ?: ""
    }
}
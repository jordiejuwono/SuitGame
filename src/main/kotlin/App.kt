import players.PlayerOne
import players.PlayerTwo
import utils.ResultCondition

class App {
    private var handOne: String = ""
    private var handTwo: String = ""

    fun run() {
        printHeader()
        inputFirstPlayer()
        inputSecondPlayer()
        setCondition()
        printResult()
    }

    private fun printHeader() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    private fun inputFirstPlayer() {
        val playerOne = PlayerOne()
        playerOne.printPlayerNumber()
        handOne = playerOne.inputPlayerHand()
    }

    private fun inputSecondPlayer() {
        val playerTwo = PlayerTwo()
        playerTwo.printPlayerNumber()
        handTwo = playerTwo.inputPlayerHand()
    }

    object Constant {
        const val BATU = "batu"
        const val GUNTING = "gunting"
        const val KERTAS = "kertas"
    }

    private fun setCondition() {
        //Menggunakan Looping While
        //Kondisi jika input pemain 1 dan pemain 2 salah
        while ((handOne != Constant.BATU && handOne != Constant.GUNTING && handOne != Constant.KERTAS) &&
            (handTwo != Constant.BATU && handTwo != Constant.GUNTING && handTwo != Constant.KERTAS)
        ) {
            println("Input 'pemain 1' dan 'pemain 2' salah, silahkan coba masukkan lagi")
            inputFirstPlayer()
            inputSecondPlayer()
            setCondition()
        }
        //Kondisi jika hanya input pemain 1 yang salah
        while (handOne != Constant.BATU && handOne != Constant.GUNTING && handOne != Constant.KERTAS) {
            println("Input 'pemain 1' salah, silahkan coba masukkan lagi")
            inputFirstPlayer()
            setCondition()
        }
        //Kondisi jika hanya input pemain 2 yang salah
        while (handTwo != Constant.BATU && handTwo != Constant.GUNTING && handTwo != Constant.KERTAS) {
            println("Input 'pemain 2' salah, silahkan coba masukkan lagi")
            inputSecondPlayer()
            setCondition()
        }

        //Menggunakan Recursive If & Else If

//        if ((handOne != "batu" && handOne != "gunting" && handOne != "kertas") &&
//            (handTwo != "batu" && handTwo != "gunting" && handTwo != "kertas")
//        ) {
//            println("Input 'pemain 1' dan 'pemain 2' salah, silahkan coba masukkan lagi")
//            inputFirstPlayer()
//            inputSecondPlayer()
//            setCondition()
//        } else if (handOne != "batu" && handOne != "gunting" && handOne != "kertas") {
//            println("Input 'pemain 1' salah, silahkan coba masukkan lagi")
//            inputFirstPlayer()
//            setCondition()
//        } else if (handTwo != "batu" && handTwo != "gunting" && handTwo != "kertas") {
//            println("Input 'pemain 2' salah, silahkan coba masukkan lagi")
//            inputSecondPlayer()
//            setCondition()
//        }
    }

    private fun printResult() {
        val utils = ResultCondition()
        utils.setResultCondition(handOne, handTwo)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().run()
        }
    }
}
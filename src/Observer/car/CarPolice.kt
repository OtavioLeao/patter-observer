package Observer.car


class CarPolice: Car, ObserverCarPolice {

    override fun go() {
        println("Viatura segue em frente.")
    }

    override fun right() {
        println("Viatura dobra a direita.")
    }

    override fun left() {
        println("Viatura dobra a esquerda.")
    }

    override fun stop() {
        println("Viatura para.")
    }

    override fun update(action: String) {

        when(action){
            "frente" -> this.go()
            "direita" -> this.right()
            "esquerda" -> this.left()
            "para" -> this.stop()
        }
    }
}

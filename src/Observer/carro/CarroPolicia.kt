package Observer.carro

import CarroRoubado
import java.util.*


class CarroPolicia: Carro, ObserverCarroPolicia {

    override fun emfrente() {
        println("Viatura segue em frente.")
    }

    override fun direita() {
        println("Viatura dobra a direita.")
    }

    override fun esquerda() {
        println("Viatura dobra a esquerda.")
    }

    override fun para() {
        println("Viatura para.")
    }

    override fun update(action: String) {

        when(action){
            "frente" -> this.emfrente()
            "direita" -> this.direita()
            "esquerda" -> this.esquerda()
            "para" -> this.para()
        }
    }
}

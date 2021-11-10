
import Observer.car.Car
import Observer.car.ObserverCarPolice
import Observer.car.ObsevableCar

class CarTief: ObsevableCar, Car {
    private var listObserver = ArrayList<ObserverCarPolice>()
    var action: String = ""

    override fun go() {
        action = "frente"
        println("Carro roubado segue em frente")
        changeState()
    }


    override fun right() {
        action = "direita"
        println("Carro roubado dobrou direita")
        changeState()
    }

    override fun left() {
        action = "esquerda"
        println("Carro roubado dobrou esquerda")
        changeState()
    }

    override fun stop() {
        action = "para"
        println("Carro roubado parou")
        changeState()
    }

    override fun registerObserver(observer: ObserverCarPolice) {
        listObserver.add(observer)
    }

    override fun notifyObserver(acao: String) {
        for (i in listObserver){
            i.update(acao)
        }
    }

    private fun changeState() {
        notifyObserver(action)
    }

}

import Observer.carro.Carro
import Observer.carro.ObserverCarroPolicia
import Observer.carro.ObsevableCarro

class CarroRoubado: ObsevableCarro, Carro {
    private var listObserver = ArrayList<ObserverCarroPolicia>()
    var acao: String = ""

    override fun emfrente() {
        acao = "frente"
        println("Carro roubado segue em frente")
        changeState()
    }


    override fun direita() {
        acao = "direita"
        println("Carro roubado dobrou direita")
        changeState()
    }

    override fun esquerda() {
        acao = "esquerda"
        println("Carro roubado dobrou esquerda")
        changeState()
    }

    override fun para() {
        acao = "para"
        println("Carro roubado parou")
        changeState()
    }

    override fun registerObserver(observer: ObserverCarroPolicia) {
        listObserver.add(observer)
        println("Register observer")
        println("ListaAdd ${listObserver.size.toString()}" )    }

    override fun notifyObserver(acao: String) {
        for (i in listObserver){
            i.update(acao)
        }
    }

    private fun changeState() {
        notifyObserver(acao)
    }

}
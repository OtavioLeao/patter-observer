package Observer.carro

interface ObsevableCarro {
    fun registerObserver(observer: ObserverCarroPolicia)
    fun notifyObserver(acao: String)
}
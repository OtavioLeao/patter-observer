package Observer.car

interface ObsevableCar {
    fun registerObserver(observer: ObserverCarPolice)
    fun notifyObserver(acao: String)
}
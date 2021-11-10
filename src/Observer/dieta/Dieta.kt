package Observer.dieta

class Dieta: Observable {
    private var listObserver = ArrayList<Observer>()
    private var peso : Double? = null


    override fun registerObserver(observer: Observer) {
        listObserver.add(observer)
        println("Register observer")
        println("ListaAdd ${listObserver.size.toString()}" )

    }

    override fun removeObserver(observer: Observer) {
        listObserver.remove(observer)
        println("remove observer")
        println("ListaRemove ${listObserver.size.toString()}" )

    }

    override fun notifyObserver() {
        for (i in listObserver){
            peso?.let { i.update(it) }
        }
    }

}
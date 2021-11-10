package Observer.dieta


class BalancaDieta: Observer {
    override fun update(peso: Double) {
        if (peso >= 100){
            println("Você ultrapassou o peso")
        }else{
            println("Esta tudo ok com voce")
        }

    }

}
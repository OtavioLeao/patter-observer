import Observer.carro.CarroPolicia

fun main(){
//    //subject / observable
//    val dieta = Dieta()
//    //observer
//    val peso100 = BalancaDieta()
//    val peso70 = BalancaDieta()
//
//    dieta.registerObserver(peso100)
//    peso100.update(100.00)
//    dieta.registerObserver(peso70)
//    peso70.update(70.00)

    //observado
    val carroRoubado = CarroRoubado()
    //observador
    val carroPolicia = CarroPolicia()

    carroRoubado.registerObserver(carroPolicia)
    carroRoubado.emfrente()
    carroRoubado.direita()
    carroRoubado.esquerda()
    carroRoubado.para()


}
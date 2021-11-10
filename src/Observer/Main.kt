import Observer.car.CarPolice

fun main(){

    //observado
    val stolenCar = CarTief()
    //observador
    val carPolice = CarPolice()

    stolenCar.registerObserver(carPolice)
    stolenCar.go()
    stolenCar.right()
    stolenCar.left()
    stolenCar.stop()


}
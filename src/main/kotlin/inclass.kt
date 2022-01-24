interface Car {
    fun accelerate()
}


class FlyingCar():Car{
    var combustible = 0
    var velocidad = 0
    var altura = 0
    constructor(combustible:Int):this(){
        this.combustible = combustible
    }
    override fun accelerate() {
        combustible -= 5
        velocidad += 5
    }

}

open class RacingCar(private var remainingFuel: Int) : Car {
    private var power = 0
    override fun accelerate() {
        increasePower()
        decrementFuel()
    }

    protected open fun decrementFuel() {
        remainingFuel--
    }

    protected open fun increasePower() {
        power++
    }

}

class Driver(car: Car) {
    val racingCar: Car = car

    fun increaseSpeed() {
        racingCar.accelerate()
    }

}

fun main(){

    val alex = Driver(RacingCar(30))
    val ricardo = Driver(FlyingCar(300))
    ricardo.increaseSpeed()
    alex.increaseSpeed()
}
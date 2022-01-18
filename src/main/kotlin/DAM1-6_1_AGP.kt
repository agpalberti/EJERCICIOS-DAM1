//Especialización

//Superclase
open class Trabajador(){
    fun trabaja(){}
}

//Subclases
class Guardia():Trabajador(){
    fun vigila(){}
}
class Enfermero():Trabajador(){
    fun opera(){}
}


//Extensión

//Superclase
open class Coche(){
    fun acelera(){}
}

//Subclases
class CocheVolador():Coche(){
    fun vuela(){}
}
class CocheAcuatico():Coche(){
    fun sumerje(){}
}

//Especificación

//Superclase
open class Comida(){
    fun cocina(){}
}

//Subclases
class Lasagna(){}
class ChocoFrito(){}

//Construcción

//Superclase
open class Motor(){
    fun aumentarRevoluciones(){}
}

//Subclases
class Avion():Motor(){
    fun vuela(){}
}
class Camion():Motor(){
    fun acelerar(){}
}

fun main() {

    var trabajador:Trabajador = Guardia()
    trabajador = Enfermero()

    var coche:Coche = CocheAcuatico()
    coche= CocheVolador()

    var motor:Motor = Avion()
    motor = Camion()

}

//Otra forma de implementarlo sería mediante una variable del supertipo.
//Que comparten metodos y variables.
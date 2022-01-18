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

    val coche:Coche = CocheAcuatico()

}
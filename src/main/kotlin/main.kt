fun main(args: Array<String>) {
    //Definición de variables y constantes
    var titulo = "QBO Institute"
    var subtitulo: String = "Kotlin Expert for Android"
    val tema: String
    tema = "Fundamentos de Kotlin"
    //Tipos de variables
    var numero : Int = 5
    var numero2: Int
    numero2 = 10
    var numeroDouble = 5.6
    val mensaje: String = "Hola mundo Kotlin"
    val nombre = "Luis"
    val anioNac = 1990
    val anioAct = 2021
    //Gestión de valores Null
    var curso: String?
    curso = null
    var longitud: Int? = curso?.length ?: 0
    //Arrays en Koltin
    val arrayNumeros: IntArray = intArrayOf(23,34,2,5)
    //ArrayList
    val paises = ArrayList<String>()
    paises.add("Perú")
    paises.add("Bolivia")
    paises.add("Nicaragua")
    paises.add("México")
    /*for(pais in paises){
	    imprimirMensaje(pais)
    }*/
    obtenerLargoApellido("Salvatierra", "Aquino")
    validarLongitudNombre("Luis")
    println(validarNumero(3))
}
//Definición de función con parametros y uso de condicional IF
fun obtenerLargoApellido(apellido1: String, apellido2: String){
    var apellidoLargo = if(apellido1.length > apellido2.length){
        apellido1
    }else if(apellido2.length > apellido1.length){
        apellido2
    }else{
        "Ambos apellidos tienen la misma longitud"
    }
    println("El apellido más extenso es: $apellidoLargo")
}
//Definición de función con parametros y uso de WHEN
fun validarLongitudNombre(nombre: String){
    when(nombre.length){
        0 -> println("Nombre vacío")
        in 1..4 -> println("Nombre pequeño")
        in 5..7 -> println("Nombre mediano")
        else -> println("Nombre extenso")
    }
}
//Definición de función con parametro de entrada y salida
fun validarNumero(numero: Int): String{
    var resultado = ""
    when(numero % 2){
        0 -> resultado = "Número Par"
        else -> resultado = "Número Impar"
    }
    return resultado
}

fun imprimirMensaje(mensaje: String){
    println(mensaje)
}
//Definición de función y uso de FOR
fun bucleFor(){
    val edades = intArrayOf(24,23,30,34,36)
    for(edad: Int in edades){
        //imprimirMensaje(edad.toString())
    }
    for((indice, valor) in edades.withIndex()){
        //imprimirMensaje("Edad: $indice - $valor")
    }
    for(i in 5..15) imprimirMensaje("Número $i")
}
//Definición de función y uso de WHILE Y DO WHILE
fun bucleWhile(){
    var i = 10
    /*while(i > 0){
        println(i)
        i--
    }*/
    do{
        println(i)
        i--
    }while(i > 0)
}

fun busquedaOrdenamiento(){
    for(i in 1..4){
        for(j in 1..4){
            if(i == 2 && j == 2){
                println("Ambas variables son IGUALES")
                break
            }else{
                println("i= $i - j= $j")
            }

        }
    }
}
//Funciones en linea
val calcularNumero = { num: Int -> num * 3}
val multiplicarNumeros : (Int, Int) -> Int = {x, y -> x * y}

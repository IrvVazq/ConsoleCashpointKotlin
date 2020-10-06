package com.example.acts12_08

fun main(){
    println("CAJERO AUTOMATICO PERSONAL")
    val pin = 2383
    var saldo= 12956.87
    do{
        println(" INGRESE SU PIN:")
        var acceso= readLine()!!.toInt()
        if(acceso!= pin){
            println("  PIN INCORRECTO")
        }
    }while(acceso!= pin)

    println(" BIENVENIDO.")
    var op :Int
    var systemOn =true
    while(systemOn) {
        println("¿QUE OPERACION DESEA REALIZAR?")
        println("1. DEPOSITAR DINERO")
        println("2. RETIRAR DINERO")
        println("0. APAGAR")
        println("SU SALDO ACTUAL ES DE: "+saldo)
        print("SU RESPUESTA: ")
        op = readLine()!!.toInt()
        when (op) {
            1 -> {
                saldo= depositar(saldo)
            }

            2 -> {
                saldo= retirar(saldo)
            }

            0 -> {
                println("GRACIAS POR USAR NUESTRO CAJERO AUTOMATICO. QUE TENGA UN BUEN DIA")
                systemOn = false
            }
        }
    }

}

fun depositar (saldo:Double):Double{
    println("DEPOSITAR DINERO")
    print(" INGRESE LA CANTIDAD QUE DESEA AGREGAR A SU CUENTA: ")
    var cantidadIngresar = readLine()!!.toDouble()
    println(" PROCESO EJECUTADO CON EXITO. SU SALDO ACTUAL ES DE: $"+(saldo + cantidadIngresar))
    return (saldo + cantidadIngresar)
}

fun retirar (saldo:Double): Double {
    println("RETIRAR DINERO")
    print("INGRESE LA CANTIDAD QUE DESEA RETIRAR DE SU CUENTA: ")
    var cantidadRetirar = readLine()!!.toDouble()
    if(cantidadRetirar<saldo){
        println(" PROCESO EJECUTADO CON EXITO. SU SALDO ACTUAL ES DE: $"+(saldo-cantidadRetirar))
        return (saldo - cantidadRetirar)
    } else{
        println("IMPOSIBLE REALIZAR LA OPERACION. LA CANTIDAD SOLICITADA ES DEMASIADO ALTA PARA EL SALDO DISPONIBLE EN SU CUENTA")
        return saldo
    }

}
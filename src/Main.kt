fun calcularIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}

fun clasificacionIMC(imc: Double): String {
    return when {
        imc < 16.0 -> "Delgadez severa"
        imc in 16.0..16.99 -> "Delgadez moderada"
        imc in 17.0..18.49 -> "Delgadez leve"
        imc in 18.5..24.99 -> "Normal"
        imc in 25.0..29.99 -> "Preobeso"
        imc in 30.0..34.99 -> "Obesidad leve"
        imc in 35.0..39.99 -> "Obesidad media"
        imc >= 40.0 -> "Obesidad mórbida"
        else -> "Dato no válido"
    }
}

fun main() {
    print("Ingrese su peso en kg: ")
    val peso = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingrese su altura en metros: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    if (peso > 0 && altura > 0) {
        val imc = calcularIMC(peso, altura)
        val clasificacion = clasificacionIMC(imc)
        println("Su IMC es: %.2f".format(imc))
        println("Clasificación: $clasificacion")
    } else {
        println("Por Favor Ingrese Valores Correctos.")
    }
}

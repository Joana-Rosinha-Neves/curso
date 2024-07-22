function fibonacii() {

    //Variaveis
    let inicio = document.getElementById("rangeInicio").value
    let fim = document.getElementById("rangeFim").value

    let numerosFabiciano = " "

    //For(inicialização; comparação; incremento)

    for (var i = inicio; i < fim; i++) {

        //Qual a condição do retorno

        if ((i === i + (i - 1)))
            {
            numerosFabiciano += i + " "
        }
    }
    document.getElementById("textoNumerosFabiciano").innerText = "Numeros pares são: " + numerosFabiciano


}
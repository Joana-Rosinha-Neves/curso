



function calculadoraSoma(){

let  valorA = parseInt(document.getElementById("valorA").value);

    // Guardar o valor B numa variavel
let valorB = parseInt(document.getElementById("valorB").value);


let resultadoSoma = valorA + valorB

// Mostrar resultado
// alert(resultadoSoma)

// Mostrar o resultado em texto
document.getElementById("resultadoH1").innerText = "Resultado = " + resultadoSoma;

}
// // Função Subtração
function  calcularSubtracao(){

let  valorA = parseInt(document.getElementById("valorA").value);

    // Guardar o valor B numa variavel
let valorB = parseInt(document.getElementById("valorB").value);


let resultadoSubtracao = valorA - valorB

document.getElementById("resultadoH1").innerText = "Resultado = " + resultadoSubtracao;

}

// Função Divisão
function calculardivisao()
{


let valorA = parseInt(document.getElementById("valorA").value);

let valorB = parseInt(document.getElementById("valorB").value);
let resultadoDivisao = valorA / valorB
document.getElementById("resultadoH1").innerText = "Resultado = " + resultadoDivisao;

}
// Função Multiplicar
function calcularmultiplicacao() 
{

let valorA = parseInt(document.getElementById("valorA").value);
let valorB = parseInt(document.getElementById("valorB").value);
let resultadoMultiplicar = valorA * valorB
document.getElementById("resultadoH1").innerText = "Resultado = " + resultadoMultiplicar;
}
// Função - Avaliar o tipo de opreção atraves da comparação

function compararOpe()
{
    // Guardar o input do user numa variavel
    let sinalOp = document.getElementById("tipoOp").value;

    if(sinalOp === "+")
    {
        calculadoraSoma();
    }

    if(sinalOp ==="-") 
    {
        calcularSubtracao();

    }

    // Funcao divisao

    if(sinalOp ==="/")
    {

        calculardivisao();
    }

    if(sinalOp === "*")
    {

     calcularmultiplicacao();

    }

}
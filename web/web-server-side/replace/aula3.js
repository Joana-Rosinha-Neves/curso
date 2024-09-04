

let diadasemana = prompt("qual o dia da semana").toLowerCase;

switch (diadasemana) {

    case 'segunda':
        alert(" faltam 4 dias")
        break;

    case 'terça':
        alert(" faltam 3 dias")
        break;

    case 'sexta-feira':
        alert(" yay, sobrevivemos a uma uma semana")
        break;

    default:
        alert("dia incorrecto");
        break;


}
console.log(diadasemana);

let passutilizador = prompt("qual a password?")


let tamanho = passutilizador.length;

if (tamanho <= 6) {
    alert("pass invalido")

}


//Escreva uma função chamada multiply que receba dois valores e retorne o resultado da multiplicação dos 

// function multiply (a,b) {
//     return a*b;

// }

// let x = multiply(2,3);
// console.log (x);

// O tempo está incerto e eu não sei se deva vestir calções ou calças, ajude-me a decidir. Escreva uma função 
// chamada isShortsWeather que aceite um argumento a que podemos chamar temperature. Se a temperatura for 
// maior que 25, retorna verdadeiro. Se não, retorna falso.


// function isShortWheather (temperatura) 
// {
//     if (temperatura > 25) {
//         return true
        
// }
// else 
// {
//     return false
// }
// }

// console.log(isShortWheather (25))
// . Escreva uma função chamada lastElement que aceite um array. Essa função deve retornar o último elemento do 
// array (sem o remover). Se o array for vazio, a função deve retornar null. 

// function lastElement(list) {

    
//     if(list.length===0)
//     {
//         return null
//     }
//     else
//     {
//     return list[list.length-1]
//     }
// }
// console.log(lastElement([3,5,7]));

// Escreva uma função chamada capitalize que aceite um argumento string e retorne uma nova string com a 
// primeira letra em maiúscula.

// function capitalize (a) {

//     let texto = a.slice(0,1).toUpperCase();
//     let textos = a.slice(1, a.length);
//     return texto + textos
// }

// console.log(capitalize("joanasalome"));

// Escreva uma função chamada sumArray que aceite um array de números. A função deve retornar a soma de 
// todos os números do array.

// function sumArray(a){
    
//     let soma = 0;
//    for (let i=0; i<a.length; i++)
//    {
//     soma = soma+a[i];
//    }

// return soma
// }

// console.log(sumArray([1,2,3]));


// Escreva uma função chamada returnDay. A função aceita um parâmetro de 1 a 7 e retorna o dia 
// correspondente: 1, retorna Segunda, 2, retorna Terça, etc.... Se o número for menor que 1 ou maior que 7, a 
// função deve retornar null.

// function returnday(a)
// {

//     if (a==1)
//         return "domingo";
//     else if (a==2) {
        
//         return "Segunda";
//     }
//     else if (a==3) {
        
//         return "terça";
//     }  
//     else if (a==4) {
        
//         return "quarta";
//     }
//     else if (a==5) {
        
//         return "quinta";
//     }
//     else if (a==6) {
        
//         return "sexta";
//     }
//     else if (a==7) {
        
//         return "sabado";
//     }
//     else 
//     {
//         return null
//     }
// }
// console.log(returnday(3))


// // o chatgpt sugeriu para melhorar desta forma:function returnDay(a) {
//     const days = ["Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"];
//     return a >= 1 && a <= 7 ? days[a-1] : null;
// }
// console.log(returnDay(3)); // Output: Quarta


// // nova forma de fazer arryas passar caderno pra estudar

//  let input = prompt("Digite uma lista separada por vírgulas:");
// let array = input.split(",");
// console.log(array);  // Converte a string diretamente em um array

// tb sugere nos meus arrays o trim 

// let input = prompt("Digite uma lista separada por vírgulas:");
// let array = [];
// let items = input.split(",");  // Divide a string, mas ainda não adiciona os itens ao array manualmente


// for (let i = 0; i < items.length; i++) {
//   array.push(items[i].trim()); 

// notas de como imprimir arrays para estudar 

// 1. Imprimir o array completo de uma vez:
// Você pode simplesmente usar o console.log() para imprimir o array inteiro.

// js
// Copiar código
// let frutas = ["maçã", "banana", "laranja"];
// console.log(frutas);  // Imprime o array completo: ["maçã", "banana", "laranja"]
// 2. Imprimir cada elemento do array separadamente:
// Se você quiser imprimir cada elemento do array em uma nova linha ou formatado de maneira personalizada, pode usar um loop.

// Usando for loop:
// js
// Copiar código
// let frutas = ["maçã", "banana", "laranja"];
// for (let i = 0; i < frutas.length; i++) {
//   console.log(frutas[i]);  // Imprime cada elemento individualmente
// }
// Usando forEach():
// js
// Copiar código
// let frutas = ["maçã", "banana", "laranja"];
// frutas.forEach(function(fruta) {
//   console.log(fruta);  // Também imprime cada elemento individualmente
// });
// 3. Imprimir o array como uma string formatada:
// Você pode transformar o array em uma string usando join() e definir o delimitador que preferir.

// js
// Copiar código
// let frutas = ["maçã", "banana", "laranja"];
// console.log(frutas.join(", "));  // Imprime: "maçã, banana, laranja"
// Você também pode usar outros delimitadores, como um espaço, ponto e vírgula, ou uma nova linha.

// Usando quebra de linha (\n):
// js
// Copiar código
// let frutas = ["maçã", "banana", "laranja"];
// console.log(frutas.join("\n"));  // Imprime cada elemento em uma nova linha
// 4. Imprimindo arrays em HTML (caso esteja em um navegador):
// Se você estiver trabalhando com uma página web, pode imprimir arrays diretamente no HTML, por exemplo, numa lista:

// html
// Copiar código
// <!DOCTYPE html>
// <html lang="pt-BR">
// <body>
//   <ul id="listaDeFrutas"></ul>

//   <script>
//     let frutas = ["maçã", "banana", "laranja"];
//     let ul = document.getElementById("listaDeFrutas");

//     frutas.forEach(function(fruta) {
//       let li = document.createElement("li");  // Cria um novo elemento de lista
//       li.textContent = fruta;                 // Define o texto do item de lista
//       ul.appendChild(li);                     // Adiciona o item de lista ao HTML
//     });
//   </script>
// </body>
// </html>
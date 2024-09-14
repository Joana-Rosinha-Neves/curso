
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

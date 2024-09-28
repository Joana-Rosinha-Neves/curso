
// ex1
// let text = "A turma de web é dinamica e tem as caracteristicas essenciais para brilhar numa empresa"

// let posicao = text.indexOf("u");
// let posicao2 = text.indexOf("w");
// let sizestex = text.length

// console.log( " a letra w aparece pela primeira vez na posicao " + posicao)
// console.log( " a letra u aparece pela primeira vez na posicao " + posicao2)
// console.log(" a string tem " + sizestex)

// 2

// let prendas = ["carro", "viagem japao", " coleçao tech dos animais"]


// for (let i=0; i<prendas.length;i++)
// {
//    console.log(prendas)

// }
// console.log(" a lista tem " + prendas.length + " items")



// let prendas = [{ 
//     nome:"carro", preco: 20},
//     {nome:"viagem japap" , preco: 5 },
//     {nome:"livro tech" , preco: 4} 

// ]

// ex3 
//  function menosvinte(prendas){
//      const novo = prendas.filter(element => element.preco <20)
//      return novo 
//   }
//  console.log(menosvinte(prendas))

//  ex4

// function multiply (x,y)
// {    return x*y;
// }
// console.log(multiply(2,3))

// ex5 
// function isShortWeather (temperatura){


// if (temperatura>25) {


//     return true
// }
// else 
// {
//     return false
// }
// }

// console.log(isShortWeather(30))

// console.log(isShortWeather(10))

// ex6
// function cumprimentar(){

// let nome = prompt("Qual o seu nome?")
// alert("ola " + nome)

// }


// ex7


// function sumArray(list){
//     let soma = 0
// for (let i = 0; i<list.length;i++)
// {
//     soma= soma + list[i]
// }
// console.log(" a soma é"+ soma)

// } 
// sumArray([1,2,4])
// ex8

// let colors= ["blue", "yellow", "green","orange","red"]

//  let buttons= document.querySelectorAll("button");

// for (let i=1; i<4; i++)
//  {
//     buttons[i].addEventListener("click", function(){
//         const randomColor= Math.floor(Math.random()* colors.length);
//          buttons[i].style.backgroundColor= colors[randomColor];

//  })
// }

//  ex9 ex10  ex11

// function paragrafo(){

// let paragrafo = document.createElement("p");

// paragrafo.innerText=' é so mais um esforço e a seguir serei uma programadora de renome'
// const mycontainer = document.querySelector("#container")
// mycontainer.appendChild(paragrafo)


// let buttonaumentar = document.createElement('button')
// buttonaumentar.innerText = 'aumentar'
// mycontainer.appendChild(buttonaumentar);
// buttonaumentar.addEventListener('click',function(){
//     paragrafo.style.fontSize='70px';

//     paragrafo.style.textAlign="center";
// })

// let buttonreduzir = document.createElement('button')
// buttonreduzir.innerText = 'reduzir';
// mycontainer.appendChild(buttonreduzir);
// buttonreduzir.addEventListener('click',function(){
//     paragrafo.style.fontSize='10px';
//     paragrafo.style.textAlign='right';
// })
// }

// exe 12 e ex13

// function aprendido()
// {
//    let items= document.querySelectorAll('li')
//    for (let elements of items)
//    {
//         elements.innerText +=  " aprendido"
//    }
// }

// function aprendido2()
// {
//     let adicionarlista = prompt("aprendeu algo mais?")
//     const myli= document.createElement('li')
//     myli.innerText = adicionarlista
//     const myUl = document.querySelector('ul')
//     myUl.appendChild(myli);


// }
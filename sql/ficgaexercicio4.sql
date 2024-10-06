CREATE DATABASE GestComercial_joanaNeves;

CREATE TABLE Cliente (
 id int AUTO_INCREMENT,
 nome varchar(50),
 morada varchar(250),
 estado BIT,
 CONSTRAINT PK_Cliente PRIMARY KEY (id)
 );
    
CREATE TABLE Produto (
id int ,
descricao varchar(100) NOT NULL,
preco DECIMAL (12,2),
CONSTRAINT PK_Produto PRIMARY KEY (id)
  
);

ALTER TABLE Produto MODIFY id INT, ADD PRIMARY KEY (id);


CREATE TABLE Venda (
prod int,
cli int,
data datetime,
CONSTRAINT PK_Venda PRIMARY KEY (prod, cli,data),
CONSTRAINT FK_Venda_Produto FOREIGN	KEY (prod) REFERENCES Produto(id),
CONSTRAINT FK_Venda_Cliente FOREIGN KEY (cli) REFERENCES Cliente(id));

ALTER TABLE Venda
ADD qtd INT;

ALTER TABLE Produto MODIFY id INT, ADD PRIMARY KEY (id);


INSERT INTO cliente ( id, nome, morada, estado) VALUES (1,'Helena Monteiro', 'Perafita – Freixieiro ',1), (2,'Raul Simas', 'Palmela',0);
INSERT INTO produto ( id, descricao,preco) VALUES (1,'Rato Logitec XPTO 1 ', 10 ), (2,'Monitor Sony Vaio XPTO',120);

como é autoincremento fica 
INSERT INTO cliente (nome, morada, estado)
VALUES ('Helena Monteiro', 'Perafita – Freixieiro', 1),
       ('Raul Simas', 'Palmela', 0);

INSERT INTO Venda (cli, prod, qtd, data) VALUES (1, 1, 1, '2012-04-05 00:00:00'), (2, 1, 5, '2012-04-05 23:59:59')
INSERT INTO Venda (cli, prod, qtd, data) VALUES (1, 1, 1, '2012-04-05 00:00:00'), (2, 1, 5, '2012-04-05 23:59:59');


UPDATE venda SET qtd=10 WHERE cli=2; 

UPDATE cliente
SET morada = 'Porto' // atençao nao tem virgula
WHERE nome = 'Raul Simas';

or 
UPDATE cliente
SET morada = 'Porto' // atençao nao tem virgula
WHERE nome like 'Raul%';


UPDATE produto
SET preco =100
where descricao = 'Monitor'; melhor nome completo ou 

UPDATE produto
SET preco = 100
WHERE descricao LIKE 'Monitor%';


SELECT * FROM produto;

select nome from cliente where estado =1;

select nome from cliente where estado !=0;


SELECT v.prod, v.qtd, v.data
from venda v
INNER join  cliente c on v.cli= c.id
where c.nome='Raul Simas';


SELECT * 
From vendas v
INNER join cliente c on v.cli=c.id=  // aparece as 2 tabelas
where c.nome like 'H%';


SELECT v.prod, v.qtd, v.data
From vendas v  // aparece so a de vendas
INNER join cliente c on v.cli=c.id
where c.nome like 'H%';


SELECT v.qtd
from venda v 
INNER join cliente ON v.cli=c.id=
where c.nome = 'Raul Simas';


SELECT v.qtd from venda v INNER join cliente c ON c.id=v.cli where c.nome = 'Raul Simas'; // nao é a quantidade porque uma venda pode ter mtos produtos.

SELECT count(*) as 'numero de vendas Raul' from venda v INNER join cliente c ON v.cli=c.id where c.nome = 'Raul Simas';   on a key = bkey

SELECT MAX(preco) from produto;
SELECT MAX(preco) as 'valor mais alto'
 from produto;

 SELECT descricao from produto where preco<=100;
 SELECT * FROM `produto` WHERE preco<=100;


SELECT c.nome 
FROM cliente c 
LEFT JOIN venda v ON c.id = v.cli 
WHERE v.cli IS NULL;


SELECT SUM(v.qtd*preco)
from venda v
inner join produto p on v.prod=p.id
group by DATA;

+ correcto
SELECT v.data, SUM(p.preco * v.qtd) AS total_faturado
FROM venda v
INNER JOIN produto p ON v.prod = p.id
GROUP BY v.data;

se nao fosse sumatorio :

SELECT (v.qtd * p.preco) AS total_faturado
FROM venda v
INNER JOIN produto p ON v.prod = p.id;

SELECT p.descricao, SUM(le.quantidade) AS total_quantidade from linhaencomenda le INNER JOIN Produto p ON le.codProduto = p.codProduto inner join Encomenda e on le.codEncomenda = e.codEncomenda inner join Cliente c on c.codCliente=e.codCliente where c.nome LIKE '%Silva%' Group by p.descricao;
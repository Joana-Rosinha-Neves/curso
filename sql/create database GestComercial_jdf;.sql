create database GestComercial_jdf;
CREATE TABLE Cliente ( id int AUTO_INCREMENT PRIMARY KEY, nome varchar(50) not null, morada varchar(250), estado bit );
CREATE TABLE produto ( id int AUTO_INCREMENT PRIMARY KEY, descricao varchar(50) not null, preco decimal(12,2) );
CREATE TABLE Venda ( prod INT, cli INT, data DATETIME, qtd INT , PRIMARY KEY (prod, cli, data), FOREIGN KEY (prod) REFERENCES Produto(id), FOREIGN KEY (cli) REFERENCES Cliente(id) );
SELECT * FROM `cliente`
INSERT INTO cliente ( id, nome, morada, estado) VALUES (1,'Helena Monteiro', 'Perafita – Freixieiro ',1), (2,'Raul Simas', 'Palmela',0);
INSERT INTO produto ( id, descricao,preco) VALUES (1,'Rato Logitec XPTO 1 ', 10 ), (2,'Monitor Sony Vaio XPTO',120);
SELECT * FROM `venda`
INSERT INTO Venda (cli, prod, qtd, data) VALUES (1, 1, 1, '2012-04-05 00:00:00'), (2, 1, 5, '2012-04-05 23:59:59');
SELECT * FROM `venda`
update Venda SET qtd=10 where cli=2;
SELECT * FROM `venda`
SELECT * FROM `cliente`
update cliente SET morada='Porto' where nome='Raul Simas';
SELECT * FROM `cliente`
SELECT * FROM `produto`
update produto SET preco=100 where descricao='Monitor Sony Vaio XPTO ';
SELECT * FROM `produto`
SELECT * FROM `produto`;
SELECT nome FROM cliente WHERE estado=1;
SELECT v.prod, v.qtd, v.data FROM cliente c INNER Join venda v on v.cli=c.id;
SELECT v.prod, v.qtd, v.data FROM cliente c INNER Join venda v on v.cli=c.id where c.nome='Raul Simas';
SELECT * FROM venda v INNER join cliente c ON c.id=v.cli where c.nome like 'H%';
SELECT * from venda v Inner join cliente c on v.cli=c.id;
SELECT count(*) as 'numero Vendas Raul' from venda v Inner join cliente c on v.cli=c.id where c.nome = 'Raul Simas';
SELECT MAX(preco) FROM produto;
SELECT MAX(preco) as 'valor mais alto' FROM produto;
SELECT * FROM `produto` WHERE preco<=100;
SELECT (c.nome) FROM cliente c left join venda v on c.id=v.cli where v.cli is null;
Expandir Repetir consulta Editar Marcadores Banco de dados : gestcomercial_jdf Tempo de execução da consulta : 16:55:29
-- Mostre o total faturado a cada dia. SELECT * from venda v inner join produto p on v.prod = p.id;
-- Mostre o total faturado a cada dia. SELECT SUM(p.preco) from venda v inner join produto p on v.prod = p.id group by `data`;
-- Mostre o total faturado a cada dia. SELECT SUM(p.preco*v.qtd) from venda v inner join produto p on v.prod = p.id group by `data`;
​
ascendentedescendenteOrdem:Depurar SQLOrdem de execuçãoTempo gastoOrdenar por:Agrupar consultas
Ocorreram alguns erros enquanto informações de debug do SQL eram gerados.
FavoritosAtualizarAdicionar
Sem marcador(es)
Adicionar marcador
Rótulo: 
 Banco de Dados destino: 
 Compartilhar marcador 
​
OpçõesDefinir padrão
Sempre expandir mensagens de consulta
Mostrar histórico de consulta ao iniciar
Mostrar consulta de navegação atual
 Execute consultas com Enter e insira nova linha com Shift + Enter. Para definir esta configuração como permanente, vá em configurações.
Mudar para o tema escuro

 A seleção atual não contém uma única coluna. As funções edição em grade, checkbox, editar, copiar e apagar não estão disponíveis. Documentação
 Mostrando registros 0 - 1 (2 no total, Consulta levou 0.0007 segundos.)
-- Mostre o total faturado a cada dia. SELECT SUM(p.preco*v.qtd) from venda v inner join produto p on v.prod = p.id group by `data`;
[ Editar em linha ] [ Editar ] [ Criar código PHP ]
 Mostrar tudo	|			Número de linhas: 
25
Filtrar linhas: 
Procurar nesta tabela
SUM(p.preco*v.qtd)
10.00
100.00
 Mostrar tudo	|			Número de linhas: 
25
Filtrar linhas: 
Procurar nesta tabela
Operações resultantes das consultas
    
Marcar essa consulta SQL Marcar essa consulta SQL
Rótulo: 
 Deixar qualquer usuário acessar esse marcador




Pressione Ctrl+Enter para executar consulta
SELECT * FROM `seccao`
SELECT * FROM `empregado`
SELECT * FROM `seccao`
SELECT * FROM `empregado`
SELECT * FROM `empregado`
ALTER TABLE empregado MODIFY COLUMN chefe int;
ALTER TABLE empregado add CONSTRAINT fk_empregado_chefe FOREIGN KEY (chefe) references empregado(numEmp);
SELECT * FROM `empregado`
SELECT * FROM `empregado`
SELECT * FROM `empregado`
INSERT INTO empregado (numEmp, nome, seccao, posto, chefe, salario, comissao) VALUES (3, 'Alvaro',50, 'Administrador', null, 2500,0), (5, 'Susana',20, 'Admistrador', null, 2750,30), (1, 'Ana',10, 'Programador', 3, 3000,10), (2, 'Nuno',70, 'Engenheiro', 1, 1500,40), (4, 'Antonio',10, 'Engenheiro', 3, 2500,20), (6, 'Claudio',60,'Vendedor', 4, 1000,50);
select s.nome, s.cidade from seccao s where s.numsec=70;
select e.posto, e.salario, e.comissao from empregado e where e.COMISSAO>e.salario;
select s.nome from seccao s where s.cidade like 'Porto';
select e.nome, e.salario, e.comissao from empregado e where e.salario>=20*e.comissao or e.salario=2000;
select distinct e.posto from empregado e;
select e.nome, e.posto, e.salario from empregado e where e.seccao!=70 order by e.posto, e.salario desc;
select e.nome from empregado e where e.seccao not in (select s.numsec from seccao s where s.cidade like 'Porto');
select e.nome from empregado e where e.seccao not in (select s.numsec from seccao s where s.cidade like 'Porto');
select e.nome from empregado e where e.nome like 'A%a';
select e.nome, e.posto, e.seccao from empregado e where e.seccao in (20, 30, 40);
create database GestComercial_jdf;
CREATE TABLE Cliente ( id int AUTO_INCREMENT PRIMARY KEY, nome varchar(50) not null, morada varchar(250), estado bit );
CREATE TABLE produto ( id int AUTO_INCREMENT PRIMARY KEY, descricao varchar(50) not null, preco decimal(12,2) );
CREATE TABLE Venda ( prod INT, cli INT, data DATETIME, qtd INT , PRIMARY KEY (prod, cli, data), FOREIGN KEY (prod) REFERENCES Produto(id), FOREIGN KEY (cli) REFERENCES Cliente(id) );
SELECT * FROM `cliente`
INSERT INTO cliente ( id, nome, morada, estado) VALUES (1,'Helena Monteiro', 'Perafita – Freixieiro ',1), (2,'Raul Simas', 'Palmela',0);
INSERT INTO produto ( id, descricao,preco) VALUES (1,'Rato Logitec XPTO 1 ', 10 ), (2,'Monitor Sony Vaio XPTO',120);
SELECT * FROM `venda`
INSERT INTO Venda (cli, prod, qtd, data) VALUES (1, 1, 1, '2012-04-05 00:00:00'), (2, 1, 5, '2012-04-05 23:59:59');
SELECT * FROM `venda`
update Venda SET qtd=10 where cli=2;
SELECT * FROM `venda`
SELECT * FROM `cliente`
update cliente SET morada='Porto' where nome='Raul Simas';
SELECT * FROM `cliente`
SELECT * FROM `produto`
update produto SET preco=100 where descricao='Monitor Sony Vaio XPTO ';
SELECT * FROM `produto`
Expandir Repetir consulta Editar Demonstrar SQL Perfil Marcadores Banco de dados : gestcomercial_jdf Tempo de execução da consulta : 15:52:10
SELECT * FROM `produto`;
SELECT nome FROM cliente WHERE estado=1;
SELECT v.prod, v.qtd, v.data FROM cliente c INNER Join venda v on v.cli=c.id;
SELECT v.prod, v.qtd, v.data FROM cliente c INNER Join venda v on v.cli=c.id where c.nome='Raul Simas';
SELECT * FROM venda v INNER join cliente c ON c.id=v.cli where c.nome like 'H%';
SELECT * from venda v Inner join cliente c on v.cli=c.id;
SELECT count(*) as 'numero Vendas Raul' from venda v Inner join cliente c on v.cli=c.id where c.nome = 'Raul Simas';
SELECT MAX(preco) FROM produto;
SELECT MAX(preco) as 'valor mais alto' FROM produto;
SELECT * FROM `produto` WHERE preco<=100;
SELECT (c.nome) FROM cliente c left join venda v on c.id=v.cli where v.cli is null;
-- Mostre o total faturado a cada dia. SELECT * from venda v inner join produto p on v.prod = p.id;
-- Mostre o total faturado a cada dia. SELECT SUM(p.preco) from venda v inner join produto p on v.prod = p.id group by `data`;
-- Mostre o total faturado a cada dia. SELECT SUM(p.preco*v.qtd) from venda v inner join produto p on v.prod = p.id group by `data`;
a percebi primeiro penso no que ele quer e se sao 2 tabelas é o inner uma tabela coloco join e sem ser tabela composta o union ou seja sem fk da outra
1 reação Gosto.
1
obrigada professor ja percebi ja percebi pr... por Joana Neves - ALUNO PRT
17:18
Joana Neves - ALUNO PRT
obrigada professor ja percebi ja percebi primeiro penso no que ele quer e se sao 2 tabelas é o inner e  sem ser tabela composta o union sem repetiçao do atributo ou seja sem fk da outra
 
a frente do select é o que quero obter 
 
no final, se sao todos os atributos é o asterisco.
 
se for na mesma tabela so uma sem valores repetidos é o outro. 
 
so uma tabela é o distinct,2 tabela sem ser... por Joana Neves - ALUNO PRT
17:19
Editada
Joana Neves - ALUNO PRT
so uma tabela é o distinct,2 tabela sem ser composta é o union
e ter cuidados com as classes caso seja uma... por Joana Neves - ALUNO PRT
17:21
Joana Neves - ALUNO PRT
e ter cuidados com as classes caso seja uma superclass colocar na tabela primeiro a superclass com os ids primeiros e depois a subclass
acho que foram as notas de hoje colegas, go... por Joana Neves - ALUNO PRT
17:22
Joana Neves - ALUNO PRT
acho que foram as notas de hoje colegas, gostei mto. e aprendi mto
tenho que aprender a lidar com pressao mais... por Joana Neves - ALUNO PRT
17:23
Joana Neves - ALUNO PRT
tenho que aprender a lidar com pressao mais foi bom
e disto ainda falta nao esquecer dos not nu... por Joana Neves - ALUNO PRT
17:23
Joana Neves - ALUNO PRT
e disto ainda falta nao esquecer dos not null
e treinamos e tiramos 20 por Joana Neves - ALUNO PRT
17:23
Joana Neves - ALUNO PRT
e treinamos e tiramos 20
tem menu de contexto



 primeiro penso no que ele quer e se sao 2 tabelas é o inner e  sem ser tabela composta o union sem repetiçao do atributo ou seja sem fk da outra
 
a frente do select é o que quero obter 
 
no final, se sao todos os atributos é o asterisco.
 
se for na mesma tabela so uma sem valores repetidos é o outro. 
 
so uma tabela é o distinct, 2tabelas sem ser composta é o union
 
 
e ter cuidados com as classes caso seja uma superclass colocar na tabela primeiro a superclass com os ids primeiros e depois a subclass
 
e fazer exercicios
 
e falta nao esqueecer dos not null
 
e no inner a tabela a convem ser a tabela principal. ou seja se quero algo dos clientes coloco clientes apesar de ter condiçao com b. assim nao me baralho.
 
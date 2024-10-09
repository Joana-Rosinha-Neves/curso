-- criar base de dados

CREATE database joana_aula01 

CREATE DATABASE joana_aula01

CREATE TABLE tabela (
    id int AUTO_INCREMENT PRIMARY KEY,
    nome varchar(300)
    )

    use joana_aula01;

    CREATE TABLE tabela2 (
    id int AUTO_INCREMENT PRIMARY KEY,
    nome varchar(300)
    )


    use joana_aula01;

CREATE TABLE tabela2 (
    id int AUTO_INCREMENT PRIMARY KEY,
    nome varchar(300)
    );


    DROP TABLE tabela2


    ALTER TABLE tabela MODIFY COLUMN nome varchar(100) NOT null;


    -- CREATE TABLE tipo (
     -- id int AUTO_INCREMENT,
      -- nome varChar(30), 
      -- Constraint PK_TIPO PRIMARY KEY(id) 
      -- ); 
      -- CREATE TABLE tipo (
-- id int AUTO_INCREMENT,
-- nome varChar(30),
  --  Constraint PK_TIPO PRIMARY KEY(id)
    -- );


-- CREATE Table maquina (
-- numero int AUTO_INCREMENT,
-- idTipo INT,
-- dataUltimaManut datetime,
-- CONSTRAINT PK_MAQUINA PRIMARY KEY (numero),
-- CONSTRAINT FK_MAQUINA_IDTIPO FOREIGN KEY (idTipo) REFERENCES Tipo(id)
--);

CREATE TABLE Servico ( codFatura int, numaquina int, duracaoEmMinutos int, valor DECIMAL(8,2), NifCliente varchar(9), dataHora dateTime );

      CREATE Table maquina ( numero int AUTO_INCREMENT, idTipo INT, dataUltimaManut datetime, CONSTRAINT PK_MAQUINA PRIMARY KEY (numero), CONSTRAINT FK_MAQUINA_IDTIPO FOREIGN KEY (idTipo) REFERENCES Tipo(id) );



      
ALTER TABLE Sercico
ADD CONSTRAINT PK_SERVICO PRIMARY KEY (codFatura);

ALTER TABLE servico
ADD CONSTRAIND FK_SERVICO_MAQUINA FOREIGN KEY (numMaquina) REFERENCES Maquina
(numero);

ALTER TABLE servico
MODIFY COLUMN codFatura int AUTO_INCREMENT




-- ALTER TABLE servico
-- ADD CONSTRAINT PK_SERVICO PRIMARY KEY (codFatura);

-- ALTER TABLE servico
-- ADD CONSTRAIND FK_SERVICO_MAQUINA FOREIGN KEY (numMaquina)
-- REFERENCES Maquina (numero);

-- ALTER TABLE servico
-- MODIFY COLUMN codFatura int AUTO_INCREMENT
-- criar base de dados

CREATE database joana_aula01 

CREATE DATABASE joana_aula01

CREATE TABLE tabela (
    id int AUTO_INCREMENT PRIMARY KEY,
    nome varchar(300)
    )

    use joana_aula01;

    CREATE TABLE tabela2 (
    id int AUTO_INCREMENT PRIMARY KEY,
    nome varchar(300)
    )


    use joana_aula01;

CREATE TABLE tabela2 (
    id int AUTO_INCREMENT PRIMARY KEY,
    nome varchar(300)
    );


    DROP TABLE tabela2


    ALTER TABLE tabela MODIFY COLUMN nome varchar(100) NOT null;


    -- CREATE TABLE tipo (
     -- id int AUTO_INCREMENT,
      -- nome varChar(30), 
      -- Constraint PK_TIPO PRIMARY KEY(id) 
      -- ); 
      -- CREATE TABLE tipo (
-- id int AUTO_INCREMENT,
-- nome varChar(30),
  --  Constraint PK_TIPO PRIMARY KEY(id)
    -- );


-- CREATE Table maquina (
-- numero int AUTO_INCREMENT,
-- idTipo INT,
-- dataUltimaManut datetime,
-- CONSTRAINT PK_MAQUINA PRIMARY KEY (numero),
-- CONSTRAINT FK_MAQUINA_IDTIPO FOREIGN KEY (idTipo) REFERENCES Tipo(id)
--);

-- CREATE TABLE Servico ( codFatura int, numaquina int, duracaoEmMinutos int, valor DECIMAL(8,2), NifCliente varchar(9), dataHora dateTime );

--       CREATE Table maquina ( numero int AUTO_INCREMENT, idTipo INT, dataUltimaManut datetime, CONSTRAINT PK_MAQUINA PRIMARY KEY (numero), CONSTRAINT FK_MAQUINA_IDTIPO FOREIGN KEY (idTipo) REFERENCES Tipo(id) );



      
-- ALTER TABLE Sercico
-- ADD CONSTRAINT PK_SERVICO PRIMARY KEY (codFatura);

-- ALTER TABLE servico
-- ADD CONSTRAIND FK_SERVICO_MAQUINA FOREIGN KEY (numMaquina) REFERENCES Maquina
-- (numero);

-- ALTER TABLE servico
-- MODIFY COLUMN codFatura int AUTO_INCREMENT




-- ALTER TABLE servico
-- ADD CONSTRAINT PK_SERVICO PRIMARY KEY (codFatura);

-- ALTER TABLE servico
-- ADD CONSTRAIND FK_SERVICO_MAQUINA FOREIGN KEY (numMaquina)
-- REFERENCES Maquina (numero);

-- ALTER TABLE servico
-- MODIFY COLUMN codFatura int AUTO_INCREMENT

--INSERT INTO maquina (idTipo, dataUltimaManut) VALUES 
-- (1,´2024-09-15 11:50'),
-- (1


-- INSERT INTO Tipo(nome) VALUES ('lava'), ('seca');


-- INSERT INTO maquina (idTipo, dataUltimaManut) VALUES (1,"2024-09-15 11:50"), (1, "2024-05-14 11:20");


-- UPDATE maquina SET dataUltimaManut = "2024-09-26 15:11" WHERE numero = 2;

-- UPDATE maquina SET dataUltimaManut = NOW() WHERE numero = 2;


--INSERT INTO tipo(nome.id) VALUES (100,"lava"),(null,"seca")
DELETE FROM tipo where id in (100,101)

Insert INTO TIPO (nome) Values ("lava/seca");

SELECT *FROM tipo

INSERT INTO tipo(nome.id) 
VALUES (100,"lava"),(null,"seca")

DELETE FROM tipo where id in (100,101)

Insert INTO TIPO (nome) Values ("lava/seca");

SELECT *FROM tipo

UPDATE tipo
set id=3,nome = "outro nome"
Where id=103


INSERT INTO tipo(nome.id) 
VALUES (100,"lava"),(null,"seca")

DELETE FROM tipo where id in (100,101)

Insert INTO TIPO (nome) Values ("lava/seca");

SELECT *FROM tipo

UPDATE tipo
set id=3,nome = "outro nome"
Where id=103

("101", 2. "2024-09-13 12:00"),
("102", 1. "2024-09-25 09:59"),



ALTER TABLE servico 
CHANGE COLUMN `mumMaquina` numMaquina int




SELECT * FROM `servico`;

SELECT codFatura, numMaquina FROM `servico` 


SELECT *
FROM servico
Where 'numMaquina'=100 AND valor>=12.3


SELECT *
FROM servico
Where numMaquinA = 100 AND valor>=12.3 AND nifCliente IS NOT null

SELECT *
FROM servico
Where numMaquinA = 100 AND (valor>=12.3 OR nifCliente IS null)

porque primeiro o and parentisis


SELECT *
FROM servico
Where numMaquinA = 100 AND (valor>=12.3 OR nifCliente IS null)



SELECT *
FROM servico
-- Where valor>=10 AND valor<=15 
WHERE valor BETWEEN 10 AMD 15 

SELECT *
FROM servico
-- Where valor>=10 AND valor<=15 
-- WHERE valor BETWEEN 10 AND 15 
Where valor<10 OR valor<15 


SELECT *
FROM servico
-- Where valor>=10 AND valor<=15 
-- WHERE valor BETWEEN 10 AND 15 
-- Where valor<10 OR valor<15 
WHERE valor not BETWEEN 10 AND 15 

SELECT * FROM `tipo` WHERE nome= 'lava';

SELECT * 
FROM `tipo` 
WHERE nome= 'lava%';

SELECT * 
FROM tipo
WHERE nome LIKE 

SELECT * 
FROM tipo
WHERE nome LIKE 'lava_%'



SELECT * FROM `maquina` 
ORDER BY dataUltimaManut DESC


SELECT * FROM `maquina` 
ORDER BY dataUltimaManut, idTipo 


'2024-09-15' and '2024-09-30'
 SELECT * 
FROM maquina
WHERE dataUltimaManut BETWEEN '2024-09-15' and '2024-09-30 23:59:59' para garantir a hora o dia inteiro


SELECT COUNT(*)
FROM maquina
where id>105

SELECT COUNT(*) FROM maquina where numero >105;


SELECT COUNT(*) AS 'MAQUINA MAIS 105' FROM maquina where numero >105;


SELECT SUM(valor)
FROM `servico`;



SELECT SUM(valor) FROM `servico`;


WHERE dataHora BETWEEN '2024-09-01' and '2024-09-15 23:59:59'


SELECT SUM(valor) FROM servico WHERE dataHora BETWEEN '2024-01-01' and '2024-03-31 23:59:59';


SELECT AVG(valor)
FROM servico
WHERE dataHora BETWEEN '2024-01-01' and '2024-03-31 23:59:59'
 


 SELECT MAX(valor) FROM servico WHERE dataHora BETWEEN '2024-01-01' and '2024-03-31 23:59:59';


 SELECT DISTINCT valor
From servico


SELECT DISTINCT valor, COUNT(*)
From servico



SELECT  valor, COUNT(*)
From servico
GROUP BY valor

IGUAL AO DISTIVENT


SELECT  valor, COUNT(*)
From servico
GROUP BY valor


SELECT  valor, COUNT(*)
From servico
GROUP BY valor

SELECT  COUNT(*)
FROM servico;


SELECT valor, COUNT(*) as contagem
From servico
GROUP BY valor
HAVING contagem >250


SELECT valor, COUNT(*) as contagem
From servico
-- WHERE valor!= 8.5
GROUP BY valor
HAVING contagem >250;


SELECT valor, COUNT(*) as contagem
From servico
-- WHERE valor!= 8.5
GROUP BY valor
HAVING contagem >250;


SELECT count(*)
FROM servico;


SELECT valor, COUNT(*) as contagem
From servico
-- WHERE valor!= 8.5
GROUP BY valor
HAVING contagem >250;


SELECT count(*)
FROM servico;



SELECT *
FROM tipo, maquina


SELECT *
FROM tipo, maquina
where tipo.id = maquina.idTipo 


SELECT * FROM `maquina` 
inner join tipo on maquina.idTipo = tipo.id


SELECT maquina.numero, maquina.dataUltimaManut, tipo.nome
FROM `maquina` 
inner join tipo on maquina.idTipo = tipo.id


SELECT * FROM `servico` INNER JOIN maquina on maquina.numero = servico.numMaquina INNER JOIN tipo on tipo.id= maquina.idTipo;


SELECT * FROM `servico` INNER JOIN maquina on maquina.numero = servico.numMaquina left JOIN tipo on tipo.id= maquina.idTipo;
 

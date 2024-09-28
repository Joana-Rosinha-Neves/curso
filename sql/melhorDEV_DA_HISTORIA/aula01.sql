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

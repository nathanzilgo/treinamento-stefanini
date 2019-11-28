CREATE TABLE pessoa(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	ativo BOOLEAN NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(10) ,
	complemento VARCHAR(100) ,
	bairro VARCHAR(50),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(30)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES('Nathan F.', TRUE, 'Rua Sebastião Nascimento', '500', 'Perto da padaria x', 'Centro', '5409-32', 'Campina Grande', 'Paraíba');

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
VALUES('Joao Nascimento', TRUE, 'Rua Fantasia 1', '345', 'Perto do bar da loira', 'São José', '11387-65', 'João Pessoa', 'Paraíba');

CREATE TABLE usuarios(
  id BIGINT(20) PRIMARY KEY AUTO INCREMENT,
  nome VARCHAR(50) NOT NULL,
  email VARCHAR(100) UNIQUE NOT NULL,
  senha VARCHAR(100) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO TABLE usuarios(nome, email, senha) VALUES("Joaozinho", "joaozinho@outlook.com", "eaimain123");
INSERT INTO TABLE usuarios(nome, email, senha) VALUES("Maria", "mariafernandes@outlook.com", "m4r14t4mb13n");
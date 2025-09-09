CREATE TABLE usuario(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(150) NOT NULL,
	email VARCHAR(100) UNIQUE NOT NULL,
	tipo_usuario VARCHAR(10) DEFAULT 'comum'
);

CREATE TABLE conta(
	id SERIAL PRIMARY KEY,
	senha VARCHAR(255) NOT NULL,
	id_usuario INT NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

CREATE TABLE categoria(
	id SERIAL PRIMARY KEY,
	titulo VARCHAR(100) NOT NULL
);

CREATE TABLE status_tarefa(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(9) NOT NULL
);

CREATE TABLE tarefa(
	id SERIAL PRIMARY KEY,
	titulo VARCHAR(100) NOT NULL,
	descricao TEXT,
	data DATE,
	id_status_tarefa INT NOT NULL,
	id_conta INT NOT NULL,
	id_categoria INT,
	FOREIGN KEY (id_status_tarefa) REFERENCES status_tarefa(id),
	FOREIGN KEY (id_conta) REFERENCES conta(id),
	FOREIGN KEY (id_categoria) REFERENCES categoria(id)
);

INSERT INTO status_tarefa(nome) VALUES ('atribuído'), ('concluído'), ('pendente');
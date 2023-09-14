insert into tb_tipo_logradouro (nome_tipo_logradouro) values ('Rua');

insert into tb_endereco (cep, tipo_logradouro_id_fk) values ('12345678', 1);

INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk)
VALUES ('João Silva', '01/01/1990', 'Masculino', 0, '111.222.333-44', '1.222.333', 'Passaporte: 123456', 'vitor@email.com', '67999999999', '6734615555', 1);

-- Inserir um novo tipo de logradouro
INSERT INTO tb_tipo_logradouro (nome_tipo_logradouro) VALUES ('Avenida');

-- Inserir um endereço com o novo tipo de logradouro
INSERT INTO tb_endereco (cep, tipo_logradouro_id_fk) VALUES ('98765432', 2);

-- Inserir outra pessoa com um endereço diferente
INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk)
VALUES ('Maria Santos', '15/05/1985', 'Feminino', 1, '987.654.321-00', '2.345.678', 'Passaporte: 789012', 'maria@email.com', '67998888888', '6734619999', 2);

-- Inserir uma pessoa com um novo tipo de documento
INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk)
VALUES ('Pedro Oliveira', '20/11/1982', 'Masculino', 0, '333.444.555-66', '3.444.555', 'CNH: 987654', 'pedro@email.com', '67997777777', '6734618888', 1);

-- Inserir um novo tipo de logradouro
INSERT INTO tb_tipo_logradouro (nome_tipo_logradouro) VALUES ('Avenida');

-- Inserir um endereço com o novo tipo de logradouro
INSERT INTO tb_endereco (cep, nome_logradouro, numero, complemento, bairro, cidade, estado, pais, tipo_logradouro_id_fk)
VALUES ('98765432', 'Avenida das Flores', 123, 'Bloco A, Ap. 301', 'Centro', 'São Paulo', 'SP', 'Brasil', 1);

-- Inserir outra pessoa com um endereço diferente
INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk)
VALUES ('Maria Santos', '15/05/1985', 'Feminino', 1, '987.654.321-00', '2.345.678', 'Passaporte: 789012', 'maria@email.com', '67998888888', '6734619999', 2);

-- Inserir uma pessoa com um novo tipo de documento
INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk)
VALUES ('Pedro Oliveira', '20/11/1982', 'Masculino', 0, '333.444.555-66', '3.444.555', 'CNH: 987654', 'pedro@email.com', '67997777777', '6734618888', 1)
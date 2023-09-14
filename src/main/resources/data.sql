INSERT INTO tb_tipo_logradouro (nome_tipo_logradouro) values ('Rua');
INSERT INTO tb_tipo_logradouro (nome_tipo_logradouro) VALUES ('Avenida');

INSERT INTO tb_escolaridade (nome_descricao) VALUES ('Ensino Fundamental');
INSERT INTO tb_escolaridade (nome_descricao) VALUES ('Ensino Médio');
INSERT INTO tb_escolaridade (nome_descricao) VALUES ('Ensino Superior');


INSERT INTO tb_endereco (cep, nome_logradouro, numero, complemento, bairro, cidade, estado, pais, tipo_logradouro_id_fk)
VALUES ('98765432', 'Avenida das Flores', 123, 'Bloco A, Ap. 301', 'Centro', 'São Paulo', 'SP', 'Brasil', 1);

INSERT INTO tb_endereco (cep, nome_logradouro, numero, complemento, bairro, cidade, estado, pais, tipo_logradouro_id_fk)
VALUES ('12345678', 'Rua das Palmeiras', 456, 'Bloco B, Ap. 302', 'Centro', 'São Paulo', 'SP', 'Brasil', 2);


INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk, id_escolaridade_fk)
values ('João Silva', '10/01/1980', 'Masculino', 0, '111.222.333-44', '1.222.333', 'CNH: 123456', 'joao@email.com', '67999999999', '6734611111', 1, 1);

INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk, id_escolaridade_fk)
values ('Maria Silva', '10/01/1980', 'Feminino', 0, '111.222.333-44', '1.222.333', 'CNH: 123456', 'maria@email.com', '67999999999', '6734611111', 2, 2);

INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk, id_escolaridade_fk)
values ('José Silva', '10/01/1980', 'Masculino', 0, '111.222.333-44', '1.222.333', 'CNH: 123456', 'jose@email.com', '67999999999', '6734611111', 1, 3);
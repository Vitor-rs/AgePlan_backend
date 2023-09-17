insert into tb_tipo_logradouro (nome_tipo_logradouro) values ('Rua');
insert into tb_tipo_logradouro (nome_tipo_logradouro) values ('Avenida');

INSERT INTO tb_profissao_cargo_funcao (nome_descricao) VALUES ('Analista de Sistemas');
INSERT INTO tb_profissao_cargo_funcao (nome_descricao) VALUES ('Analista de Suporte');
INSERT INTO tb_profissao_cargo_funcao (nome_descricao) VALUES ('Analista de Testes');

insert into tb_escolaridade (nome_descricao) values ('Ensino Fundamental');
insert into tb_escolaridade (nome_descricao) values ('Ensino Médio');
insert into tb_escolaridade (nome_descricao) values ('Ensino Superior');

insert into tb_orgao_instituicao_empresa (nome_descricao, sigla) values ('Instituto Federal de Mato Grosso do Sul', 'IFMS');
insert into tb_orgao_instituicao_empresa (nome_descricao, sigla) values ('Universidade Federal de Mato Grosso', 'UFMT');

insert into tb_endereco (cep, nome_logradouro, numero, complemento, bairro, cidade, estado, pais, tipo_logradouro_id_fk)
values ('98765432', 'Avenida das Flores', 123, 'Bloco A, Ap. 301', 'Centro', 'São Paulo', 'SP', 'Brasil', 1);

insert into tb_endereco (cep, nome_logradouro, numero, complemento, bairro, cidade, estado, pais, tipo_logradouro_id_fk)
values ('12345678', 'Rua das Palmeiras', 456, 'Bloco B, Ap. 302', 'Centro', 'São Paulo', 'SP', 'Brasil', 2);

-- Criando exemplos de registros de frequência das pessoas
insert into registro_frequencia (data_hora_registro, numero_aula, presenca, conteudo_planejado, conteudo_ministrado, observacoes_anotacoes, duracao_aula, fala, audicao, leitura, escrita, tarefa, situacao_tarefa, app, engajamento, sala)
values ('2021-01-01 10:00:00', 1, 'P', 'Introdução ao Java', 'Introdução ao Java', 'Aula de introdução ao Java', '1h', 5, 5, 5, 5, 5, 'Concluída', 'Google Meet', 5, 1);

insert into registro_frequencia (data_hora_registro, numero_aula, presenca, conteudo_planejado, conteudo_ministrado, observacoes_anotacoes, duracao_aula, fala, audicao, leitura, escrita, tarefa, situacao_tarefa, app, engajamento, sala)
values ('2021-01-01 10:00:00', 2, 'P', 'Classes em Java', 'Introdução ao Java', 'Aula de introdução ao Java', '1h', 5, 5, 5, 5, 5, 'Concluída', 'Google Meet', 5, 1);

insert into registro_frequencia (data_hora_registro, numero_aula, presenca, conteudo_planejado, conteudo_ministrado, observacoes_anotacoes, duracao_aula, fala, audicao, leitura, escrita, tarefa, situacao_tarefa, app, engajamento, sala)
values ('2021-01-01 10:00:00', 1, 'P', 'Introdução ao Java', 'Introdução ao Java', 'Aula de introdução ao Java', '1h', 5, 5, 5, 5, 5, 'Concluída', 'Google Meet', 5, 1);

-- Adicionando exemplos de pessoas
insert into tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk, id_escolaridade_fk, id_orgao_instituicao_empresa_fk, id_profissao_cargo_funcao_fk)
values ('João Silva', '10/01/1980', 'Masculino', 0, '111.222.333-44', '1.222.333', 'CNH: 123456', 'joao@email.com', '67999999999', '6734611111', 1, 1, 1, 1);

insert into tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk, id_escolaridade_fk, id_orgao_instituicao_empresa_fk, id_profissao_cargo_funcao_fk)
values ('Maria Silva', '10/01/1980', 'Feminino', 0, '111.222.333-44', '1.222.333', 'CNH: 123456', 'maria@email.com', '67999999999', '6734611111', 2, 1, 1, 1);
insert into tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk)
values ('João da Silva', '01/01/2000', 'Masculino', 0, '700.111.222-33', '1.000.333', 'Passaporte: 123456', 'vitor@email.com', '67999999999', '6734615555', 1);

insert into tb_endereco (cep, nome_logradouro, numero, complemento, bairro, cidade, estado, pais)
values ('79000000', 'Rua 1', 1, 'Casa 1', 'Centro', 'Campo Grande', 'MS', 'Brasil');
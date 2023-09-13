insert into tb_tipo_logradouro (nome_tipo_logradouro) values ('Rua');
insert into tb_endereco (cep, tipo_logradouro_id_fk) values ('12345678', 1);
insert into tb_pessoa (nome_completo, id_endereco_fk) values ('Vitor Santos', 1);

insert into tb_tipo_logradouro (nome_tipo_logradouro) values ('Avenida');
insert into tb_endereco (cep, tipo_logradouro_id_fk) values ('87654321', 2);
insert into tb_pessoa (nome_completo, id_endereco_fk) values ('João Silva', 2);

insert into tb_endereco (cep, tipo_logradouro_id_fk) values ('12345678', 2);
insert into tb_pessoa (nome_completo, id_endereco_fk) values ('Maria Souza', 3);
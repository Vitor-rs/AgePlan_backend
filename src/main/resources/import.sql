-- Inserindo dados de exemplo na tabela tb_endereco
INSERT INTO tb_endereco (cep, nome_logradouro, numero, complemento, bairro, cidade, estado, pais)
VALUES
    ('12345-678', 'Rua Exemplo 123', 456, 'Apto 101', 'Bairro A', 'Cidade X', 'Estado A', 'Brasil'),
    ('54321-876', 'Avenida Teste 456', 789, 'Casa 2', 'Bairro B', 'Cidade Y', 'Estado B', 'Brasil');

-- Inserindo dados de exemplo na tabela tb_pessoa
INSERT INTO tb_pessoa (nome_completo, data_nascimento, genero, estrangeiro, cpf, rg, outros_documentos, email, telefone_celular, telefone_fixo, id_endereco_fk)
VALUES
    ('João da Silva', '1990-05-15', 'Masculino', false, '123.456.789-00', '9876543', 'Passaporte: XYZ123', 'joao@example.com', '(11) 98765-4321', '(11) 1234-5678', 1),
    ('Maria Souza', '1985-03-20', 'Feminino', true, 'N/A', '1234567', 'RG: ABC987', 'maria@example.com', '(21) 98765-4321', '(21) 1234-5678', 2);
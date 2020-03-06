INSERT INTO user(id,nome,cpf,login,senha,papel,cep,logradouro,bairro,cidade,uf,complemento) values(1,'Luiz Cesar Tavares Bibas Filho','99999999999','admin','123456'
,'ROLE_ADMIN','66040020','Avenida Alcindo Cacela ','Nazaré','Belém','PA','casa 99');


INSERT INTO user(id,nome,cpf,login,senha,papel,cep,logradouro,bairro,cidade,uf,complemento) values(2,'Talita Oliveira de Nazaré','88888888888','comum','123456'
,'ROLE_COMUM','88888888','Alcindo Cacela 888','São Bras','Belém','PA','Apt 2502');

INSERT INTO email(id, email, user_id) values (1,'admin@admin.com.br',1);

INSERT INTO email(id, email, user_id) values (3,'luiz@luiz.com.br',1);


INSERT INTO email(id, email, user_id) values (2,'comum@comum.com.br',2);

INSERT INTO telefone(id, tipo, telefone, user_id) values (1, 'celular', '91991201598',1);

INSERT INTO telefone(id, tipo, telefone, user_id) values (2, 'celular', '999comum',2);

INSERT INTO telefone(id, tipo, telefone, user_id) values (3, 'residencial', '32497754',1);

INSERT INTO telefone(id, tipo, telefone, user_id) values (4, 'residencial', '3249comum',2);






INSERT INTO user(id,nome,cpf,login,senha,papel,cep,logradouro,bairro,cidade,uf,complemento) values(1,'admin','cpf','admin','123456'
,'ROLE_ADMIN','cep','logradouro','bairro','cidade','uf','complemento');


INSERT INTO user(id,nome,cpf,login,senha,papel,cep,logradouro,bairro,cidade,uf,complemento) values(2,'comum','cpf','comum','123456'
,'ROLE_COMUM','cep','logradouro','bairro','cidade','uf','complemento');

INSERT INTO email(id, email, user_id) values (1,'admin@admin',1);

INSERT INTO email(id, email, user_id) values (2,'comum@comum',2);

INSERT INTO telefone(id, tipo, telefone, user_id) values (1, 'celular', '999admin',1);

INSERT INTO telefone(id, tipo, telefone, user_id) values (2, 'celular', '999comum',2);






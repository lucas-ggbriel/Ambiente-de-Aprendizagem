create database ecomerce;

use ecomerce;

create table produto(
	id_produto bigint (5) auto_increment,
    nome_produto varchar (25),
    preco_produto float (12,3),
    parcelamento_produto int (12),
    categoria_produtop varchar (25),
    
    primary key (id_produto)
)


insert into produto (nome_produto, preco_produto, parcelamento_produto, categoria_produtop) values
("Iphone 11",6000.00,12, "Eletrônicos - Celulares");
insert into produto (nome_produto, preco_produto, parcelamento_produto, categoria_produtop) values
("Iphone 11",6000.00,12, "Eletrônicos - Celulares");
insert into produto (nome_produto, preco_produto, parcelamento_produto, categoria_produtop) values
("Iphone 4",1000.00,8, "Eletrônicos - Celulares");
insert into produto (nome_produto, preco_produto, parcelamento_produto, categoria_produtop) values
("Iphone 5",1200.00,3, "Eletrônicos - Celulares");
insert into produto (nome_produto, preco_produto, parcelamento_produto, categoria_produtop) values
("Iphone 6",3000.00,0, "Eletrônicos - Celulares");
insert into produto (nome_produto, preco_produto, parcelamento_produto, categoria_produtop) values
("Iphone 7",4000.00,2, "Eletrônicos - Celulares");

select * from produto where preco_produto > 500;
select * from produto where preco_produto < 500;
select * from produto where preco_produto >= 700 and preco_produto <= 900;

delete from produto where id_produto = 2;
update produto set preco_produto = 400 where id_produto = 3;
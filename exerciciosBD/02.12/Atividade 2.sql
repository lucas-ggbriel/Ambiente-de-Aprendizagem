create table db_ecommerce2;

use db_ecommerce2;

create table tb_categoria(
	id_categoria bigint (5) auto_increment,
    nome_categoria varchar (25),
    segmento_categoria varchar (25),
    
    primary key (id_categoria)
)

create table bt_produto(
	id_produto bigint (5) auto_increment,
    nome_produto varchar (25),
    preco_produto float (12,3),
    modelo_produto varchar (25),
    categoria bigint(5),
    
    primary key (id_produto),
    foreign key (categoria) references tb_categoria (id_categoria)
)

insert into tb_categoria (nome_categoria, segmento_categoria)
values ("Celulares", "Eletrônicos");
insert into tb_categoria (nome_categoria, segmento_categoria)
values ("Tablets", "Eletrônicos");
insert into tb_categoria (nome_categoria, segmento_categoria)
values ("Televisão", "Eletrônicos");
insert into tb_categoria (nome_categoria, segmento_categoria)
values ("Geladeira", "Eletrodomésticos");
insert into tb_categoria (nome_categoria, segmento_categoria)
values ("Microondas", "Eletrodomésticos");

insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung S10", 9000, "Samsung S10", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung A10", 1000, "Samsung A10", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Moto One Action", 2000, "Moto One", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung Fros-free", 5000, "Geladeira Samsung", 4);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Nokia T56", 1500, "Nokia T56", 2);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung 35", 9000, "Samsung S10", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung A23", 1000, "Samsung A10", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Moto One G", 2000, "Moto G", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung Arc.", 5000, "Ar-condicionado", 3);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Nokia T57", 2000, "Nokia T57", 2);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung S4", 400, "Samsung S4", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung A20", 3000, "Samsung A20", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Moto Z3", 2000, "Moto Z", 1);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Samsung Watch", 5000, "Samsung Watch", 4);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Nokia T58", 2500, "Nokia T58", 2);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Sony Vayo 1", 19000, "Sony Vayo", 3);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Sony Vayo 2", 38000, "Sony Vayo", 3);
insert into bt_produto (nome_produto, preco_produto, modelo_produto, categoria)
values ("Sony Vayo 3", 57000, "Sony Vayo", 3);

select * from bt_produto where preco_produto > 2000;
select * from bt_produto where preco_produto >= 1000 and preco_produto <= 2000;
select * from bt_produto where nome_produto like "%c%";


select * from bt_produto 
inner join tb_categoria on tb_categoria.id_categoria = bt_produto.categoria;;

select * from bt_produto 
inner join tb_categoria on tb_categoria.id_categoria = bt_produto.categoria
where tb_categoria.segmento_categoria = "Eletrônicos";
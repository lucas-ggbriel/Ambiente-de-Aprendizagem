create database locadora;

use locadora;

create table filmes(
	id_filmes bigint (5) auto_increment,
	nome_filme varchar (30),
	ano_filme int (4),
	categoria_filme varchar (30),
	duracao_filme vharchar (20),

	primary key (id_filmes)
);

insert into filmes (nome_filme, ano_filme, categoria_filme, duracao_filme)
values ("Em busca de vingança", 2012,"Ação","2 horas");
insert into filmes (nome_filme, ano_filme, categoria_filme, duracao_filme)
values ("2012", 2012,"Ação","1,5 horas");
insert into filmes (nome_filme, ano_filme, categoria_filme, duracao_filme)
values ("A história de um cas.", 2019,"Drama","2 horas");
insert into filmes (nome_filme, ano_filme, categoria_filme, duracao_filme)
values ("Chuck", 2013,"Terror","2 horas");
insert into filmes (nome_filme, ano_filme, categoria_filme, duracao_filme)
values ("Annabele", 2018,"Terror","1,6 horas");
insert into filmes (nome_filme, ano_filme, categoria_filme, duracao_filme)
values ("Até o último homem", 2018,"Superação","2 horas");

select * from filmes where nome_filme like "%s%";
select * from filmes where categoria_filme = "Drama";

delete from filmes where id_filme = 3;
update filmes set ano_filme = 2014 where id_filme = 4;

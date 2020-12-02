create database petshop;

use petshop;

create table animais (
	id_animais bigint (5) auto_increment,
	nome_animal varchar (25),
	peso_animal float(10,3),
	especie_animal varchar (30),
	sexo_animal boolean,

	primary key (id_animais)
);

insert into animais (nome_animal, peso_animal, especie_animal , sexo_animal)
	values("Alexandra", 800, "hipopótomo", true);

insert into animais (nome_animal, peso_animal, especie_animal , sexo_animal)
	values(Diana", 2000, "vaca", true);

insert into animais (nome_animal, peso_animal, especie_animal , sexo_animal)
	values("Bob", 20, "chachorro", false);

insert into animais (nome_animal, peso_animal, especie_animal , sexo_animal)
	values("Evandro", 90, "capivara", false);

insert into animais (nome_animal, peso_animal, especie_animal , sexo_animal)
	values("Bohr", 8, "gato", false);

select from animais where nome_animal like "%b%";
select from animais where peso_animal > 20;

delete from animais where id_animais = 1;
update animais set nome_animal = "Augusta" where id_animais = 2;

Atividade 1:

create datebase db_rh2;

use db_rh2;

creat table tb_cargo(
	id_cargo bigint (5) auto_increment,
	nome_cargo varchar (25),
	piso_cargo float (12,3),

	primary key (id_cargo)
);

create table tb_funcionário(
	id_funcionario bigint (5) auto_increment,
	nome_funcionario varchar(25),
	salario_funcionario float (12,3),
	endereco_funcionario varchar (40),
	cargo bigint (5),

	primary key (id_funcionario),
	foreign key (cargo) references tb_cargo (id_cargo)
);

insert into tb_cargo (nome_cargo, piso_cargo) 
values ("Programador Java J.", 6530.00);
insert into tb_cargo (nome_cargo, piso_cargo) 
values ("Programador Java S.", 10530.80);
insert into tb_cargo (nome_cargo, piso_cargo) 
values ("Programador Java FS.", 15962.30);
insert into tb_cargo (nome_cargo, piso_cargo) 
values ("UI", 8934.00);
insert into tb_cargo (nome_cargo, piso_cargo) 
values ("UX", 9000.00);


insert into tb_funcionário (nome_funcionario, salario_funcionario, endereco_funcionario, cargo)
values ("Lucas", 16893.00, "Hortolândia - SP", 3);
insert into tb_funcionário (nome_funcionario, salario_funcionario, endereco_funcionario, cargo)
values ("Sthefanie", 8893.00, "Hortolândia - SP", 2);
insert into tb_funcionário (nome_funcionario, salario_funcionario, endereco_funcionario, cargo)
values ("Laura", 16893.00, "Campinas - SP", 3);
insert into tb_funcionário (nome_funcionario, salario_funcionario, endereco_funcionario, cargo)
values ("Luana", 9000.00, "Hortolândia - SP", 5);
insert into tb_funcionário (nome_funcionario, salario_funcionario, endereco_funcionario, cargo)
values ("Marcelo", 16893.00, "São Paulo - SP", 3);
insert into tb_funcionário (nome_funcionario, salario_funcionario, endereco_funcionario, cargo)
values ("Hugo", 8000.00, "Hortolândia - SP", 4);
insert into tb_funcionário (nome_funcionario, salario_funcionario, endereco_funcionario, cargo)
values ("Camila", 16893.00, "Olinda - SP", 3);

select * from tb_funcionário where salario_funcionario > 2000;
select * from tb_funcionário where salario_funcionario >= 1000 and salario_funcionario <= 2000;
select * from tb_funcionário where nome_funcionario like "%c%";

select * from tb_funcionário 
left join tb_cargo on  tb_funcionário.cargo = tb_cargo.id_cargo;

select * from tb_funcionário 
left join tb_cargo on  tb_funcionário.cargo = tb_cargo.id_cargo
where tb_cargo.nome_cargo like "%Programador%";
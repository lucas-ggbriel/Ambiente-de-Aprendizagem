create database bd_rh;

use bd_rh;



create table tb_funcionario (
	id_funcionario bigint (5) auto_increment,
    nome_funcionario varchar (25),
    idade_funcionario int(3),
    endereco_funcionario varchar (100),
    salario_funcionario float (12,2),
    
    primary key (id_funcionario)
)

insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Roberto",30,"Campinas - SP", 4.000);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Regina",30,"Campinas - SP", 4000);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Lucas",19,"Hortolandia - SP", 12000);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Marcel",29,"Campinas - SP", 2000);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Rihanna",17,"Campinas - SP", 22000);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Isabella",38,"Campinas - SP", 4.200);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Paulo",30,"Campinas - SP", 4.100);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Miguel",40,"Campinas - SP", 4.300);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Vitor",27,"Campinas - SP", 5.000);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Augusto",24,"Campinas - SP", 1.200);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Leonardo",26,"Campinas - SP", 1.200);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Bruno",30,"Campinas - SP", 1.200);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Lia",35,"Campinas - SP", 1.200);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Luiza",37,"Campinas - SP",1.200);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Cynthia",52,"Campinas - SP",1.200);
insert into tb_funcionario (nome_funcionario, idade_funcionario, endereco_funcionario, salario_funcionario) values
("Isabel",38,"Campinas - SP", 1.200);

select * from tb_funcionario where salario_funcionario > 2000
select * from tb_funcionario where salario_funcionario < 2000

update tb_funcionario set salario_funcionario = 36.0 where id_funcionario = 1

delete from tb_funcionario where id_funcionario = 1;
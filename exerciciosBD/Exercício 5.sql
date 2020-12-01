create database escola;

use escola;

create table aluno(
	ra_aluno bigint (5) auto_increment,
    nome_aluno varchar(25),
    idade_aluno int (2),
    série_aluno varchar (3),
    perídio_aluno varchar(6),
    
    primary key (ra_aluno)
)

insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Rubens", 14, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Raíssa", 18, "3°A","Tarde");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Lucas", 14, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Everton", 17, "3°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Tiago", 15, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Tânia", 19, "3°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Marcos", 18, "3°A","Tarde");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Lucas", 14, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Marcelo", 17, "3°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Lucas G.", 15, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Marcia", 19, "3°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Alberto", 14, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Juliane", 17, "3°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Ana", 15, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Maria", 19, "3°A","Manhã");
    insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Isabela", 18, "3°A","Tarde");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Lucas", 14, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Everton", 17, "3°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Jarlison", 15, "8°A","Manhã");
insert into aluno (nome_aluno, idade_aluno, série_aluno, perídio_aluno)
	values ("Randerson", 19, "3°A","Manhã");

select * from aluno where idade_aluno > 7;
select * from aluno where idade_aluno < 7;

delete from aluno where ra_aluno = 4;
update aluno set nome_aluno = "Jacson do Pandeiro" where ra_aluno = 10

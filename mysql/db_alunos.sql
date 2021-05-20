-- crie um banco de dados para um registro de uma escola
create database db_escola;

use db_escola;

-- crie uma tabela alunos/a/e com 5 atributos relevantes dos alunos/a/e para se trabalhar com o serviço dessa escola.
create table tb_alunos (
	id bigint auto_increment,
    matricula varchar(60) not null,
	nome varchar(255) not null,
    sexo char(1) not null,
    turma char(2) not null,
    nota float not null,
    primary key (id)
);

select * from tb_alunos;

-- popule esta tabela com até 8 dados
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("B2345", "Maria", 'F', '23', 6.5);
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("M1410", "José", 'M', '14', 7.5);
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("PG0510", "Francisca", 'F', '05', 8.5);
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("PG0511", "Lucas", 'M', '05', 5.5);
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("G0510", "Maria Luiza", 'F', '05', 8.5);
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("G0510", "Marcelo", 'M', '05', 5.5);
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("PG0510", "Ariel", 'O', '05', 9.5);
insert into tb_alunos (matricula, nome, sexo, turma, nota) values ("M1301", "André", 'M', '13', 8.5);

-- faça um select que retorne o/as alunos/a/e com a nota maior do que 7.
select * from tb_alunos where nota > 7; 

-- faça um select que retorne o/as alunos/a/e com a nota menor do que 7.
select * from tb_alunos where nota < 7; 

-- atualize um dado desta tabela através de uma query de atualização.
update tb_alunos set nota = 10.0 where id = 7;
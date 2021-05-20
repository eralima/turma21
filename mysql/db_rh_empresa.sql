-- banco de dados para um serviço de RH de uma empresa
create database db_rh_empresa;

use db_rh_empresa;

-- crie uma tabela de funcionaries com 5 atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
create table  tb_funcionario(
	id bigint auto_increment,
    nome varchar(255) not null,
    sexo char not null,
    cargo varchar(255) not null,
    data_admissao date not null,
    salario float not null,
    primary key (id)
);

select * from tb_funcionario;

-- popule a tabela com até 5 dados
insert into tb_funcionario (nome, sexo, cargo, data_admissao, salario) values ("José", 'M', "Gerente", "2014/05/31", 2500);
insert into tb_funcionario (nome, sexo, cargo, data_admissao, salario) values ("Maria", 'F', "Diretora", "2011/05/06", 3500);
insert into tb_funcionario (nome, sexo, cargo, data_admissao, salario) values ("João", 'M', "Operador de produção", "2010/05/31", 1500);
insert into tb_funcionario (nome, sexo, cargo, data_admissao, salario) values ("Manuel", 'M', "Operador de produção", "2010/05/31", 1500);
insert into tb_funcionario (nome, sexo, cargo, data_admissao, salario) values ("Francisca", 'F', "Gerente", "2019/05/31", 2500);

-- faça um select que retorne os funcionaries com o salário maior do que 2000.
select * from tb_funcionario where salario> 2000; 

-- faça um select que retorne os funcionaries com o salário menor do que 2000.
select * from tb_funcionario where salario < 2000; 

-- atualize um dado desta tabela através de uma query de atualização.
update tb_funcionario set cargo = "Operador de produção II" where id = 3;

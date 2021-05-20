-- criar um banco de dados
create database db_quitanda;

-- acessar banco de dados
use db_quitanda;

create table  td_produtos(
	id bigint auto_increment,
    nome varchar(255) not null, 
    preco float not null,
    primary key (id)
);

select * from td_produtos;

insert into td_produtos (nome,preco) values ("mamao",2.50);
insert into td_produtos (nome,preco) values ("laranja",1.50);



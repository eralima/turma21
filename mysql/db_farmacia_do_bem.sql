-- crie um banco de dados, db_farmacia_do_bem, para um serviço de farmácia de uma empresa
create database db_farmacia_do_bem;

use db_farmacia_do_bem;

-- crie uma tabela de categorias com 3 atributos relevantes para se trabalhar com o serviço desta farmacia.
create table tb_categoria (
	id bigint auto_increment,
    descricao varchar(255) not null,
    oferta_fabricante boolean,
    oferta_farmacia boolean,
    delivery boolean not null,
    primary key (id)
);

-- popule esta tabela categoria com até 5 dados.
insert into tb_categoria (descricao, oferta_fabricante, oferta_farmacia, delivery) values ("Medicamentos", false, true, false);
insert into tb_categoria (descricao, oferta_fabricante, oferta_farmacia, delivery) values ("Genericos", true, false, false );
insert into tb_categoria (descricao, oferta_fabricante, oferta_farmacia, delivery) values ("Beleza e cosméticos", false, true, true);
insert into tb_categoria (descricao, oferta_fabricante, oferta_farmacia, delivery) values ("Higiene", false, true, true);
insert into tb_categoria (descricao, oferta_fabricante, oferta_farmacia, delivery) values ("Infantil", false, true, true);

-- crie uma tabela de tb_produto com 5 atributos relevantes para se trabalhar com o serviço deste farmacia
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    marca varchar(255) not null,
    categoria varchar(255) not null,
    preco float not null,
    quantidade_produto int not null,
    categoria_id bigint,
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id)
);

select * from tb_categoria;

-- popule esta tabela produto com até 8 dados
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Prednisona 20mg 10 comprimidos", "Medley", "Corticosteróides", 6.80, 200, 2);
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Loratadina Xarope 100ml", "Cimed", "Antialérgico", 7.42, 300, 2);
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Dorflex 10 comprimidos", "Sanofi aventis", "Relaxante muscular", 5.30, 400, 1);
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Gel Secativo 15g", "Asepxia", "Acne", 19.76, 350, 3);
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Hastes Flexíveis 150 unidades", "Johnson&Johnson", "Hastes flexíveis", 9.27, 150, 4);
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Bepantol Baby 30g", "Bayer", "Assadura", 14.36, 670, 5);
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Toalhas umedecidas Huggies Turma da Mônica Max Clean 48 unidades", "Kimberly-Clark", "Lenços e hidratantes", 11.56, 550, 5);
insert into tb_produtos (nome, marca, categoria, preco, quantidade_produto,categoria_id) values ("Loção Hidratante Corporal 200ml", "Cerave", "Hidratantes e cremes", 50.51, 90, 3);

select * from tb_produtos;

-- faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produtos where preco > 50.00;

-- faça um select trazendo  os Produtos com valor entre 3 e 60 reais.
select * from tb_produtos 
where preco between 3 and 60;

-- faça um select  utilizando LIKE buscando os Produtos com a letra B.
select * from tb_produtos where nome like "%b%";

-- faça um um select com inner join entre  tabela categoria e produto.
select nome, marca, categoria, preco, tb_categoria.descricao as categoria_geral
from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;

-- faça um select onde traga todos os produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
select nome, marca, categoria, preco, tb_categoria.descricao as categoria_geral
from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id
where tb_categoria.descricao like "Beleza e cosméticos";

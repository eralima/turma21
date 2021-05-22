-- crie um banco de dados, db_construindo_a_nossa_vida, para um serviço de uma loja de produtos de construção onde o sistema trabalhará com as informações dos produtos desta empresa.
create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

-- crie uma tabela de categorias com 3 atributos relevantes para se trabalhar com o serviço deste ecommerce.
create table tb_categoria (
	id bigint auto_increment,
    departamento varchar(255) not null,
    instalacao boolean not null,
    off_30 boolean not null,
    primary key (id)
);

-- popule esta tabela categoria com até 5 dados.
insert into tb_categoria (departamento, instalacao, off_30) values ("Materiais de construção", false, true);
insert into tb_categoria (departamento, instalacao, off_30) values ("Materiais hidráulicos", true, false);
insert into tb_categoria (departamento, instalacao, off_30) values ("Pisos e revestimentos", true, true);
insert into tb_categoria (departamento, instalacao, off_30) values ("Decoração", false, true);
insert into tb_categoria (departamento, instalacao, off_30) values ("Tintas e acessórios", false, false);
insert into tb_categoria (departamento, instalacao, off_30) values ("Iluminação", true, false);

select * from tb_categoria;

-- crie uma tabela de tb_produto com 5 atributos relevantes para se trabalhar com o serviço deste ecommerce
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    marca varchar(255) not null,
    categoria varchar(255) not null,
    preco float not null,
    retirar_loja boolean not null, 
    categoria_id bigint,
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id)
);

-- popule esta tabela produto com até 8 dados
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Caixa d'água de Polietileno 3.000L Multiuso", "Fortlev", "Caixas d' água", 1799.90, false, 1);
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Areia Média a Granel 10m³", "Cinco", "Areia, Pedra Brita, Gesso, Cal e Argila", 762.90, false, 1);
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Torneira para Pia de Cozinha Bica Alta Cromado", "Deca", "Torneiras para Cozinha", 409.90, true, 2);
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Tinta Acrílica Acetinado Toque de Seda Premium Branco 18L", "Suvinil", "Tintas", 479.90, true, 5);
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Tapete Sisal Liso Casual Bege 1,50x2,00m", "Apaeb", "Tapetes para Sala", 399.90, true, 4);
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Piso Laminado Prime Carvalho 136x19,7cm 7mm", "Eucafloor", "Pisos de madeira", 33.50, false, 3);
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Pendente 1 Lâmpada Cinza Tecido Linho", "Inspire", "Lustres e pendentes", 187.90, true, 6);
insert into tb_produtos (nome, marca, categoria, preco, retirar_loja,categoria_id) values ("Caixa de Passagem e Inspenção de Esgoto Premium 41,2L", "Metasul", "Caixas de gordura", 134.90, true, 2);

select * from tb_produtos;

-- faça um select que retorne os produtos com o valor maior do que 50 reais.
select * from tb_produtos where preco > 50.00;

-- faça um select trazendo  os produtos com valor entre 3 e 60 reais.
select * from tb_produtos 
where preco between 3 and 60;

-- faça um select  utilizando LIKE buscando os produtos com a letra C.
select * from tb_produtos where nome like "%b%";
select * from tb_produtos where nome like "b%";

-- faça um um select com inner join entre  tabela categoria e produto.
select nome, marca, categoria, preco, retirar_loja, tb_categoria.departamento
from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;

-- faça um select onde traga todos os produtos de uma categoria específica (exemplo todos os produtos que são da categoria hidráulica).
select nome, marca, categoria, preco, retirar_loja, tb_categoria.departamento
from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id
where tb_categoria.departamento like "Materiais hidráulicos"
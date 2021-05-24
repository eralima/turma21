-- crie um banco de dados para um serviço de pizzaria de uma empresa, db_pizzaria_legal, onde o sistema trabalhará com as informações dos produtos desta empresa. 
create database db_pizzaria_legal;

use db_pizzaria_legal;

-- crie uma tabela de categorias com 3 atributos relevantes para se trabalhar com o serviço desta pizzaria.
create table tb_categoria (
	id bigint auto_increment,
    tipo_produto varchar(255) not null,
    borda_recheada boolean not null,
    metade_preco boolean not null,
    primary key (id)
);

-- popule esta tabela categoria com até 5 dados.
insert into tb_categoria (tipo_produto, borda_recheada, metade_preco) values ("Pizzas tradicionais", true, true);
insert into tb_categoria (tipo_produto, borda_recheada, metade_preco) values ("Pizzas especiais", false, false);
insert into tb_categoria (tipo_produto, borda_recheada, metade_preco) values ("Pizzas doces", false, true);
insert into tb_categoria (tipo_produto, borda_recheada, metade_preco) values ("Pizzas brotinho", false, false);
insert into tb_categoria (tipo_produto, borda_recheada, metade_preco) values ("Bebidas", false, false);

select * from tb_categoria;

-- crie uma tabela tb_pizza com 5 atributos relevantes dos produtos para se trabalhar com o serviço dessa pizzaria
create table tb_pizza(
	id bigint auto_increment,
    nome varchar(255) not null,
    descricao varchar(255),
    tipo_massa varchar(255),
    tempo_preparo int,
    preco float not null,
    categoria_id bigint,
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id)
);

-- popule esta tabela categoria com até 5 dados.
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("Mussarela", "Queijo mussarela e oregano servido sobre molho de tomates", "Pan", 35, 45.00, 1);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("4 queijos", "Mussarela, requeijão, gorgonzola, oregano e parmesão ralado servido sobre molho de tomates", "Pan", 45, 55.90, 2);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("Pepperoni", "Pepperoni (salame especial condimentado com páprica) servidas sobre mussarela e de molho de tomate", "Fina e crocante", 40, 48.90, 1);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("Vegetariana", "Mussarela, champignon, azeitona preta, cebola, oregano e pimentão verde ervido sobre molho de tomates", "Pan", 30, 40.90, 1);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("Chocolate", "Chocolate com creme de baunilha ,brigadeiro de chocolate e granulado","Pan", 30, 28.90, 4);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("Coca Cola 2 Litros", null, null, null, 8.60, 5);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("Mussarela de búfala", "Mussarela, mussarela de búfala, requeijão, parmesão ralado, oregano e manjericão servido sobre molho de tomates", "Pan", 50, 68.90, 2);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("M&M's", "Chocolate ao leite com M&M's", "Fina e crocante", 35, 55.90, 3);
insert into tb_pizza (nome, descricao, tipo_massa, tempo_preparo, preco, categoria_id) values ("Guaraná Antarctica 2 Litros", null, null, null, 7.60, 5);

select * from tb_pizza;

-- faça um select que retorne os produtos com o valor maior do que 45 reais.
select * from tb_pizza where preco > 50.00;

-- faça um select trazendo os Produtos com valor entre 29 e 60 reais.
select * from tb_pizza 
where preco between 29 and 60;

-- faça um select utilizando LIKE buscando os produtos com a letra C.
select * from tb_pizza  where nome like "%c%";

-- faça um um select com inner join entre tabela categoria e pizza.
select nome, descricao, tipo_massa, tempo_preparo as preparo_minutos, preco, tb_categoria.tipo_produto
from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id;

-- faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select nome, descricao, tipo_massa, tempo_preparo as preparo_minutos, preco, tb_categoria.tipo_produto
from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id
where tb_categoria.tipo_produto like "Pizzas doces";
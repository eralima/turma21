-- crie um banco de dados, db_cidade_das_frutas, para um serviço de uma quitanda 
create database db_cidade_das_frutas;

use db_cidade_das_frutas;

-- crie uma tabela de categorias com 3 atributos relevantes para se trabalhar com o serviço dessa quitanda
create table tb_categoria (
	id bigint auto_increment,
    tipo_produto varchar(255) not null,
    primary key (id)
);

-- popule esta tabela categoria com até 5 dados.
insert into tb_categoria (tipo_produto) values ("Frutas");
insert into tb_categoria (tipo_produto) values ("Verduras");
insert into tb_categoria (tipo_produto) values ("Legumes");
insert into tb_categoria (tipo_produto) values ("Condimentos");
insert into tb_categoria (tipo_produto) values ("Ovos");

select * from tb_categoria;

-- crie uma tabela de tb_produto com 5 atributos relevantes para se trabalhar com o serviço dessa quitanda
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    categoria varchar(255) not null,
    organico boolean,
    preco float not null,
    peso float,
    quantidade_produto int not null,
    categoria_id bigint,
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id)
);

-- popule esta tabela produto com até 8 dados
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Abacate", "Frutas Frescas", true, 4.60, null, 300, 1);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Uvas passas", "Frutas secas", false, 11.90, 250, 200, 1);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Chuchu", "Legumes frescos", true, 8.49, 600, 200, 3);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Brócolis", "Legumes congelados", false, 15.79, 500, 150, 3);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Gengibre em pó", "Temperos secos", true, 23.97, 50, 170, 4);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Cominho em pó", "Temperos secos", false, 4.99, 40, 600, 4);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Repolho", "Verduras frescas", true, 6.29, 400, 350, 2);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Ovos vermelhos 12 unidades", "Ovos de galinha", true, 10.90, null, 350, 5);
insert into tb_produtos (nome, categoria, organico, preco, peso, quantidade_produto, categoria_id) values ("Sal Rosa do Himalaia", "Sal", false, 8.39, 500, 150, 4);

select * from tb_produtos;

-- faça um select que retorne os produtos com o valor maior do que 50 reais.
select * from tb_produtos where preco > 50;

-- faça um select trazendo  os produtos com valor entre 3 e 60 reais.
select * from tb_produtos 
where preco between 3 and 60;

-- faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_produtos where nome like "c%"; -- somente alimentos que começam com a letra c
select * from tb_produtos where nome like "%c%"; -- somente alimentos que tem letra c

-- faça um um select com inner join entre tabela categoria e produto.
select nome, categoria, organico, preco, peso as peso_gramas, tb_categoria.tipo_produto
from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;


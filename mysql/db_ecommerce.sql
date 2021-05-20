-- crie um banco de dados para um e commerce, 
create database db_ecommerce;

use db_ecommerce;

-- crie uma tabela produtos com 5 atributos relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
create table tb_produtos (
	id bigint auto_increment,
	nome_produto varchar(255) not null,
    descricao varchar(500) not null,
    categoria varchar(250) not null,
    unidades_estoque bigint not null,
    preco float not null,
    primary key (id)
);

select * from tb_produtos;

-- popule esta tabela com até 8 dados
insert into tb_produtos (nome_produto, descricao, categoria, unidades_estoque, preco) values ("Cooktop 4 Bocas Brastemp Preto a Gás Ative BDD61 Bivolt", "Este Cooktop a Gás Brastemp Ative! de quatro bocas possui mesa de vidro temperado, acendimento super automático, botões removíveis, discos esmaltados e um design exclusivo.", "Eletrodoméstico", 2500, 549.00);
insert into tb_produtos (nome_produto, descricao, categoria, unidades_estoque, preco) values ("Cafeteira Expresso Arno Dolce Gusto Mini Me Preta 110V", "Esta Cafeteira Expresso Arno Dolce Gusto Mini Me, Preta - 110V é uma máquina multi-bebidas que prepara mais de 20 tipos de bebidas em capsulas. Com um cursor de seleção, ela ajuda você a preparar sua bebida na medida certa. Basta selecionar o nível de água indicado na cápsula, a temperatura da bebida e ela para automaticamente quando sua bebida estiver pronta. ", "Eletroportáveis", 3000, 399.99);
insert into tb_produtos (nome_produto, descricao, categoria, unidades_estoque, preco) values ("Micro-ondas Electrolux MEO44 34 Litros Branco 110V", "Este Micro-ondas Electrolux MEO44 34 Litros Branco 110V possui tecnologia avançada onde seu sistema elimina os odores mais fortes. Este modelo vem com um QR Code que permite assistir vídeos que explicam o modo de preparo de todas as receitas.", "Eletrodoméstico", 3500, 577.89);
insert into tb_produtos (nome_produto, descricao, categoria, unidades_estoque, preco) values ("Samsung Galaxy A32", "O Samsung Galaxy A32 possui tela Super AMOLED de 6.4 polegadas com resolução de 1080 x 2400 (FHD+), câmera traseira quádrupla 64MP + 8MP + 5MP + 2MP e frontal para selfie de 20MP. O Smartphone ainda apresenta memória ram de 4GB, processador Octa-Core 2.0GHz e sistema operacional Android 11.0.", "Celulares e smartphones", 1500, 1599.00);

-- faça um select que retorne os produtos com o valor maior do que 500.
select * from tb_produtos where preco > 500; 

-- faça um select que retorne os produtos com o valor menor do que 500.
select * from tb_produtos where preco < 500; 

-- atualize um dado desta tabela através de uma query de atualização.
update tb_funcionario set preco = 499.99 where id = 2;





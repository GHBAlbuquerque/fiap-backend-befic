create table usuario (
	id int not null auto_increment,
    nome varchar(60) not null,
    dt_nasc date not null,
    celular varchar(20),
    email varchar(255) not null,
    genero varchar(50) not null,
    perfil varchar(500) not null,
    
    primary key (id)
);

create table login (
	id int not null auto_increment,
    usuario int not null,
    username varchar(100) not null,
    senha varchar(100) not null,

    primary key (id)
);

create table historia (
	id int not null auto_increment,
    autor int not null,
    nome varchar(100) not null,
    dt_publicacao date not null,
    dt_atualizacao date not null,
    sinopse varchar(300) not null,

    primary key (id)
);

create table capitulo (
	numero int not null auto_increment,
    historia int not null,
    titulo varchar(100) not null,
    dt_publicacao date not null,
    dt_atualizacao date not null,
    conteudo text not null,
    notas_iniciais varchar(300) not null,
    notas_finais varchar(300)  not null,

    primary key (numero)
);
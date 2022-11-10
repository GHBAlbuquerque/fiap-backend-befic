create table usuario (
	id int not null auto_increment,
    nome varchar(60) not null,
    dt_nasc date not null,
    celular varchar(20),
    email varchar(255) not null,
    genero varchar(50) not null,
    perfil varchar(500) not null,
    dt_cadastro date not null,
    
    primary key (id)
);

create table login (
	id int not null auto_increment,
    usuario_id int not null unique,
    username varchar(100) not null,
    senha varchar(100) not null,
    dt_cadastro date not null,

    primary key (id)
);

create table historia (
	id int not null auto_increment,
    autor_id int not null,
    nome varchar(100) not null,
    dt_publicacao date not null,
    dt_atualizacao date,
    sinopse varchar(1000) not null,

    primary key (id)
);

create table capitulo (
	numero int not null auto_increment,
    historia_id int not null,
    titulo varchar(100) not null,
    dt_publicacao date not null,
    dt_atualizacao date,
    conteudo text not null,
    notas_iniciais varchar(300) not null,
    notas_finais varchar(300)  not null,

    primary key (numero, historia_id)
);


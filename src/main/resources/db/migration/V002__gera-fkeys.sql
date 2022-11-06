alter table login add constraint fk_login_usuario
foreign key (usuario) references usuario (id);

alter table historia add constraint fk_historia_usuario
foreign key (autor) references usuario (id);

alter table capitulo add constraint fk_capitulo_historia
foreign key (historia) references historia (id);
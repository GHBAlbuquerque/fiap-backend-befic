alter table login add constraint fk_login_usuario
foreign key (usuario_id) references usuario (id);

alter table historia add constraint fk_historia_usuario
foreign key (autor_id) references usuario (id);

alter table capitulo add constraint fk_capitulo_historia
foreign key (historia_id) references historia (id);
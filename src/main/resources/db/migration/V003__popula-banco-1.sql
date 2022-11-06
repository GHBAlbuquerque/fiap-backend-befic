INSERT INTO `db-befic`.usuario (`nome`, `dt_nasc`, `celular`, `email`, `genero`, `perfil`, `dt_cadastro`)
VALUES (
'Ana Carolina Santos',
'1998-04-18',
'11 984758765',
'annacarol@gmail.com',
'FEMININO',
'𝗳𝗶𝗰𝘄𝗿𝗶𝘁𝗲𝗿 𝖽𝖾 𝗊𝗎𝖺𝗅𝗂𝖽𝖺𝖽𝖾 𝖽𝗎𝗏𝗂𝖽𝗈𝗌𝖺. ﹙𝗇𝖾𝗃𝗂𝗁𝗂𝗇𝖺, 𝗌𝖺𝗌𝗎𝗁𝗂𝗇𝖺, dickbabs, 𝗒𝗎𝗍𝖺𝗆𝖺𝗄𝗂﹚e outros. 𝖆𝖑𝖑𝖍𝖎𝖓𝖆',
'2021-01-01'
);

INSERT INTO `db-befic`.login (`usuario`, `username`, `senha`, `dt_cadastro`)
VALUES (
1,
'nejihinax',
'senha12345*',
'2021-01-01'
);

INSERT INTO `db-befic`.historia (`autor`, `nome`, `dt_publicacao`, `sinopse`)
VALUES (
1,
'Sobre Defeitos',
'2022-06-01',
'O defeito da vida é ter reviravoltas demais (mas ainda bem que tem).');

INSERT INTO `db-befic`.capitulo (`historia`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
1,
'Capítulo Único',
'2022-06-01',
'Toji tinha como defeito a instabilidade exaberbada. Estava tão determinado a ser livre que sequer conseguia notar que na verdade estava preso em um ciclo vicioso de autodestruição que afetava qualquer um que se aproximasse demais. Um eterno viajante que não gostava de fazer paradas longas; suas relações não eram destinadas a durar. Talvez tivesse a ver com o fato de que seu pai o abandonara poucos meses depois que nascera ou pela falta de tato de sua mãe que colocava tudo acima do afeto fazendo com que ele se sentisse duplamente largado. /n Hinata nunca conseguiu se livrar totalmente do gostinho da insuficiência amargando sua boca quando de forma automática deixava o lado esquerdo da cama livre na esperança dele se materializar ali. Toji, que amou Hinata verdadeiramente, se sentiu ainda pior em relação a criar laços e por isso não namorou mais ninguém.',
'Oiii! História nova!',
'Espero que gostem!'
);


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
'<p>Lorem ipsum dolor sit amet. Est tempore rerum eum illo consectetur est velit quaerat eum aperiam quas! At voluptatem neque ut dolores eveniet in molestias necessitatibus et dolorum rerum! Ut sequi molestiae aut porro amet et voluptas internos et ratione consequuntur et soluta galisum ad assumenda sunt. Et quisquam omnis id omnis quas eos quasi dolorem rem sint enim qui nihil voluptatum ut culpa voluptatem nam aperiam quae. </p><p>Ut quis maiores et aspernatur dolorum et delectus aliquid ad molestias iure et dignissimos atque in quisquam pariatur et consectetur fugit. Cum assumenda reprehenderit qui officiis quas cum blanditiis officiis 33 quia ipsam sit quos voluptatibus et natus nihil ad magnam dolor. Sed debitis ipsa in quas excepturi non ducimus nihil qui sint magni. Et enim voluptatem in quis voluptatibus aut labore autem. </p><p>Non commodi optio et facere voluptates ut natus laborum eos quos reprehenderit eos facere enim. Quo perferendis ullam et quia libero ut voluptatem dolorem. </p>',
'Oiii! História nova!',
'Espero que gostem!'
);


INSERT INTO `db-befic`.usuario (`nome`, `dt_nasc`, `celular`, `email`, `genero`, `perfil`, `dt_cadastro`)
VALUES (
'Ana Carolina Santos',
'1998-04-18',
'11 984758765',
'annacarol@gmail.com',
'FEMININO',
'π³πΆπ°ππΏπΆππ²πΏ π½πΎ πππΊπππ½πΊπ½πΎ π½ππππ½πππΊ. οΉππΎππππππΊ, ππΊππππππΊ, dickbabs, ππππΊππΊπποΉe outros. πππππππ',
'2021-01-01'
);

INSERT INTO `db-befic`.login (`usuario_id`, `username`, `senha`, `dt_cadastro`)
VALUES (
1,
'nejihinax',
'senha12345*',
'2021-01-01'
);

INSERT INTO `db-befic`.historia (`autor_id`, `nome`, `dt_publicacao`, `sinopse`)
VALUES (
1,
'Sobre Defeitos',
'2022-06-01',
'O defeito da vida Γ© ter reviravoltas demais (mas ainda bem que tem).');

INSERT INTO `db-befic`.capitulo (`historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
1,
'CapΓ­tulo Γnico',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Est tempore rerum eum illo consectetur est velit quaerat eum aperiam quas! At voluptatem neque ut dolores eveniet in molestias necessitatibus et dolorum rerum! Ut sequi molestiae aut porro amet et voluptas internos et ratione consequuntur et soluta galisum ad assumenda sunt. Et quisquam omnis id omnis quas eos quasi dolorem rem sint enim qui nihil voluptatum ut culpa voluptatem nam aperiam quae. \nUt quis maiores et aspernatur dolorum et delectus aliquid ad molestias iure et dignissimos atque in quisquam pariatur et consectetur fugit. Cum assumenda reprehenderit qui officiis quas cum blanditiis officiis 33 quia ipsam sit quos voluptatibus et natus nihil ad magnam dolor. Sed debitis ipsa in quas excepturi non ducimus nihil qui sint magni. Et enim voluptatem in quis voluptatibus aut labore autem. \nNon commodi optio et facere voluptates ut natus laborum eos quos reprehenderit eos facere enim. Quo perferendis ullam et quia libero ut voluptatem dolorem. ',
'Oiii! HistΓ³ria nova!',
'Espero que gostem!'
);


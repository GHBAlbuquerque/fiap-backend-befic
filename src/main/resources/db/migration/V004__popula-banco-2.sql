-- usuarios

INSERT INTO `db-befic`.usuario (`nome`, `dt_nasc`, `celular`, `email`, `genero`, `perfil`, `dt_cadastro`)
VALUES (
'Monique Silva',
'2003-05-20',
'11 986756487',
'monis@gmail.com',
'FEMININO',
'Nada a declarar',
'2018-06-07'
);
INSERT INTO `db-befic`.usuario (`nome`, `dt_nasc`, `celular`, `email`, `genero`, `perfil`, `dt_cadastro`)
VALUES (
'Henrique Tanore',
'204-03-20',
'19 987685647',
'htanore@gmail.com',
'MASCULINO',
'#𝙇𝙃44 #𝙈𝙎𝘾47 #𝙀𝙊31 𝑦𝑎𝑠 | 𝗲𝘀𝗰𝗿𝗶𝘁𝗼𝗿𝗮 𝗲 𝗹𝗲𝗶𝘁𝗼𝗿𝗮 𝗮𝗽𝗮𝗶𝘅𝗼𝗻𝗮𝗱𝗮 ⌗ 𝘧𝘰𝘳𝘮𝘶𝘭𝘢 1, 𝘬-𝘱𝘰𝘱, 𝘥𝘰𝘳𝘢𝘮𝘢𝘴, 𝘧𝘶𝘵𝘦𝘣𝘰𝘭 🍒',
'2020-07-07'
);
INSERT INTO `db-befic`.usuario (`nome`, `dt_nasc`, `celular`, `email`, `genero`, `perfil`, `dt_cadastro`)
VALUES (
'Yas',
'2005-07-01',
'21 967587498',
'yassss_@gmail.com',
'FEMININO',
'Leitora e Escritora',
'2022-06-07'
);
INSERT INTO `db-befic`.usuario (`nome`, `dt_nasc`, `celular`, `email`, `genero`, `perfil`, `dt_cadastro`)
VALUES (
'Gabrielle',
'2000-05-20',
'11 985766453',
'gabiss_bibi@gmail.com',
'FEMININO',
'Ficwriter de carteirinha',
'2019-01-12'
);


-- login

INSERT INTO `db-befic`.login (`usuario_id`, `username`, `senha`, `dt_cadastro`)
VALUES (
2,
'dai-san',
'senha12345*',
'2018-06-07'
);

INSERT INTO `db-befic`.login (`usuario_id`, `username`, `senha`, `dt_cadastro`)
VALUES (
3,
'tannor_1',
'senha12345*',
'2020-07-07'
);

INSERT INTO `db-befic`.login (`usuario_id`, `username`, `senha`, `dt_cadastro`)
VALUES (
4,
'yasescreve',
'senha12345*',
'2022-06-07'
);

INSERT INTO `db-befic`.login (`usuario_id`, `username`, `senha`, `dt_cadastro`)
VALUES (
5,
'doffy',
'senha12345*',
'2019-01-12'
);


-- historias

INSERT INTO `db-befic`.historia (`autor_id`, `nome`, `dt_publicacao`, `sinopse`)
VALUES (
2,
'Formigamento',
'2022-06-01',
'Hinata Hyuuga odiava formigamentos, mas Sasuke Uchiha estava transformando a sensação em algo interessante.');
INSERT INTO `db-befic`.historia (`autor_id`, `nome`, `dt_publicacao`, `sinopse`)
VALUES (
2,
'Gratidão',
'2022-06-01',
'Por muitos anos o terceiro dia de Julho fora incomodo. Neji havia forçado irrelevância, mas a verdade era que a data sempre esfregara em sua cara o quanto ele era solitário mesmo não estando realmente sozinho, mas hoje tudo o que ele sentia era gratidão.');
INSERT INTO `db-befic`.historia (`autor_id`, `nome`, `dt_publicacao`, `sinopse`)
VALUES (
3,
'Amarrado',
'2022-06-01',
'Kiba Inuzuka estava amarrado (amarradão mesmo!) em Sakura Haruno, mas ele não iria assumir isso em voz alta.');
INSERT INTO `db-befic`.historia (`autor_id`, `nome`, `dt_publicacao`, `sinopse`)
VALUES (
3,
'O Selo do Tempo',
'2022-06-01',
'Após perder Neji na Quarta Guerra Mundial Ninja, Hinata se recusa a seguir em frente. Decidida a encontrar um meio de trazê-lo de volta à vida, ela parte de Konoha em busca de informações para conseguir tal façanha. Só que mesmo com anos de preparação, as coisas podem não ocorrer como a Hyuuga imagina.');
INSERT INTO `db-befic`.historia (`autor_id`, `nome`, `dt_publicacao`, `sinopse`)
VALUES (
5,
'Beijos na calçada',
'2022-06-01',
'Uma história sobre perder a paciência, dedos roçando e beijos na calçada.');



-- capitulos

INSERT INTO `db-befic`.capitulo (`numero`, `historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
1,
2,
'Capítulo Único',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Est tempore rerum eum illo consectetur est velit quaerat eum aperiam quas! At voluptatem neque ut dolores eveniet in molestias necessitatibus et dolorum rerum! Ut sequi molestiae aut porro amet et voluptas internos et ratione consequuntur et soluta galisum ad assumenda sunt. Et quisquam omnis id omnis quas eos quasi dolorem rem sint enim qui nihil voluptatum ut culpa voluptatem nam aperiam quae. \nUt quis maiores et aspernatur dolorum et delectus aliquid ad molestias iure et dignissimos atque in quisquam pariatur et consectetur fugit. Cum assumenda reprehenderit qui officiis quas cum blanditiis officiis 33 quia ipsam sit quos voluptatibus et natus nihil ad magnam dolor. Sed debitis ipsa in quas excepturi non ducimus nihil qui sint magni. Et enim voluptatem in quis voluptatibus aut labore autem. \nNon commodi optio et facere voluptates ut natus laborum eos quos reprehenderit eos facere enim. Quo perferendis ullam et quia libero ut voluptatem dolorem. ',
'Nada a declarar',
'Espero que gostem!'
);
INSERT INTO `db-befic`.capitulo (`numero`, `historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
1,
3,
'Capítulo Único',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Eum quam internos vel internos cumque est sint recusandae sit possimus voluptatem ut quis earum est similique tempore aut numquam amet. Ut unde nulla est magni voluptatibus ut maiores temporibus est molestiae architecto quo nostrum deleniti qui nemo accusantium. \n33 internos enim ut inventore inventore est soluta modi ut nesciunt similique et vitae distinctio. Et quis beatae ex dolores voluptatem id nisi perferendis aut consectetur consequatur non repudiandae quas! Et nihil accusantium et accusamus ipsam et quia enim in harum reprehenderit vel numquam distinctio ea ipsam expedita est facilis corrupti? \nRem ratione facere qui repudiandae impedit a quibusdam quidem et aspernatur sunt. Et voluptates beatae in praesentium ipsam eos nulla autem ea quia quas nam ipsum expedita. ',
'Começando de novo...',
'Demorei demais para postar né?'
);
INSERT INTO `db-befic`.capitulo (`numero`, `historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
1,
4,
'Capítulo Único',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Id veniam autem At dicta aliquam eum perferendis dignissimos sit dolor dicta aut mollitia expedita sit tempora vero ut laborum quia. Aut assumenda dolores vel impedit voluptas sed animi repellendus aut beatae error aut inventore quis. At iure fuga qui nemo totam et dolorem saepe sed voluptatem enim et voluptas consectetur nam itaque voluptatem sit nisi quam! \nEt omnis neque sed molestiae aperiam qui aperiam provident est libero molestiae et delectus delectus eum debitis beatae. Et illo rerum ut magnam expedita ut commodi consectetur. \nId reprehenderit nesciunt in ipsa repellendus qui saepe laborum qui nostrum voluptate ut minus animi et quasi ducimus. Ut perferendis dolorem hic rerum iusto in deserunt natus et rerum doloribus ea ipsam quis aut reprehenderit dicta ut eveniet consequatur. Sit animi ipsum non quisquam unde vel nihil distinctio rem perferendis animi vel reiciendis consectetur. ',
'Mais uma história quentinha!',
'Deixem comentários <3'
);
INSERT INTO `db-befic`.capitulo (`numero`, `historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
2,
4,
'Capítulo Único',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Et voluptas consequatur ut placeat libero et molestiae consequatur est accusantium tenetur eum ratione molestiae a maxime quia aut quaerat repellendus? Ut cumque impedit hic tenetur quae ab commodi voluptatum nam iste aspernatur ut facere sequi ea amet possimus eum eveniet voluptatem. \nSit dolores veniam sed inventore debitis sit iusto dolorem. Non molestias libero sit beatae enim ut nihil sunt qui delectus velit eos similique accusamus. Qui quasi rerum et dolor voluptate non quod voluptas sit voluptas dolorem quo aliquid necessitatibus ab rerum ratione. \nUt natus illo ut nemo perspiciatis ex fugit officiis qui rerum officiis ut dolores error et repellendus repellendus sed excepturi officiis! Et nihil quidem eum alias commodi eum quibusdam autem ut corporis cumque aut nihil quam id aliquam nesciunt ut quasi alias! Eos commodi omnis est omnis maxime aut voluptatem quos. ',
'Olá pessoa, estou tentando começar novamente.. espero que curtam.',
'obrigadaaaa'
);
INSERT INTO `db-befic`.capitulo (`numero`, `historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
1,
5,
'Capítulo Único',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Et officiis itaque hic iure ipsa rem velit amet et odio reprehenderit 33 autem suscipit qui tempora quis in voluptatem totam. 33 dolorem dolorem ab suscipit impedit ut ratione deleniti et ullam incidunt ut vitae dignissimos! \nEum fugit corporis eos blanditiis debitis ab deserunt nostrum ea dolorem voluptate. Et assumenda vitae vel nemo vero sed odit magnam hic voluptate odit in ducimus quia! Qui consequatur libero qui voluptatem veritatis ut saepe magnam ut quidem dolores in quibusdam odio sit quasi reprehenderit. \nCum vero maiores ex enim aliquid ut animi incidunt 33 voluptas dolore et dolorem amet et tenetur facilis ea deleniti quia! Non tenetur sapiente eum eligendi quidem et autem magni qui sint architecto et velit rerum sed laudantium autem 33 delectus enim. Est molestias quia id asperiores dolore est laborum provident non optio nihil in quasi laborum et quae quae. ',
'Testando novas formas de escrita',
'Valeeeeu!'
);
INSERT INTO `db-befic`.capitulo (`numero`, `historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
2,
5,
'Capítulo Único',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Et rerum molestiae et delectus dolores ea dignissimos blanditiis sit esse totam ab corrupti voluptas est totam voluptatibus. Nam animi Quis aut dolorem omnis hic numquam ducimus sit praesentium doloremque sit molestiae accusamus et doloremque consequuntur! Ab autem expedita quo dolores odio aut ipsam omnis eos corrupti recusandae vel quibusdam explicabo aut accusantium unde est eveniet nobis. \nSit incidunt tenetur ut sequi recusandae est voluptatem rerum. Sed consequuntur possimus in distinctio praesentium sed labore rerum. Est praesentium perspiciatis et eius quia 33 voluptas nulla ut consequatur ducimus hic quos totam et consequatur perferendis non placeat velit! \nVel omnis voluptate sit minus expedita non repellendus alias vel sapiente facilis. Quo impedit voluptates non dolorum eligendi ut ipsam pariatur et illum accusamus est corporis consectetur ut enim distinctio. ',
'XoXo',
'XoXo'
);
INSERT INTO `db-befic`.capitulo (`numero`, `historia_id`, `titulo`, `dt_publicacao`, `conteudo`, `notas_iniciais`, `notas_finais`)
VALUES (
2,
2,
'Capítulo Único',
'2022-06-01',
'\nLorem ipsum dolor sit amet. Eum facilis sunt aut quos nihil rem adipisci fuga sit assumenda sapiente! Sit nihil nihil vel enim quae aut perferendis porro 33 reiciendis veniam quo mollitia minus qui necessitatibus illo. Non inventore illo nam enim quaerat 33 autem aperiam 33 omnis adipisci? \nSit nisi nobis a mollitia illum aut atque vitae. Sit harum soluta nam repellat nobis vel minus iste. Ea facere debitis ut ipsum obcaecati et tempore libero in rerum quos sit praesentium officiis qui voluptas assumenda ea molestiae vitae! Non esse quod a fugit adipisci quo nesciunt galisum nam laboriosam voluptatibus in dolores tempora eos fugiat esse! \nSed aliquam error aut nisi corporis eum deserunt obcaecati ad beatae tempore. Sed architecto dolorum 33 perferendis consequatur 33 molestiae debitis et natus natus in error aperiam At quaerat esse. ',
'Credo, como demorei pra voltar! Mas espero que curtam!!',
'Vlwwww, turma!!'
);


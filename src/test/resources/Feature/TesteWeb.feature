# language: pt

@TesteDialog
Funcionalidade: Acessar o site da Dialog e postar um video na timeline
  Cenario: Acessar o site da Dialog
    Dado que estou no site da dialog
    Quando eu digito meu nome do usuário
    E digitar a senha
    E clico no botão entrar
    Então Sou redirecionado para a home do site dialog
    Quando clicar em Timeline
    E clicar em O que você vai nos dizer hoje?
    Então Sou redirecionado para a tela de Publicar na Timeline
    Quando cliar no ícone de camera
    E selecionar um vídeo da minha galeria no meu computador
    E clicar em Abrir
    E clicar em Publicar
    Então o video deve aparecer na minha timeline

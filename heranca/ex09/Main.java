/*

9. Pensando em Relacionamentos (Conceitual)
Você está modelando um sistema universitário. Você tem os conceitos Universidade e Departamento
(ex: "Departamento de Computação"). Um Departamento "é-um-tipo-de" Universidade (Herança) ou uma
Universidade "tem-muitos" Departamentos (Composição)? Justifique sua escolha de design. 

Resposta: Escolheria composição, pois uma universidade é composta por vários departamentos que só
existem dentro dela. Um departamento não é um tipo de universidade, mas uma parte que a compõe.

 */
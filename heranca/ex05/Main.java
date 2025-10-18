/* 
 
5. O Teste do "É-UM" (Análise de Design)
Como arquiteto de software, você precisa decidir se a relação entre os conceitos abaixo deve ser modelada
com Herança ("é-um-tipo-de") ou se seria melhor usar Composição ("tem-um"). Em um comentário no seu
código, justifique sua escolha para cada par:

• a) NotaFiscal e ItemDaNotaFiscal
Composição, pois toda nota fiscal terá ao menos um item. Uma nota não é um tipo de item e nem o contrário,
não podendo fazer parte de uma herança.

• b) Funcionario e Endereco
Composição, pois o funcionário tem um endereço, e não é um "tipo de endereço". O endereço existe mesmo
sem estar ligado ao funcionário.

• c) IngressoVIP e Ingresso
Herança, pois o ingresso VIP terá, além de suas informações extras, as informações básicas de um
ingresso comum, como data, setor, horário.

• d) Pedido e Cliente
Composição, pois um pedido não é um "tipo de cliente" nem o contrário. Cada cliente faz seu pedido,
enquanto cada pedido possui seu próprio cliente.

• e) Carro e Pneu
Composição, pois um carro completo tem um pneu, e um não é um tipo do outro.

*/
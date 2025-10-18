/*

10. Uma Prévia do Futuro: Coleções de Tipos Comuns
Usando a hierarquia de Veiculo que você criou, experimente o seguinte no seu método main:

1. Crie um ArrayList que possa guardar Veiculos: List<Veiculo> minhaFrota = new ArrayList<>();
2. Crie um objeto Carro e um objeto Moto.
3. Adicione ambos os objetos à lista minhaFrota.

O código compilou e funcionou? Em um comentário, explique por que o Java permite que você coloque um
Carro e uma Moto dentro de uma lista de Veiculo. (Dica: pense na relação "é-um-tipo-de").

Resposta: o código compilou e funcionou. O Java permite essa adição na lista de Veiculo pois ambas são
subclasses de Veiculo (um carro e uma moto são um tipo de veiculo), logo, qualquer objeto que herda
Veiculo pode ser tratado como um Veiculo.

 */
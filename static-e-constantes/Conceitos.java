/*
4. A Analogia (Conceitual): Qual a diferença de memória entre o atributo preco e o atributo taxaImposto
da sua classe Produto? Use a analogia da "República e o Monumento" para explicar.

Cada objeto possui o seu próprio atributo preço, enquanto o atributo taxaImposto é compartilhado na
memória para todos os objetos criados a partir daquela classe, ou seja, toda instância possui a mesma taxa.
Na república, cada indivíduo possui suas coisas individuais (preco). Já o monumento está na praça e todos
da república compartilham e veem esse mesmo monumento (taxaImposto). 


5. Regras do static (Conceitual): É possível, dentro de um método static como setTaxaImposto, acessar
um atributo de instância como this.preco? Explique com suas palavras por que sim ou por que não. 

Não é possivél acessar um atributo com this em um método static, pois o this faz referência a um atributo
ou método do objeto atual, enquanto o static compartilha a memória com todas as instâncias, assim,
não há quem o this de um static representar.


10. Decisão de Design (Conceitual): Você precisa criar uma funcionalidade para calcular juros
compostos. O método seria calcularJurosCompostos(double principal, double taxa, int periodos).
Você criaria uma classe CalculadoraDeJuros para ser instanciada (new CalculadoraDeJuros()) ou a
implementaria como um método estático em uma classe FinanceiroUtil? Justifique sua decisão de
design.

Implementaria com um método estático de uma classe utilitária, visto que para fazer essa função de
cálculo, não é necessário criar um objeto, e sim apenas chamar um método que faz essa operação de
forma independente.

*/


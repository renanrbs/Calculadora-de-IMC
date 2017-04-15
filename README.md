<h1>Calculador de IMC</h1>
Implementação de uma calculadora de imc de <strong>adultos, idosos e crianças</strong>, utilizando padrões de projeto para minimizar a quantidade de ifs e minimizar a repetição do código. Trabalho realizado para a disciplina de  <strong>Arquitetura de Softwares</strong>

<h2>Como Usar</h2>
Para verificar o funcionamento da calculadora execute os testes do <strong>JUnit</strong> que estão disponiveis no pacote tests.
Para verificações manuais basta criar uma instância da classe CalculadoraIMC e realizar uma chamada ao método calcularIMC, fornecendo a altura, o peso, o sexo e a idade.

<h2>Padrões Utilizados</h2>
Os padrões <strong>Factory Method e Abstract Factory</strong> foram utilizados para criar instancias da calculadora de acordo com o tipo necessário, e o padrão <strong>Bridge</strong> foi adaptado para suprir as informaçoes que cada faixa etária deve possuir para realizar o cálculo.

<h2>Referências</h2>
http://www.mdsaude.com/2014/10/imc-indice-de-massa-corporal.html

/*
 Ex. 1 (exemplo "Aula03_01")
- Crie uma primeira classe chamada Principal (onde terá a função "main");
- Crie uma segunda classe chamada Veiculo. Nela, deverão existir os atributos "nome", "fabricante", "ano" e "velocidade". 
Além disso, deverão existir os métodos "acelerar", "desacelerar" e "parar", onde a velocidade sofrerá, respectivamente, o acréscimo de 5km/h,
o decréscimo de 5km/h e a atribuição de 0km/h.

- na classe Principal, instancie 3 objetos da classe Veiculo, com os nomes, fabricantes e anos que você quiser, mas que tenham, 
respectivamente, as velocidades em 15, 200, 150;
- aumente e diminua as velocidades a seu bel prazer, sempre exibindo a velocidade a cada alteração.

Ex. instanciar objeto da classe Veiculo:
        Veiculo objV1 = new Veiculo("Gol", "Volkswagen", 2001, 150);

Requisitos:
- implemente o encapsulamento (getters e setters) de modo que o valor da velocidade não possa ser alterado por alguma 
classe externa (alheia à regra de negócio), devendo ser alterada, apenas, pelos métodos de negócio ("acelerar", "desacelerar" e "parar");

- limite a faixa de velocidade entre 0km/h a 220km/h.

===>>>> Continuação da Implementação:

- Crie uma terceira classe chamada Carro, que seja subclasse de Veiculo. Nela, inclua o atributo "quantidadePortas" e faça um polimorfismo do método 
"acelerar", aumentando a velocidade de 10km/h em 10km/h;

- Crie uma quarta classe chamada Moto, também subclasse de Veiculo; ela deverá ter o atributo "apoioAcionado" (booleano) e um polimorfismo do método 
"acelerar", outro do método "desacelerar" e outro para método "parar": quando a velocidade for igual a 0, 
o atributo "apoioAcionado" deverá ser verdadeiro; quando a velocidade for maior que 0, o atributo deverá ir para falso.
 */

package exProfDavi3;

public class Principal {
	public static void main(String[] args) {
		
		/*Veiculo v1 = new Veiculo("gol","volks","2001",10);
		v1.getAno();
		v1.getNome();
		v1.getFabricante();
		v1.acelerar();
		
		Veiculo v2 = new Veiculo("siena","fiat","2018",180);
		v2.acelerar();
		v2.acelerar();
		
		Carro c1 = new Carro("gol","volks","2001",10,4);
		c1.acelerar();
		c1.acelerar();
		c1.desacelerar();*/
				
		Moto m1 = new Moto("honda","titan","2005",10,true);
		
		m1.acelerar();
		m1.subirApoio();
		m1.acelerar();
		 
	}

}

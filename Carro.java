package exProfDavi3;

public class Carro extends Veiculo

{
	
	public int getQtddPortas() {
		System.out.println(qtddPortas);
		return qtddPortas;
	}

	private int qtddPortas;

	public Carro(String nome, String fabricante, String ano, int vel, int qtddPortas) {
		super(nome, fabricante, ano, vel);

		this.qtddPortas = qtddPortas;

	}
	
	public void acelerar() {
		if(vel == 220) {
			System.out.println("Voc� atingiu o limite m�ximo de velocidade!");
		}else {
			System.out.println("acelerando...");
			vel = vel + 10;
		}
	}
}

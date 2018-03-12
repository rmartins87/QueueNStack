package exProfDavi3;

public class Veiculo {
	private String nome, fabricante, ano;
	protected int vel;
	
	public Veiculo(String nome, String fabricante, String ano, int vel) {
		this.nome=nome;
		this.fabricante=fabricante;
		this.ano=ano;
		this.vel=vel;
	}
	
	public String getNome() {
		System.out.println(nome);
		return nome;
	}

	public String getFabricante() {
		System.out.println(fabricante);
		return fabricante;
	}

	public String getAno() {
		System.out.println(ano);
		return ano;
	}

	public int getVel() {
		System.out.println(vel);
		return vel;
	}

	public void acelerar() {
		if(vel == 220) {
			System.out.println("Você atingiu o limite máximo de velocidade!");
		}else {
			System.out.println("acelerando...");
			vel = vel + 5;
		}
	}
	
	public void desacelerar() {
		if (vel == 0) {
			System.out.println("Você está parado!");
		}else {
			System.out.println("brecando...");
			vel = vel - 5;
		}
	}
	
	public void parar() {
		vel=0;
	}
}

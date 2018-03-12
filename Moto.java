package exProfDavi3;

public class Moto extends Veiculo {
	
	public Moto(String nome, String fabricante, String ano, int vel, boolean apoioAcionado) {
		super(nome, fabricante, ano, vel);
		// TODO Auto-generated constructor stub
		this.apoioAcionado=apoioAcionado;
	}

	public boolean getApoioAcionado() {
		System.out.println(apoioAcionado);
		return apoioAcionado;
	}
	
	public boolean subirApoio() {
		return apoioAcionado=false;
	}
	
	public boolean descerApoio() {
		return apoioAcionado=true;
	}
	
	private boolean apoioAcionado;
	
	public void acelerar() {
		if (getApoioAcionado()) {
			System.out.println("apoio está acionado!");
		}else {
		if(vel == 220) {
			System.out.println("Você atingiu o limite máximo de velocidade!" + apoioAcionado);
		}else {
			System.out.println("levantando apoio, agora sim podemos ir..");
			System.out.println("acelerando...");
			vel = vel + 5;
		}
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
		if(getApoioAcionado()) {
			System.out.println("podemos parar, apoio abaixado...");
			vel=0;
			System.out.println("você está parado!");
		}else {
			System.out.println("abaixe o apoio para parar!");
		}
	}
}

package entities;

public class Logica {
	
	private char usuario;
	private int senhaAcesso;
	private char morador;
	private char bloco;
	private int numCasa;
	
	public Logica (char usuario, int senhaAcesso) {
		this.usuario = usuario;
		this.senhaAcesso = senhaAcesso;
	}
	
	public Logica(char usuario, int senhaAcesso, char morador, char bloco, int numCasa) {
		this.usuario = usuario;
		this.senhaAcesso = senhaAcesso;
		this.morador = morador;
		this.bloco = bloco;
		this.numCasa = numCasa;
	}
	
	public char getUsuario() {
		return usuario;
	}
	
	public int getSenhaAcesso() {
		return senhaAcesso;
	}
	
	public char getMorador() {
		return morador;
		
	}
	
	public void setMorador(char morador) {
		this.morador = morador;
	}
	
	public char getBloco() {
		return bloco;
	}
	
	public void setBloco(char bloco) {
		this.bloco = bloco;
	}
	
	public int getNumCasa() {
		return numCasa;
	}
	
	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
	}
}

package projetoEntrevista;
import java.util.Scanner;

public class Usuário {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String senhaAcesso = "Admin1234";
		String senhaDigitada;
		Scanner sc = new Scanner(System.in);
		System.out.print("Usuario: ");
		String usuario = sc.nextLine();
		System.out.print("Seha: ");
		int senhaAdm = sc.nextInt();
		
		//verificação de senha
		do {
            System.out.println("Digite a senha:");
            senhaDigitada = sc.nextLine();

            if (!senhaDigitada.equals(senhaAcesso)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(senhaAcesso));

        // Quando a senha estiver correta

		System.out.println("Acesso concedido. Bem vindo(a)");
		System.out.print("Morador(a) que deseja adicionar: ");
		String morador = sc.nextLine();
		System.out.print("Bloco do(a) morador(a) adicionado: ");
		String bloco = sc.nextLine();
		System.out.print("Número da casa do mesmo: ");
		int numCasa = sc.nextInt();
		System.out.print("Que bom que mais um morador se juntou a comunidade!");
		
		
		
		sc.close();
		
		
		
		
	}

}

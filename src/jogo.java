import java.util.Random;
import java.util.Scanner;

public class jogo {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(1, 4);

		Scanner entrada = new Scanner(System.in);
		int numeroUsuario;

		System.out.println("=============================");
		System.out.println("======= Jogo  Jokenpo =======");
		System.out.println("=============================");
		System.out.println("= 1 - Pedra                 =");
		System.out.println("= 2 - Papel                 =");
		System.out.println("= 3 - Tesoura               =");
		System.out.println("=============================");
		System.out.println("= Qual sua op��o de jogada? =");

		numeroUsuario = entrada.nextInt();
		
		entrada.close();
		;
		if (numeroUsuario == 1) {
			System.out.println("Voc� escolheu Pedra!");
			if (numeroAleatorio == 1) {
				System.out.println("O computador escolheu Pedra!");
				System.out.println("\nVoc� EMPATOU o jogo\n");
			} else if (numeroAleatorio == 2) {
				System.out.println("O computador escolheu Papel!");
				System.out.println("\nVoc� PERDEU o jogo\n");
			} else {
				System.out.println("O computador escolheu Tesoura!");
				System.out.println("\nVoc� VENCEU o jogo\n");
			}
		}

		if (numeroUsuario == 2) {
			System.out.println("Voc� escolheu Papel!");
			if (numeroAleatorio == 1) {
				System.out.println("O computador escolheu Pedra!");
				System.out.println("\nVoc� VENCEU o jogo\n");
			} else if (numeroAleatorio == 2) {
				System.out.println("O computador escolheu Papel!");
				System.out.println("\nVoc� EMPATOU o jogo\n");
			} else {
				System.out.println("O computador escolheu Tesoura!");
				System.out.println("\nVoc� PERDEU o jogo\n");
			}
		}

		if (numeroUsuario == 3) {
			System.out.println("Voc� escolheu Tesoura!");
			if (numeroAleatorio == 1) {
				System.out.println("O computador escolheu Pedra!");
				System.out.println("\nVoc� PERDEU o jogo\n");
			} else if (numeroAleatorio == 2) {
				System.out.println("O computador escolheu Papel!");
				System.out.println("\nVoc� VENCEU o jogo\n");
			} else {
				System.out.println("O computador escolheu Tesoura!");
				System.out.println("\nVoc� EMPATOU o jogo\n");
			}
		}

	}

}

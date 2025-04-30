package aula13_vetores;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String ay[] = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("informe o nome " + i);
			ay[i] = ler.nextLine();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("\nNomes: " + ay[i]);
		}
		ler.close();
	}

}

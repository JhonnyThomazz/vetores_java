package aula13_vetores;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int V[] = new int[5];

		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("informe o valor " + i);
			V[i] = ler.nextInt();
			sum = sum + V[i];
		}

		if (sum > 15) {
			System.out.println("\nO seu resultado foi maior que 15, o valor sendo: " + sum);
		}
		ler.close();

	}

}

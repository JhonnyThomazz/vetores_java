package aula13_vetores;

import java.util.Scanner;

public class Vetor_Array {

	public static void main(String[] args) {

		int a[] = new int[5];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("informe um valor " + i + " ");
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("\nValor armazenado: " + a[i]);
		}
		scanner.close();
	}

}

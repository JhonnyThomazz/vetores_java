package aula13_vetores;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int va[] = new int[5];
		int vb[] = new int[5];
		int vc[] = new int[10];

		for (int i = 0; i < 5; i++) {
			System.out.println("\nInforme o valor " + i + " para o vetor_A(" + i +"):");
			va[i] = ler.nextInt();
			
			System.out.println("\nInforme o valor " + i + " para o vetor_B(" + i +"):");
			vb[i] = ler.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			vc[i] = va[i];
		}
		for (int i = 0; i < 5; i++) {
			vc[i + 5] = vb[i];
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Vetor_A: " + va[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < 5; i++) {
			System.out.println("Vetor_B: " + vb[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Vetor_C: " + vc[i]);
		}
		ler.close();
	}
	
}

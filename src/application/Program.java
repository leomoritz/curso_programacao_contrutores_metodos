package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria c1; // Declarando variável do tipo ContaBancaria
		int numConta;
		char isInitialDeposit;
		double valor;
		String nomeTitular;

		System.out.print("Enter account number: ");
		numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		nomeTitular = sc.nextLine();

		do {
			System.out.print("Is there na initial deposit (y/n): ");
			isInitialDeposit = sc.next().charAt(0);

			if (isInitialDeposit != 'y' && isInitialDeposit != 'n') {
				System.out.println("Invalid response! " + "Only values y/n are valid." + "Please, try again\n");
			}
		} while (isInitialDeposit != 'y' && isInitialDeposit != 'n');

		switch (isInitialDeposit) {
		case 'y':
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
			c1 = new ContaBancaria(numConta, nomeTitular, valor);
			break;
		default:
			c1 = new ContaBancaria(numConta, nomeTitular);
			break;
		}

		System.out.println("\nAccount Data: \n" + c1);

		System.out.print("\nEnter a deposit value: ");
		valor = sc.nextDouble();
		c1.deposito(valor);
		System.out.println("\nUpdated Account Data: \n" + c1);

		System.out.print("\nEnter a withdraw value: ");
		valor = sc.nextDouble();
		c1.saques(valor);
		System.out.println("\nUpdated Account Data: \n" + c1);

		sc.close();

	}

}

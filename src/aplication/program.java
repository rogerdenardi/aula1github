package aplication;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Informe um número: ");
		int numero = entrada.nextInt();
		System.out.println("Número: "+numero);
		System.out.println("Informe um nome: ");
		String nome = entrada.next();
		System.out.println("Nome: "+nome);
		System.out.println("Informe o cargo: ");
		String cargo = entrada.next();
		System.out.println("Cargo: "+cargo);

	}

}

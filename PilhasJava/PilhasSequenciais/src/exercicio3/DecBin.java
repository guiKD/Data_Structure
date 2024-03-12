package exercicio3;

import java.util.Scanner;

import pilhas.Pilhaint;

public class DecBin {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pilhaint pilha = new Pilhaint();

		pilha.init();

		System.out.println("Informe valor decimal: ");
		int decimal = entrada.nextInt();
		int resto;
		while (decimal != 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}

		System.out.println("Binário: ");
		pilha.esvazia();

		entrada.close();

	}

}

package aplicacao;

import pilhas.Pilhaint;

public class MainTeste {

	public static void main(String[] args) {

		Pilhaint pilha = new Pilhaint();
		pilha.init();

		pilha.push(01);
		pilha.push(12);
		pilha.push(22);
		pilha.push(33);
		pilha.push(44);
		pilha.push(55);
		pilha.push(66);

		if (!pilha.isEmpty()) // (pilha.isEmpty()!=true)
			System.out.println("Valor que está no topo da pilha " + pilha.top());
		else
			System.out.println("Pilha vazia");

		pilha.esvazia();

	}

}

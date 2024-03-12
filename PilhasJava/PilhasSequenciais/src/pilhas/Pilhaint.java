package pilhas;

public class Pilhaint {

	public final int N = 6;
	int dados[] = new int[6];
	int topo;

	public void init() {
		topo = 0;
	} // topo sempre começa em 0 - convenção

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}

	public void push(int elem) {
		if (isFull())
			System.out.println("Stack Overflow");
		else {
			dados[topo] = elem;
			topo++;
		}
	}

	public boolean isEmpty() {
		if (topo == 0)
			return true;
		else
			return false;
	}

	public int pop() {
		topo--;
		return (dados[topo]);
	}
	
	public int top() {
		return (dados[topo-1]);
	}

	public void esvazia() {
		while (!isEmpty()) // (pilha.isEmpty()!=true)
			System.out.println(" " + pop());
	}
	
}

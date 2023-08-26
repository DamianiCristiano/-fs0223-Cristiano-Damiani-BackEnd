package chain;

public class Main {

	private ChainDisp c1;

	public void Fchain() {
		this.c1 = new Generale();
		ChainDisp c2 = new Colonnello();
		ChainDisp c3 = new Tenente();
		ChainDisp c4 = new Maggiore();
		ChainDisp c5 = new Capitano();
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		c3.setNextChain(c4);
		c4.setNextChain(c5);
	}

	public static void main(String[] args) {

		Main m = new Main();
		m.Fchain();
		m.c1.dispense(new Soldi(5000));
		m.c1.dispense(new Soldi(2000));
	}

}

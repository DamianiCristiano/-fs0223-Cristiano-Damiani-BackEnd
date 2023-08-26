package chain;

public class Capitano implements ChainDisp {

	private ChainDisp chain;

	@Override
	public void setNextChain(ChainDisp nextChain) {
		this.chain = nextChain;

	}

	@Override
	public void dispense(Soldi cur) {
		if (cur.getCurrency() == 1000) {
			System.out.println("sono un Capitano");
		} else {
			this.chain.dispense(cur);
		}
	}

}

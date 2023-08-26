package chain;

public class Colonnello implements ChainDisp {

	private ChainDisp chain;

	@Override
	public void setNextChain(ChainDisp nextChain) {
		this.chain = nextChain;

	}

	@Override
	public void dispense(Soldi cur) {
		if (cur.getCurrency() == 4000) {
			System.out.println("sono un Colonnello");
		} else {
			this.chain.dispense(cur);
		}
	}
}

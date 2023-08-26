package chain;

public class Maggiore implements ChainDisp {

	private ChainDisp chain;

	@Override
	public void setNextChain(ChainDisp nextChain) {
		this.chain = nextChain;

	}

	@Override
	public void dispense(Soldi cur) {
		if (cur.getCurrency() == 2000) {
			System.out.println("sono un Maggiore");
		} else {
			this.chain.dispense(cur);
		}
	}

}

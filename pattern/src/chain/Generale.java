package chain;

public class Generale implements ChainDisp {

	private ChainDisp chain;

	@Override
	public void setNextChain(ChainDisp nextChain) {
		this.chain = nextChain;

	}

	@Override
	public void dispense(Soldi cur) {
		if (cur.getCurrency() == 5000) {
			System.out.println("sono un Generale");
		} else {
			this.chain.dispense(cur);
		}
	}
}

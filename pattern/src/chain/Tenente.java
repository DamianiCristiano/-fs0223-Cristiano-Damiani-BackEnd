package chain;

public class Tenente implements ChainDisp {

	private ChainDisp chain;

	@Override
	public void setNextChain(ChainDisp nextChain) {
		this.chain = nextChain;

	}

	@Override
	public void dispense(Soldi cur) {
		if (cur.getCurrency() == 3000) {
			System.out.println("sono un Tenente");
		} else {
			this.chain.dispense(cur);
		}
	}

}

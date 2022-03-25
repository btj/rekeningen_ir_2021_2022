package rekeningen;

public abstract class Rekening {
	
	private int balans;
	
	public int getBalans() { return balans; }
	
	/**
	 * @post | getBalans() == 0
	 */
	public Rekening() {
		balans = 0;
	}
	
	/**
	 * @pre | 0 <= bedrag
	 * 
	 * @mutates | this
	 * 
	 * @post | getBalans() == old(getBalans()) + bedrag
	 */
	public void stort(int bedrag) {
		balans += bedrag;
	}
	
	/**
	 * @pre | 0 <= bedrag
	 * @mutates | this
	 * @post | getBalans() == old(getBalans()) - result
	 * @post | 0 <= result && result <= bedrag
	 */
	public int haalAf(int bedrag) {
		balans -= bedrag;
		return bedrag;
	}

}

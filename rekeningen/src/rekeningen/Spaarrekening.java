package rekeningen;

public class Spaarrekening extends Rekening {
	
	/**
	 * @post | getBalans() == 0
	 */
	public Spaarrekening() {}
	
	/**
	 * @post | result == 0
	 * @post | getBalans() == old(getBalans())
	 */
	public int haalAf() { return 0; }

}

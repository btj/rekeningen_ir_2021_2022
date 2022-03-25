package rekeningen;

/**
 * @invar | -getKredietlimiet() <= getBalans()
 */
public class Zichtrekening extends Rekening {
	
	/**
	 * @invar | 0 <= kredietlimiet
	 * @invar | -kredietlimiet <= super.getBalans()
	 */
	private int kredietlimiet;
	
	public int getKredietlimiet() { return kredietlimiet; }
	
	/**
	 * @pre | 0 <= kredietlimiet
	 * 
	 * @post | getBalans() == 0
	 * @post | getKredietlimiet() == kredietlimiet
	 */
	public Zichtrekening(int kredietlimiet) {
		this.kredietlimiet = kredietlimiet;
	}
	
	/**
	 * @pre | 0 <= bedrag
	 * @mutates | this
	 * @post | getBalans() == old(getBalans()) - result
	 * @post | result == Math.min(bedrag,
	 *       |    getKredietlimiet() + getBalans())
	 */
	@Override
	public int haalAf(int bedrag) {
		if (-getKredietlimiet() <= getBalans() - bedrag)
			return super.haalAf(bedrag);
		int result = getBalans() + getKredietlimiet();
		return super.haalAf(result);
	}

}

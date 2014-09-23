package pathfinder.data.Spells;

/**
 * A data representation for the ranges of a spell
 * @author Real Standard Studios - Kenneth Cooper
 */
public enum Ranges {
	PERSONAL(0), TOUCH(5), CLOSE(25), MEDIUM(100), LONG(400), OTHER(-1);
	
	private int value;
	
	/**
	 * @param value
	 */
	private Ranges(int value) {
		this.value = value;
	}
	
	/**
	 * @returns an int
	 */
	public int getValue() {
		return value;
	}
}

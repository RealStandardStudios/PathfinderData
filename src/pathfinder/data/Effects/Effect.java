package pathfinder.data.Effects;

/**
 * An effect of some kind with a definable value to the character
 * @author Real Standard Studios - Matthew Meehan
 */
public abstract class Effect {
	private int value;
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * The default Constructor for Kryo
	 */
	public Effect() { }
	
	/**
	 * 
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 */
	public Effect(int val, String name) {
		this.value = val;
		this.name = name;
	}
}

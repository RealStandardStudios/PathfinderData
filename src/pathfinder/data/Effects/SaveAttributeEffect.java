/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that gives a bonus to a SaveAttribute
 * @author Real Standard Studios - Matthew Meehan
 */
public class SaveAttributeEffect extends Effect {
	private String attributeName;
	
	/**
	 * @return the attributeName
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * @param attributeName the attributeName to set
	 */
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	/**
	 * The default Constructor for Kryo
	 */
	public SaveAttributeEffect() {
		super();
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 * @param attributeName The name of the Save Attribute that is effected by this
	 */
	public SaveAttributeEffect(int val, String name, String attributeName) {
		super(val, name);
		this.attributeName = attributeName;
	}

}
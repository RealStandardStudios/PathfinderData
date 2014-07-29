/**
 * 
 */
package pathfinder.data.Effects.Actions;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link ActionEffect} that occurs when a Feint is successful
 */
public class FeintActionEffect extends ActionEffect {
	private String description;

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * The default Constructor for Kyro
	 */
	public FeintActionEffect() {
		super();
	}

	/**
	 * @param val
	 * @param name
	 */
	public FeintActionEffect(int val, String name, String description) {
		super(val, name, "Feint");
		this.description = description;
	}
	
}

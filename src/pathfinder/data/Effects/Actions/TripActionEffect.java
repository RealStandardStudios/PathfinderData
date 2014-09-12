/**
 * 
 */
package pathfinder.data.Effects.Actions;

/**
 * An {@link ActionEffect} that gives a bonus to trips
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class TripActionEffect extends ActionEffect{
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
	public TripActionEffect() {
		super();
		this.getNameProperty().set("Trip Action Effect");
	}
	
	/**
	 * @param val
	 * @param Name
	 */
	public TripActionEffect(int val, String name, String description) {
		super(val, name, "Trip");
		this.description = description;
	}
}

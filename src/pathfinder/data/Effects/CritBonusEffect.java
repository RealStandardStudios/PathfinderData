/**
 * 
 */
package pathfinder.data.Effects;

/**
 * An {@link Effect} that gives a bonus to Attack rolls made to confirm Critical Hits
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class CritBonusEffect extends Effect {

	/**
	 * The default constructor for Kryo
	 */
	public CritBonusEffect() {
		super();
		this.getNameProperty().set("Crit Bonus Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public CritBonusEffect(int val, String name) {
		super(val, name);
	}
	
}

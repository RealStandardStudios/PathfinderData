package pathfinder.data.Effects;

/**
 * A {@link Effect} that gives the multiplier for damage
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class DamageMultiplierEffect extends Effect {
	/**
	 * The default constructor for Kryo
	 */
	public DamageMultiplierEffect() {
		super();
		this.NameProperty().set("Damage Multipluer Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public DamageMultiplierEffect(int val, String name) {
		super(val, name);
	}
}

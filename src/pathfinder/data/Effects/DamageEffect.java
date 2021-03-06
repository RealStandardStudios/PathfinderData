package pathfinder.data.Effects;

/**
 * An {@link Effect} that gives a boost to damage
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class DamageEffect extends Effect {
	/**
	 * The default constructor for Kryo
	 */
	public DamageEffect() {
		super();
		this.getNameProperty().set("Damage Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public DamageEffect(int val, String name) {
		super(val, name);
	}
}

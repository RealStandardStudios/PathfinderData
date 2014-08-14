package pathfinder.data.Effects;

public class DamageEffect extends Effect {
	/**
	 * The default constructor for Kryo
	 */
	public DamageEffect() {
		super();
		this.NameProperty().set("Damage Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 */
	public DamageEffect(int val, String name) {
		super(val, name);
	}
}

package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

public class MetaMagicEffect extends Effect {
	/**
	 * The default constructor for Kryo
	 */
	public MetaMagicEffect() {
		super();
		this.NameProperty().set("Meta Magic Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param name The Name of the {@link Effect}
	 */
	public MetaMagicEffect(int val, String name) {
		super(val, name);
	}
}

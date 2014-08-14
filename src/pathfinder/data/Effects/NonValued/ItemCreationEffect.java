package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

public class ItemCreationEffect extends Effect {
	/**
	 * The default constructor for Kryo
	 */
	public ItemCreationEffect() {
		super();
		this.NameProperty().set("Item Creation Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public ItemCreationEffect(int val, String name) {
		super(val, name);
	}
}

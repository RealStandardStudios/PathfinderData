package pathfinder.data.Effects.NonValued;

import pathfinder.data.Effects.Effect;

/**
 * A {@link Effect} that is applied spells
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class MetaMagicEffect extends Effect {
	String spellName;
	String Effect;
	
	/**
	 * @return the spellName
	 */
	public String getSpellName() {
		return spellName;
	}

	/**
	 * @param spellName the spellName to set
	 */
	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}

	/**
	 * @return the effect
	 */
	public String getEffect() {
		return Effect;
	}

	/**
	 * @param effect the effect to set
	 */
	public void setEffect(String effect) {
		Effect = effect;
	}

	/**
	 * The default constructor for Kryo
	 */
	public MetaMagicEffect() {
		super();
		this.NameProperty().set("Meta Magic Effect");
	}

	/**
	 * @param val The Value of the {@link Effect}
	 * @param Name The Name of the {@link Effect}
	 */
	public MetaMagicEffect(int val, String name) {
		super(val, name);
	}
}

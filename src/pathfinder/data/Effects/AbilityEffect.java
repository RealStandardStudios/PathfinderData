package pathfinder.data.Effects;

import pathfinder.data.Attributes.AbilityName;

/**
 * An {@link Effect} that modifies an ability
 * @author Real Standard Studios - Matthew Meehan
 */
public class AbilityEffect extends Effect {
	private AbilityName abilityName;

	public AbilityName getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(AbilityName abilityName) {
		this.abilityName = abilityName;
	}
	
	/**
	 * Default Constructor for Kryo
	 */
	public AbilityEffect() {
		super();
	}
	
	public AbilityEffect(int val, String name, AbilityName abilityName) {
		super(val, name);
		this.abilityName = abilityName;
	}
}

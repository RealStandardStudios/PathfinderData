package pathfinder.data.Effects;

import pathfinder.data.Attributes.AbilityName;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that modifies an ability
 */
public class AbilityEffect extends Effect {
	private AbilityName abilityName;

	public AbilityName getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(AbilityName abilityName) {
		this.abilityName = abilityName;
	}
	
	public AbilityEffect() {
		super();
	}
	
	public AbilityEffect(int val, String name, AbilityName abilityName) {
		super(val, name);
		this.abilityName = abilityName;
	}
}

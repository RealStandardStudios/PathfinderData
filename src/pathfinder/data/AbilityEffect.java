package pathfinder.data;

import pathfinder.data.Attributes.AbilityName;

public class AbilityEffect extends Effect {
	private AbilityName abilityName;

	public AbilityName getAbilityName() {
		return abilityName;
	}

	public void setAbilityName(AbilityName abilityName) {
		this.abilityName = abilityName;
	}
	
	public AbilityEffect(int val,AbilityName abilityName) {
		super(val);
		this.abilityName = abilityName;
	}
}

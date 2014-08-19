package pathfinder.data.Attributes;

/**
 * Holds enumerator information for Ability Score names
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public enum AbilityName {
	Strength("Strength"), Dexterity("Dexterity"), Wisdom("Wisdom"), Constitution("Constitution"), Intelligence("Intelligence"), Charisma("Charisma");
	private String abilityName;
	
	private AbilityName(String abilityName) {
		this.abilityName = abilityName;
	}
	
	public String toString() {
		return this.abilityName;
	}
}

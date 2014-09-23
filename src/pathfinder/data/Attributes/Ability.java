package pathfinder.data.Attributes;

/**
 * Base class used for each of the 6 Ability Scores
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Ability {
	private int value;
	private AbilityName abilityName;

	/**
	 * @return the abilityName
	 */
	public AbilityName getAbilityName() {
		return abilityName;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set 
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return an int that represents an ability modifier
	 */
	public int getModifier() {
		if(((value -10 )/ 2.0) < 0.0)
		{
			return (int) (((value -10 )/ 2.0) - 0.5); 
		}
		else
		{
			return (this.value - 10) / 2;
		}
		
	}
	
	/**
	 * called from getAbility to increase the ability by 1
	 */
	public void increaseValue()
	{
		value++;
	}
	
	/**
	 * called from getAbility to decrease the ability by 1
	 */
	public void decreaseValue()
	{
		value--;
	}

	/**
	 * Base constructor for Kryo
	 */
	public Ability() {
	}

	/**
	 * Constructor for the Ability class
	 * 
	 * @param abilityName
	 * @param value
	 */
	public Ability(AbilityName abilityName, int value) {
		this.abilityName = abilityName;
		this.value = value;
	}
}
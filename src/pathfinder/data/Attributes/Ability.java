package pathfinder.data.Attributes;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 * Base class used for each of the 6 Ability Scores
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Ability {
	private int totalValue;
	private AbilityName abilityName;
	private int baseValue;
	private int racialBonus;
	
	public int getRacialBonus() {
		return racialBonus;
	}

	public void setRacialBonus(int racialBonus) {
		this.racialBonus = racialBonus;
	}

	public int getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(int baseValue) {
		this.baseValue = baseValue;
	}

	/**
	 * @return the abilityName
	 */
	public AbilityName getAbilityName() {
		return abilityName;
	}

	/**
	 * @return the total value 
	 */
	public int getTotalValue() {
		return totalValue;
	}
	/**
	 * 
	 * @param add the sent integer to the total
	 */
	public void setTotalValue(int addToTotal)
	{
		totalValue = totalValue + addToTotal;
	}

	/**
	 * @param value the value to set 
	 */
	/**
	 * @return an int that represents an ability modifier
	 */
	public ObjectProperty<Integer> getModifier() {
		if(((totalValue -10 )/ 2.0) < 0.0)
		{
			return new SimpleObjectProperty<Integer>((int) (((totalValue -10 )/ 2.0) - 0.5)); 
		}
		else
		{
			return new SimpleObjectProperty<Integer>((this.totalValue - 10) / 2);
		}
		
	}
	
	/**
	 * called from getAbility to increase the ability by 1
	 */
	public void increaseValue()
	{
		baseValue++;
		totalValue++;
	}
	
	/**
	 * called from getAbility to decrease the ability by 1
	 */
	public void decreaseValue()
	{
		baseValue--;
		totalValue--;
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
		this.baseValue = value;
		this.totalValue = value;
	}
}
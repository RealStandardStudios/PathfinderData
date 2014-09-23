package pathfinder.data;

import java.util.HashMap;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Attributes.Ability;

/**
 * The skill class
 * 
 * @Author Real Standard Studios - Matthew Meehan
 */
public class Skill {
	public ObjectProperty<Integer> Rank;
	public ObjectProperty<Ability> AttrToUse;
	public StringProperty Name;
	private boolean classSkill = false;
	
	/**
	 * this table is for when you get a bonus vs a certain event e.g- +2
	 * perception bonus for identifying evil hats, the string key identifies
	 * what the bonus applies against. as you display the result of your skill
	 * check, it also prints out the result against certain criteria. it's up to
	 * the player if that criteria applies.
	 */
	private HashMap<String, Integer> situationalMod = new HashMap<String, Integer>();

	/**
	 * @return the trained
	 */
	public boolean isClassSkill() {
		return classSkill;
	}

	/**
	 * @return the situationalMod
	 */
	public HashMap<String, Integer> getSituationalMod() {
		return situationalMod;
	}

	/**
	 * Empty constructor for Kryo
	 */
	public Skill() {
	}

	/**
	 * @param Rank
	 * @param AttrToUse
	 * @param Name
	 * @param classSkill
	 * @param situationalMod
	 */
	public Skill(int rank, Ability attrToUse, String name, boolean classSkill,
			HashMap<String, Integer> situationalMod) {
		this.Rank = new SimpleObjectProperty<Integer>(rank);
		this.AttrToUse = new SimpleObjectProperty<Ability>(attrToUse);
		this.Name = new SimpleStringProperty(name);
		this.classSkill = classSkill;
		this.situationalMod = situationalMod;
	}
}

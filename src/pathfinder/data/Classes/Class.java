package pathfinder.data.Classes;

import java.util.ArrayList;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pathfinder.data.DiceType;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTable.LevelTableRow;

/**
 * A generic class for classes
 * 
 * @author Real Standard Studios - Matthew Meehan 
 */
public abstract class Class {
	/**
	 * The Name of the class
	 */
	private StringProperty name;

	/**
	 * Some flavor Text about the Class from the SRD
	 */
	private String description;

	/**
	 * The role of the Class as described by the SRD
	 */
	private String role;

	/**
	 * The level of the class
	 */
	private int level;

	/**
	 * Whether the class has any alignment requirements
	 */
	private Alignment requireAlignments[];

	/**
	 * The dice type rolled for new HP every level
	 */
	private DiceType hitDice;

	/**
	 * The number of d6*10 this class rolls to determine it's starting wealth
	 */
	private int startingWealthD6;

	/**
	 * The skill ranks gained per level, Need to make sure get/set acounts for
	 * the fact that this is an int+INTMOD
	 */
	private int skillRanksPerLevel;

	/**
	 * The list of skills a class is trained in
	 */
	private String[] classSkills;

	/**
	 * A list of the Features the class has, Features is a generic type, I might
	 * remove this later
	 */
	private ObservableList<Feature> features;

	private String[] weaponProficiencies;

	private String[] armorProficiencies;

	/**
	 * @return the Name
	 */
	public String getName() {
		return name.getValue();
	}
	
	/**
	 * @return the name as a StringProperty
	 */
	public StringProperty getNameProperty() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	
	public SimpleObjectProperty<Integer> getLevelProp() {
		return new SimpleObjectProperty<Integer>(this.level);
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the requireAlignments
	 */
	public Alignment[] getRequireAlignments() {
		return requireAlignments;
	}
	
	/**
	 * Iterate through array of Alignment
	 * Return alignment value as string
	 * @return
	 */
	public String getAlignments() {
		String s = "";
		/*
		for (Alignment a : requireAlignments) {
			s += a.toString()+ ", ";
		}
		*/
		
		for (int i = 0; i < requireAlignments.length -1; i++) {
			s += requireAlignments[i].toString() + ", ";
		}
		s += requireAlignments[requireAlignments.length-1].toString();
		
		return s;
	}

	/**
	 * @return the hitDice
	 */
	public DiceType getHitDice() {
		return hitDice;
	}

	/**
	 * @return the startingWealthD6
	 */
	public int getStartingWealthD6() {
		return startingWealthD6;
	}

	/**
	 * @return the skillRanksPerLevel
	 */
	public int getSkillRanksPerLevel() {
		return skillRanksPerLevel;
	}
	
	/**
	 * @return a string of integers
	 */
	public String getSkillRanksToString() {
		return Integer.toString(skillRanksPerLevel);
	}

	/**
	 * @return the classSkills
	 */
	public String[] getClassSkills() {
		return classSkills;
	}
	
	/**
	 * @returns a string of skills thr class uses
	 */
	public String getClassSkillsToString() {
		String str = "";
		for (String s : classSkills) {
			str += s.trim() + ", ";
		}
		return str.substring(0,str.length()-2);
	}

	/**
	 * @return the features
	 */
	public ObservableList<Feature> getFeatures() {
		return features;
	}

	/**
	 * @return the weaponProficiencies
	 */
	public String[] getWeaponProficiencies() {
		return weaponProficiencies;
	}
	
	/**
	 * @returns a string of the weapon proficiencies that the class uses
	 */
	public String getWeaponProfsToString() {
		String s = "";
		for (String	w : weaponProficiencies) {
			s += w.toString();
		}
		return s;
	}

	/**
	 * @return the armorProficiencies
	 */
	public String[] getArmorProficiencies() {
		return armorProficiencies;
	}
	
	/**
	 * @returns a string of the armour proficiencies that the class uses
	 */
	public String getArmorProfsToString() {
		String s = "";
		for (String	a : armorProficiencies) {
			s += a.toString();
		}
		return s;
	}
	
	/**
	 * An observable list for class levels
	 */
	public abstract ObservableList<LevelTableRow> getLeveltableRow();
	
	/**
	 * sets the class level table
	 */
	public abstract void setLevelTable(ObservableList<LevelTableRow> levelTable);

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name.set(name);
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @param requireAlignments the requireAlignments to set
	 */
	public void setRequireAlignments(Alignment[] requireAlignments) {
		this.requireAlignments = requireAlignments;
	}

	/**
	 * @param hitDice the hitDice to set
	 */
	public void setHitDice(DiceType hitDice) {
		this.hitDice = hitDice;
	}

	/**
	 * @param startingWealthD6 the startingWealthD6 to set
	 */
	public void setStartingWealthD6(int startingWealthD6) {
		this.startingWealthD6 = startingWealthD6;
	}

	/**
	 * @param skillRanksPerLevel the skillRanksPerLevel to set
	 */
	public void setSkillRanksPerLevel(int skillRanksPerLevel) {
		this.skillRanksPerLevel = skillRanksPerLevel;
	}

	/**
	 * @param classSkills the classSkills to set
	 */
	public void setClassSkills(String[] classSkills) {
		this.classSkills = classSkills;
	}

	/**
	 * @param features the features to set
	 */
	public void setFeatures(ObservableList<Feature> features) {
		this.features = features;
	}

	/**
	 * @param weaponProficiencies the weaponProficiencies to set
	 */
	public void setWeaponProficiencies(String[] weaponProficiencies) {
		this.weaponProficiencies = weaponProficiencies;
	}

	/**
	 * @param armorProficiencies the armorProficiencies to set
	 */
	public void setArmorProficiencies(String[] armorProficiencies) {
		this.armorProficiencies = armorProficiencies;
	}

	/**
	 * an empty constructor for Kryo
	 */
	public Class() {
	}

	/**
	 * @param Name
	 * @param description
	 * @param role
	 * @param level
	 * @param requireAlignments
	 * @param hitDice
	 * @param startingWealthD6
	 * @param skillRanksPerLevel
	 * @param classSkills
	 * @param features
	 * @param weaponProficiencies
	 * @param armorProficiencies
	 */
	public Class(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, String[] classSkills,
			ArrayList<Feature> features, String[] weaponProficiencies,
			String[] armorProficiencies) {
		this.name = new SimpleStringProperty(name);
		this.description = description;
		this.role = role;
		this.level = level;
		this.requireAlignments = requireAlignments;
		this.hitDice = hitDice;
		this.startingWealthD6 = startingWealthD6;
		this.skillRanksPerLevel = skillRanksPerLevel;
		this.classSkills = classSkills;
		this.features = FXCollections.observableArrayList(features);
		this.weaponProficiencies = weaponProficiencies;
		this.armorProficiencies = armorProficiencies;
	}
	public String toString() {
		return this.name.get();
	}
}

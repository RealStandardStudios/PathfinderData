package pathfinder.data.Races;

import java.util.ArrayList;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import pathfinder.data.Effects.AbilityEffect;
import pathfinder.data.Races.Objects.Size;
import pathfinder.data.Races.Objects.VisionType;
import pathfinder.data.Races.Traits.Trait;

/**
 * An abstract class for the many races of Pathfinder
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Race {
	
	/**
	 * The Name of the Race
	 */
	private StringProperty name;
	
	/**
	 * The description of the Race
	 */
	private String description;
	
	/**
	 * The physical description of the race
	 */
	private String physicalDescription;
	
	/**
	 * The description of the races society
	 */
	private String society;
	
	/**
	 * The relations of the race with other races
	 */
	private String relations;
	
	/**
	 * The alignment and religions available to the race
	 */
	private String alignmentAndReligion;
	
	/**
	 * The kinds of adventures the race would get up to
	 */
	private String adventures;

	/**
	 * The racial effects to the players Ability Data;
	 */
	private AbilityEffect[] racialModifiers;
	
	/**
	 * The size of the race
	 */
	private Size size;
	
	/**
	 * The default speed of the race in feet
	 */
	private int speed;
	
	/**
	 * An array of Vision types applicable to the race
	 */
	private VisionType[] visionTypes;
	
	/**
	 * The variable number of racial traits
	 */
	private ArrayList<Trait> racialTraits;
	
	/**
	 * An array of the Weapons the race can use
	 */
	private String[] weaponFamiliarity;
	
	/**
	 * An array of the languages the race can speak
	 */
	private String[] languages;
	
	/**
	 * indicates whether the race's speed is effected by armor or encumberance
	 */
	private boolean speedLoss;
	
	public StringProperty getNameProperty() {
		return name;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return name.get();
	}

	/**
	 * the Name to set
	 * 
	 * @param Name
	 */
	public void setName(String name) {
		this.name.set(name);
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * the description to set
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the physicalDescription
	 */
	public String getPhysicalDescription() {
		return physicalDescription;
	}

	/**
	 * the physicalDescription to set
	 * 
	 * @param physicalDescription
	 */
	public void setPhysicalDescription(String physicalDescription) {
		this.physicalDescription = physicalDescription;
	}

	/**
	 * @return the society
	 */
	public String getSociety() {
		return society;
	}

	/**
	 * the society to set
	 * 
	 * @param society
	 */
	public void setSociety(String society) {
		this.society = society;
	}

	/**
	 * @return the relations
	 */
	public String getRelations() {
		return relations;
	}

	/**
	 * the relations to set
	 * 
	 * @param relations
	 */
	public void setRelations(String relations) {
		this.relations = relations;
	}

	/**
	 * @return the alignmentAndReligion
	 */
	public String getAlignmentAndReligion() {
		return alignmentAndReligion;
	}

	/**
	 * the alignmentAndReligion to set
	 * 
	 * @param alignmentAndReligion
	 */
	public void setAlignmentAndReligion(String alignmentAndReligion) {
		this.alignmentAndReligion = alignmentAndReligion;
	}

	/**
	 * @return the adventures
	 */
	public String getAdventures() {
		return adventures;
	}

	/**
	 * the adventures to set
	 * 
	 * @param adventures
	 */
	public void setAdventures(String adventures) {
		this.adventures = adventures;
	}

	/**
	 * @return the racialModifiers
	 */
	public AbilityEffect[] getRacialModifiers() {
		return racialModifiers;
	}
	
	public String getRacialModifierString() {
		String output = racialModifiers[0].getValue()+" "+racialModifiers[0].getAbilityName().name();
		for (int i = 1; i < racialModifiers.length; i++) {
			output+=", "+racialModifiers[i].getValue()+" "+racialModifiers[i].getAbilityName().name();
		}
		
		return output;
	}

	/**
	 * the racialModifiers to set
	 * 
	 * @param racialModifiers
	 */
	public void setRacialModifiers(AbilityEffect[] racialModifiers) {
		this.racialModifiers = racialModifiers;
	}

	/**
	 * @return the size
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * the size to set
	 * 
	 * @param size
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * the speed to set
	 * 
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the visionTypes
	 */
	public VisionType[] getVisionTypes() {
		return visionTypes;
	}

	/**
	 * the visionTypes to set
	 * 
	 * @param visionTypes
	 */
	public void setVisionTypes(VisionType[] visionTypes) {
		this.visionTypes = visionTypes;
	}

	/**
	 * @return the racialTraits
	 */
	public ArrayList<Trait> getRacialTraits() {
		return racialTraits;
	}

	/**
	 * the racialTraits to set
	 * 
	 * @param racialTraits
	 */
	public void setRacialTraits(ArrayList<Trait> racialTraits) {
		this.racialTraits = racialTraits;
	}

	/**
	 * @return the weaponFamiliarity
	 */
	public String[] getWeaponFamiliarity() {
		return weaponFamiliarity;
	}

	/**
	 * the weaponFamiliarity to set
	 * 
	 * @param weaponFamiliarity
	 */
	public void setWeaponFamiliarity(String[] weaponFamiliarity) {
		this.weaponFamiliarity = weaponFamiliarity;
	}

	/**
	 * @return the languages
	 */
	public String[] getLanguages() {
		return languages;
	}

	/**
	 * the languages to set
	 * 
	 * @param languages
	 */
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}

	/**
	 * @return the speedLoss
	 */
	public boolean isSpeedLoss() {
		return speedLoss;
	}

	/**
	 * the speedLoss to set
	 * 
	 * @param speedLoss
	 */
	public void setSpeedLoss(boolean speedLoss) {
		this.speedLoss = speedLoss;
	}

	/**
	 * @description The empty Constructor for Kryo
	 */
	public Race() {
		name = new SimpleStringProperty();
	}

	/**
	 * @param Name
	 * @param size
	 * @param speed
	 * @param languages
	 * @param weapons
	 * @param attributeBonus
	 * @param speedLoss
	 * @param visionTypes
	 */
	public Race(String name, Size size, int speed, String[] languages,
			String[] weapons, ArrayList<AbilityEffect> racialModifiers,
			boolean speedLoss, VisionType[] visionTypes) {
		super();
		this.name = new SimpleStringProperty(name);
		this.size = size;
		this.speed = speed;
		this.languages = languages;
		this.weaponFamiliarity = weapons;
		this.racialModifiers = (AbilityEffect[]) racialModifiers.toArray();
		this.speedLoss = speedLoss;
		this.visionTypes = visionTypes;
	}

	public String getVisionString() {
		String output = visionTypes[0].getName();
		for (int i = 1; i < visionTypes.length; i++) {
			output+=", "+visionTypes[i].getName();
		}
		return output;
	}

	public String getTraitsString() {
		String output = racialTraits.get(0).Name.get();
		for (int i = 1; i < racialTraits.size(); i++) {
			output+=", "+racialTraits.get(i).Name.get();
		}
		return output;
	}
	
	public String getWeaponsString() {
		String output = weaponFamiliarity[0];
		for (int i = 1; i < weaponFamiliarity.length; i++) {
			output+=", "+weaponFamiliarity[i];
		}
		return output;
	}

	public String getLanguagesString() {
		String output = languages[0];
		for (int i = 1; i < languages.length; i++) {
			output+=", "+languages[i];
		}
		return output;
	}
}

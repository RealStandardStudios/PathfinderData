package pathfinder.data.Character;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import pathfinder.data.Feat;
import pathfinder.data.Skill;
import pathfinder.data.Attributes.Ability;
import pathfinder.data.Attributes.SaveAttribute;
import pathfinder.data.Classes.Class;
import pathfinder.data.Classes.Objects.AdvancmentTable;
import pathfinder.data.Classes.Objects.LevelOption;
import pathfinder.data.Effects.Effect;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Shield;
import pathfinder.data.Races.Race;
import pathfinder.data.Races.Traits.Trait;

/**
 * A class that represents the character as a whole, emulates the data from a
 * character sheet
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class Character {
	private String name;
	private int level;
	private Race race;
	private Ability[] abilities = new Ability[6];
	private SaveAttribute[] saveAttributes = new SaveAttribute[3];
	private Resistance[] resistances = new Resistance[5];
	private Class[] classes;
	private Skill[] skills;
	private Feat[] feats;
	private Inventory inventory;
	private Alignment alignment;
	private HashMap<String, String> fluff;
	private String[] languages;
	private int maxHP;
	private int currentHP;
	private int nonLethalHP;
	private int[] hpGainedPerLevel = new int[20];

	
	public void setMaxHP(int hitDice, int conMod)
	{
		if (level == 1)
		{
			maxHP = hitDice + conMod;
		}
		else
		{
			Random rand = new Random();
			int  n = rand.nextInt(hitDice) + 1;
			maxHP += n + conMod;
			hpGainedPerLevel[level] = n + conMod;
		}
	}

	public int getCurrentHP() {
		return currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
	}

	public int getNonLethalHP() {
		return nonLethalHP;
	}

	public void setNonLethalHP(int nonLethalHP) {
		this.nonLethalHP = nonLethalHP;
	}	
	
	public int getMaxHP()
	{
		return maxHP;
	}
	
	/**
	 * The effects that have been applied to the character through Class
	 * features, Feats or racial traits
	 */
	private ArrayList<Effect> effects;

	/**
	 * get and set for this will need to take into account all of the relevant
	 * bonus
	 */
	private int armorClass;

	/**
	 * int between 0 and 2; 0 is slow track, 1 is medium track, 2 is fast track
	 */
	private int experienceTrack;
	private int experienceValue;

	/**
	 * @return the inventory
	 */
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * @param inventory
	 *            the inventory to set
	 */
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param Name
	 *            the Name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
		try {
			setFortitude(new SaveAttribute("Fortitude", getConstitution(), this.getClasses()[0].getLeveltableRow().get(level).getFort(), 0));
			setReflex(new SaveAttribute("Reflex", getDexterity(), this.getClasses()[0].getLeveltableRow().get(level).getRef(), 0));
			setWill(new SaveAttribute("Will", getWisdom(), this.getClasses()[0].getLeveltableRow().get(level).getWill(), 0));
			getClasses()[0].setLevel(this.level);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int[] getBaB() {
		return getClasses()[0].getLeveltableRow().get(level).getBAB();
	}

	public String getBabString() {
		return getClasses()[0].getLeveltableRow().get(level).getBABProperty()
				.get();
	}

	/**
	 * @return the race
	 */
	public Race getRace() {
		return race;
	}

	/**
	 * @param race
	 *            the race to set
	 */
	public void setRace(Race race) {
		this.race = race;
		for (Trait t : race.getRacialTraits()) {
			effects.add(t.getEffect());
		}
	}

	/**
	 * @return the attributes
	 */
	public Ability[] getAbilities() {
		return abilities;
	}

	/**
	 * @return this.abilities[0] the position in the array for strength
	 */
	public Ability getStrength() {
		return this.abilities[0];
	}

	/**
	 * @return this.abilities[1] the position in the array for dexterity
	 */
	public Ability getDexterity() {
		return this.abilities[1];
	}

	/**
	 * @return this.abilities[2] the position in the array for constitution
	 */
	public Ability getConstitution() {
		return this.abilities[2];
	}

	/**
	 * @return this.abilities[0] the position in the array for intelligence
	 */
	public Ability getIntelligence() {
		return this.abilities[3];
	}

	/**
	 * @return this.abilities[0] the position in the array for wisdom
	 */
	public Ability getWisdom() {
		return this.abilities[4];
	}

	/**
	 * @return this.abilities[0] the position in the array for charisma
	 */
	public Ability getCharisma() {
		return this.abilities[5];
	}

	/**
	 * @param abilities
	 *            the attributes to set
	 */
	public void setAbilities(Ability[] abilities) {
		this.abilities = abilities;
	}

	/**
	 * Sets abilities[0] which is strength
	 * 
	 * @param strength
	 */
	public void setStrength(Ability strength) {
		this.abilities[0] = strength;
	}

	/**
	 * Sets abilities[1] which is dexterity
	 * 
	 * @param dexterity
	 */
	public void setDexterity(Ability dexterity) {
		this.abilities[1] = dexterity;
	}

	/**
	 * Sets abilities[2] which is constitution
	 * 
	 * @param constitution
	 */
	public void setConstitution(Ability constitution) {
		this.abilities[2] = constitution;
	}

	/**
	 * Sets abilities[3] which is intelligence
	 * 
	 * @param intelligence
	 */
	public void setIntelligence(Ability intelligence) {
		this.abilities[3] = intelligence;
	}

	/**
	 * Sets abilities[4] which is wisdom
	 * 
	 * @param wisdom
	 */
	public void setWisdom(Ability wisdom) {
		this.abilities[4] = wisdom;
	}

	/**
	 * Sets abilities[5] which is charisma
	 * 
	 * @param charisma
	 */
	public void setCharisma(Ability charisma) {
		this.abilities[5] = charisma;
	}

	/**
	 * @return the saveAttributes
	 */
	public SaveAttribute[] getSaveAttributes() {
		return saveAttributes;
	}

	/**
	 * @return saveAttributes[0] which is fortitude
	 */
	public SaveAttribute getFortitude() {
		return saveAttributes[0];
	}

	/**
	 * @return saveAttributes[1] which is reflex
	 */
	public SaveAttribute getReflex() {
		return saveAttributes[1];
	}

	/**
	 * @return saveAttributes[2] which is will
	 */
	public SaveAttribute getWill() {
		return saveAttributes[2];
	}

	/**
	 * @param saveAttributes
	 *            the saveAttributes to set
	 */
	public void setSaveAttributes(SaveAttribute[] saveAttributes) {
		this.saveAttributes = saveAttributes;
	}

	/**
	 * sets saveAttributes[0] which is fortitude
	 * 
	 * @param fortitude
	 */
	public void setFortitude(SaveAttribute fortitude) {
		this.saveAttributes[0] = fortitude;
	}

	/**
	 * sets saveAttributes[1] which is reflex
	 * 
	 * @param reflex
	 */
	public void setReflex(SaveAttribute reflex) {
		this.saveAttributes[1] = reflex;
	}

	/**
	 * sets saveAttributes[2] which is will
	 * 
	 * @param will
	 */
	public void setWill(SaveAttribute will) {
		this.saveAttributes[2] = will;
	}

	/**
	 * @return the classes
	 */
	public Class[] getClasses() {
		return classes;
	}

	/**
	 * @param classes
	 *            the classes to set
	 */
	public void setClasses(Class[] classes) {
		this.classes = classes;
		// for (Class c : classes) {
		// for (Feature f : c.getFeatures()) {
		// if(f.getEffectProperty().get()!=null)effects.add(f.getEffectProperty().get());
		// }
		// }
	}

	/**
	 * @return the skills
	 */
	public Skill[] getSkills() {
		return skills;
	}

	/**
	 * @param skills
	 *            the skills to set
	 */
	public void setSkills(Skill[] skills) {
		this.skills = skills;
	}

	/**
	 * @return the feats
	 */
	public Feat[] getFeats() {
		return feats;
	}

	/**
	 * @param feats
	 *            the feats to set
	 */
	public void setFeats(Feat[] feats) {
		this.feats = feats;
	}

	/**
	 * @return the armorClass
	 */
	public int getArmorClass() {
		return armorClass;
	}

	/**
	 * sets armorClass with a totaled integer
	 * 
	 * @param armorClass
	 */
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	/**
	 * sets armorClass with all of the components to add together
	 * 
	 * @param deflectionMod
	 * @param miscMod
	 */
	public void setArmorClass(int deflectionMod, int miscMod) {
		int armorBonus = 0, shieldBonus = 0;
		for (Armor a : inventory.getArmorWorn()) {
			if (a instanceof Shield)
				shieldBonus += a.getArmorBonusInt();
			else
				armorBonus += a.getArmorBonusInt();
		}
		this.armorClass = 10 + armorBonus + shieldBonus
				+ this.getDexterity().getModifier().get()
				+ this.race.getSize().getSizeModifier() + deflectionMod
				+ miscMod;
	}

	/**
	 * @return the experienceTrack
	 */
	public int getExperienceTrack() {
		return experienceTrack;
	}

	/**
	 * @param experienceTrack
	 *            the experienceTrack to set
	 */
	public void setExperienceTrack(int experienceTrack) {
		this.experienceTrack = experienceTrack;
	}

	/**
	 * @return the experienceValue
	 */
	public int getExperienceValue() {
		return experienceValue;
	}

	/**
	 * @param experienceValue
	 *            the experienceValue to set
	 * @description every time experience is updated, check to see if leveled
	 */
	public void setExp(int experienceValue) {
		this.experienceValue = experienceValue;
		LevelOption temp = AdvancmentTable.IsLeveled(this.experienceValue,
				this.experienceTrack);
		if (temp.Level() != this.level)
			this.level = temp.Level();
	}

	/**
	 * @return the resistances
	 */
	public Resistance[] getResistances() {
		return resistances;
	}

	/**
	 * @return resistances[0] which is fire resistance
	 */
	public Resistance getFireResistance() {
		return resistances[0];
	}

	/**
	 * @return resistances[1] which is cold resistance
	 */
	public Resistance getColdResistance() {
		return resistances[1];
	}

	/**
	 * @return resistances[2] which is sonic resistance
	 */
	public Resistance getSonicResistance() {
		return resistances[2];
	}

	/**
	 * @return resistances[3] which is acid resistance
	 */
	public Resistance getAcidResistance() {
		return resistances[3];
	}

	/**
	 * @return resistances[4] which is electric resistance
	 */
	public Resistance getElectricResistance() {
		return resistances[4];
	}

	/**
	 * @param resistances
	 *            the resistances to set
	 */
	public void setResistances(Resistance[] resistances) {
		this.resistances = resistances;
	}

	/**
	 * sets resistances[0] which is fire resistance
	 * 
	 * @param fireReisistance
	 */
	public void setFireResistance(Resistance fireReisistance) {
		this.resistances[0] = fireReisistance;
	}

	/**
	 * sets resistances[1] which is cold resistance
	 * 
	 * @param coldReisistance
	 */
	public void setColdResistance(Resistance coldReisistance) {
		this.resistances[1] = coldReisistance;
	}

	/**
	 * sets resistances[2] which is sonic resistance
	 * 
	 * @param sonicReisistance
	 */
	public void setSonicResistance(Resistance sonicReisistance) {
		this.resistances[2] = sonicReisistance;
	}

	/**
	 * sets resistances[3] which is acid resistance
	 * 
	 * @param acidReisistance
	 */
	public void setAcidResistance(Resistance acidReisistance) {
		this.resistances[3] = acidReisistance;
	}

	/**
	 * sets resistances[4] which is electric resistance
	 * 
	 * @param electricReisistance
	 */
	public void setElectricResistance(Resistance electricReisistance) {
		this.resistances[4] = electricReisistance;
	}

	public ArrayList<Effect> getEffects() {
		return effects;
	}

	public void setEffects(ArrayList<Effect> effects) {
		this.effects = effects;
	}

	/**
	 * The empty constructor for Kryo
	 */
	public Character() {
		this.effects = new ArrayList<>();
		this.fluff = new HashMap<String, String>();
	}

	/**
	 * @return the alignment
	 */
	public Alignment getAlignment() {
		return alignment;
	}

	/**
	 * @param alignment
	 *            the alignment to set
	 */
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	/**
	 * @param fluff
	 *            the fluff to set
	 */
	public void setFluff(HashMap<String, String> fluff) {
		this.fluff = fluff;
	}

	public HashMap<String, String> getFluff() {
		return this.fluff;
	}

	public void setLanguages(String[] data) {
		this.languages = data;
	}
	
	public String[] getLanguages() {
		return this.languages;
	}
	
	public String getLanguagesString() {
		String languages = this.languages[0];
		for (int i = 1; i < this.languages.length; i++) {
			languages+=", "+this.languages[i];
		}
		return languages;
	}
}

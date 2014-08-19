package pathfinder.data.Classes;

import java.util.HashMap;

import pathfinder.data.DiceType;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTableRow;
import pathfinder.data.Classes.Objects.SpellLevelTableRow;
import pathfinder.data.Items.ArmorType;
import pathfinder.data.Items.WeaponType;
import pathfinder.data.Skills.Skill;
import pathfinder.data.Spells.Spell;

/**
 * The Wizard Class http://paizo.com/pathfinderRPG/prd/classes/wizard.html#_wizard
 * 
 * @author Matthew
 */
public class Wizard extends Class {
	/**
	 * An array of a HashMaps containing spells, an index of the array equals a
	 * level
	 */
	private HashMap<String, Spell> spells;

	private SpellLevelTableRow[] levelTable;

	/**
	 * @return the spells
	 */
	public HashMap<String, Spell> getSpells() {
		return spells;
	}

	/**
	 * @return the levelTable
	 */
	public SpellLevelTableRow[] getLevelTable() {
		return levelTable;
	}
	
	@Override
	public void SetLevelTable(LevelTableRow[] levelTable) {
		this.levelTable = (SpellLevelTableRow[]) levelTable;
	}
	
	/**
	 * an empty constructor for Kryo
	 */
	public Wizard(){
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
	 * @param spells
	 * @param levelTable
	 */
	public Wizard(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, String[] classSkills,
			Feature[] features, String[] weaponProficiencies,
			String[] armorProficiencies, HashMap<String, Spell> spells,
			SpellLevelTableRow[] levelTable) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.spells = spells;
		this.levelTable = levelTable;
	}
}

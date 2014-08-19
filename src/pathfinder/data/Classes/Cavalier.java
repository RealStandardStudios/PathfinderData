package pathfinder.data.Classes;

import pathfinder.data.DiceType;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTableRow;

/**
 * The Cavalier Class http://paizo.com/pathfinderRPG/prd/advanced/baseClasses/cavalier.html
 * 
 * @author Real Standard Studio - Matthew Meehan 
 */
public class Cavalier extends Class {

	private LevelTableRow[] levelTable;

	/**
	 * @return the levelTable
	 */
	public LevelTableRow[] getLevelTable() {
		return levelTable;
	}
	
	@Override
	public void SetLevelTable(LevelTableRow[] levelTable) {
		this.levelTable = levelTable;
	}
	
	/**
	 * An empty constructor for Kryo
	 */
	public Cavalier() {
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
	 * @param levelTable
	 */
	public Cavalier(String name, String description, String role, int level,
			Alignment[] requireAlignments, DiceType hitDice,
			int startingWealthD6, int skillRanksPerLevel, String[] classSkills,
			Feature[] features, String[] weaponProficiencies,
			String[] armorProficiencies, LevelTableRow[] levelTable) {
		super(name, description, role, level, requireAlignments, hitDice,
				startingWealthD6, skillRanksPerLevel, classSkills, features,
				weaponProficiencies, armorProficiencies);
		this.levelTable = levelTable;
	}

}

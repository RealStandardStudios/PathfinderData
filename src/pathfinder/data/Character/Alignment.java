package pathfinder.data.Character;

/**
 * holds the enumerator information for Alignments
 * 
 * @author Real Standard Studios - Ian Larsen
 */
public enum Alignment {
	LawfulGood("Lawful Good"), NeutralGood("Neutral Good"), ChaoticGood("Chaotic Good"), LawfulNeutral("Lawful Neutral"), Neutral("Neutral"), ChaoticNeutral("Chaotic Neutral"), LawfulEvil("Lawful Evil"), NeutralEvil("Neutral Evil"), ChaoticEvil("Chaotic Evil");
	
	private String alignment;
	
	/**
	 * @param stringVal
	 */
	private Alignment(String stringVal) {
		alignment = stringVal;
	}
	
	/**
	 * overrides toString() to print out alignment
	 */
	public String toString() {
		return alignment;
	}
}

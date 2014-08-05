package pathfinder.data.Character;

/**
 * 
 * @author Real Standard Studios - Alignment
 * 
 *         holds the enumerator information for Alignments
 */
public enum Alignment {
	LawfulGood("Lawful Good"), NeutralGood("Neutral Good"), ChaoticGood("Chaotic Good"), LawfulNeutral("Lawful Neutral"), Neutral("Neutral"), ChaoticNeutral("Chaotic Neutral"), LawfulEvil("Lawful Evil"), NeutralEvil("Neutral Evil"), ChaoticEvil("Chaotic Evil");
	
	private String alignment;
	
	private Alignment(String stringVal) {
		alignment = stringVal;
	}
	
	public String toString() {
		return alignment;
	}
}

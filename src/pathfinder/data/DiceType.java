package pathfinder.data;

/**
 * 
 * @author Real Standard Studios - Matthew Meehan, Ian Larsen
 * 
 * holds the enumerator information for the
 * Die Types
 */
public enum DiceType {
	d2(2),d3(3),d4(4),d6(6),d8(8),d10(10),d12(12),d20(20),d100(100);
	
	private int diceType;
	
	private DiceType(int diceValue) {
		diceType = diceValue;
	}
	
	public String toString() {
		return Integer.toString(diceType);
	}
}

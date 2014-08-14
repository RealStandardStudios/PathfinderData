package pathfinder.data.Character;

/**
 * Creating a set of alignments to facilitate faster programming
 * 
 * @author Real Standard Studios - Ian Larsen
 */
public class Alignments {
	public static Alignment[] Any = new Alignment[] { 
		Alignment.LawfulGood, Alignment.NeutralGood, Alignment.ChaoticGood,
		Alignment.LawfulNeutral, Alignment.Neutral,
		Alignment.ChaoticNeutral, Alignment.LawfulEvil,
		Alignment.NeutralEvil, Alignment.ChaoticEvil
	};
	
	public static Alignment[] AnyNonLawful = new Alignment[] {
		Alignment.NeutralGood, Alignment.ChaoticGood,
		Alignment.Neutral, Alignment.ChaoticNeutral,
		Alignment.NeutralEvil, Alignment.ChaoticEvil
	};
	
	public static Alignment[] AnyLawful = new Alignment[] {
		Alignment.LawfulGood, Alignment.LawfulNeutral, Alignment.LawfulEvil
	};
}
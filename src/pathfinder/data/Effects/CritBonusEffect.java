/**
 * 
 */
package pathfinder.data.Effects;

/**
 * @Author Real Standard Studios - Matthew Meehan
 * @description An {@link Effect} that gives a bonus Attack rolls made to confirm CriticalHits
 */
public class CritBonusEffect extends Effect {

	/**
	 * The default constructor for Kryo
	 */
	public CritBonusEffect() {
		super();
	}

	/**
	 * @param val
	 * @param name
	 */
	public CritBonusEffect(int val, String name) {
		super(val, name);
	}
	
}

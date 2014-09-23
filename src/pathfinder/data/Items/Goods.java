package pathfinder.data.Items;

/**
 * An {@link Item} that is considered goods.
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class Goods extends Item {

	/**
	 * an empty constructor for Kryo
	 */
	public Goods()
	{
		
	}
	
	/**
	 * @param name
	 * @param cost
	 * @param weight
	 */
	public Goods(String name, String cost, String weight)
	{
		super(name, cost, weight);
	}
}

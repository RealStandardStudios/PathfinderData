/**
 * 
 */
package pathfinder.data.Items;

/**
 * The base class for all items
 * @author Real Standard Studios - Joshua Boyd
 *
 */
public abstract class Item {
	private String name;
	private int cost;
	private int weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	 * The default constructor for Kyro
	 */
	public Item() {
		
	}
	
	/**
	 * An Item
	 * @param name The name of the item
	 * @param cost The cost of the item
	 * @param weight The Weight of the item
	 */
	public Item(String name, int cost, int weight) {
		this.name = name;
		this.cost = cost;
		this.weight = weight;
	}
	
}

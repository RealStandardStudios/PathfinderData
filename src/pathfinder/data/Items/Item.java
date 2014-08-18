/**
 * 
 */
package pathfinder.data.Items;

/**
 * The base class for all items
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public abstract class Item {
	private String name;
	private String cost;
	private String weight;
	
	/**
	 * @returns a String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @returns a String
	 */
	public String getCost() {
		return cost;
	}
	
	/**
	 * @param cost
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	/**
	 * @returns a String
	 */
	public String getWeight() {
		return weight;
	}
	
	/**
	 * @param weight
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	/**
	 * The default constructor for Kyro
	 */
	public Item() {
		
	}
	
	/**
	 * An Item
	 * @param Name The Name of the item
	 * @param cost The cost of the item
	 * @param weight The Weight of the item
	 */
	public Item(String name, String cost, String weight) {
		this.name = name;
		this.cost = cost;
		this.weight = weight;
	}
	
}

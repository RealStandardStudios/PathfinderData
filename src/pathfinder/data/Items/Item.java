/**
 * 
 */
package pathfinder.data.Items;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * The base class for all items
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public abstract class Item {
	private StringProperty name;
	private String cost;
	private String weight;
	
	public StringProperty getNameProperty() {
		return this.name;
	}
	
	/**
	 * @returns a String
	 */
	public String getName() {
		return name.getValue();
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name.set(name);
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
		this.name = new SimpleStringProperty(name);
		this.cost = cost;
		this.weight = weight;
	}
	
}

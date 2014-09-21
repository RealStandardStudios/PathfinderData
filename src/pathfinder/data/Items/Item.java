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
	private StringProperty cost;
	private StringProperty weight;
	
	//name
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
	
	//cost
	public StringProperty getCostProperty() {
		return this.cost;
	}
	
	/**
	 * @returns a String
	 */
	public String getCost() {
		return cost.getValue();
	}
	
	/**
	 * @param cost
	 */
	public void setCost(String cost) {
		this.cost.set(cost);
	}
	
	//weight
	public StringProperty getWeightProperty() {
		return this.weight;
	}
	
	/**
	 * @returns a String
	 */
	public String getWeight() {
		return weight.getValue();
	}
	
	/**
	 * @param weight
	 */
	public void setWeight(String weight) {
		this.weight.set(weight);
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
		this.cost = new SimpleStringProperty(cost);
		this.weight = new SimpleStringProperty(weight);
	}
	
}

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
	public StringProperty Name;
	public StringProperty Cost;
	public StringProperty Weight;
	private SlotType slotType;
	
	/**
	 * The default constructor for Kyro
	 */
	public Item() {
		slotType = SlotType.None;
	}
	
	/**
	 * An Item
	 * @param Name The Name of the item
	 * @param cost The cost of the item
	 * @param weight The Weight of the item
	 */
	public Item(String name, String cost, String weight) {
		this.Name = new SimpleStringProperty(name);
		this.Cost = new SimpleStringProperty(cost);
		this.Weight = new SimpleStringProperty(weight);
		slotType = SlotType.None;
	}

	public SlotType getSlotType() {
		return this.slotType;
	}
	
	public void setSlotType(SlotType slotType) {
		this.slotType = slotType;
	}
}

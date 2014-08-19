package pathfinder.data.Races.Traits;


/**
 * A trait for when a race has an event which does not have a statistical value as such
 * e.g: They do not lose hit points when they gain a negative level
 * 
 * @author Real Standard Studios - Joshua Boyd
 */
public class EventTrait extends Trait {
	private String cause;
    //the condition when a particular event occers
    
	private String event;
    //what the effect is when the condition is meet
}

package pathfinder.data.Races;

/**
 * 
 * @author Real Standard Studios - Joshua Boyd
 *
 * A trait for when a race has an event which does not have a staticial value as such
 * e.g: They do not lose hit points when they gain a negative level
 */
public class EventTrait extends Trait {
	private String cause;
        //the condition when a particular event accors
        private String event;
        //what the effect is when the condition is meet
}

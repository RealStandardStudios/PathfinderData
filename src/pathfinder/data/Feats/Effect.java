package pathfinder.data.Feats;

public abstract class Effect {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public Effect(int val) {
		this.value = val;
	}
}

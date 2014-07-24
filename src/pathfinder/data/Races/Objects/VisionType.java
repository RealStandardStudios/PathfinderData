package pathfinder.data.Races.Objects;

public class VisionType {
	private int distance;
	private String name;
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public VisionType(int distance, String name) {
		super();
		this.distance = distance;
		this.name = name;
	}
}
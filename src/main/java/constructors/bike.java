package constructors;

public class bike {

	int noOfGears;
	String color;

	public static void main(String[] args) {
		bike b1 = new bike("Red");
		System.out.println(b1.getcolor());
		


	}

	public bike() {
		color = "black";
	}

	public bike(String color) {
		this.color = color;
	}

	public void increasAcceleration(int speed) {
		System.out.println("acceleration is increased by :" + speed);
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

}


public class Horse extends Dog {
	@Override
	public void sound() {
		System.out.println("Neigh");
	}
	public void display() {
		sound();
		super.sound();
	}
}

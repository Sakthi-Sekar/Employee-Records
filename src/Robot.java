class App {
	public void speak(String text) {
		System.out.println(text);
		}
	public void jump(int height) {
		System.out.println("Jumping :" + " " + height);
	}
	public void move(String direction, double distance) {
		System.out.println("Moving" + " " + distance + " " + "meters in direction" + " " + direction);
	}
	public static void wish(String wishing) {
		System.out.println("Hi" + " " + wishing);
	}

}

public class Robot {
	public static void main(String[] args) {
		App santa = new App();
		santa.speak("Hi I'm Santa");
		santa.jump(3);
		santa.move("South",13.3);
		String wishing = "Hello ";
		santa.wish(wishing);
	}
}
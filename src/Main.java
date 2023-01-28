public class Main {
	public static void main(String[] args) {
		String string = "are you able to climb, are you able to swim or are you able to fly?";
		string = string.replaceAll("(?<=\\s)are*","_XYZ");
		System.out.println(string);
	}
}
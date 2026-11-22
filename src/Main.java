import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		boolean running = true;
		while(running){
			System.out.println("Press 1 to start a new game and press 2 to exit.");
			String action = sc.nextLine();
			if (action.equals("1")) {
				// game code
				System.out.println("The game is about to start...");
			}
			else if (action.equals("2")) {
				running = false;
			}
			else {
				System.out.println("Unknown action, please enter '1' or '2'.");
			}
		}
	}
}

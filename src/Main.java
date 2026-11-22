import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		boolean running = true;
		while(running){
			System.out.println(" Press 1 to start a new game and press 2 to exit.");
			int action = sc.nextInt();
			if (action==1) {
				// game code
			}
			else if (action == 2) {
				running = false;
			}
			else {
				System.out.println("Unknown action, please enter 1 or 2.");
			}
		}
	}
}

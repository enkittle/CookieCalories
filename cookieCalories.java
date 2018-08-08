import java.util.Scanner;

public class cookieCalories {

	public static void main(String[] args) {
		// 1 bag has 40 cookies, 10 servings in a bag, 1 serving = 300 calories
		// enter number of cookies get calorie amount
		
		Scanner keyboard = new Scanner(System.in);
		int toEat;
		int cTotal;
		
		System.out.print("How many cookies are you going to eat: ");
		toEat = Integer.parseInt(keyboard.next());
		
		// 40/10 = 4 cookies in a serving
		// 300/4 = 75 calories per cookie
		
		cTotal = toEat * 75;
		
		System.out.printf("You will consum %d calories", cTotal);

	}

}

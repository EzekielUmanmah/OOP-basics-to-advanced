import java.util.Scanner;
public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();

		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		String r = "*".repeat(width);
		String c = ("\n*" + " ".repeat(width - 2) + "*").repeat(height-2);
		String rect = r + c + "\n" + r;

		System.out.println(rect);

	}

}

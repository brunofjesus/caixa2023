package pt.brunojesus.caixa;

public class Main {

	public static void main(String[] args) {
		printBox(4,4);
		printBox(8,4);
		printBox(5,5);
	}
	
	public static void printBox(int width, int height) {
		if (width < 4) {
			width = 4;
		}
		if (height < 4) {
			height = 4;
		}
		printTopOrBottom(width);
		printLeftAndRight(width,height-2);
		printTopOrBottom(width);
	}
	
	public static void printTopOrBottom(int width) {
		for (int i = 0; i < width; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void printLeftAndRight(int width, int height) {
		for (int i = 0; i < height; i++) {
			System.out.print("*");
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");				
			}
			System.out.println("*");
		}
	}
}

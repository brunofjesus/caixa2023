package pt.brunojesus.caixa;

public class Main {

	public static void main(String[] args) {
		printTopOrBottom(6);
		printLeftAndRight(6,4);
		printTopOrBottom(6);
	}
	
	public static void printTopOrBottom(int size) {
		for (int i = 0; i < size; i++) {
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

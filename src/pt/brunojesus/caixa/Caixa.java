package pt.brunojesus.caixa;

public class Caixa {
	
	private int width;
	private int height;
	
	public Caixa(int widthParam, int heightParam) {
		width = widthParam;
		height = heightParam;
	}

	public void print() {
		if (width < 4) {
			width = 4;
		}
		if (height < 4) {
			height = 4;
		}
		printTopOrBottom();
		printLeftAndRight();
		printTopOrBottom();
	}
	
	private void printTopOrBottom() {
		for (int i = 0; i < width; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	private void printLeftAndRight() {
		for (int i = 0; i < height - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");				
			}
			System.out.println("*");
		}
	}
}

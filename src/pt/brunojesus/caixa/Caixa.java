package pt.brunojesus.caixa;

import pt.brunojesus.caixa.errors.NotEnoughHeightException;
import pt.brunojesus.caixa.errors.NotEnoughWidthException;

public class Caixa {
	
	private int width;
	private int height;
	private char character;
	
	public Caixa(int widthParam, int heightParam) {
		this(widthParam, heightParam, '*');
	}
	
	public Caixa(int widthParam, int heightParam, char characterParam) {
		width = widthParam;
		height = heightParam;
		character = characterParam;
	}

	public void print() throws NotEnoughWidthException {
		if (width < 4) {
			//width = 4;
			// Unchecked exception
			//throw new RuntimeException("Width cannot be less than 4");
			
			// Checked exception
			//throw new Exception("Width cannot be less than 4");
			throw new NotEnoughWidthException("Width cannot be less than 4");
		}
		if (height < 4) {
			//height = 4;
			// Unchecked exception
			//throw new RuntimeException("Height cannot be less than 4");
			
			throw new NotEnoughHeightException("Height cannot be less than 4");
			
			// Checked exception
			//throw new Exception("Height cannot be less than 4");

		}
		printTopOrBottom();
		printLeftAndRight();
		printTopOrBottom();
	}
	
	private void printTopOrBottom() {
		for (int i = 0; i < width; i++) {
			System.out.print(character);
		}
		System.out.println();
	}
	
	private void printLeftAndRight() {
		for (int i = 0; i < height - 2; i++) {
			System.out.print(character);
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");				
			}
			System.out.println(character);
		}
	}
}

package test;

public class SOS {

	public static void main(String[] args) {
		String[] arr = {"x","x","x",
				"_","x","o",
				"_","_","x"};
		
		
		Minimax b1 = new Minimax(arr);
		//System.out.print(b1.isXWin());
		b1.printBoard();
		
		
		//System.out.println(board.charAt(0));
	}

}

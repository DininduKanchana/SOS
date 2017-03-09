package test;

public class Minimax {
	public String[] board = new String[9];
	public String player;
	

	public Minimax(String[] board) {
		super();
		this.board = board;
		
	}
	
	public String[] getBoard() {
		return board;
	}

	public void setBoard(String[] board) {
		this.board = board;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public boolean isXWin(){
		//row matching
		for (int i = 0; i <= 8 ; i = i+3){
			if (board[i] == "x" && board[i+1] == "x" && board[i+2] == "x") {
				return true;
			}
				
		}
		//column matching
		for (int i = 0; i <= 2; i++){
			if (board[i] == "x" && board[i+3] == "x" && board[i+6] == "x") {
				return true;
			}
		}
		//diagonal matching
		if ((board[0] == "x" && board[4] == "x" && board[8] == "x") ||
				(board[2] == "x" && board[4] == "x" && board[6] == "x")){
			return true;
		}
		
		return false;
		
	}
	
	public void printBoard () {
		for (int i=0;i<9;i++){
			if (i == 3 || i== 6 ){
				System.out.print("\n");
			}
			System.out.print(" " + board[i] + " ");
		}
	}
	
	public boolean move(int index){
		
		return false;
		
	}
	
	
	

}

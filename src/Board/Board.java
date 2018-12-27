package Board;

import Rooms.Room;

public class Board {
    private Room[][] board;

    //Creates the board with random x and y
    public Board(Room[][] board) {
        this.board = board;
    }
    //Creates the board with input x and y
    public Board(int x,int y){
        this.board=new Room[x][y];
    }

    //Prints out board
    public void print() {
        String row ="";
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[i].length; j++) {
                row += board[i][j].toString();
            }
            System.out.println(row);
        }
    }

}
package Board;

import Rooms.Room;

public class Board {
    private Room[][] board;

    public Board(Room[][] board) {
        this.board = board;
    }

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

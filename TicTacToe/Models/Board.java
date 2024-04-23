package Models;

public class Board {
    int size;
    Cell[][] board = new Cell[size][size];

    Board(int size) {
        this.size = size;
    }
}

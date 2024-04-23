package Models;

import Models.Enums.CellState;

public class Cell {
    int row;
    int col;
    Player player;
    CellState cellState;

    Cell(int row, int col, Player player, CellState cellState) {
        this.row = row;
        this.col = col;
        this.player = player;
        this.cellState = cellState;
    }
}

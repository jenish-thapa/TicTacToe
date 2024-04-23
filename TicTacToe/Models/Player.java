package Models;

import Models.Enums.PlayerType;

public class Player {
    String name;
    Symbol symbol;
    PlayerType type;

    Player(String name, Symbol symbol, PlayerType type) {
        this.name = name;
        this.symbol = symbol;
        this.type = type;
    }
}
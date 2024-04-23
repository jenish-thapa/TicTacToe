package Models;

import Models.Enums.BotDifficultyLevel;
import Models.Enums.PlayerType;

public class Bot extends Player{
    BotDifficultyLevel level;

    Bot(String name, Symbol symbol, PlayerType type, BotDifficultyLevel level) {
        super(name, symbol, type);
        this.level = level;
    }
}

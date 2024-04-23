import java.util.List;

import Models.Board;
import Models.Move;
import Models.Player;

public class Game {
    Board board;
    List<Player> playerList;
    int nextPlayerMoveIndex;
    Player winner;
    List<Move> moveList;
    GameState gameState;
}

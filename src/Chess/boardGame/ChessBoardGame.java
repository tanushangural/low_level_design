package Chess.boardGame;

import Chess.board.Board;
import Chess.board.ChessBoard;
import Chess.enums.PieceName;
import Chess.player.ChessPlayer;
import Chess.player.Player;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// Incomplete
public class ChessBoardGame extends BoardGame {
    private final ChessPlayer player1, player2;
    public ChessBoardGame(ChessPlayer player1, ChessPlayer player2, ChessBoard chessBoard) {
        super(chessBoard, new LinkedList<>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public boolean isOver() {

        return player1.getPiece(PieceName.KING).isDead() ||
                player2.getPiece(PieceName.KING).isDead();
    }
    private void prepareBoard(ChessPlayer firstPlayer, ChessPlayer secondPlayer) {

    }
}

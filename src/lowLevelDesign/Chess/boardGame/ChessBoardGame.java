package lowLevelDesign.Chess.boardGame;

import lowLevelDesign.Chess.board.ChessBoard;
import lowLevelDesign.Chess.enums.PieceName;
import lowLevelDesign.Chess.player.ChessPlayer;

import java.util.Arrays;
import java.util.LinkedList;

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

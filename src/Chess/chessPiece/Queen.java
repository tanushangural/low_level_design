package Chess.chessPiece;

import Chess.board.ChessBoard;
import Chess.ChessCell;
import Chess.enums.PieceName;

public class Queen implements ChessPiece{
    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public Boolean isDead() {
        return null;
    }

    @Override
    public void setDead(Boolean isDead) {

    }

    @Override
    public PieceName getName() {
        return null;
    }
}

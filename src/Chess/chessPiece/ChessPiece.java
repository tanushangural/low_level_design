package Chess.chessPiece;

import Chess.board.ChessBoard;
import Chess.ChessCell;
import Chess.enums.PieceName;

public interface ChessPiece {
    void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);

    Boolean isDead();

    void setDead(Boolean isDead);

    PieceName getName();

}

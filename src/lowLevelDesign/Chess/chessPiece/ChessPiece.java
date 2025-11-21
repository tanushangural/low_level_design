package lowLevelDesign.Chess.chessPiece;

import lowLevelDesign.Chess.enums.PieceName;
import lowLevelDesign.Chess.board.ChessBoard;
import lowLevelDesign.Chess.ChessCell;

public interface ChessPiece {
    void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);

    Boolean isDead();

    void setDead(Boolean isDead);

    PieceName getName();

}

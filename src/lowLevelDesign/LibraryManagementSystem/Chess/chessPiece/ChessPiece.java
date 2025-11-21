package lowLevelDesign.LibraryManagementSystem.Chess.chessPiece;

import lowLevelDesign.LibraryManagementSystem.Chess.board.ChessBoard;
import lowLevelDesign.LibraryManagementSystem.Chess.ChessCell;
import lowLevelDesign.LibraryManagementSystem.Chess.enums.PieceName;

public interface ChessPiece {
    void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);

    Boolean isDead();

    void setDead(Boolean isDead);

    PieceName getName();

}

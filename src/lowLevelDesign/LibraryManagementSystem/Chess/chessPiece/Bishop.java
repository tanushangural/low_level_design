package lowLevelDesign.LibraryManagementSystem.Chess.chessPiece;

import lowLevelDesign.LibraryManagementSystem.Chess.board.ChessBoard;
import lowLevelDesign.LibraryManagementSystem.Chess.ChessCell;
import lowLevelDesign.LibraryManagementSystem.Chess.enums.Color;
import lowLevelDesign.LibraryManagementSystem.Chess.enums.PieceName;

public class Bishop implements ChessPiece{

    private final Color color;
    private final PieceName pieceName;
    private boolean isDead;

    public Bishop(Color color, PieceName pieceName, boolean isDead) {
        this.color = color;
        this.pieceName = pieceName;
        this.isDead = isDead;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public Boolean isDead() {
        return isDead;
    }

    @Override
    public void setDead(Boolean isDead) {
        this.isDead = isDead;
    }

    @Override
    public PieceName getName() {
        return this.pieceName;
    }
}

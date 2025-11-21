package lowLevelDesign.Chess.chessPiece;

import lowLevelDesign.Chess.enums.Color;
import lowLevelDesign.Chess.board.ChessBoard;
import lowLevelDesign.Chess.ChessCell;
import lowLevelDesign.Chess.enums.PieceName;

public class Pawn implements ChessPiece{
    private final Color color;
    private final PieceName pieceName;
    private boolean isDead;

    public Pawn(Color color, PieceName pieceName, boolean isDead) {
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

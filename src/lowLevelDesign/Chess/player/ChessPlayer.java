package lowLevelDesign.Chess.player;

import lowLevelDesign.Chess.Move;
import lowLevelDesign.Chess.board.ChessBoard;
import lowLevelDesign.Chess.chessPiece.ChessPiece;
import lowLevelDesign.Chess.enums.PieceName;

import java.util.Map;

public abstract class ChessPlayer extends Player{

    private final Map<PieceName, ChessPiece> chessPieces;
    private final ChessBoard chessBoard;

    protected ChessPlayer(String name, Map<PieceName, ChessPiece> chessPieces, ChessBoard chessBoard) {
        super(name);
        this.chessPieces = chessPieces;
        this.chessBoard = chessBoard;
    }

    @Override
    public Move makeMove() {
        return null;
    }

    public ChessPiece getPiece(PieceName pieceName) {
        if(chessPieces.containsKey(pieceName)) {
            throw new IllegalArgumentException("invalid arg");
        }
        return this.chessPieces.get(pieceName);
    }

    public Map<PieceName, ChessPiece> getChessPieces() {
        return chessPieces;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }
}

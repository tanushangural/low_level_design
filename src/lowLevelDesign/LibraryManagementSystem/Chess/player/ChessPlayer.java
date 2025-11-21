package lowLevelDesign.LibraryManagementSystem.Chess.player;

import lowLevelDesign.LibraryManagementSystem.Chess.Move;
import lowLevelDesign.LibraryManagementSystem.Chess.board.ChessBoard;
import lowLevelDesign.LibraryManagementSystem.Chess.chessPiece.ChessPiece;
import lowLevelDesign.LibraryManagementSystem.Chess.enums.PieceName;

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

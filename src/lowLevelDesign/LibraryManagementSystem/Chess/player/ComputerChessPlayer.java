package lowLevelDesign.LibraryManagementSystem.Chess.player;

import lowLevelDesign.LibraryManagementSystem.Chess.board.ChessBoard;
import lowLevelDesign.LibraryManagementSystem.Chess.chessPiece.ChessPiece;
import lowLevelDesign.LibraryManagementSystem.Chess.enums.PieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{
    protected ComputerChessPlayer(String name, Map<PieceName, ChessPiece> chessPieces, ChessBoard chessBoard) {
        super(name, chessPieces, chessBoard);
    }
}

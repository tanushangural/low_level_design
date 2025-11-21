package lowLevelDesign.Chess.player;

import lowLevelDesign.Chess.board.ChessBoard;
import lowLevelDesign.Chess.chessPiece.ChessPiece;
import lowLevelDesign.Chess.enums.PieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{
    protected ComputerChessPlayer(String name, Map<PieceName, ChessPiece> chessPieces, ChessBoard chessBoard) {
        super(name, chessPieces, chessBoard);
    }
}

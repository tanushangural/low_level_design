package Chess.player;

import Chess.board.ChessBoard;
import Chess.chessPiece.ChessPiece;
import Chess.enums.PieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{
    protected ComputerChessPlayer(String name, Map<PieceName, ChessPiece> chessPieces, ChessBoard chessBoard) {
        super(name, chessPieces, chessBoard);
    }
}

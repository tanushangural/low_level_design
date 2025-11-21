package Chess.player;

import Chess.Move;
import Chess.Pair;
import Chess.board.ChessBoard;
import Chess.chessPiece.ChessPiece;
import Chess.enums.PieceName;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{
    protected HumanChessPlayer(String name, Map<PieceName, ChessPiece> chessPieces, ChessBoard chessBoard) {
        super(name, chessPieces, chessBoard);
    }

    @Override
    public Move makeMove() {
        getChessBoard().display();
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Optional<ChessPiece> chessPiece = getChessBoard().getChell(new Pair(x,y)).getChessPiece();
        if(!chessPiece.isPresent()) {
            throw new RuntimeException("invalid spot");
        }
        if(!chessPiece.get().equals(getPiece(chessPiece.get().getName()))) {
            throw new RuntimeException("invalid piece");
        }
        Pair source = new Pair(x,y);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Pair destination = new Pair(x,y);
        // validations of destinations
        return new Move(source, destination);
    }
}

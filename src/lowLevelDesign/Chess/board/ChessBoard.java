package lowLevelDesign.Chess.board;

import lowLevelDesign.Chess.ChessCell;
import lowLevelDesign.Chess.chessPiece.ChessPiece;
import lowLevelDesign.Chess.Move;
import lowLevelDesign.Chess.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board {

    private final List<List<ChessCell>> cells;
    private static final int rowCount = 8;
    private static final int colCount = 8;

    public ChessBoard() {
        this.cells = new ArrayList<>();
        for(int i=0; i<rowCount; i++) {
            List<ChessCell> chessCells = new ArrayList<>();
            for(int j=0; j<colCount; j++) {
                chessCells.set(j, new ChessCell(i,j));
            }
            this.cells.add(chessCells);
        }
    }

    @Override
    public void display() {
        for(int row=0; row < rowCount; row++) {
            for(int col=0; col < colCount; col++) {
                Pair pair = new Pair(row, col);
                Optional<ChessPiece> chessPiece = getChell(pair).getChessPiece();
                if(chessPiece.isEmpty()) {
                    System.out.print("0 | ");
                }
                else {
                    System.out.print(chessPiece.get().getName() + " | ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void applyMove(Move move) {
        ChessCell source = getChell(move.getSource());
        ChessCell destination = getChell(move.getDestination());
        Optional<ChessPiece> chessPiece = source.getChessPiece();
        if(chessPiece.isEmpty()) {
            new RuntimeException("invalid chess piece");
        }
        chessPiece.get().move(source, destination, this);
    }

    public ChessCell getChell(Pair pair) {
        return this.cells.get(pair.getX()).get(pair.getY());
    }
}

package lowLevelDesign.Chess.board;

import lowLevelDesign.Chess.Move;

public interface Board {
    void display();
    void applyMove(Move move);
}

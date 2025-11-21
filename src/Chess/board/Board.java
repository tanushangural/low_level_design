package Chess.board;

import Chess.Move;

public interface Board {
    void display();
    void applyMove(Move move);
}

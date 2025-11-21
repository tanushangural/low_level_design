package lowLevelDesign.LibraryManagementSystem.Chess.board;

import lowLevelDesign.LibraryManagementSystem.Chess.Move;

public interface Board {
    void display();
    void applyMove(Move move);
}

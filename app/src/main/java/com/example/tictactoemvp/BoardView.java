package com.example.tictactoemvp;

public interface BoardView {

    static char PLAYER_1_SYMBOL = 'X';
    static char PLAYER_2_SYMBOL = 'O';

    byte DRAW = 0;
    byte PLAYER_1_WINNER = 1;
    byte PLAYER_2_WINNER = 2;

    void newGame();
    void putSymbol(char symbol, byte row, byte col);
    void gameEnded(byte winner);
    void invalidPlayer(byte row, byte col);
}

package com.example.Sudoku.dao;

import com.example.Sudoku.model.SudokuBoard;

public interface SudokuDao {
    /*
    ONLY AVAILABLE TO ADMIN

    1. Get a new sudoku board from external API by passing in desired difficulty
    easy: 34-46 given numbers
    medium: 32-35 given numbers
    hard: 28-31 given numbers
    evil: 17-27 given numbers

    2. Get Solution to board from external API call by using received board

    3. Upload puzzle, solution to DB

    return starting board to call
     */
    SudokuBoard newBoard(String difficulty);

    /*
    AVAILABLE TO ALL USERS
    Get board of desired difficulty from DB and return to user
     */
    SudokuBoard getBoard(String difficulty);
}

package com.example.Sudoku.controller;

import com.example.Sudoku.dao.SudokuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class AppController {

    @Autowired
    SudokuDao sudokuDao;

    @RequestMapping(path = "/createExtBoard", method = RequestMethod.GET)
    public void createExtBoard(@RequestParam String difficulty){
        sudokuDao.newBoard(difficulty);
    }
}

package com.example.Sudoku.dao;

import com.example.Sudoku.model.SudokuBoard;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class JdbcSudokuDao implements SudokuDao {
    private JdbcTemplate jdbcTemplate;
    private RestTemplate restTemplate = new RestTemplate();
    private String API_BASE_URL = "https://sudoku-all-purpose-pro.p.rapidapi.com/sudoku?";

    //TODO: constructor to set jdbctemplate with datasource

    @Override
    public SudokuBoard newBoard(String difficulty) {
        SudokuBoard createdBoard = new SudokuBoard();

        //get string of new board with requested difficulty from External API
        HttpEntity<Object> entity = setEntity();
        String starterBoard = restTemplate.exchange(API_BASE_URL + "create=" + difficulty, HttpMethod.GET, entity, String.class).getBody();
        System.out.println(starterBoard);
        return null;
    }

    @Override
    public SudokuBoard getBoard(String difficulty) {
        return null;
    }

    private HttpEntity<Object> setEntity(){
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-rapidapi-host", "sudoku-all-purpose-pro.p.rapidapi.com");
        headers.set("x-rapidapi-key", "c58cca1d8bmsh15f27e9c5a33612p1aa0bdjsn8d4f8ebd9ab0");
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        return entity;
    }
}

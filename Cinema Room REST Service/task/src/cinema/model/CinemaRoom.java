package cinema.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class CinemaRoom {
    private int total_rows;
    private int total_columns;
    private List<Seat> available_seats;

    public CinemaRoom(int total_columns, int total_rows){
        this.total_rows = total_rows;
        this.total_columns = total_columns;
        available_seats = new ArrayList<>();
        for (int row = 0; row <= total_rows; row++){
            for (int col = 0; col <= total_columns; col++){
                available_seats.add(new Seat(row, col));
            }
        }
    }

    public int getTotal_rows() {

        return total_rows;
    }

    public void setTotal_rows(int total_rows) {

        this.total_rows = total_rows;
    }

    public int getTotal_columns() {

        return total_columns;
    }

    public void setTotal_columns(int total_columns) {

        this.total_columns = total_columns;
    }

    public List<Seat> getAvailable_seats() {

        return available_seats;
    }

    public void setAvailable_seats(List<Seat> available_seats) {

        this.available_seats = available_seats;
    }


}

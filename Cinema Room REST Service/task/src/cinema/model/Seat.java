package cinema.model;

public class Seat {
    private int row;
    private int column;

    public Seat() {
    }

    public Seat( int row, int column) {
        this.row = row;
        this.column = column;
    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}

package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;
    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] col = new String[3];
        for(int i = 0;i<3;i++) col[i]=this.board[i][value];
        return col;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0]==row[1]&&row[0]==row[2];
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        return column[0]==column[1]&&column[0]==column[2];
    }

    public String getWinner() {
        String prospWinner = checkBoard();
        if (prospWinner!="")return prospWinner;
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
    
    public String checkBoard() {
        for (int i = 0; i < 3; i++) {
            if (isRowHomogenous(i)&&this.board[i][0]!="")return this.board[i][0];
            if (isColumnHomogeneous(i)&&this.board[0][i]!="") return this.board[0][i];
        }
        if(this.board[0][0]==this.board[1][1]&&this.board[1][1]==this.board[2][2]||
           this.board[0][2]==this.board[1][1]&&this.board[1][1]==this.board[2][0]
        ) return this.board[1][1];
        return "";
    }
    
}

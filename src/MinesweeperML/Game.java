package MinesweeperML;

public class Game {

    int[] grid;
    int numMines;
    int width, height;
    boolean firstMove;

    public Game(int w, int h, int mines) {
        grid = new int[h*h];
        for(int j = 0; j < height; j ++) {
            for(int i = 0; i < width; i ++) {
                grid[j*width+i] = 0;
            }
        }
        numMines = mines;
        width = w;
        height = h;
        firstMove = true;
    }

    public int[] update(int input) {
        if(input != -1) {

        }
        return grid.clone();
    }
}

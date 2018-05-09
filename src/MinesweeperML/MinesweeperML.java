package MinesweeperML;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinesweeperML {

    private Game game;
    int[] grid;
    boolean humanPlayer = true;

    private int width, height, numMines;

    public static void main(String[] args) {
        new MinesweeperML(8,8,10);
    }
    public MinesweeperML(int w, int h, int mines) {
        numMines = mines;
        width = w;
        height = h;
        game = new Game(width, height, numMines);
        grid = game.update(-1);

        if(humanPlayer) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int input = 0;
            try {
                while (input != -1) {
                    try {



                        System.out.print("Move~> ");
                        String inputString = reader.readLine().trim();
                        if(inputString.length() == 0) {
                            throw new NumberFormatException();
                        } else {
                            inputString = inputString.substring(0, 1);
                        }
                        input = Integer.parseInt(inputString);
                        game.update(input);
                        printBoard();



                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: Please enter a number...");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Quitting...");
        } else {

        }


    }


    public void printBoard() {
        for(int j = 0; j < height; j ++) {
            for(int i = 0; i < width; i ++) {
                System.out.print(grid[j*width+i] + " ");
            }
            System.out.println();
        }
    }
}

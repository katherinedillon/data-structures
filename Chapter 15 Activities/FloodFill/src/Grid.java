import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];


    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        Stack<Pair> theGrid = new Stack<Pair>();
        Pair thePair = new Pair(row,column);
        theGrid.push(thePair);

        int count=1;
        while (!theGrid.isEmpty()){
            Pair currentPair = theGrid.pop();
            int pixel = pixels[currentPair.getRow()][currentPair.getCol()];
            if (pixel == 0) {
                pixels[currentPair.getRow()][currentPair.getCol()] = count;
                count++;

                if (currentPair.getRow() -1 >= 0) {
                    Pair north = new Pair(currentPair.getRow() - 1, currentPair.getCol());
                    theGrid.push(north);
                }
                if (currentPair.getRow() +1 < SIZE) {
                    Pair south = new Pair(currentPair.getRow() + 1, currentPair.getCol());
                    theGrid.push(south);
                }
                if (currentPair.getCol() + 1  < SIZE) {
                    Pair east = new Pair(currentPair.getRow(), currentPair.getCol() + 1);
                    theGrid.push(east);
                }

                if (currentPair.getCol() -1 >= 0) {
                    Pair west = new Pair(currentPair.getRow(), currentPair.getCol() - 1);
                    theGrid.push(west);
                }
            }
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}

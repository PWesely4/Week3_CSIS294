import java.security.SecureRandom;

public class Week3 {

    public static void main(String[] args) {

        Week3 Week3 = new Week3();
        //Week3.testRandomNums();
        Week3.createGameGrid();
    }

    public void testRandomNums(){
        SecureRandom Rand = new SecureRandom();
        int num = Rand.nextInt();
        System.out.println(num);
        num = Rand.nextInt();
        System.out.println(num);
    }

    public void createGameGrid () {

        int[][] grid = new int[10][8];
        SecureRandom Rand = new SecureRandom();
         int wallChance = 10;

        for(int y = 0; y < grid.length; y++ ) {
            for(int x = 0; x < grid[y].length; x++) {
                int temp = Rand.nextInt(100);
                if (temp < wallChance) {
                    grid[y][x] = 1;
                }
                else {
                    grid[y][x] = 0;
                }
                System.out.print(grid[y][x] + "  ");
            }
            System.out.println();
        }

    }
}

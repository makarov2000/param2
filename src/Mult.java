
public class Mult {
    public static void main(String[] args) {
        int[][] multiplyTab = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplyTab[i][j] = (i + 1) * (j + 1);
                System.out.print(multiplyTab[i][j]);
            }
            System.out.println();
        }
    }
}

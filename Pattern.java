public class Pattern {
    public static void main(String[] args) {
        for (int row = 1; row<=5; row++) {
            for (int pattern = 1; pattern <= row; pattern++) {
                System.out.print(pattern);
            }
            System.out.println();
        }
        for (int row = 1; row<=5; row++) {
            for (int pattern = 1; pattern <= row; pattern++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        R1:SSSSN
        R2:SSSNN
        R3:SSNNN
        R4:SNNNN
        R5:NNNNN

         */
        char sp = ' ' ;
        for (int row = 1; row <= 5; row++) {
            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(sp);
            }
            for (int coulumn = 1; coulumn <= row; coulumn++) {
                System.out.print(coulumn);
            }
            System.out.println();
        }
    }
}

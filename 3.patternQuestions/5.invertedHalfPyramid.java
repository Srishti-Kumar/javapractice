
public class invertedHalfPyramid {
    public static void main(String[] args) {
        int row = 5;
        int column = 9;

        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= column; j++) {
                if(j<=i)
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

//    * * * * *
//    * * * *
//    * * *
//    * *
//    *

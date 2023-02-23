package Lab1;
public class Exercice2 {
    static char [][] wordSquare = {
            {'L','I','M','B'},
            {'A','R','R','A'},
            {'C','O','R','k'},
            {'K','N','E','E'}
    };
    /**
     * make a 2d array with words
     */
    public static void main(String[] args) {
        printRow(wordSquare,2);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        printColumn(wordSquare,2);

    }
    //    public static void printRow(char[][]wordSquare, int ind){
//            for(int j = 0; j < wordSquare.length; j++){
//                System.out.println(wordSquare[ind-1][j]);
//            }
//    }
    public static void printRow(char[][] wordSquare, int rowIndex) {
        System.out.println(wordSquare[rowIndex-1]);
    }
    public static void printColumn(char[][]wordSquare, int ind){
        for (char[] chars : wordSquare) {
            System.out.print(chars[ind - 1]);

        }
        /***
         * for-each iterator
         *the input is the number of column of index, we iterate each row
         * to find the right index of column and print them
         */
    }


}

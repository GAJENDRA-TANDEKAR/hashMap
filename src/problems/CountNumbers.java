package problems;

public class CountNumbers {

    public static void main(String[] args) {

        String str = " hi my name is gajendra ";
        char ch = ' ';
        int count = 0 ;
        int countSpace = 0 ;
        System.out.println("original str ->  "+str);

        char[] strchar = str.toCharArray();
        int length = strchar.length;
        System.out.println(" str char length with space -> . " + length);


        for ( int i = 0 ; i <length ; i++){
            if (str.charAt(i) != ch){
                count++;
            }
        }
        System.out.println( " without space "+count);

        for ( int i = 0 ; i <length ; i++){
            if (str.charAt(i) == ch){
                countSpace++;
            }
        }
        System.out.println(" space count - > " +countSpace);


    }
}

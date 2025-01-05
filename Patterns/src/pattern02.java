public class pattern02 {
    public static void main(String[] args) {
        pattern_02(5);
    }
    static void pattern_02(int n){
        for (int row = 1;row<=n;row++){
            for (int col = n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

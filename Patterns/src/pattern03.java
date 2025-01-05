public class pattern03 {
    public static void main(String[] args) {
        pattern_03(5);
    }
    static void pattern_03(int n){
        for (int row =1;row<=n;row++){
            for (int col = 1;col<= row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

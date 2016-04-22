public class fallProblem {
    public static void main(String[] args) {
        int total = 1;
        for(int i = 0; i<4; i++){
            for(int z = 0; z<=i; z++){
                for(int k = i-z; k<=i; k++){

                System.out.print(total);
                }
            System.out.println();
            }
            total = total * 2;
        }
    }
}

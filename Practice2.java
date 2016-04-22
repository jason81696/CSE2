public class Practice2 {
    public static void main(String[] args) {
        for(int i = 6; i>0; i--) {
            int j = 0;
            int z = i;
            do{
                int k = 0;
                do{
                    System.out.print(i);
                    k++;
                }while(k<z-2);
                j++;
                z--;
                System.out.println();
            }while(j<i-2);
            }
        }
    }

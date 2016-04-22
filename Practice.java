


public class Practice {
    public static void main (String[] args) {
        
        for(int i = 6; i>0; i--){
            int j = 0;
            int z = i;
            do{
                int k = 0;
                do{
                    System.out.print(i);
                k++;
            }while(k<z-2);
            System.out.println();
            j++;
            z--;
        }while(j<i-2);
    }
}
}
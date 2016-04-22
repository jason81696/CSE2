import java.util.Scanner;

public class Spring2 {
    public static void main( String args[] ){
	Scanner myScanner = new Scanner(System.in);
	do{
		System.out.print("Enter an int- ");
		int nextValue = myScanner.nextInt();
		if( nextValue <= 0){
			return ;
		}
		else{
		    System.out.print(sumseq(nextValue));
		}
	}
	while( true );
     
}

public static int sumseq(int nextValue) {
    int total = 0;
    int i = 0;
    int j = 0;
    for(i = 0; i<=nextValue; i++){
        int current = i;

        for(j= 0; j<=i; j++){
            current *= i;
            
        }
        total += current;
        
        
    }
    return(total);
    }
}

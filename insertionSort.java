package insertionsort;
import java.util.*;
public class InsertionSort{
    public static int[] array;
    public static int l, n, max;
    public static void fillArray(){
	for(int i=0; i<l; i++){
            n = casualInt();
            order(i);
            print(i);
	}
    }
    public static int casualInt(){
    	n=(int)(Math.random()*(max+1));
        return n;
    }
    public static void print(int i){
        System.out.println("number: "+n);
	for(int s=0; s<i+1; s++)
            System.out.print(array[s]+" ");
        System.out.println("");
    }

    public static void order(int i){
        if(i==0)
            array[0]=n;
		else{
            for(int j=0; j<i+1; j++){
				if(n<array[j]){
                    shift(i, j);
                    break;
                }else if(j==i)
                    array[i]=n;
            }
        }
    }
    public static void shift(int i, int j){
        for(int k=i-1; k>j-1; k--)
            array[k+1]=array[k];
        array[j]=n;
    }
    public static int research(int search){
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]==search)
                count++;
        }
        return count;
    }
    public static void countNumbers(){
        int count;
        for(int i=0; i<max+1; i++){
            count=research(i);
            System.out.println(i+" is present "+count+" times");
        }
    }
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("how long should the array be? ");
		l = sc.nextInt();
        System.out.print("what should be the maximum value of the numbers that make up the array? ");
        max = sc.nextInt();
		array = new int[l];
		fillArray();
        countNumbers();
    }
}

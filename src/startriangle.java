import java.util.Scanner;

public class startriangle {
    public static void main(String args[]){
        int j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        int limit=sc.nextInt();
        char array[]=new char[limit];
        for(int i=0;i<=limit-1;i++){
            array[i]='*';
        }
        for(j=0;j<limit;j++){
            for(k=0;k<=j;k++){
                System.out.print(array[k]+" ");
            }
            System.out.println("");
        }
        for(j=limit-2;j>=0;j--){
            for(k=0;k<=j;k++){
                System.out.print(array[k]+" ");
            }
            System.out.println("");
        }
    }
}

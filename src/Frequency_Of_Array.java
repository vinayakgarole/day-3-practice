import java.util.Scanner;

public class Frequency_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[]=new int [n];
        int b[]=new int [n];
        int c=0;
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            c=1;
            if(a[i]!=-1) {
                for(int j=0;j<n;j++) {
                    if(a[i]==a[j]) {
                        c=c+1;
                        a[j]=-1;
                    }
                }
                b[i]=c;
            }
        }
        for(int i=0;i<n;i++) {
            if(a[i]!=-1) {
                System.out.println(a[i] + ":"+ b[i]);
            }
        }
    }
}
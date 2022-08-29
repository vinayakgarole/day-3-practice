import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int a[]=new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Element ");
        for(int i=0;i<5;i++) {
            a[i]=sc.nextInt();
        }
        int largest = a[0];
        for(int i=1;i<5;i++) {
            if(a[i]>largest) {
                largest = a[i];
            }
        }
        System.out.println("Largest Element "+largest);
    }
}

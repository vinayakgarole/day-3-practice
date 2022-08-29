public class SmallestElement {
    public static void main(String[] args) {
        int[] arr={20,30,50,10,40};
        int smallest=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);
    }
}

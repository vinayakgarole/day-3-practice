public class FrequencyArray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,8,4,1,2,1,3};
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            if (x == -1) continue;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;
                    arr[j] = -1;
                }
            }
            System.out.println("frequency of "+x+" is " +count);
        }
    }
}

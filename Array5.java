//Sum of Array
public class Array5 {
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,5,6,7,8,9};
        int sum =0;

        System.out.println();
        for(int i=0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of arr: "+ sum);
    }
}

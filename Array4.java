public class Array4 {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3},{2,3,4},{3,4,4}};

        for(int i=0; i<3; i++){
            for(int j=0;j<3; j++){
                System.out.print(arr[i][j] + " "); //Space between
            }
            System.out.println();
        }
    }
}

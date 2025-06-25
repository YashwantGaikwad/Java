class Array1 {
    public static void main(String[] args) {

        int [] arr; // declare an array

        arr = new int[10];  //allocating 10 numbers

        //initialize the elements of the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        arr[7] = 80;
        arr[8] = 90;
        arr[9] = 100;

        for(int i = 0; i<arr.length;i++){
            System.out.println("Elements at index "+ i + " : " + arr[i]);
        }
    }
}

class Student{          // Array Object
    public int roll_no;
    public String std_name;

    Student(int roll_no, String std_name){
        this.roll_no = roll_no;
        this.std_name = std_name;
    }
    
}
class Array2 {
    public static void main(String[] args) {
    
        Student[] arr = new Student[5];

        arr[0] = new Student(1 , "Sk");
        arr[1] = new Student(2 , "Anna");
        arr[2] = new Student(3 , "Pratik");
        arr[3] = new Student(4 , "Panya");
        arr[4] = new Student(5 , "Yash");

        for(int i = 0; i<arr.length; i++){
            System.out.println("Elements at " + i + " : " + arr[i].roll_no+ "  "+ arr[i].std_name);
        }
    }
}

// OVER RIDING 
// class Student{          // Array Object
//     public String std_name;
    
//     Student(String std_name){   // This is a constructor of student
//         this.std_name = std_name;
//     }

//     @Override
//     public String toString(){
//         return std_name;
//     }    
    
// }
// class Array2 {
//     public static void main(String[] args) {
    
//         Student[] arr = new Student[]{
//             new Student("Sk"),
//             new Student("Panya"),
//             new Student("Pratik")
//         };

//         for(int i = 0; i<arr.length; i++){
//             System.out.println("Elements at " + i + " : " + "  "+ arr[i].std_name);
//         }
//     }
// }
/*we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects */
public class ClassMethod {

    static void myStaticMethod(){ //creating static method
        System.out.println("Static methods are called without creating objects");
    }

    public void myPublicMethod(){ //creating public method
        System.out.println("Public method are called by creating objects");
    }
    
    public static void main(String[] args) {
        myStaticMethod();

        ClassMethod obj = new ClassMethod(); // create object of main class
        obj.myPublicMethod(); //calling public method
    }
}

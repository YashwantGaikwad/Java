class Test <T>{
    T obj;
    // constructor
    public Test(T obj) { 
        this.obj = obj;
    }
    // getters and setters
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

}
public class Generices {
    public static void main(String[] args) {
        //instance of integer type
        Test<Integer> iobj = new Test<Integer>(10);
        System.out.println(iobj.getObj());

        //instance of string type
        Test<String> sobj = new Test<String>("Yash");
        System.out.println(sobj.getObj());
    }
}

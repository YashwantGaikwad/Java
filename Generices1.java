class Test<T, U>{
    T obj1;
    U obj2;

    public Test(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    } 
}
public class Generices1 {
    public static void main(String[] args) {
        Test <String, Integer> obj = new Test<String, Integer>("Yashwant", 9);
        obj.print();
    }
}

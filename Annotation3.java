
public class Annotation3 {

    public void display(){
        System.out.println("Base Display");
    }
    public static void main(String[] args) {
        Annotation3 at = new B();
        at.display();
    }
}

class B extends Annotation3{
    @Override          // @override annotation
    public void display(){
        System.out.println("Extended class B");
    }
}
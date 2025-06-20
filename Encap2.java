// Area Of Rectangle
public class Encap2 {
    private int l;
    private int b;
    // Constructor
    Encap2(int l, int b){
        this.l = l;
        this.b = b;
    }

    public void getArea(){
        int area = l * b;
        System.out.println("Area os rectangle:"+ area);
    }

    public static void main(String[] args) {
        Encap2 myobj = new Encap2(10, 15);
        myobj.getArea();
    }
}

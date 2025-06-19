// Use of Object and Classes in Java
class OOps {
    // prpoerties
    private int a;
    private int b;
    //Setters
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    //Methods
    public void sum(){
        System.out.println("Summation is :"+ (a+b));
    }

    public static void main(String[] args) {
        OOps myobj = new OOps();

        // Using setters instead of direct access
        myobj.setA(5);
        myobj.setB(10);
        myobj.sum();
    }
}

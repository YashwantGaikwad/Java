class Encap1{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        Encap1 myobj = new Encap1();
        myobj.name = "john";
        System.out.println(myobj.name);
    }
}
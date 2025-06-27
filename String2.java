public class String2 {
    public static void main(String[] args) {
        String s = "Yashwant";
    
        // concat() method appends
        // the string at the end
        s.concat(" Gaikwad");
    
        // This will print Sachin
        // because strings are
        // immutable objects


        // Now it will print Full Name
        s = s.concat(" Gaikwad");
        System.out.println(s);
    }
}

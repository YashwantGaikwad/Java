
public class StringHandlingDemo {
    public static void main(String[] args) {
        String str1 = "Hello All, Welcome To string handling";
        String str2 = "Thank You..";

        // System.out.println(str1.length());
        // System.out.println(str2.length());
        // System.out.println(str1.charAt(6));
        // System.out.println(str1.indexOf("A"));
        // System.out.println(str2.replace(".","!"));

        // String result = str1.concat("\n"+str2);
        // System.out.println(result);

        // String r = String.format("My name is: " + "%s, and my age is: %d","Yash", 25 );
        // System.out.println(r);

        // if(str1.equals(str2)){
        //     System.out.println("Both are same");
        // }else{
        //     System.out.println("Both are differents");
        // }

        // String[] arr =str1.split(" ");
        // Arrays.asList(arr).forEach(s -> System.err.println(s));

        String newstr1 = str1.substring(0,5);
        System.out.println(newstr1);
    }
}

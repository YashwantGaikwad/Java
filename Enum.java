// Enumeration in java

public class Enum {
    enum Color{
        RED("red"), GREEN("green"), BLUE("blue");

        private String value;

        private Color(String value) {
            this.value = value;
        }

        public String getValue(){
            return value;
        }
    }

    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println("Red enum name:" + c1.name());
        System.out.println("Red Enum value:" + c1.getValue());

        for(Color color : Color.values()){
            System.out.println("Enum Values: " + color.getValue());
        }
    }
}

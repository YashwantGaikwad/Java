enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum1 {
    public static void main(String[] args){
        for(Days day : Days.values()){
            System.out.println("Days: " + day);
        }
    }
}

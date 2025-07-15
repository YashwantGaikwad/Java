import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnno{}

public class Annotation2 {
    public static void main(String[] args) {
        @TypeAnno String string = "I am annotation with a type annotation";
        System.out.println(string);
    }
}

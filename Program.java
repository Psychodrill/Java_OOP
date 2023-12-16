import java.time.LocalDate;
import java.util.ArrayList;

import Classes.*;

public class Program{
    public static void main(String[] args){

        Cat barsik = new Cat("Barsik", LocalDate.of(1993,6,6),
                             new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        barsik.lifeCycle();
    }
}
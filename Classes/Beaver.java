package Classes;

import java.time.LocalDate;
import java.util.List;

public class Beaver extends Animal implements Goable,Swimable{

    public Beaver(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);

    }

    @Override
    public double swim() {
       
        return 2;
    }

    @Override
    public double run() {
       
        return 4;
    }
    
}

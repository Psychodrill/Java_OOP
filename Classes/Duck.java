package Classes;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Flyable, Swimable{

    public Duck(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);

    }

    @Override
    public double swim() {
        return 1;
    }

    @Override
    public double fly() {
        return 5;
    }

    
}

package Classes;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable{

    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double fly() {

        return 8;
    }

}

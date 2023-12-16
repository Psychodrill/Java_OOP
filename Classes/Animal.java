package Classes;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    
    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner){
        this.name=name;
        this.birthDate=birthDate;
        this.vaccinations=vaccinations;
        this.illness=illness;
        this.owner=owner;
    }
    public String getName(){
        return name;
    }
    public LocalDate getBirthDate(){
        return birthDate;
    }
    public List<String> getVaccinations(){
        return vaccinations;
    }
    public String getIllness(){
        return illness;
    }
    public String getOwner(){
        return owner;
    } 

    private void eat(){
        System.out.println("Animal ate");
    }
    private void sleep(){
        System.out.println("Animal sleeping");
    }
    private void play(){
        System.out.println("Animal playing");
    }

    private void wakeup(){
        System.out.println("Animal wakes up");
    }
    private void wakeup(LocalDate time){
        System.out.println(String.format("Animal had woken up in %s", time));
    }
    public void lifeCycle(){
        wakeup();
        eat();
        play();
        sleep();
    }

    @Override
    public String toString(){

        return "Animal{"+ "name='"+name+'\''+
        ", birthdate='"+birthDate+'\''+
        ", vaccinations='"+vaccinations+'\''+
        ", illness='"+illness+'\''+
        ", owner='"+owner+'\''+
        '}';
    }
}

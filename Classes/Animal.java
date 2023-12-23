package Classes;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    protected String type;
    
    public Animal(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner){
        this.name=name;
        this.birthDate=birthDate;
        this.vaccinations=vaccinations;
        this.illness=illness;
        this.owner=owner;
        this.type = getClass().getSimpleName();
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

    public void eat(){
        System.out.printf("%s %s ate", type, name);
    }
    public void sleep(){
        System.out.printf("%s %s sleeping", type, name);
    }
    public void play(){
        System.out.printf("%s %s playing", type, name);
    }
    // protected void go(){
    //     System.out.printf("%s %s walking",type, name);
    // }
    // protected void fly(){
    //     System.out.printf("%s %s flying", type, name);
    // }
    // protected void swim(){
    //     System.out.printf("%s %s swimming", type, name);
    // }

    public void wakeup(){
        System.out.printf("%s %s wakes up", type, name);
    }
    public void wakeup(LocalDate time){
        System.out.println(String.format("Animal had woken up in %s", time));
    }
    // protected void lifeCycle(){
    //     wakeup();
    //     eat();
    //     play();
    //     sleep();
    //     wakeup();
    //     go();
    //     fly();
    //     swim();
    //     sleep();
    // }

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

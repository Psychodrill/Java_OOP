package Classes;

import java.util.ArrayList;

public class VeterinaryClinic {

    
    ArrayList<Employee> clinicEmployees = new ArrayList<Employee>();
    ArrayList<Animal> illAnimals = new ArrayList<Animal>();

    public VeterinaryClinic(ArrayList<Animal> animals, ArrayList<Employee> employees){
        this.illAnimals=animals;
        this.clinicEmployees=employees;
    }

    public ArrayList<Goable> getGoableAnimals(){

        ArrayList<Goable> result = new ArrayList<Goable>();
        for(Animal animal :this.illAnimals){
            if(animal instanceof Goable){
                result.add((Goable)animal); 
            }
        }
        return result;
    }
    public ArrayList<Swimable> getSwimableAnimals(){

        ArrayList<Swimable> result = new ArrayList<Swimable>();
        for(Animal animal :this.illAnimals){
            if(animal instanceof Swimable){
                result.add((Swimable)animal); 
            }
        }
        return result;
    }
    public ArrayList<Flyable> getFlyableAnimals(){

        ArrayList<Flyable> result = new ArrayList<Flyable>();
        for(Animal animal :this.illAnimals){
            if(animal instanceof Flyable){
                result.add((Flyable)animal); 
            }
        }
        return result;
    }
    public ArrayList<Doctor> getDoctors(){

        ArrayList<Doctor> result = new ArrayList<Doctor>();
        for(Employee employee :this.clinicEmployees){
            if(employee instanceof Doctor){
                result.add((Doctor)employee); 
            }
        }
        return result;
    }
    public ArrayList<Nurse> getNurses(){

        ArrayList<Nurse> result = new ArrayList<Nurse>();
        for(Employee employee :this.clinicEmployees){
            if(employee instanceof Nurse){
                result.add((Nurse)employee); 
            }
        }

        return result;
    }


    
}

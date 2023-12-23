package Classes;

public class Doctor extends Employee implements Healable, Diagnosable, Vaccinatable {

    private Nurse nurse;

    public Doctor(){
        super();
        
    }
    public Doctor(Nurse nurse){
        super();
        this.nurse=nurse;
    }

    public void toDiagnose(){

    }

    public void toHeal(){

    }
    public void toVaccinate(){

    }
    
}

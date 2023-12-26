package Classes.Pharmacy;

public class Component implements Comparable<Component>{

    public String name;
    public String weight;
    private int power;

    public Component (String name, String weight, int power){
    this.name=name;
    this.weight=weight;
    this.power=power;
    }

    public Integer getPower(){
        return this.power;
    }

    @Override
    public String toString() {
        return "Component{"+ "name='"+name+'\''+
        ", weight='"+weight+'\''+
        ", power='"+power+'\''+
        '}';
    }

    @Override
    public int compareTo(Component o) {
        // if(this.power> o.power) return -1;
        // if(this.power> o.power) return -1;
        // return 0;
        return Integer.compare(this.power, o.power);
        
    }



    
}


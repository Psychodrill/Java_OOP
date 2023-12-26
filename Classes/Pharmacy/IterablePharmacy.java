package Classes.Pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IterablePharmacy implements Iterable<Component>, Comparable<IterablePharmacy> {

   // private int index;
    private ArrayList<Component> components=new ArrayList<Component>(); 

    public void addComponents(Component ...components){
        if(components.length==0) System.out.println("Не передали компоненты");
        else Collections.addAll(this.components,components);
    }

    
    public ArrayList<Component> getComponents(){
        return components;
    }

    @Override
    public Iterator<Component> iterator() {
        return new ComponentIterator(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IterablePharmacy itPharmacy = (IterablePharmacy) obj;


        return getPharmacyPower() == itPharmacy.getPharmacyPower();
    }

    @Override
    public int hashCode() {

        return getPharmacyPower();
    }

    @Override
    public int compareTo(IterablePharmacy obj) {

       return Integer.compare(this.getPharmacyPower(), obj.getPharmacyPower());
    }

    private int getPharmacyPower(){

        int result = 0;
        for (Component component : components) {
            result +=component.getPower()* component.weight.hashCode();
        }
        return result;
    }

}

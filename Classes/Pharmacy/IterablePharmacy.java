package Classes.Pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IterablePharmacy implements Iterable<Component> {

    private int index;
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

}

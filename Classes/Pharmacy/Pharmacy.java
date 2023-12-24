package Classes.Pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Pharmacy implements Iterator<Component> {

    private int index;
    private ArrayList<Component> components=new ArrayList<Component>(); 

    public void addComponents(Component ...components){
        if(components.length==0) System.out.println("Не передали компоненты");
        else Collections.addAll(this.components,components);
    }

    @Override
    public boolean hasNext() {
        return index<components.size(); 
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

}

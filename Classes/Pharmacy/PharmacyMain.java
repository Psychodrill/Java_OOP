package Classes.Pharmacy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PharmacyMain {

    public static void main(String[] args) {

        Component ultramek = new Component("Ultramek", "10mg", 100);
        Component diclacox = new Component("Diclacox", "50ml", 60);
        Component novocaine = new Component ("Novocaine","0,5%",30);
        Component chlorhexidine = new Component("Chlorhexidine", "2un", 20);

        Pharmacy pharmacy= new Pharmacy();
        IterablePharmacy ipharmacy = new IterablePharmacy();

        pharmacy.addComponents(ultramek,chlorhexidine, diclacox);

        ipharmacy.addComponents(diclacox, ultramek,novocaine);

        // // Iterator<Component> iterator = pharmacy;

        // // while (iterator.hasNext()) {
        // //     System.out.println(iterator.next());
            
        // // }
        // for(Component com:ipharmacy){
        //     System.out.println(com);
        // }

        List<Component> components = new ArrayList<Component>();
        components.add(ultramek);
        components.add(chlorhexidine);
        components.add(novocaine);

        Collections.sort(components);

        System.out.println(components);

        
    }
    
}

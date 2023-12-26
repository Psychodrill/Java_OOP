package Classes.Pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        
        ArrayList<Component> components = new ArrayList<Component>();
        components.add(ultramek);
        components.add(chlorhexidine);
        components.add(novocaine);

        Collections.sort(components);

        System.out.println(components);

        //Homework below

        IterablePharmacy itPharmacy1 = new IterablePharmacy();
        IterablePharmacy itPharmacy2 = new IterablePharmacy();
        IterablePharmacy itPharmacy3 = new IterablePharmacy();
        
        Component [] drugs3 = {ultramek,chlorhexidine,novocaine};
        Component [] drugs2 = {novocaine,chlorhexidine, diclacox};

        itPharmacy1.addComponents(drugs3);
        itPharmacy2.addComponents(drugs3);
        itPharmacy3.addComponents(drugs2);
        
        Set<IterablePharmacy> result = new HashSet<IterablePharmacy>();
        result.add(itPharmacy1);
        result.add(itPharmacy2);
        result.add(itPharmacy3);

        System.out.println(result.size());
        ArrayList<IterablePharmacy> pharmacyArList= new ArrayList<IterablePharmacy>(result);
        System.out.println(result);
        Collections.sort(pharmacyArList);
        System.out.println(pharmacyArList);

     

        

        
    }
    
}

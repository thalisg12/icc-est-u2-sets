package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        
        int resultComparationApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());

        if(resultComparationApellido !=0){
            return resultComparationApellido;
        }
        int resultComparationNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resultComparationNombre;
    }

    
    
}

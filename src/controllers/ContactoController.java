package controllers;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class ContactoController {


    public ContactoController(){
        runTreeContacto8();
    }
    
    public void runTreeContacto8(){

        Set<Contacto> agenda = new TreeSet<>();
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));
        agenda.add(new Contacto("Pedro", "Gonzalez", "222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "222222222"));
        
       for (Contacto contacto : agenda) {
        System.out.println(contacto);
        
       }















    }
}

package controllers;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorHash;
import utils.ContactoComparatorTelefono;

public class ContactoController {


    public ContactoController(){
        runTreeContacto();
    }
    
    public void runTreeContacto(){

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
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
     
    public void runTreeContactoTelefono(){

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorTelefono());
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
    public void runTreeContactoHash(){

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHash());
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


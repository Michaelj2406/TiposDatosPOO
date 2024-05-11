/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import modelo.Persona;

/**
 *
 * @author LENOVO
 */
//1.-CONSUMIENDO OBJETOS
public class Main1 {
    //2.-LLAMAR A MÉTODO MAIN TRADUCTOR
    //O INTERPRETE DEL CÓDIGO
    //PROBRA EL CÓDIGO
    public static void main(String[] args) {
        //1.-CREAR/INSTANCIA EL OBJETO
        //NombreClase nombreObjeto=new NombreClase();
        Persona michael=new Persona(); //Se ha creado un nombre al objeto
        //2.-DARLE DATOS A michael
        //nombreObjeto.atributo/variable="dato"
        //ACCEDIENDO A LOS ATRIBUTOS
        michael.idPersona=0021;
        michael.nombres="Michael";
        michael.apellidos="Chasiguano";
        michael.etnia="mestizo";
        michael.cedula=1004334734;
        michael.numeroTelefono=989972254; //Con int no reconoce el numero "0"
        michael.horoscopo="Capricornio";
        //ACCECIENDO A LOS MÉTODOS
        michael.saludar();
        //CONSUMIENTO MÉTODO (EL DATO DENTRO DE LOS PARENTÉSIS SE LLAMA PARÁMETROS)
        michael.saludarEdad(19);
        michael.sHoroscopo();
                
        Persona pablo=new Persona();
        pablo.idPersona=0022;
        pablo.nombres="Pablo";
        pablo.apellidos="Gómez";
        pablo.etnia="mestizo";
        pablo.cedula=1004358757;
        pablo.numeroTelefono=998754123;
        pablo.horoscopo="Libra";
        pablo.saludar();

        pablo.saludarEdad(29);
        
        pablo.sHoroscopo1();

        Persona maria=new Persona();
        maria.idPersona=0023;
        maria.nombres="María";
        maria.apellidos="Burgos";
        maria.etnia="mestiza";
        maria.cedula=1005287998;
        maria.numeroTelefono=985547575;
        maria.horoscopo="Géminis";
        
        maria.saludar();

        maria.saludarEdad(15);
        
        maria.sHoroscopo2();
        
        Persona ana=new Persona();
        ana.idPersona=0024;
        ana.nombres="Ana";
        ana.apellidos="Burgos";
        ana.etnia="mestiza";
        ana.cedula=1068971211;
        ana.numeroTelefono=958772221;
        ana.horoscopo="Leo";
        
        ana.saludar();

        ana.saludarEdad(29);
        
        ana.sHoroscopo3();
        
        Persona eduardo=new Persona();
        eduardo.idPersona=0024;
        eduardo.nombres="Eduardo";
        eduardo.apellidos="Sinmancas";
        eduardo.etnia="blanco";
        eduardo.cedula=1005688222;
        eduardo.numeroTelefono=958778821;
        eduardo.horoscopo="Piscis";
        
        eduardo.saludar();

        eduardo.saludarEdad(89);
        
        eduardo.sHoroscopo4();
        
        Persona ariel=new Persona();
        ariel.idPersona=0024;
        ariel.nombres="Ariel";
        ariel.apellidos="Toapanta";
        ariel.etnia="mestizo";
        ariel.cedula=1005688555;
        ariel.numeroTelefono=958228821;
        ariel.horoscopo="Escorpio";
        
        ariel.saludar();

        ariel.saludarEdad(9);
        
        ariel.sHoroscopo5();
    }
}

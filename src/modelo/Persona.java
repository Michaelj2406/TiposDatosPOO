package modelo;

/**
 *
 * @author LENOVO
 */
//1.- NOMBRE DE CLASE:
public class Persona { //Public=Palabrareservada
//2.-ATRIBUTOS - DECLARACIÓN GLOBAL DE VARIABLES
    //public-private-protected
    public int idPersona;
    public String nombres;
    public String apellidos;
    public String etnia;
    public int cedula;
    public int numeroTelefono;
    public String horoscopo;
//3.-MÉTODOS/ACCIONES/COMPORTAMIENTOS    
    //puclic-private
    //1)MÉTODO DE NO RETORNO
    //SON SECCIONES DE CÓDIGO
    //PUEDEN POSEER VARIABLES LOCALES
    public void saludar(){ //METODO DE NO RETORNO
        //PARA MOSTRAR INFORMACIÓN RECURRIR A IMPRIMIR
        System.out.println("HOLA: "+nombres);   
    }
    //1.1)MÉTODO DE NO RETORNO UTILIZAR ARGUMENTOS DE ENTRADA
    //UN ARGUMENTO ES UNA VARIABLE LOCAL
    //SOLO SE RECONOCE EN ESE BLOQUE DE CÓDIGO
    public void saludarEdad(int edad){
        if(edad>18){
            System.out.println("Hola Mayor de Edad: ");
        }else{
            System.out.println("Hola Menor de Edad ");
        } 
    }

    public void sHoroscopo() {
        if("Capricornio".equals(horoscopo)){
            System.out.println("Eres " + horoscopo + " y su predicción es:\n "
                    + "El éxito se logra con esfuerzo y disciplina, paso a paso.");   
        }
        System.out.println("************************************************************************");
    }
    public void sHoroscopo1() {
        if("Libra".equals(horoscopo)){
            System.out.println("Eres " + horoscopo + " y su predicción es:\n "
                    + "Busca la armonía y el equilibrio en tus relaciones, y encontrarás la \n verdadera felicidad.");   
        }
        System.out.println("************************************************************************");
    }
    public void sHoroscopo2() {
        if("Géminis".equals(horoscopo)){
            System.out.println("Eres " + horoscopo + " y su predicción es:\n "
                    + "Tu mente curiosa y adaptable te permite fluir en diferentes direcciones \n y descubrir nuevas oportunidades.");   
        }
        System.out.println("************************************************************************");
    }
    public void sHoroscopo3() {
        if("Leo".equals(horoscopo)){
            System.out.println("Eres " + horoscopo + " y su predicción es:\n "
                    + "Brilla con confianza y seguridad, pues eres el protagonista de tu propia vida.");   
        }
        System.out.println("************************************************************************");
    }
    public void sHoroscopo4() {
        if("Piscis".equals(horoscopo)){
            System.out.println("Eres " + horoscopo + " y su predicción es:\n "
                    + "Con tu empatía y sensibilidad, puedes inspirar a otros y crear un \n impacto positivo en sus vidas.");   
        }
        System.out.println("************************************************************************");   
    } 
    public void sHoroscopo5() {
        if("Escorpio".equals(horoscopo)){
            System.out.println("Eres " + horoscopo + " y su predicción es:\n "
                    + "Con tu pasión y determinación, puedes transformar cualquier obstáculo \n en una oportunidad de crecimiento.");   
        }
        System.out.println("************************************************************************");   
    }    
}    
//IF(EDAD=="ARIES")
//MÉTODO QUE NOS INDIQUE EL HORÓSCOPO
//INVENTARSE UN MENSAJE
//EL USUARIO INGRESAR HORORSCOPO
//RESULTADO QUE DIGA FRASE LIBRA-
//ARIES-INDIQUE TAL MENSAJE
//LIBRA-INDIQUE TAL MESAJE
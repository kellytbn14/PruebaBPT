import java.util.Vector;

public class Punto1 {
    public static void main(String[] args) {

        Vector<String> personas= new Vector<>();

        //Ni Catalina ni Juan llegan tan tarde como Carlos
        personas.add("Catalina");
        personas.add("Juan");
        personas.add("Carlos");

        //Juan y Andrea llegan mas tarde que Jorge
        personas.add(personas.indexOf("Juan"),"Jorge");
        personas.add(personas.indexOf("Juan")+1,"Andrea");

        //Catalina llega mas tarde que Jorge, pero mas temprano que Juan
        personas.remove("Catalina");
        personas.add(personas.indexOf("Jorge")+1,"Catalina");

        System.out.println(personas.toString());
        System.out.println("Primero en llegar: "+personas.firstElement());
        System.out.println("Ultimo en llegar: "+personas.lastElement());


    }
}

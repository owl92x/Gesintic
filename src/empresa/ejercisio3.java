package empresa;
// aqui tenemos un paquete que lo llamamos  empresa
import java.util.Scanner;
//importamos  scaner para que leea los  datos
public class ejercisio3 {
   //aqui ponemos como publica la clase ejercisio3 la cual vamso a utilizar para 
   //realizar el menu

    public static void main(String[] args) {
        //este es  el metodo principal aqui iniciaremos la app
        Scanner scanner = new Scanner(System.in);
        //aqui creamos un objeto scanner este ase  que leean los datos del usuario
        gestor gestor = new gestor();
        //creamos  el objeto gestor ps para gestioar los puestos y tambien las incidencias
        while (true) {
            //aqui usamos un while mientras sea verdad ps  se  imorimiera lo siguiente
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Añadir puesto");
            System.out.println("2. Añadir incidencia");
            System.out.println("3. Listar incidencias por puesto");
            System.out.println("4. Salir");
            //aqui tenemos lo que en teoria se mostraria como menu princupal bueno 
            //con las opciones que hay 

            int option = scanner.nextInt();
            //este int que seria  el que lee  lo que se selecciona 
            scanner.nextLine();
            switch (option) {
                //este  switch es para poner un puesto nuevo  op1
                case 1:
                //aqui es el primer caso
                    System.out.println("Introduce el nombre del puesto:");
                    //aqui pedimos  el puesto al usuario
                    scanner.nextLine();
                    //lee el salto de linea que pasa ala siguiente linea ?¿
                    String puestoName = scanner.nextLine();
                    // aqui crea un objeto nuevo  puesto con el el nombre que se puso  
                    puesto puesto = new puesto(puestoName, puestoName);
                    // aqui añadimos  el nuevo puesto ala linea que gestiona el objeto
                    gestor.addpuesto(puesto);
                    //aqui el gestor añade  pusto en el puesto ??
                    break;
                case 2:
                // este seria el segundo caso
                    System.out.println("Introduce el nombre del puesto de la incidencia:");
                    // seria si el usuario coge la opcion2  se añadiria una nueva incidencia 
                    scanner.nextLine();
                    //lee el salto de linea que pasa ala siguiente linea ?¿
                    String incidenciaPuestoName = scanner.nextLine();
                    //coge el puesto donde se ah producido la incidencia
                    puesto incidenciaPuesto = gestor.getpuesto(incidenciaPuestoName);
                    // se pone el puesto al que se kiere agregar la incidencia
                    if (incidenciaPuesto == null) {
                        //aqui con el if si no ay incidencia  valor nulo
                        System.out.println("No existe ningún puesto con ese nombre.");
                        // aqui. imprime  que no ahy ningun puesto con ese nombre 
                        break;//con esto ponemos una opcion que nos dejaria salir de una sentencia 
                        //etiquetada
                    }
                    System.out.println("Introduce la descripción de la incidencia:");
                    //aqui introducimos la descripcion de la incidencia
                    String incidenciaDescription = scanner.nextLine();
                    //lee la descripcion de la incidencia
                    incidencia incidencia = new incidencia(incidenciaDescription, incidenciaPuesto);
                    // creamos un nuevo objeto incidencia
                    incidenciaPuesto.addincidencia(incidencia);
                    //añadiimos incidencia
                    break;//con esto ponemos una opcion que nos dejaria salir de una sentencia 
                    //etiquetada
                case 3://caso3
                    System.out.println("Introduce el nombre del puesto:");
                    //pide el nombre del puesto
                    scanner.nextLine();
                    //lee el salto de linea que  baja a otra linea
                    String listPuestoName = scanner.nextLine();
                    //lee el nombre del puesto
                    puesto listPuesto = gestor.getpuesto(listPuestoName);
                    // aqui llamar al gestor  y del gestor obtiene el puesto 
                    if (listPuesto == null) {
                        // caso contrario si no  ps devolvera un valor nulo
                        System.out.println("No existe ningún puesto con ese nombre.");
                        //entonces imprime  el mesaje
                        break;//con esto ponemos una opcion que nos dejaria salir de una sentencia 
                        //etiquetada
                                    }
                    System.out.println("Incidencias del puesto " + listPuestoName + ":");
                    //aqui imprime el nombre del puesto y la palabra incidencias
                    for (incidencia Incidencia : listPuesto.getincidencias()) {
                        // recorre las incidencias del puesto 
                        System.out.println(Incidencia.getDescription());
                        // aqui describe la descripcion de las incidencias
                    }
                    break;//con esto ponemos una opcion que nos dejaria salir de una sentencia 
                    //etiquetada
                case 4:
                // caso 4
                    scanner.close();
                    //cierra el scanner para no tener errores
                    return;
                    // retorna bueno saldria del metodo main
                default:
                    System.out.println("Opción no válida.");
                    // si la opcion no es valida  imprimira este mensaje
            }
        }
    }


    
}

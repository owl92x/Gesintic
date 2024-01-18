package empresa;
// paquete empresa

import java.util.ArrayList;
import java.util.List;
// asemos una importacion de la list

public class gestor {
    // creamos  la clase gestor
    private List<incidencia> Incidentes;
    //ponemso el atributo de  que es  una lista de incidencias
    private ArrayList <puesto> Puestos;
    //ponemoso el atributo  que  una lista de puestos

    public gestor() {
        //constructor gestor
        this.Incidentes = new ArrayList<>();
        // iniciamos la lista de incidencias
        this.Puestos = new ArrayList<>();
        // iniciamos la lista de pruevas 
    }

    public void crearIncidencia(String descripcion, String estado, String prioridad, String idPuesto) {
        incidencia incidencia = new incidencia(descripcion, 0, estado, prioridad, idPuesto);
        // aqui creamos una nueva incidencia los los parametro dados
        this.Incidentes.add(incidencia);
        //  añadimos los datos ala nueva lista de incidencias
    }

    public void resolverIncidencia(int index) {
        if (index >= 0 && index < this.Incidentes.size()) {
            // si el indice esta dentro de los limites de la lista  con esto ariamos una comprobacion
            this.Incidentes.get(index).setEstado("Resuelto");
            // cambiamos el estado de la incidencia por q esta resuelto
        } else {
            System.out.println("Índice inválido.");
            //caso contrario ps imprimira  que no vale
        }
    }

    public void crearPuesto(String nombre, String localizacion) {
        puesto puesto = new puesto(nombre, localizacion);
        //aqui creamos un nuevo puesto con los  datos que se piden  con los paramentros
        this.Puestos.add(puesto);
        // y lo metemmos ala lista puestos
    }

    public void eliminarPuesto(int index) {
        if (index >= 0 && index < this.Puestos.size()) {
            this.Puestos.remove(index);
            // si esta. bien el indice pues eliminariamos el puesto 
            for (incidencia incidencia : this.Incidentes) {
                // recorremos la lista incidentes
                if (incidencia.getIdPuesto().equals(this.Puestos.get(index).getId())) {
                    // si ecuentra  uan incedincia con el mismo id del puesto
                    System.out.println("No se puede eliminar el puesto porque tiene incidentes asociados.");
                    // aqui decimos que no se elimina 
                    this.Puestos.addAll(index, Puestos);
                    // entonces con esto volvemos añadir el puesto ala lista 
                    break;//con esto ponemos una opcion que nos dejaria salir de una sentencia 
                    //etiquetada
                }
            }
        } else {
            System.out.println("Índice inválido.");
            // caso contrario ps imprimiriamos el mensaje valido
        }
    }

    public void mostrarIncidencias() {
        for (int i = 0; i < this.Incidentes.size(); i++) {
            System.out.println((i + 1) + ". " + this.Incidentes.get(i).toString());
            //recorremos la lista de incidencia y muesta el indice y con esto la 
            //la incidencia completa
        }
    }

    public void mostrarPuestos() {
        for (int i = 0; i < this.Puestos.size(); i++) {
            System.out.println((i + 1) + ". " + this.Puestos.get(i).toString());
            //los miso igual que la anterior pero mostraria los puestos
        }
    }
    public void addpuesto(puesto puesto) {
        this.Puestos.add(puesto);
    }

    public puesto addpuesto(String listPuestoName) {
        puesto puesto = new puesto(listPuestoName);
        this.Puestos.add(puesto);
        return puesto;
    }

    public puesto getpuesto(String incidenciaPuestoName) {
        for (puesto puesto : this.Puestos) {
            if (puesto.getNombre().equals(incidenciaPuestoName)) {
                return puesto;
            }
        }
        return null;
    
    }
}

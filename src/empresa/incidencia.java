package empresa;
//aqui tenemos el paquete empresa

public class incidencia {
    //definimos la clase incidencia
    private String descripcion;
    private String estado;
    private String prioridad;
    private String idPuesto;
    // aqui definimos unos atributos con los cuales guardaremos 
    //la (descripcion,estado,prioridad, idpuesto-utiliza este q pertenece a la incidencia)
  

    public incidencia(String descripcion, int numincidencia, String estado, String prioridad, String idPuesto) {
        //cosntuctor de la clase 
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.idPuesto = idPuesto;
      // aqui definimos los parametros
    }

    public incidencia(String incidenciaDescription, puesto incidenciaPuesto) {
        //aqui tenemos un autogenerado  el cual por un error de compliacion lo realize
        //el autogenerado lo que ase el contructor de la clase 
        //incidencia con los parametros ?¿
    }

    public incidencia(String incidenciaDescription, puesto numincidecia, int i) {
        //TODO Auto-generated constructor stub
    }

    public String getDescripcion() {
        return descripcion;
        // devolvemos el valor del atributo descripcion 
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        //damos el valor de atributo al  descripcion
    }
    public String getEstado() {
        return estado;
        // nos devuelve el valor de atributo estado
    }

    public void setEstado(String estado) {
        this.estado = estado;
        //damos el valor de atributo a estado
    }

    public String getPrioridad() {
        return prioridad;
        //nos devolve el valor de atributo prioridad
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
        // damos le valor de atributo a prioridad
    }

    public String getIdPuesto() {
        return idPuesto;
        //nos devuleve el valor  de atributo IDpuesto
    }

    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
        // aqui. asignamso el valor de a tributo a idpuesto
    }
    @Override
    // con esto creamos una ver siiond e un metodo que  ay emos definido en una superclase 
    // lo que asemos es  cambir un metodo heredado  o darle funciones adicionales al una clase  en este caso alas. quevemos abajo
    public String toString() {
        return "Incidencia [descripcion=" + descripcion + ", estado=" + estado + ", prioridad=" + prioridad + ", idPuesto="
                + idPuesto + "]";
                // lo dixo
    }

    public char[] getDescription() {
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
        //necesitaria una explicaion por que es un autogenrado el cual no comprendo ??
    }
}
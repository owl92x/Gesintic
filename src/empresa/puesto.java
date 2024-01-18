package empresa;
//paquete empresa

public class puesto {
    //aqui definimos la clase puesto como publica
    private String nombre;
    private String localizacion;
    private String id;
    //definomos estos atributos con el tipo string(entonces esto representa una cadena alfanumerica de una valor constante
    //que no puede ser cambianda despues de  haber sido creada

    public puesto(String nombre, String localizacion2) {
        // el constructor  puesto  recibe los atributos nombre y localizacion
        this.nombre = nombre;
        this.localizacion = id;
        this.id = generarId();
        //asignamos valores de los argumentos a los atributos correspondientes
    }

    public puesto(String listPuestoName) {
        //TODO Auto-generated constructor stub
    }

    private String generarId() {
        //asignamos un unico identificador ala instacia clase
        //usando el metodo generarID()
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //creamos una cadena de letras mayusculas
        String numeros = "0123456789";
        //creamos una cadena de numero 
        String id = "";
        //aqui crea una cadena vacia para. le identificador 
        id += letras.charAt((int) (Math.random() * letras.length()));
        id += letras.charAt((int) (Math.random() * letras.length()));
        id += numeros.charAt((int) (Math.random() * numeros.length()));
        id += numeros.charAt((int) (Math.random() * numeros.length()));
        id += numeros.charAt((int) (Math.random() * numeros.length()));
        //con esto los que ralizamos es agregar una letra aleatoria al identificador 1-2 y tambien tres
        //numero aleatorios
        return id;
        //aqui nos devuelve el identifcador ants generado 
    }

    public String getNombre() {// aqui tnemos un metodo publico que nos devulve el vlaor del atributo nnombre
        return nombre;
    }

    public void setNombre(String nombre) {
        //igual metodo publico que establece el valo del atributo nombre
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        //igual metodo publico que devuelve el valor del atributo nombre
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        //metodo publico que establece el valor del atributo localizacion
        this.localizacion = localizacion;
    }

    public String getId() {
        //nos devulve el valor del atributo id
        return id;
    }

    @Override
    // con esto creamos una version de un metodo que  ay emos definido en una superclase 
    // lo que asemos es  cambir un metodo heredado  o darle funciones adicionales al una clase  en este caso alas. quevemos abajo
    public String toString() {
        return "Puesto [nombre=" + nombre + ", localizacion=" + localizacion + ", id=" + id + "]";
    }

    

    public incidencia[] getincidencias() {
        // el metodo publico incidencias devuelve el arrego  de las instacias  de la clase incidencia asociadas alas instacia case  de la clase puesto 
        //este es un metodo que no emos implemntado  lo tenemos como autogenerado por un error de compilacion 
        throw new UnsupportedOperationException("Unimplemented method 'getincidencias'");
    }

    public void addincidencia(incidencia incidencia) {
        // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method'addincidencia'");
    }
}

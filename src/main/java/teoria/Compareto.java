package teoria;

/**
 * CLASE COMPARETO
 * Demuestra como implementar la interfaz Comparable<T>
 * para definir un orden natural entre objetos.
 */
public class Compareto {
    
    /**
     * CLASE INTERNA: Persona
     * Implementa Comparable<Persona> para poder comparar personas
     * El metodo compareTo define como se ordenan las personas
     */
    public static class Persona implements Comparable<Persona> {
        // ATRIBUTOS de la clase Persona
        private String nombre;  // Nombre de la persona
        private int edad;       // Edad de la persona
        
        /**
         * CONSTRUCTOR de Persona
         * Recibe el nombre y la edad como parametros
         * Los asigna a los atributos de la clase
         */
        public Persona(String nombre, int edad) {
            this.nombre = nombre;  // Asigna el nombre
            this.edad = edad;      // Asigna la edad
        }
        
        /**
         * METODO: compareTo
         * Es el metodo principal de la interfaz Comparable
         * Define como se comparan dos personas
         * 
         * @param otra: La otra persona a comparar
         * @return int: Negativo si esta es menor, cero si iguales, positivo si mayor
         */
        @Override
        public int compareTo(Persona otra) {
            // Compara edades: devuelve resultado para ordenar de menor a mayor
            return this.edad - otra.edad;
        }
        
        /**
         * METODO: toString
         * Convierte el objeto a una cadena de texto legible
         * Se usa para imprimir informacion de forma estructurada
         */
        @Override
        public String toString() {
            return nombre + " (" + edad + " anos)";
        }
        
        /**
         * GETTER: getNombre
         * Retorna el nombre de la persona
         */
        public String getNombre() {
            return nombre;
        }
        
        /**
         * GETTER: getEdad
         * Retorna la edad de la persona
         */
        public int getEdad() {
            return edad;
        }
    }
}

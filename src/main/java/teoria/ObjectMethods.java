package teoria;

/**
 * Clase ObjectMethods: Teoría y conceptos relacionados con los métodos toString, equals y hashCode en Java
 *
 * Estos métodos pertenecen a la clase Object, la superclase de todas las clases en Java.
 * Es crucial sobreescribirlos en clases personalizadas para un comportamiento adecuado.
 *
 * 1. toString():
 *    - Devuelve una representación en cadena del objeto.
 *    - Por defecto: "NombreClase@hashCodeEnHexadecimal"
 *    - Debería ser legible y descriptiva.
 *    - Se usa automáticamente en System.out.println(objeto), concatenación de strings, etc.
 *    - Buenas prácticas: Incluir todos los campos relevantes.
 *    - Ejemplo: Para una clase Persona, "Persona{nombre='Juan', edad=25}"
 *
 * 2. equals(Object obj):
 *    - Compara si dos objetos son "iguales" en términos de lógica de negocio.
 *    - Por defecto: Compara referencias (obj1 == obj2).
 *    - Debe ser reflexivo, simétrico, transitivo, consistente y manejar null.
 *    - Generalmente compara campos clave.
 *    - Si se sobreescribe, también se debe sobreescribir hashCode.
 *    - Ejemplo: Dos personas son iguales si tienen el mismo ID.
 *
 * 3. hashCode():
 *    - Devuelve un código hash entero para el objeto.
 *    - Por defecto: Basado en la dirección de memoria.
 *    - Se usa en estructuras como HashMap, HashSet para indexación rápida.
 *    - Contrato con equals: Si obj1.equals(obj2), entonces obj1.hashCode() == obj2.hashCode().
 *    - Debe ser consistente: Mismo objeto siempre mismo hashCode (mientras no cambie).
 *    - Buenas prácticas: Incluir los mismos campos que en equals.
 *    - Implementación común: Usar Objects.hash(campo1, campo2, ...).
 *
 * Importancia del contrato equals-hashCode:
 * - Violaciones pueden causar problemas en colecciones basadas en hash (HashSet, HashMap).
 * - Ejemplo: Si dos objetos son iguales pero tienen hashCodes diferentes, no se comportan bien en HashSet.
 *
 * Consideraciones:
 * - toString no afecta el contrato de equals/hashCode.
 * - Para clases inmutables, hashCode puede cachearse.
 * - Usar herramientas como Lombok @EqualsAndHashCode para generar automáticamente.
 * - En enums, estos métodos ya están implementados correctamente.
 *
 * Ejemplos de implementación:
 * - Ver métodos de ejemplo en esta clase.
 *
 * Esta clase no implementa funcionalidad ejecutable completa, sino que sirve como referencia teórica.
 */
public class ObjectMethods {

    // Clase de ejemplo para demostrar implementaciones
    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Persona{nombre='" + nombre + "', edad=" + edad + "}";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Persona persona = (Persona) obj;
            return edad == persona.edad && nombre.equals(persona.nombre);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(nombre, edad);
        }
    }

    /**
     * Método de ejemplo: Imprimir teoría básica
     */
    public static void imprimirTeoria() {
        System.out.println("Teoría de toString, equals y hashCode:");
        System.out.println("- toString: Representación legible del objeto");
        System.out.println("- equals: Comparación lógica de objetos");
        System.out.println("- hashCode: Código hash para colecciones basadas en hash");
        System.out.println("- Contrato: equals y hashCode deben ser consistentes");
    }

    /**
     * Método de ejemplo: Demostrar uso
     */
    public static void demostrarUso() {
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Juan", 25);
        Persona p3 = new Persona("Ana", 30);

        System.out.println("p1.toString(): " + p1.toString());
        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false
        System.out.println("p1.hashCode() == p2.hashCode(): " + (p1.hashCode() == p2.hashCode())); // true
    }
}
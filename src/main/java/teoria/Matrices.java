package teoria;

public class Matrices {

    // Método para crear una matriz de tamaño filas x columnas inicializada en cero
    public static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para sumar dos matrices
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        int filas = a.length;
        int columnas = a[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;
    }

    // Método para restar dos matrices
    public static int[][] restarMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        int filas = a.length;
        int columnas = a[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = a[i][j] - b[i][j];
            }
        }
        return resultado;
    }

    // Método para multiplicar una matriz por un escalar
    public static int[][] multiplicarPorEscalar(int[][] matriz, int escalar) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }
        return resultado;
    }

    // Método para multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("El número de columnas de A debe ser igual al número de filas de B");
        }
        int filas = a.length;
        int columnas = b[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return resultado;
    }

    // Método para transponer una matriz
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    // Método para calcular el determinante de una matriz cuadrada (usando recursión)
    public static int determinante(int[][] matriz) {
        int n = matriz.length;
        if (n != matriz[0].length) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada");
        }
        if (n == 1) {
            return matriz[0][0];
        }
        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }
        int det = 0;
        for (int i = 0; i < n; i++) {
            int[][] submatriz = new int[n-1][n-1];
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (k < i) {
                        submatriz[j-1][k] = matriz[j][k];
                    } else if (k > i) {
                        submatriz[j-1][k-1] = matriz[j][k];
                    }
                }
            }
            det += (i % 2 == 0 ? 1 : -1) * matriz[0][i] * determinante(submatriz);
        }
        return det;
    }

    // Método para verificar si una matriz es simétrica.
    public static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;
        if (n != matriz[0].length) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para verificar si una matriz es identidad.
    public static boolean esIdentidad(int[][] matriz) {
        int n = matriz.length;
        if (n != matriz[0].length) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Método para crear una matriz identidad.
    public static int[][] matrizIdentidad(int n) {
        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            identidad[i][i] = 1;
        }
        return identidad;
    }

    // Método para copiar una matriz.
    public static int[][] copiarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] copia = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            System.arraycopy(matriz[i], 0, copia[i], 0, columnas);
        }
        return copia;
    }

    // Método para comparar dos matrices.
    public static boolean matricesIguales(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // ================= Ejemplos de uso de matrices en juegos =================

    // Ejemplo: Tablero de Hundir la Flota (Battleship)
    // 0 = agua, 1 = barco, 2 = tocado, 3 = hundido
    public static int[][] crearTableroHundirLaFlota(int filas, int columnas) {
        return new int[filas][columnas];
    }

    // Marcar un disparo en el tablero
    public static void disparar(int[][] tablero, int fila, int columna) {
        if (tablero[fila][columna] == 1) {
            tablero[fila][columna] = 2; // tocado
        } else if (tablero[fila][columna] == 0) {
            tablero[fila][columna] = -1; // agua disparada
        }
    }

    // Colocar un barco en el tablero
    public static void colocarBarco(int[][] tablero, int fila, int columna, int longitud, boolean horizontal) {
        for (int i = 0; i < longitud; i++) {
            if (horizontal) {
                tablero[fila][columna + i] = 1;
            } else {
                tablero[fila + i][columna] = 1;
            }
        }
    }

    // Ejemplo: Tablero de La Oca
    // Cada casilla puede tener un valor especial: 0 = normal, 1 = oca, 2 = puente, 3 = posada, etc.
    public static int[] crearTableroOca(int casillas) {
        int[] tablero = new int[casillas];
        // Ejemplo: poner ocas en casillas 5, 9, 14...
        for (int i = 0; i < casillas; i++) {
            if (i == 5 || i == 9 || i == 14 || i == 18 || i == 23 || i == 27 || i == 32 || i == 36 || i == 41 || i == 45 || i == 50 || i == 54 || i == 59) {
                tablero[i] = 1; // oca
            }
        }
        // Ejemplo: poner puente en casilla 6
        tablero[6] = 2;
        // Ejemplo: poner posada en casilla 19
        tablero[19] = 3;
        return tablero;
    }

    // Imprimir tablero de la oca
    public static void imprimirTableroOca(int[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i] + " ");
        }
        System.out.println();
    }

    // Puedes añadir más métodos para otros juegos de tablero usando matrices
}
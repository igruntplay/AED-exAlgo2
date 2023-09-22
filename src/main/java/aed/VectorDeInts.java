package aed;

class VectorDeInts implements SecuenciaDeInts {
    private static final int CAPACIDAD_INICIAL = 1;
    private int[] array; // Array para almacenar los elementos del vector.
    private int size; // Variable para almacenar la cantidad de elementos en el vector.

    public VectorDeInts() {
        array = new int[CAPACIDAD_INICIAL]; // Inicializa el array con la capacidad inicial.
        size = 0; // Al comienzo, el vector no tiene elementos.
    }
    public int longitud(){
        return size;
    }
    
    public void agregarAtras(int i) {
                // Si el array está lleno, se debe crear uno nuevo de mayor capacidad.
                if (size == array.length) {
                    int newCapacity = 2 * array.length; // Calcula la nueva capacidad del array.
                    int[] newArray = new int[newCapacity]; // Crea un nuevo array con la nueva capacidad.
        
                    // Copia los elementos del array antiguo al nuevo array.
                    for (int j = 0; j < array.length; j++) {
                        newArray[j] = array[j];
                    }
        
                    array = newArray; // El array antiguo se reemplaza por el nuevo.
                }
        
                // Añade el nuevo elemento en la posición size y aumenta el tamaño del vector.
                array[size] = i;
                size++;
        
    }

    public int obtener(int i) {
       return array[i];
    }

    public void quitarAtras() {
            size--;
    }
    

    public void modificarPosicion(int indice, int valor) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public VectorDeInts copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

}

import java.util.Arrays;

public class Metodos {
            public int [] insertionSort(int[] arr , boolean cambio) {
                int n = arr.length;
                if (cambio == true) {
                    for (int i = 1; i < n; i++) {
                        System.out.println(" Pasada numero :  : " + i);
                        int key = arr[i]; // Elemento a insertar
                        int j = i - 1;
            
                        // Mover los elementos de arr[0..i-1], que son mayores que key,
                        // a una posición adelante de su posición actual
                        System.out.println("\ti=" + i + " j=" + j + " [i]=" + arr[i] + " [j]=" + arr[j]);
                         while (j >= 0 && arr[j] > key) {
                            System.out.println("\t\tComparamos " + key + " con " + arr[j]);
                            arr[j + 1] = arr[j];
                            j--;
                            System.out.println("\t\t--------" + Arrays.toString(arr));
                        }
                        arr[j + 1] = key; // Insertar el elemento en su posición correcta
                        System.out.println("\t--------" + Arrays.toString(arr));
                    }
                    return arr;
                } else {
                    return null;
                }

            }
        
            public void imprimir (int [] arr){
                for (int i : arr) {
                    System.out.print(" " + i);
                }
            }
        }
        
        
    
    


    

    
    


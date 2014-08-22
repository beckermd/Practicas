//19. Hacer el organigrama de un programa que dado un array A ordenado de N elementos,
// encuentre la posición de uno B leído por teclado.
//
//
//        El algoritmo a emplear es el siguiente:
//
//
//        1. Se fijan los extremos de la porción a buscar: I=1, J=N.
//        2. Se calcula el índice del elemento medio K=(I+J)/2.
//        3. Se compara B con el elemento medio A(K).
//        4. Si es igual se escribe K y se termina.
//        5. Si es mayor se cambian los extremos a I=K+1, J=N y se vuelve a 2.
//        6. Si es menor se cambian los extremos a I=1, J=K-1 y se vuelve a 2.
//////////////// Pensar!!
//        Pensar después que habrá que modificar para que busque también valores de B que no estén en el array A,
//          si se da ese caso y no lo encuentra debe poner un mensaje diciendo que no esta.
public class Posicion {

    public int[] listNum = {1, 2, 5, 7, 9, 10, 15, 45, 76};

    public static void main(String[] args) {
        Posicion posicion = new Posicion();
        posicion.buscar(3, 0, 8);

    }

    public void buscar(int num, int primer, int end) {

        int inicio = primer;
        int ultimo = end;
        int medio = (inicio + ultimo) / 2;

        if (num == listNum[0]) {
            System.out.println("The position of number: " + num + " is:  0");
        } else if (num == listNum[listNum.length - 1]) {
            System.out.println("The position of number: " + num + " is:  " + listNum.length);
        } else {
            while (medio > 1) {
                if (num == listNum[medio]) {
                    System.out.println("The position of number: " + num + " is:  " + medio);


                } else if (num > listNum[medio]) {

                    inicio = medio;
                    ultimo = listNum.length - 1;
                    buscar(num, inicio, ultimo);

                } else if (num < listNum[medio]) {
                    inicio = 0;
                    ultimo = medio + 1;

                    buscar(num, inicio, ultimo);
                }

                break;
            }

        }

    }
}


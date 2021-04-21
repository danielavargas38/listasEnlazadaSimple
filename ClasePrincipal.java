/*
Daniela Vargas Zuleta
Cc.1036686455
*/ 

package ListaEnlazadaSimple;

public class ClasePrincipal {

    public static void main(String[] args) {
        ListaEnlazadaSimple miLista = new ListaEnlazadaSimple();
        System.out.println(miLista.isVacia());
        miLista.agregarCabeza(124);        
        miLista.agregarUltimo(158); 
        miLista.anular();
        Nodo miPrimerNodo = new Nodo(24);
        Nodo miSegundoNodo = new Nodo(-64);
        miLista.setCabeza(miPrimerNodo);
        miPrimerNodo.setSiguiente(miSegundoNodo);
        System.out.println(miLista.isVacia());
        System.out.println(miLista.localizar(-64));
        System.out.println(miLista.localizar(80));
        miLista.recorrer();
        miLista.agregarEnPosicioni(0,5);
    }
}

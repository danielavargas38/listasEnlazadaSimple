/*
Daniela vargas zueta
CC. 1036686455
 */
package ListaEnlazadaSimple;

public class ListaEnlazadaSimple {
    private Nodo cabeza;
    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }
    public ListaEnlazadaSimple(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    public Nodo getCabeza() {
        return cabeza;
    }
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public boolean isVacia() {
        return this.cabeza==null;
    }

    public void anular() {
        this.cabeza = null;
    }
    public void recorrer(){
      Nodo nodoActual;
      if (this.cabeza != null){
          nodoActual = this.cabeza;
          System.out.println(nodoActual.getDato());
          while(nodoActual.getSiguiente() != null){
              nodoActual =nodoActual.getSiguiente();
              System.out.println(nodoActual.getDato());
          }
      }
    }
    public Nodo localizar(Integer x){
        Nodo nodoActual = this.cabeza;
        while (nodoActual != null){
            if(nodoActual.getDato().equals(x)){
                return nodoActual; 
            }
            nodoActual = nodoActual.getSiguiente(); 
        }
        return null ;
    }     
    public void agregarCabeza(Integer d){
        Nodo nuevoNodo = new Nodo(d);
        nuevoNodo.setSiguiente(this.cabeza);
        this.cabeza = nuevoNodo;
    }
    
    public void agregarUltimo(Integer d){
        Nodo nuevoNodo = new Nodo(d);
        if (isVacia()) {
            this.cabeza = nuevoNodo;
        }else{
            Nodo aux = this.cabeza ;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
        }
    }
    public void agregarEnPosicioni(int i,int d){
        Nodo aux = this.cabeza ;
        Integer contador = 0;
        while(aux.getSiguiente() != null){
            if(i == contador){
                aux.setDato(d);
                   i = d;   
                }
        contador += 1;
            aux = aux.getSiguiente();  
        }
    }    
    public void anularCabeza (){
         this.cabeza = null; 
    }    
    public void anularUltimo (){
         this.cabeza = null; 
    }    
}
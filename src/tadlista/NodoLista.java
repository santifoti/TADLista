
package tadlista;

public class NodoLista{
	private Object dato;
	private NodoLista sig;

    public NodoLista(Object dato) {
        this.dato = dato;
        this.sig = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoLista getSig() {
        return sig;
    }

    public void setSig(NodoLista sig) {
        this.sig = sig;
    }

 
}

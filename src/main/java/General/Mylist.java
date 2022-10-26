package General;

import java.util.ArrayList;
import java.util.Collections;

public class Mylist {
	private ArrayList<Integer> lista=new ArrayList<Integer>();
	public Mylist() {
		
	}
	public ArrayList<Integer> getLista() {
		return lista;
	}
	public int length() {return this.lista.size();}
	@Override
	public String toString() {
		return "Mylist [lista=" + lista + "]";
	}

	public void setLista(ArrayList<Integer> lista) {
		this.lista = lista;
	}
	public void add(int x) {
		this.lista.add(x);
	}
	public int pop() {
		return(this.lista.remove(this.lista.size()-1));
	}
	public void sort(int x) {
		if (x==0) { // ordine crescente
			Collections.sort(this.lista);
		}
		else {
			Collections.sort(this.lista,Collections.reverseOrder());
		}
	}
	public void clear() {
		this.lista.clear();
	}
	public int get(int x) {
		return this.lista.get(x);
	}

}

package PileGenerique;
/* 
 * Pile g�n�rique d'objets implant�e � l'aide d'un tableau
 */

 public class Stack<E> {
	private int maxElements = 1000;
	private E elements[];
	private int sommet;

	@SuppressWarnings("unchecked")
	public Stack() {
		this.elements = (E[]) new Object[maxElements];
		this.sommet = -1;
	}

	public void empiler(E nouvElem) {
		if (this.sommet == (this.maxElements - 1)) {
			System.out.println("Desole, la pile est pleine!");
		} else {
			// on empile l'�l�ment
			this.sommet = this.sommet + 1;
			this.elements[this.sommet] = nouvElem;
		}
	}

	public E depiler() {
		if (this.sommet < 0) {
			System.out.println("Errreur: la pile est vide, on ne peut pas depiler!");
			return ((E) null);
		} else {
			E elemDuHaut = this.elements[sommet];
			this.sommet = this.sommet - 1;
			return (elemDuHaut);
		}
	}

	public boolean estVide() {
		return (this.sommet == -1);
	}

	public E voir(){
		E elemSommet = depiler();
		empiler(elemSommet);
		return elemSommet;
	}
}

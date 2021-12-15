package Cell;

/*
 * * Progettare una classe di nome Cellulare, per rappresentare un telefono cellulare
 * con contratto a ricarica.
 * Tale classe prevede due variabili d'istanza. 
 * La prima variabile d'istanza e' definita come private double carica, e rappresenta il quantitativo di euro
 * disponibile per le chiamate. 
 * La seconda variabile d'istanza e' definita come private int numeroChiamate, e rappresenta il numero di chiamate effettuate con
 * il cellulare. 
 * La classe deve implementare un costruttore public Cellulare(double unaCarica), che prende come parametro esplicito la quantita' di euro della
 * ricarica iniziale. 
 * La classe deve inoltre implementare i seguenti metodi
 * 
 * Un metodo definito come public void ricarica(double unaRicarica), che ricarica il telefonino.
 * Un metodo definito come public void chiama(double minutiDurata), che effettua una chiamata di durata in minuti specificata dal parametro esplicito.
 * Tale metodo dovra' aggiornare la carica disponibile, ed incrementare la memoria
 * contenente il numero di chiamate effettuate dal telefonino. Si assuma un costo
 * di 0.20 euro per ogni minuto di chiamata. Un metodo public double numero404(),
 * che restituisce il valore della carica disponibile. 
 * Un metodo public intgetNumeroChiamate(), che restituisce il valore della variabile d'istanza
 * numeroChiamate. 
 * Infine, un metodo public void azzeraChiamate(), che azzera la
 * variabile contenente il numero di chiamate effettuate dal telefonino.
 * */

public class Cellulare {
	private double carica; //euro
	private int numeroChiamate; //n call effettuate
	
	public Cellulare(double carica) {
		this.carica = carica;
		this.numeroChiamate=0;
	}
	
	public void chiama(double minutiDurata) {
		//incremento numeroChiamate di 1 chiamata
		if(((int)this.carica)>0) {
			this.numeroChiamate++;
			
			double costo_chiamata = (double) (minutiDurata) * 0.2;
			this.carica-=costo_chiamata;
			System.out.println("\n---BIIIP---\n...\n...\nChiamata effettuata. "
					+ "La durata è stata di "+minutiDurata+" minuti.\n");

		}else {System.out.println("\nCredito residuo nullo. Ricaricare.\n");}
		
	}
	
	public double numero404() {
		return this.carica;
	}
	
	public int getNumeroChiamate() {
		return this.numeroChiamate;
	}
	
	public void azzerraChiamate() {
		this.numeroChiamate=0;
	}
	
	public void ricarica(double ricarica) {
		this.carica+=ricarica;
	}
}

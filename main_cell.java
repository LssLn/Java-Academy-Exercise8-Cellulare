package Cell;

import java.util.Random;
import java.util.Scanner;


public class main_cell {
	
	public static void menu() {
		System.out.println("\n\n--MENU'--\n");
		System.out.println("10] Menu'\n");
		System.out.println("1] Effettua chiamata\n");
		System.out.println("2] Fai una ricarica\n");
		System.out.println("3] Chiama il 404 per visualizzare il credito residuo\n");
		System.out.println("4] Visualizza numero minuti di chiamata totali\n");
		System.out.println("5] Azzera numero chiamate\n");
		System.out.println("0] Esci\n");
		System.out.println("--> Digita un numero: ");
	}
	public static void main(String[] args) {
		System.out.println("CELLULARE\nPer iniziare ad usare il cellulare, devi ricaricarlo. "
				+ "Di quanto vuoi la ricarica?\nI tagli disponibili sono multipli di 5.\t");
		
		Scanner scanner = new Scanner(System.in);
		double ricarica=0;
		do {
			ricarica = scanner.nextInt();
			if(!(ricarica % 5 ==0) ) {
				System.out.println("Taglio di ricarica non disponibile."
						+ "\nI tagli disponibili sono multipli di 5.");
			}
		}while(!(ricarica % 5 ==0));
		//ho la ricarica
		
		Cellulare cell = new Cellulare((double)ricarica);
		System.out.println("Il Cellulare è stato attivato, la Ricarica effettuata. Il credito è di: "
				+cell.numero404()+" EUR, le chiamate effettuate sono: "+cell.getNumeroChiamate());
		//menù
		int scelta=0;
		menu();

		do {
			scelta=scanner.nextInt();
			
			switch(scelta) {
			case 10:
				menu();
				break;
			case 1:
				Random random = new Random();
				int numminuti = random.nextInt(45);
				cell.chiama((double)numminuti);
				break;
			case 2:
				System.out.println("\nDi quanto vuoi fare la ricarica? ");
				do {
					ricarica = scanner.nextInt();
					if(!(ricarica % 5 ==0) ) {
						System.out.println("Taglio di ricarica non disponibile."
								+ "\nI tagli disponibili sono multipli di 5.\n");
					}
				}while(!(ricarica % 5 ==0));
				cell.ricarica((double)ricarica);
				System.out.println("\nLa ricarica di "+ricarica+" è stata fatta.\nCredito residuo: "
				+cell.numero404()+".\n");
				break;
			case 3:
				System.out.println("\nIl credito residuo è di: "+cell.numero404()+".\n");
				break;
			case 4:
				System.out.println("\nIl numero di chiamate effettuate è "+cell.getNumeroChiamate()+".\n");
				break;
			case 5:
				cell.azzerraChiamate();
				System.out.println("\nNumero chiamate azzerato."+cell.getNumeroChiamate()+".\n");
				break;
			case 0:
				System.out.println("\nAlla prossima.\n");
				break;
			default:
				System.out.println(scelta+"\n non è un opzione.\n");
			}
		}while(scelta!=0);
		
	}
}

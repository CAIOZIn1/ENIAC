import java.util.Scanner;

public class Trabalho_II{
	static void printPhraseDiscoded(int countTamDiscoded, String phraseCoded){
		int finalIntPhrase;
		char finalCharPhrase;
		
		System.out.print("Palavra descodada: ");
		
		for(int i  = 0; i < phraseCoded.length(); i++){
			if(phraseCoded.charAt(i) == 32){
				System.out.print(" ");
				continue;
			}
				
			finalIntPhrase = phraseCoded.charAt(i) - countTamDiscoded;
			finalCharPhrase =  (char)finalIntPhrase;
			
			System.out.printf("%s", finalCharPhrase);
		}
	}
	
	public static void main(String[] args){
		String phraseCoded, phraseDiscoded;
		int numberAsciiCoded, numberAsciiDiscoded = 0, countTamValue = 0, countValueCoded = 0;
		int aux = 0, i = 0;
		Scanner readPhrases = new Scanner(System.in);
		
		System.out.print("Digite a frase codificada: ");
		phraseCoded = readPhrases.nextLine();
		System.out.print("Digite a frase para decodificar: ");
		phraseDiscoded = readPhrases.nextLine();

		for(int a = 0; a < 26; a++){	
			for(int j = aux; j < phraseCoded.length(); j++){
				numberAsciiCoded = phraseCoded.charAt(j);
				
				numberAsciiDiscoded = phraseDiscoded.charAt(i) + countValueCoded;
				
				if(numberAsciiCoded == numberAsciiDiscoded){
					countTamValue++;
					i++;
					
					if(countTamValue == phraseDiscoded.length()){
						System.out.printf("Achei a palavra, numero de posicoes: %d\n", countValueCoded);
						printPhraseDiscoded(countValueCoded, phraseCoded);
						return;
					}
					continue;
				}
				countTamValue = 0;
				i = 0;
			}
			countValueCoded++;
			aux = 0;
		}
		System.out.print("Não achei :(");
	}
}

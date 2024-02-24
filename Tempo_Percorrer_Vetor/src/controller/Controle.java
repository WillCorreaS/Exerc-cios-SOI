package controller;

public class Controle {
    	public Controle() {
    		super();
    	}
    	
    	//Controle de tempo sobre 1000 posições
    	public void Vetor1000() {
    	    int[] vetor = new int[1000];

    	    double tempoInicial = System.nanoTime();

    	    // Percorrendo o vetor e preenchendo com 0
    	    for (int valor : vetor) {
    	        valor = 0;
    	    }

    	    double tempoFinal = System.nanoTime();
    	    double tempoTotal = tempoFinal - tempoInicial;
    	    double tempoTotalEmS = tempoTotal / Math.pow(10, 9);

    	    System.out.println("Vetor com 1000: " + tempoTotalEmS + " s");
    	}


		//Controle de tempo sobre 10000 posições
		public void Vetor10000() {
		    int[] vetor = new int[10000];
		
		    double tempoInicial = System.nanoTime();
		
		    // Percorrendo o vetor e preenchendo com 0
		    for (int valor : vetor) {
		        valor = 0;
		    }
		
		    double tempoFinal = System.nanoTime();
		    double tempoTotal = tempoFinal - tempoInicial;
		    double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		
		    System.out.println("Vetor com 10000: " + tempoTotalEmS + " s");
		}


		//Controle de tempo sobre 10000 posições
		public void Vetor100000() {
		    int[] vetor = new int[100000];
		
		    double tempoInicial = System.nanoTime();
		
		    // Percorrendo o vetor e preenchendo com 0
		    for (int valor : vetor) {
		        valor = 0;
		    }
		
		    double tempoFinal = System.nanoTime();
		    double tempoTotal = tempoFinal - tempoInicial;
		    double tempoTotalEmS = tempoTotal / Math.pow(10, 9);
		
		    System.out.println("Vetor com 100000: " + tempoTotalEmS + " s");
		}
}
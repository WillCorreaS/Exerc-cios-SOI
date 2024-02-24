package view;

import controller.Controle;

/*
* Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor de 1000
*posições inteiras (Preencher todas as posições com valor 0) e gere o tempo gasto, em
*Segundos, para percorrer o vetor. Repetir para 10000 e 100000 posições. A aplicação deve
*ter uma classe de controle com métodos para operações e uma classe de visão que instancie
*a classe de controle para a comunicação, A resposta da tarefa deve ser o print do console
*com cada tempo.
 */

public class Principal {

    public static void main(String[] args) {
    	//Declarando vetor
        Controle controle = new Controle();
        
        //Chamando os metodos
        controle.Vetor1000();
        controle.Vetor10000();
        controle.Vetor100000();
    }
}

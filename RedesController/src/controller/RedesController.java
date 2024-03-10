/*
	A classe RedesController.java deve ter 3 métodos.
	1) O primeiro, chamado os, que identifica e retorna o nome do Sistema Operacional (Fazê-lo
	privado)
	2) O segundo, chamado ip, que verifica o Sistema Operacional e, de acordo com o S.O., faz a
	chamada de configuração de IP.
	A leitura do processo chamado deve verificar cada linha e, imprimir, apenas, o nome do
	adaptador de rede e o IPv4, portanto, adaptadores sem IPv4 não devem ser mostrados
	
	
	3) O terceiro, chamado ping, que verifica o Sistema Operacional e, de acordo com o S.O. e, faz a
	chamada de ping em IPv4 com 10 iterações.
	A leitura do processo chamado deve verificar as linhas de saída e exibir, apenas, o tempo médio
	do ping. O teste de ping deve ser feito com a URL www.google.com.br
	A Classe Main.java deve dar as opções de chamadas do método ip ou do método ping com
	JOptionPane e, dependendo da escolha, instanciar a Classe RedesController.java e chamar o
	método escolhido. A opção de finalizar a aplicação também deve estar disponível.
	
	Dicas:
	1) Para validar o Sistema Operacional, utilizar a operação contains;
	2) Para validar as saídas e executar o que foi pedido, utiizar a operação Split;
	3) Processo de chamada de configuração de IP:
	Windows: IPCONFIG
	Linux: ifconfig ou ip addr
	4) Processo de chamada de PING com 10 iterações, em IPv4 para www.google.com.br
	Windows: ping -4 -n 10 www.google.com.br
	Linux: ping -4 -c 10 www.google.com.br
 */

package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RedesController{
	public RedesController () {
    	super();
    	}
	
	//Primeiro método
	public void os(){
		System.out.println("1° Método:");
		String os = System.getProperty("os.name");
		String ver = System.getProperty("os.version");
		String arch = System.getProperty("os.arch");
		
		System.out.println(os+ " - v. "+ ver + " - Arq. "+arch+"\n\n");
	}
	
	
	//Segundo método
	public void ip() throws IOException {
		String os = System.getProperty("os.name");
		System.out.println("2° Método:");
		System.out.println(os);
		
		
			
	        Process processo = Runtime.getRuntime().exec("ipconfig");

	        BufferedReader leitor = new BufferedReader(new InputStreamReader(processo.getInputStream()));
	        String linha;

	        while ((linha = leitor.readLine()) != null) {
	            System.out.println(linha);
	        }

	        int resultado = 0;
			try {
				resultado = processo.waitFor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	        System.out.println("Código de saída: " + resultado+"\n\n");
		
	}
	

	
	
	//Terceiro método
	public void ping() throws IOException {
		String os = System.getProperty("os.name");
		System.out.println("3° Método:");
		System.out.println(os);
	
		
		
	}
	

	
}

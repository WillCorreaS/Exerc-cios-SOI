package controller;

public class Controle {

    public int contarPartes(String texto) {
    	
    	//Utilizando Split para remover ';' do texto
        String[] partes = texto.split(";");
        return partes.length;
    }

}

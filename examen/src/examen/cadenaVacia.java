package examen;

import javax.swing.JOptionPane;

public class cadenaVacia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String texto=JOptionPane.showInputDialog(null, "ingrese texto" ,"cadena vacia para terminar",JOptionPane.INFORMATION_MESSAGE);

String cadenaResultante="";

while(!texto.isEmpty()) {
	cadenaResultante+=texto;
	
	 texto=JOptionPane.showInputDialog(null, "ingrese texto" ,"cadena vacia para terminar",JOptionPane.INFORMATION_MESSAGE);


}
JOptionPane.showInputDialog(null, cadenaResultante,"resultado",JOptionPane.INFORMATION_MESSAGE);


	}

}

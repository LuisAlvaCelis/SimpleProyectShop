package proyect.me.main;

import javax.swing.JOptionPane;
import proyect.me.codes.Codes;
import proyect.me.codes.CreateFile;
import proyect.me.view.Login;


public class MainClass {
    public static void main (String args []) throws Exception{
        if(CreateFile.getInstance().createFile() == true){
            new Login().setVisible(true);
        }else{
            Codes.getInstance().sendMessageError("Por favor, registre la base de datos antes de inciar el programa :D!");
        }
    }
}

package proyect.me.codes;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Codes {
    private static Codes instance;
    
    public static Codes getInstance(){
        if(instance == null){
            instance = new Codes();
        }
        return instance;
    }
    public void sendMessageError(String message){
        JOptionPane.showMessageDialog(null, message, "Error!", 0, new ImageIcon(getClass().getResource("/proyect/me/images/error32x32.png")));
    }
}

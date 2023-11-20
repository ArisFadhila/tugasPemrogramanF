package Tugas2;

import javax.swing.JOptionPane;

public class ifElseJOP {
    public static void main(String[]afd){
        String Username = JOptionPane.showInputDialog("username:");
        String Password = JOptionPane.showInputDialog("Password");

    if (Username != null && Password != null
        &&(
            (Username.equals("Aris")&& Password.equals("275")) ||
                    (Username.equals("Tif") && Password.equals("23"))
            )
            )
        {
            JOptionPane.showMessageDialog(null,"Youre in");
        }else{
            JOptionPane.showMessageDialog(null,"anda gagal");

        }
    }
}

import javax.swing.*;

public class asteriscos {
    public static void main(String[] args){
        // imprimir asteriscos
        // *
        // **
        // ***
        // ****

        String asterisco;
        int i;
        int cant =1;
        int limite= Integer.parseInt(JOptionPane.showInputDialog("ingresa cuantas lineas deseas imprimir"));
        while (cant<=limite){
            for(i=1;i<=cant;i++){
                System.out.print("*");
            }
            System.out.println(" ");
            cant=cant+1;
        }

    }
}

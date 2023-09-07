import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero entre 1 y 100"));

        try {
            evaluaNumero(num);
        } catch (MyCustomException e) {
            e.printStackTrace();
        }

    }

    static void evaluaNumero(int num) throws MyCustomException {
        if (num >= 1 && num <= 100) {
            System.out.println("Numero correcto");
        } else {
            throw new MyCustomException("El numero esta fuera de rango");
        }
    }
}
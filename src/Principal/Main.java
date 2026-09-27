package Principal;

import Vista.FormVideojuego;

public class Main {

    public static void main(String[] args) {

        FormVideojuego formulario = new FormVideojuego();

        formulario.setTitle("REGISTRO DE VIDEOJUEGOS");
        formulario.setLocationRelativeTo(null);
        formulario.setVisible(true);
    }
}
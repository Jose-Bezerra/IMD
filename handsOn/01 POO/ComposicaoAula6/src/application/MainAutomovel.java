package application;

import automovel.Automovel;
import automovel.Motor;

public class MainAutomovel {
    public static void main(String[] args) {

        /* 3º caso: Chamada fora da classe composta. */
        Automovel automovel = new Automovel();
        Motor motor = new Motor();
        automovel.setMotor(motor);
    }
}

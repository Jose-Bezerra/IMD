package automovel;

public class Main {
    public static void main(String[] args) {

        /* 3º caso: Chamada fora da classe composta. */
        Automovel automovel = new Automovel();
        Motor motor = new Motor();
        automovel.setMotor(motor);
    }
}

package automovel;

public class Automovel {
    private Motor motor;
    private Direcao direcao;

    /* O objeto automóvel é composto pelos objetos Motor e Direção
    * Então como definimos os construtores? */


    /* 1º caso: Chamada nos construtores da classe composta */

    public Automovel(){
        motor = new Motor();
    }

    public Automovel(int potencia){
        motor = new Motor(potencia);
    }

    /* 2º caso: Chamada nos métodos da classe composta */

    public void ligarPrimeiraVez(){
        motor = new Motor();
    }

    public void ligarPrimeiraVez(int potencia){
        motor = new Motor(potencia);
    }

    public Motor getMotor(){
        return this.motor;
    }

    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public Direcao getDirecao(){
        return this.direcao;
    }

    public void setDirecao( Direcao direcao){
        this.direcao = direcao;
    }

}

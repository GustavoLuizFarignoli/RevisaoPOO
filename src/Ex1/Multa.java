package Ex1;

import java.util.ArrayList;

public class Multa {
    private Carro carro;
    private float velomaxima = 50;
    private int multa = 0;

    public Multa(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public float getVelomaxima() {
        return velomaxima;
    }

    public void setVelomaxima(float velomaxima) {
        this.velomaxima = velomaxima;
    }

    public int multar(){
        double dif = carro.getVelocidade() - velomaxima;

        if ((dif) >= 31){
            this.multa = 347;
            return multa;
        }
        if ((dif) >= 11 && (dif) <= 30){
            this.multa = 183;
            return multa;
        }
        if ((dif) <= 10 && (dif) > 0){
            this.multa = 100;
            return multa;
        }
        return multa;
    }
}

package Ex4;

import java.time.LocalDateTime;

public class Pessoa {
    private int dia;
    private int mes;
    private int ano;
    private int idade = 0;

    public Pessoa(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int idade(){
        LocalDateTime now = LocalDateTime.now();
        this.idade = now.getYear() - ano;
        if (now.getMonthValue() < mes){
            this.idade -= 1;
        } else if (now.getMonthValue() == mes && now.getDayOfMonth() < dia) {
            this.idade -= 1;
        }
        return idade;
    }
}

package model;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nomeDono;
    private String nomeClinica;
    private String cnpj;
    private String endereco;
    private String codigoClinica;

    private List<Cliente> clientes = new ArrayList<>();

    public Double calculaImc(Double altura, Double peso){
        Double resultado = peso / Math.pow(altura, 2.0);
        if (resultado < 18.5){
            System.out.println("Abaixo do peso normal");
        } else if ( resultado >= 18.5 && resultado <= 24.9){
            System.out.println("Peso normal");
        } else if ( resultado >= 25.0 && resultado <= 29.9){
            System.out.println("Excesso de peso");
        } else if ( resultado >= 30.0 && resultado <= 34.9){
            System.out.println("Obesidade classe I");
        } else if ( resultado >= 35.0 && resultado <= 39.9){
            System.out.println("Obesidade classe II");
        } else {
            System.out.println("Obesidade classe III");
        }
        return resultado;
    }

}
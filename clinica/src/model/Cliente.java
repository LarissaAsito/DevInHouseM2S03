package model;

public class Cliente {
    private Double peso;
    private Double altura;
    private int idade;
    private String codigoCliente;

    public Cliente(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Cliente(Double peso, Double altura, int idade, String codigoCliente) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.codigoCliente = codigoCliente;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}


import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nomeDono;
    private String nomeClinica;
    private String cnpj;
    private String endereco;
    private String codigoClinica;

    private List<Cliente> clientes = new ArrayList<>();

    public Clinica(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public Clinica(String nomeDono, List<Cliente> clientes) {
        this.nomeDono = nomeDono;
        this.clientes = clientes;
    }

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

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCodigoClinica() {
        return codigoClinica;
    }

    public void setCodigoClinica(String codigoClinica) {
        this.codigoClinica = codigoClinica;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void tratamento(int id){
        clientes.get(id).setPeso(clientes.get(id).getPeso()+5.0);
        System.out.println("Novo peso: "+clientes.get(id).getPeso());
    }

    public void tratamento(int id, Double pesoReduzir){
        clientes.get(id).setPeso(clientes.get(id).getPeso()-pesoReduzir);
        System.out.println("Novo peso: "+clientes.get(id).getPeso());
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nomeClinica='" + nomeClinica + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}

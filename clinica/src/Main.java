public class Main {
    public static void main(String[] args) {

        Clinica clinica1 = new Clinica("Larissa");
        Clinica clinica2 = new Clinica("Teste 2");

        Cliente cliente1 = new Cliente(49.5, 1.63);
        Cliente cliente2 = new Cliente(50.0,1.69, 22, "123");
        Cliente cliente3 = new Cliente(56.2, 1.62);
        Cliente cliente4 = new Cliente(59.2, 1.72);

        clinica1.adicionarCliente(cliente1);
        clinica1.adicionarCliente(cliente3);

        clinica2.adicionarCliente(cliente2);
        clinica2.adicionarCliente(cliente4);

        System.out.println(clinica1);
        System.out.println(clinica2);

        clinica1.tratamento(0);
        clinica1.tratamento(1, 2.0);

        System.out.println(clinica1);
        System.out.println(clinica2);

    }
}
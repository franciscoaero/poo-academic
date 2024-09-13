package controle;

import modelo.Cliente;
import modelo.Veiculo;

public class Principal {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente1 = new Cliente("123.456.789-00", "João Silva", "Rua A, 123", "(11) 99999-9999", "joao@gmail.com");
        
        // Criando um veículo
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Civic", 2020, "Honda", "Preto");

        // Exibindo as informações
        System.out.println("Informações do Cliente:");
        cliente1.exibirInfoCliente();

        System.out.println("\nInformações do Veículo:");
        veiculo1.exibirInfoVeiculo();
    }
}

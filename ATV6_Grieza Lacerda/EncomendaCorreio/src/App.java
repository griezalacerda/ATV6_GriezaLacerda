public class App {
    public static void main(String[] args) throws Exception {

        Carta cartaA = new Carta (10001, "Rua Um, Nº 01", "Av. A, Nº 11", "CARTA SIMPLES");
        Carta cartaB = new Carta (10002, "Rua Dois, Nº 02", "Av. B, Nº 22", "CARTA REGISTRADA");

        Conta contaA = new Conta (20001, "Rua Três, Nº 03", "Av. C, Nº 33", "CONTA DE TELEFONE", 2021, 6);
        Conta contaB = new Conta (20002, "Rua Quatro, Nº 04", "ENDEREÇO DESTINATÁRIO, Nº 44", "CONTA DE LUZ", 2021, 6);

        Pacote pacoteA = new Pacote (30001, "Rua Cinco, Nº 05", "Av. D, Nº 55", 2.500, 0.50, 1.25);
        Pacote pacoteB = new Pacote (30002, "Rua Seis, Nº 06", "Av. E, Nº 66", 1.150, 0.75, 1.0);
        
        gerarCodigoRastreamento(cartaA);
        gerarCodigoRastreamento(cartaB);
        gerarCodigoRastreamento(contaA);
        gerarCodigoRastreamento(contaB);
        gerarCodigoRastreamento(pacoteA);
        gerarCodigoRastreamento(pacoteB);

    }

    public static void gerarCodigoRastreamento(Enderecavel endereco) {
        System.out.println("\n* Código de Rastreio: " + endereco.getCodigoRastreio() +
                           "\n* Endereço Remetente: " + endereco.getEnderecoRemetente() +
                           "\n* Endereço Destinatário: " + endereco.getEnderecoDestinatario());
    }
}

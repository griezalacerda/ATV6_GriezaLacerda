public class Carta implements Enderecavel {
    private int codigoRastreio;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private String texto;
    
    public Carta(int codigoRastreio, String enderecoRemetente, String enderecoDestinatario, String texto) {
        this.codigoRastreio = codigoRastreio;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.texto = texto;
    }

    @Override
    public int getCodigoRastreio() {
        return codigoRastreio;
    }

    @Override
    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    @Override
    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public String getTexto() {
        return texto;
    }
}
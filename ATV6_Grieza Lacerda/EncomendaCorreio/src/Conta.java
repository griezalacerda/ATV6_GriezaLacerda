public class Conta implements Enderecavel {
    private int codigoRastreio;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private String titulo;
    private int ano;
    private int mes;

    public Conta(int codigoRastreio, String enderecoRemetente, String enderecoDestinatario, String titulo, int ano, int mes) {
        this.codigoRastreio = codigoRastreio;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.titulo = titulo;
        this.ano = ano;
        this.mes = mes;
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

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }
}

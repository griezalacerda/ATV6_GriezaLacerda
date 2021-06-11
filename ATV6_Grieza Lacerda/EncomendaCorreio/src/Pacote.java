public class Pacote implements Enderecavel {
    private int codigoRastreio;
    private String enderecoRemetente;
    private String enderecoDestinatario;
    private double peso;
    private double altura;
    private double largura;
    
    public Pacote(int codigoRastreio, String enderecoRemetente, String enderecoDestinatario, double peso, double altura, double largura) {
        this.codigoRastreio = codigoRastreio;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
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

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
}

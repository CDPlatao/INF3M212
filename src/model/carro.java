package model;

public class carro {

    private String tpcambio;
    private String tpdirecao;
    private String placa;
    private String renavam;
    private String marca;
    private String modelo;
    private float motorizacao;
    private int anofabricacao;
    private int anomodelo;

    /**
     * Construtor Vazio
     */
    public carro() {

    }// Carro

    public carro(String tpcambio, String tpdirecao, String placa, String renavam, String marca, String modelo,
            float motorizacao, int anofabricacao, int anomodelo) {
        this.tpcambio = tpcambio;
        this.tpdirecao = tpdirecao;
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.motorizacao = motorizacao;
        this.anofabricacao = anofabricacao;
        this.anomodelo = anomodelo;
    }// Carro String

    public String getTpcambio() {
        return tpcambio;
    }

    public void setTpcambio(String tpcambio) {
        this.tpcambio = tpcambio;
    }

    public String getTpdirecao() {
        return tpdirecao;
    }

    public void setTpdirecao(String tpdirecao) {
        this.tpdirecao = tpdirecao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(float motorizacao) {
        this.motorizacao = motorizacao;
    }

    public int getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(int anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public int getAnomodelo() {
        return anomodelo;
    }

    public void setAnomodelo(int anomodelo) {
        this.anomodelo = anomodelo;
    }

    @Override
    public String toString() {
        return "Carro " + "| Tipo de cambio:" + tpcambio + "| Tipo de direção:" + tpdirecao + "| Placa:" + placa + "| Renavam:"
                + renavam + "| Marca:" + marca + "| Modelo:" + modelo + "| Motorizacao:" + motorizacao
                + "| Ano de fabricação:" + anofabricacao + "| Ano do modelo:" + anomodelo;
    }
}// Class
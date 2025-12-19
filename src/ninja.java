public class ninja {
    private String nome;
    private String cla;
    private String vila;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setCla(String cla) {
        this.cla = cla;
    }
    public String getCla() {
        return cla;
    }
    public void setVila(String vila) {
        this.vila = vila;
    }
    public String getVila() {
        return vila;
    }


    public void estiloDeLuta(){
        System.out.println("Eu sou um ninja e sei lutar");
    }
}

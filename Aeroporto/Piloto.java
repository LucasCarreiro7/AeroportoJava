package Aeroporto;

public class Piloto {
    // ATRIBUTOS
    private String nome;
    private int cadastro;
    private int idade;
    private String nacionalidade;
    private int tempoDeServico;
    private double distanciaPercorrida;
    private boolean emSolo;

    // CONSTRUTOR
    public Piloto(String nome, int cadastro, int idade, String nacionalidade, int tempoDeServico, double distanciaPercorrida) {
        this.nome = nome;
        this.cadastro = cadastro;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.tempoDeServico = tempoDeServico;
        this.distanciaPercorrida = distanciaPercorrida;
        this.emSolo = true;
    }

    // MÉTODOS ACESSORES
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getCadastro() { return cadastro; }
    public void setCadastro(int cadastro) { this.cadastro = cadastro; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public int getTempoDeServico() { return tempoDeServico; }
    public void setTempoDeServico(int tempoDeServico) { this.tempoDeServico = tempoDeServico; }

    public double getDistanciaPercorrida() { return distanciaPercorrida; }
    public void setDistanciaPercorrida(double distanciaPercorrida) { this.distanciaPercorrida = distanciaPercorrida; }

    public boolean isEmSolo() { return emSolo; }
    public void setEmSolo(boolean emSolo) { this.emSolo = emSolo; }

    // MÉTODOS
    public void exibirPiloto() {
        System.out.println("PILOTO:" + "\nNOME: " + getNome() + "\nCADASTRO: " + getCadastro() + "\nIDADE: " + getIdade() +
                "\nNACIONALIDADE: " + getNacionalidade() + "\nTEMPO DE SERVIÇO: " + getTempoDeServico() + " ANOS" +
                "\nHORAS DE VOO: " + getDistanciaPercorrida() + "\nEM SOLO NO MOMENTO: " + isEmSolo());
    }
}

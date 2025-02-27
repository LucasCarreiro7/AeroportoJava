package Aeroporto;

public class Aeronave {
    // ATRIBUTOS
    private String fabricante;
    private String modelo;
    private String companhiaAerea;
    private int capacidadePassageiros;
    private boolean emSolo;

    // CONSTRUTOR
    public Aeronave(String fabricante, String modelo, String companhiaAerea, int capacidadePassageiros) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.companhiaAerea = companhiaAerea;
        this.capacidadePassageiros = capacidadePassageiros;
        this.emSolo = true;
    }

    // MÉTODOS ACESSORES
    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCompanhiaAerea() { return companhiaAerea; }
    public void setCompanhiaAerea(String companhiaAerea) { this.companhiaAerea = companhiaAerea; }

    public int getCapacidadePassageiros() { return capacidadePassageiros; }
    public void setCapacidadePassageiros(int capacidadePassageiros) { this.capacidadePassageiros = capacidadePassageiros; }

    public boolean isEmSolo() { return emSolo; }
    public void setEmSolo(boolean emSolo) { this.emSolo = emSolo; }

    // MÉTODOS
    public void exibirAeronave() {
        System.out.println("AERONAVE: " + "\nFABRICANTE: " + getFabricante() + "\nMODELO: " + getModelo() + "COMPANHIA AÉREA: " +
                getCompanhiaAerea() + "\nCAPACIDADE MÁXIMA DE PASSAGEIROS: " + getCapacidadePassageiros() +
                "\nEM SOLO NO MOMENTO: " + isEmSolo());
    }
}

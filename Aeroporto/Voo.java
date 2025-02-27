package Aeroporto;

import java.util.Scanner;

public class Voo {
    private String destino;
    private String horarioDaDecolagem;
    private String duracao;
    private Aeronave aeronave;
    private Piloto piloto;
    private int distancia;
    private int passageiros;
    private float valorPassagem;
    private boolean autorizado;
    private boolean emAndamento;

    public Voo(Aeronave aeronave, Piloto piloto) {
        this.aeronave = aeronave;
        this.piloto = piloto;
        this.autorizado = false;
        this.emAndamento = false;
    }

    // MÉTODOS ACESSORES
    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public String getHorarioDaDecolagem() { return horarioDaDecolagem; }
    public void setHorarioDaDecolagem(String horarioDaDecolagem) { this.horarioDaDecolagem = horarioDaDecolagem; }

    public String getDuracao() { return duracao; }
    public void setDuracao(String duracao) { this.duracao = duracao; }

    public Aeronave getAeronave() { return aeronave; }
    public void setAeronave(Aeronave aeronave) { this.aeronave = aeronave; }

    public Piloto getPiloto() { return piloto; }
    public void setPiloto(Piloto piloto) { this.piloto = piloto; }

    public int getDistancia() { return distancia; }
    public void setDistancia(int distancia) { this.distancia = distancia; }

    public int getPassageiros() { return passageiros; }
    public void setPassageiros(int passageiros) { this.passageiros = passageiros; }

    public float getValorPassagem() { return valorPassagem; }
    public void setValorPassagem(float valorPassagem) { this.valorPassagem = valorPassagem; }

    public boolean isAutorizado() { return autorizado; }
    public void setAutorizado(boolean autorizado) { this.autorizado = autorizado; }

    public boolean isEmAndamento() { return emAndamento; }
    public void setEmAndamento(boolean emAndamento) { this.emAndamento = emAndamento; }

    // MÉTODOS
    public void exibirVoo() {
        System.out.println("VOO: Fortaleza-" + getDestino() + "\nHORÁRIO DA DECOLAGEM: " + getHorarioDaDecolagem() +
                "\nDURAÇÃO DO VOO: " + getDuracao() + "\nDISTÂNCIA: " + getDistancia() + " KM" + "\nAERONAVE: " +
                aeronave.getModelo() + "\nPILOTO: " + piloto.getNome() + "\nNÚMERO DE PASSAGEIROS: " +
                getPassageiros() + "\nAUTORIZADO: " + isAutorizado() + "\nEM ANDAMENTO: " + isEmAndamento());
    }

    private void selecionarDestino() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("SELECIONAR DESTINO DO VOO:");
        System.out.println("1: VOO DOMÉSTICO - 2: VOO INTERNACIONAL");
        switch (teclado.nextInt()) {
            case 1:
            System.out.println("1: SÃO PAULO - 2: RIO DE JANEIRO - 3: BELO HORIZONTE - 4: BRASÍLIA - " + 
            "5: RECIFE \n6: SALVADOR - 7: PORTO ALEGRE - 8: FLORIANÓPOLIS - 9: MANAUS - 10: BELÉM");
            switch (teclado.nextInt()) {
                case 1:
                    System.out.println("DESTINO SELECIONADO: SÃO PAULO.");
                    this.destino = "São Paulo";
                    this.distancia = 2370;
                    this.duracao = "3:30h";
                    this.valorPassagem = 1200;
                    break;
                case 2:
                    System.out.println("DESTINO SELECIONADO: RIO DE JANEIRO.");
                    this.destino = "Rio de Janeiro";
                    this.distancia = 2190;
                    this.duracao = "3:30h";
                    this.valorPassagem = 1500;
                    break;
                case 3:
                    System.out.println("DESTINO SELECIONADO: BELO HORIZONTE.");
                    this.destino = "Belo Horizonte";
                    this.distancia = 1890;
                    this.duracao = "2:45h";
                    this.valorPassagem = 1600;
                    break;
                case 4:
                    System.out.println("DESTINO SELECIONADO: BRASÍLIA.");
                    this.destino = "Brasília";
                    this.distancia = 1690;
                    this.duracao = "2:35h";
                    this.valorPassagem = 1400;
                    break;
                case 5:
                    System.out.println("DESTINO SELECIONADO: RECIFE.");
                    this.destino = "Recife";
                    this.distancia = 630;
                    this.duracao = "1:15h";
                    this.valorPassagem = 900;
                    break;
                case 6:
                    System.out.println("DESTINO SELECIONADO: SALVADOR.");
                    this.destino = "Salvador";
                    this.distancia = 1015;
                    this.duracao = "1:50h";
                    this.valorPassagem = 1100;
                    break;
                case 7:
                    System.out.println("DESTINO SELECIONADO: PORTO ALEGRE.");
                    this.destino = "Porto Alegre";
                    this.distancia = 3215;
                    this.duracao = "5:45h";
                    this.valorPassagem = 1250;
                    break;
                case 8:
                    System.out.println("DESTINO SELECIONADO: FLORIANÓPOLIS.");
                    this.destino = "Florianópolis";
                    this.distancia = 2860;
                    this.duracao = "5:20h";
                    this.valorPassagem = 1750;
                    break;
                case 9:
                    System.out.println("DESTINO SELECIONADO: MANAUS.");
                    this.destino = "Manaus";
                    this.distancia = 2400;
                    this.duracao = "3:25h";
                    this.valorPassagem = 1400;
                    break;
                case 10:
                    System.out.println("DESTINO SELECIONADO: BELÉM.");
                    this.destino = "Belém";
                    this.distancia = 1150;
                    this.duracao = "2:00h";
                    this.valorPassagem = 900;
                    break;
                default:
                    System.out.println("SELECIONE UMA OPÇÃO VÁLIDA.");
                
            }
            break;
            case 2:
            System.out.println("1: LISBOA - 2: MADRID - 3: BARCELONA - 4: LONDRES - " + 
            "5: PARIS \n6: ROMA - 7: BERLIM - 8: NOVA IORQUE - 9: MIAMI");
            switch (teclado.nextInt()) {
                case 1:
                    System.out.println("DESTINO SELECIONADO: LISBOA.");
                    this.destino = "Lisboa";
                    this.distancia = 5600;
                    this.duracao = "7:00h";
                    this.valorPassagem = 5000;
                    break;
                case 2:
                    System.out.println("DESTINO SELECIONADO: MADRID.");
                    this.destino = "Madrid";
                    this.distancia = 6090;
                    this.duracao = "7:55h";
                    this.valorPassagem = 6100;
                    break;
                case 3:
                    System.out.println("DESTINO SELECIONADO: BARCELONA.");
                    this.destino = "Barcelona";
                    this.distancia = 6500;
                    this.duracao = "9:30h (Com escalas)";
                    this.valorPassagem = 6000;
                    break;
                case 4:
                    System.out.println("DESTINO SELECIONADO: LONDRES.");
                    this.destino = "Londres";
                    this.distancia = 7130;
                    this.duracao = "12:45h (Com escalas)";
                    this.valorPassagem = 5500;
                    break;
                case 5:
                    System.out.println("DESTINO SELECIONADO: PARIS.");
                    this.destino = "Paris";
                    this.distancia = 7050;
                    this.duracao = "13:30h";
                    this.valorPassagem = 6000;
                    break;
                case 6:
                    System.out.println("DESTINO SELECIONADO: ROMA.");
                    this.destino = "Roma";
                    this.distancia = 7220;
                    this.duracao = "12:20h (Com escalas)";
                    this.valorPassagem = 5600;
                    break;
                case 7:
                    System.out.println("DESTINO SELECIONADO: BERLIM.");
                    this.destino = "Berlim";
                    this.distancia = 7910;
                    this.duracao = "12:50h (Com escalas)";
                    this.valorPassagem = 7000;
                    break;
                case 8:
                    System.out.println("DESTINO SELECIONADO: NOVA IORQUE.");
                    this.destino = "Nova Iorque";
                    this.distancia = 6110;
                    this.duracao = "12:20h (Com Escalas)";
                    this.valorPassagem = 3500;
                    break;
                case 9:
                    System.out.println("DESTINO SELECIONADO: MIAMI.");
                    this.destino = "Miami";
                    this.distancia = 5500;
                    this.duracao = "7:40h";
                    this.valorPassagem = 2600;
                    break;
            
                default:
                    System.out.println("SELECIONE UMA OPÇÃO VÁLIDA.");
                    break;
            }
            default:
            System.out.println("SELECIONE UMA OPÇÃO VÁLIDA.");
        }
        teclado.close();
    }

    private void decolar() {
        this.emAndamento = true;
        aeronave.setEmSolo(false);
        piloto.setEmSolo(false);
        piloto.setDistanciaPercorrida(piloto.getDistanciaPercorrida() + distancia);
        System.out.println("\nDECOLAGEM EM ANDAMENTO.");
    }

    public void configurarVoo() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("CONFIGURAR VOO: ");
        System.out.print("HORÁRIO DO VOO:");
        this.horarioDaDecolagem = teclado.nextLine();
        System.out.print("QUANTIDADE DE PASSAGEIROS:");
        this.passageiros = teclado.nextInt();
        while (this.passageiros > aeronave.getCapacidadePassageiros()) {
            System.out.println("A quantidade de passageiros inserida é maior do que a capacidade máxima da aeronave. Por favor tente novamente");
            System.out.print("QUANTIDADE DE PASSAGEIROS:");
            this.passageiros = teclado.nextInt();
        }
        selecionarDestino();
        if (aeronave.isEmSolo() && piloto.isEmSolo()) {
            this.autorizado = true;
            System.out.println("STATUS DO VOO: Autorizado.");
            exibirVoo();
            decolar();
        } else {
            System.out.println("STATUS DO VOO: Não Autorizado.");
        }
        teclado.close();
    }
    
}

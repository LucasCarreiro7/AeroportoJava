package Aeroporto;

public class Main {
    public static void main(String[] args) {
    Piloto piloto1 = new Piloto("John Doe", 1, 70, "Inglês", 45, 300000);
    // Piloto piloto2 = new Piloto("Rafael Lopes", 2, 41, "Brasileiro", 14, 140000);

    Aeronave aeronave1 = new Aeronave("Boeing", "Boeing 737", "LATAM", 215);

    Voo voo1 = new Voo(aeronave1, piloto1);
    voo1.configurarVoo();

    }

}

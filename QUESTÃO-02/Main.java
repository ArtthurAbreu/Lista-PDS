import builder.SanduicheBuilder;
import criadoresConcretos.LanchoneteCGFactory;
import criadoresConcretos.LanchoneteJPFactory;
import criadoresConcretos.LanchoneteRTFactory;
import modelo.Sanduiche;

public class Main {
    public static void main(String[] args) {
        SanduicheBuilder builder = new SanduicheBuilder();

        // Cria um sanduíche da Lanchonete Campina Grande
        LanchoneteCGFactory LanchoneteCGFactory = new LanchoneteCGFactory();
        Sanduiche LanchoneteCG = builder.montaSanduiche(LanchoneteCGFactory);
        System.out.println("\n\nLanchonete Campina Grande: " + LanchoneteCG);

        // Cria um sanduíche da Lanchonete João Pessoa
        LanchoneteJPFactory LanchoneteJPFactory = new LanchoneteJPFactory();
        Sanduiche LanchoneteJP = builder.montaSanduiche(LanchoneteJPFactory);
        System.out.println("Sanduíche João Pessoa: " + LanchoneteJP);

        // Cria um sanduíche da Lanchonete Rio Tinto
        LanchoneteRTFactory LanchoneteRTFactory = new LanchoneteRTFactory();
        Sanduiche LanchoneteRT = builder.montaSanduiche(LanchoneteRTFactory);
        System.out.println("Sanduíche X-Tudo: " + LanchoneteRT);
    }
}

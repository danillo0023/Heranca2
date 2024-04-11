package heranca.exercicio2;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe() {
        super();
        this.patas = 0;
        this.ambiente = "Mar";
        this.cor = "Cinzento";
        this.caracteristica = "Barbatanas e cauda";
    }

    public Peixe(String nome, int comprimento, String caracteristica) {
        super(nome, comprimento, "Cinzento", "Mar", 1.5f);
        this.patas = 0;
        this.caracteristica = caracteristica;
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Caracteristica: " + caracteristica);
    }
}
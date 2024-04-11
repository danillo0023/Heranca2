package heranca.exercicio2;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        this.ambiente = "Terra";
    }

    public Mamifero(String nome, int comprimento, String cor, String alimento) {
        super(nome, comprimento, cor, "Terra", 0.5f);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}
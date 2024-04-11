package heranca.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {

        // Criando um jardim zoológico (lista de animais)
        List<Animal> zoo = new ArrayList<>();
        // Adicionando animais ao jardim zoológico
        zoo.add(new Animal("Camelo", 150, "Amarelo", "deserto",2.0f));
        zoo.add(new Peixe("Tubarão", 300, "Barbatanas e cauda"));
        zoo.add(new Mamifero("Urso-do-Canadá", 180, "Vermelho", "Mel"));

        // Imprimindo dados do zoo
        System.out.println("Zoo:");
        for (Animal animal : zoo) {
            animal.dados();
            System.out.println();
        }
    }
}


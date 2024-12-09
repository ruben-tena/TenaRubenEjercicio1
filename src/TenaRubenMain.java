import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TenaRubenMain {
    public static void main(String[] args) {
        List<String> hobbies = Arrays.asList("🎮 Gaming", "🎨 Pintura", "📚 Lectura");
        List<String> foods = Arrays.asList("🍕 Pizza", "🍣 Sushi", "🍔 Hamburguesas");
        List<String> funFacts = Arrays.asList(
                "Hablo mas de tres idiomas.",
                "Me gusta coleccionar monedas y sellos.",
                "Mi color favorito es el negro."
        );
        TenaRubenPerfil perfil = new TenaRubenPerfil("Rubén Tena", "Soy un amante de la tecnología y las rutas al aire libre.", hobbies, foods, funFacts);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu AboutMe [" + perfil.getName() + "]");
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Fact");
            System.out.println("[4] Salir");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Opción no válida, por favor ingrese un número.");
                scanner.next();
            }
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println(perfil.showStory());
                    break;
                case 2:
                    System.out.println(perfil.showFavorites());
                    break;
                case 3:
                    System.out.println(perfil.showFunFact());
                    break;
                case 4:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida, por favor seleccione una opción del menú.");
                    break;
            }
        } while (option != 4);

        scanner.close();
    }
}


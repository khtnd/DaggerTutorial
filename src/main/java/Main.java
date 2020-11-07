import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandRouterFactory commandRouterFactory =
                DaggerCommandRouterFactory.create();
        CommandRouter commandRouter = commandRouterFactory.router();

        System.out.println(commandRouter.getClass().getSimpleName());

        while (scanner.hasNextLine()) {
            commandRouter.route(scanner.nextLine());
        }
    }
}

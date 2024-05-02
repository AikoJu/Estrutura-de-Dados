public class Teste {
    public static void main(String[] args) {
        String nome01 = "Julya";
        Double nota01 = 9.5;
        int ra01 = 5000;

        String nome02 = "Peterson";
        Double nota02 = 9.0;
        int ra02 = 5002;

        System.out.printf("%-10S %-7S %8S\n","nome","ra","nota");
        System.out.printf("%-10s %-7d %8.2f\n",nome01,ra01,nota01);
        System.out.printf("%-10s %-7d %8.2f\n",nome02,ra02,nota02);
    }
}

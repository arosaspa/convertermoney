
public class CoinConverter  {
    public static void main(String[] args) {
        String welcome = """
                *****************************************************
                *******       Welcome to Coin Converter     *********
                *****************************************************
                
                => Please!
                Read the number of the coin to converter to Yuan ¥
                
                 #   |    Coin List     |     ¥
                 ---------------------------------- 
                 1  --->  Dollar...$    to  Yuan ¥
                 2  --->  Bitcoin..₿    to  Yuan ¥
                 3  --->  Rublo....₽    to  Yuan ¥
                 4  --->  Euro.....€    to  Yuan ¥
                 
                 100 --> Exit "X"
                """;
        System.out.println(welcome);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Enter the number of the coin to convert (1-4, 100 to exit): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount of Dollars ($): ");
                    double dollars = scanner.nextDouble();
                    double yuanFromDollars = dollars * 7.0; // Assuming 1 USD = 7 CNY
                    System.out.printf("%.2f Dollars ($) is equal to %.2f Yuan (¥)%n", dollars, yuanFromDollars);
                    break;
                case 2:
                    System.out.print("Enter the amount of Bitcoin (₿): ");
                    double bitcoin = scanner.nextDouble();
                    double yuanFromBitcoin = bitcoin * 300000.0; // Assuming 1 BTC = 300,000 CNY
                    System.out.printf("%.8f Bitcoin (₿) is equal to %.2f Yuan (¥)%n", bitcoin, yuanFromBitcoin);
                    break;
                case 3:
                    System.out.print("Enter the amount of Rubles (₽): ");
                    double rubles = scanner.nextDouble();
                    double yuanFromRubles = rubles * 0.12; // Assuming 1 RUB = 0.12 CNY
                    System.out.printf("%.2f Rubles (₽) is equal to %.2f Yuan (¥)%n", rubles, yuanFromRubles);
                    break;
                case 4:
                    System.out.print("Enter the amount of Euros (€): ");
                    double euros = scanner.nextDouble();
                    double yuanFromEuros = euros * 7.5; // Assuming 1 EUR = 7.5 CNY
                    System.out.printf("%.2f Euros (€) is equal to %.2f Yuan (¥)%n", euros, yuanFromEuros);
                    break;
                case 100:
                    running = false;
                    System.out.println("Exiting Coin Converter...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}





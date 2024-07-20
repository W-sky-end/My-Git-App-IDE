package app;

public class Shop3thLesson {


        private static final String CURR_EUR = "EUR";
        static double priceSmartphone;
        static double priceLaptop;
        static int daysForPhone;
        static int daysForLaptop;
        static double avaragePhone;
        static double avarageLaptop;
        static double totalPhone;
        static double totalLaptop;

        // на сколько я понял в ТЗ средняя продажа техники в день это 1 штука, поэтому
        // такого понятия как кол-во продаж в целом я не делаю, так как кол-во продаж = кол-во дней
        // Это первый вариант согласно ТЗ
        public static void main(String[] args) {

            priceSmartphone = 2430.68;
            daysForPhone = 5;
            totalPhone = priceSmartphone * daysForPhone;
            avaragePhone = (double) (priceSmartphone * daysForPhone) / 5;
            priceLaptop = 1498.12;
            daysForLaptop = 7;
            totalLaptop = priceLaptop * daysForLaptop;
            avarageLaptop = (double) (priceLaptop * daysForLaptop) / 7;
            System.out.printf("Product No 1: smartphone," + "\nTotal sales for " + daysForPhone + " is " + CURR_EUR + " " +
                    totalPhone + "\nSales by day is " + CURR_EUR + " " + avaragePhone + "\nProduct No 2: laptop," +
                    "\nTotal sales for" + daysForLaptop + " is " + CURR_EUR + " " + totalLaptop + "\nSales by day is " +
                    CURR_EUR + " %.2f", avarageLaptop);

            //это второй вариант скажем так который не относится на прямую к ТЗ, однако мне кажется он более удобным для п
            // пользователя, данные ввел тут сам так же как и вы можете для проверки....
  /*  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the price of the phone? Please enter:");
        double pricePhone = scanner.nextDouble();
        System.out.println("How many phones were sold? Please enter:");
        int quantityPhones = scanner.nextInt();
        System.out.println("How many days was the phone sale? Please enter:");
        int quantityPhoneDays = scanner.nextInt();

        System.out.println("What is the price of the laptop? Please enter:");
        double priceLaptop = scanner.nextDouble();
        System.out.println("How many laptops were sold? Please enter:");
        int quantityLaptops = scanner.nextInt();
        System.out.println("How many days was the laptop sale? Please enter:");
        int quantityLaptopsDays = scanner.nextInt();

        double totalPhone = pricePhone * quantityPhones ;
        double averagePhone =  quantityPhones * pricePhone / quantityPhoneDays;

        double totalLaptop = priceLaptop * quantityLaptops ;
        double averageLaptop =   quantityLaptops * priceLaptop / quantityLaptopsDays;

        System.out.printf("Product No 1: smartphone:" + "\ntotal sales for " + quantityPhoneDays + " days is EUR :%.2f" +
                "\nsales by day is EUR %.2f", totalPhone, averagePhone);
        System.out.printf("\nProduct No 1: laptop:" + "\ntotal sales for " + quantityLaptopsDays +" days is EUR : %.2f" +
                "\nsales by day is EUR %.2f", totalLaptop, averageLaptop);
*/
        }
    }


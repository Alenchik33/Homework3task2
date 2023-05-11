public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        double heightInMeters = 1.87;
        int result = service.calculate(int weightKg, double heightInMeters);
        System.out.println(result);

        int result = service.calculate(58, 160);
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
        long price = 5000;
        int priceBonus = 20;
        int customerBonus = 1;
        long totalBonus = price / priceBonus * customerBonus;
        System.out.println(totalBonus);
    }}

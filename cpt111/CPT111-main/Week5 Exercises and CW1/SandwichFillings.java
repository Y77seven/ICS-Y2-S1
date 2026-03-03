public class SandwichFillings {
    public static void main(String[] args) {
        System.out.println(sandwichFillings("breadtunabread"));
        System.out.println(sandwichFillings("chipsbreadtunasalad"));
    }
    public static String sandwichFillings(String sandwich) {
        int bread1 = sandwich.indexOf("bread");
        int bread2 = sandwich.lastIndexOf("bread", bread1+1);
        if (bread1 == -1 || bread2 == -1 || bread1 == bread2) {
            return "none";
        }
        return sandwich.substring(bread1 + 5, bread2);
    }
}

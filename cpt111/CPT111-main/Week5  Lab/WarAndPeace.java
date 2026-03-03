public class WarAndPeace {
    public static void main(String[] args) {
        System.out.println(warAndPeace("there was never a good war, or a bad peace"));
        System.out.println(warAndPeace("war what is it good for"));
    }

    public static boolean warAndPeace(String text) {
        int numWar  = 0;
        int numPeace = 0;
        int warIndex = 0;
        int peaceIndex = 0;
        while ((warIndex = text.indexOf("war",warIndex)) != -1) {
            numWar++;
            warIndex += 3;
        }
        while ((peaceIndex = text.indexOf("peace",peaceIndex)) != -1) {
            numPeace++;
            peaceIndex += 5;
        }
        return numWar == numPeace;
    }
}

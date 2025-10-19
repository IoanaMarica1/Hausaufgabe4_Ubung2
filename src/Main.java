public class Main {
    public static void main(String[] args) {
        ArrayOperations a = new ArrayOperations();
        int[] Zahlen = {4, 8, 3, 10, 17};
        System.out.print("Zahlen:");
        for(int n:Zahlen)
            System.out.print(n+" ");
        System.out.println();
        int max = a.maximaleZahl(Zahlen);
        System.out.println("Maximale Zahl: " + max);
        int min = a.minimaleZahl(Zahlen);
        System.out.println("Minimale Zahl: " + min);
        int maxsum = a.maximaleSum(Zahlen);
        System.out.println("Maximale Summe: " + maxsum);
        int minsum = a.minimaleSum(Zahlen);
        System.out.println("Minimale Summe: " + minsum);
    }
}

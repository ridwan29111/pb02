package src.tutorial.ridwan;

public class main {
    public static void main(String[] args) {
        hewan a = new hewan();
        manusia b = new manusia();
        telepone c = new telepone();

        // manusia bermain hewan
        System.out.println(b.bermain("Manusia bermain") + (a.bermain(" hewan")));
        // hewan bermain bola manusia
        System.out.println(a.bermain("Hewan Bermain bersama") + (b.bermain(" Manusia")));
        // manusia menelpon indihome
        System.out.println(b.bekerja("Menelpone ") + (c.melakukan_panggilan("Indihome")));

    }
}

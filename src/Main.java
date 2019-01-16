public class Main {
    public static void main(String[] args) {

        OpisPrzedmiotu drukarka1 = new OpisPrzedmiotu("Drukarka Minolta", "Laserowa", true,
                120, 60, 50);

        OpisPrzedmiotu drukarka2 = new OpisPrzedmiotu("Drukarka HP", "Laserowa",false,
                24, 35, 30);

//        OpisPrzedmiotu drukarka1 = new OpisPrzedmiotu();
//        drukarka1.nazwa = "Minolta";
//        drukarka1.typ = "Laserowa";
//        drukarka1.prinColor = true;
//        drukarka1.dimensionsHeigh = 120;
//        drukarka1.dimensionsWidth = 60;
//        drukarka1.dimensionsDepth = 50;
//
//        OpisPrzedmiotu drukarka2 = new OpisPrzedmiotu();
//        drukarka2.nazwa = "HP";
//        drukarka2.typ = "Laserowa";
//        drukarka2.prinColor = false;
//        drukarka2.dimensionsHeigh = 24;
//        drukarka2.dimensionsWidth = 35;
//        drukarka2.dimensionsDepth = 30;


        int nrDrukarki = 0;
        System.out.println("Drukarki w pokoju 123");
        System.out.println("Drukarka nr " + ++nrDrukarki);
        drukarka1.wydruk();
        System.out.println("Drukarka nr " + ++nrDrukarki);
        drukarka2.wydruk();

    }
}
public class OpisPrzedmiotu {
    String nazwa;
    String typ;
    boolean prinColor;
    double dimensionsHeigh;
    double dimensionsWidth;
    double dimensionsDepth;

    public OpisPrzedmiotu(String nazwa, String typ, boolean prinColor, double dimensionsHeigh,
                          double dimensionsWidth, double dimensionsDepth) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.prinColor = prinColor;
        this.dimensionsHeigh = dimensionsHeigh;
        this.dimensionsWidth = dimensionsWidth;
        this.dimensionsDepth = dimensionsDepth;
    }



    void wydruk (){
        int kolejnosc = 0;
        System.out.printf("%d. Nazwa        %s\n" ,++kolejnosc,nazwa);
        System.out.printf("%d. Typ          %s\n" ,++kolejnosc,typ);
        System.out.printf("%d. Druk Kolor   %s\n" ,++kolejnosc,prinColor);
        System.out.printf("%d. Wysokosc     %.0f cm\n" ,++kolejnosc,dimensionsHeigh);
        System.out.printf("%d. Szerokosc    %.0f cm\n" ,++kolejnosc,dimensionsWidth);
        System.out.printf("%d. Glebokosc    %.0f cm\n\n" ,++kolejnosc,dimensionsDepth);

    }

}

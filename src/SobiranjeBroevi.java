public class SobiranjeBroevi {
    public static void main(String[] args) {
        // Kreiraј objekt od klasata Broevi i predaj mu dva broja
        Zadaca6 moiBroevi = new Zadaca6(5, 7);

        // Izvrshi sobiranje na broevite preku metodot
        int rezultat = moiBroevi.soberiBroevi();

        // Prikazhi go rezultatot
        System.out.println("Zbirot na broevite e: " + rezultat);
    }
}

public class ElementDriver {
    public static void main(String args[]) {

        String[] covalentBondsH = {"H", "O", "N", "C"};

        ChemicalElement hydrogen = new ChemicalElement(
                "Hydrogen", "H", 1, covalentBondsH
        );

        String[] covalentBondsO = {"O", "H", "C"};

        ChemicalElement oxygen = new ChemicalElement(
                "Oxygen", "O", 8, covalentBondsO
        );

        String[] covalentBondsN = {"H", "N"};

        ChemicalElement nitrogen = new ChemicalElement(
                "Nitrogen", "N", 7, covalentBondsN
        );

        hydrogen.print();
        oxygen.print();
        nitrogen.print();
        System.out.println(oxygen.toJson());
        System.out.println(hydrogen.toJson());
        System.out.println(nitrogen.toJson());
    }
}

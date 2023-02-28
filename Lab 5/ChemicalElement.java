import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.io.*;


class ChemicalElement {

    private String name;
    private String symbol;
    private int atomicNumber;

    /*
     * Symbols for elements with which this element can form a covalent bond.
     */
    private String[] bondsWith;

    public ChemicalElement(String name, String symbol, int atomicNumber, String[] bonds) {
        this.setName(name);
        this.setSymbol(symbol);
        this.setAtomicNumber(atomicNumber);
        this.setBonds(bonds);
    }

    public boolean bondsWith(String symbol) {
        return Arrays.asList(this.getBonds()).contains(symbol);
    }

    public int getAtomicNumber() {
        return this.atomicNumber;
    }

    public String[] getBonds() {
        return this.bondsWith;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void print() {
        System.out.println("=== " + this.getName() + " ===");
        System.out.println("Symbol: " + this.getSymbol());
        System.out.println("Atomic Number: " + this.getAtomicNumber());
        System.out.println("bondsWith: " + Arrays.toString(this.getBonds()));
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setBonds(String[] bonds) {
        this.bondsWith = bonds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Dictionary<String, Object> JsonElement_D(){
        Dictionary<String, Object> jsonElement = new Hashtable<>();

        jsonElement.put("atomicNumber",getAtomicNumber());
        jsonElement.put("bondsWith", getBonds());
        jsonElement.put("name",getName());
        jsonElement.put("symbol",getSymbol());
        return jsonElement;

    }

    public String toJson(){
       String strJson = "{\n     \"atomicNumber\": "+ getAtomicNumber()
               +",\n" +"     \"bondsWith\": "+ Arrays.toString(getBonds())
               +",\n" +"     \"name\": "+ getName()
               + ",\n" +"     \"symbol\": "+getSymbol()
               +"\n}";

        return strJson;

    }
    public String toJsonLines(){
        String strJsonLines = "{     \"atomicNumber\": "+ getAtomicNumber()
                +"," +"     \"bondsWith\": "+ Arrays.toString(getBonds())
                +"," +"     \"name\": "+ getName()
                + "," +"     \"symbol\": "+getSymbol()
                +"}";

        return strJsonLines;

    }
    public void writeJSONFromLines() throws IOException {
        String lines = toJsonLines();
        FileWriter fw = new FileWriter("Phosphorus.txt");
        PrintWriter pw = new PrintWriter(fw);
        for(ChemicalElement ce: lines)

    }
}
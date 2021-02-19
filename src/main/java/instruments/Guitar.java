package instruments;

public class Guitar extends Instrument{
    private int strings;
    public Guitar(double price, int strings) {
        super(price);
        this.strings = strings;
    }

    @Override
    public String play() {
        return "clang alang lang lang lang clang alang lang lang";
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}

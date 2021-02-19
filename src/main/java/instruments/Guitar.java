package instruments;

public class Guitar extends Instrument{
    public Guitar(double price) {
        super(price);
    }

    @Override
    public String play() {
        return "clang alang lang lang lang clang alang lang lang";
    }
}

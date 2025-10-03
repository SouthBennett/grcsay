public class Cat implements Animal {
  @Override
    public String getAnimalArt() {
        return " /\\_/\\\n" +
               "( o.o )\n" +
               " > ^ <";
    }

    @Override
    public String toString() {
        return "Cat";
    }
}

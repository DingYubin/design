package patterns.creation.factory.abstract_factory.nvwa;

public class MaleFactory implements HumanFactory{
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}

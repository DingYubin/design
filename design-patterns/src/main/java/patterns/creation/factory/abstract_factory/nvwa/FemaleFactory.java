package patterns.creation.factory.abstract_factory.nvwa;

public class FemaleFactory implements HumanFactory{
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}

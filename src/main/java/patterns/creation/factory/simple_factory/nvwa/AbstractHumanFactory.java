package patterns.creation.factory.simple_factory.nvwa;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}

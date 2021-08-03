package com.binwator.abstractfactory;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kingdom {
    private King king;
    private Castle castle;
    private Army army;

    /**
     * The factory of kingdom factories
     */
    public static class FactoryMaker{
        /**
         * Enumeration for the different type.of kingdoms.
         */
        public enum KingdomType{
            ELF, ORC
        }

        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported");
            }
        }
    }

}

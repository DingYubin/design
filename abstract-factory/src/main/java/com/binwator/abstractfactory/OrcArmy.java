package com.binwator.abstractfactory;

public class OrcArmy implements Army{
    static final String DESCRIPTION = "This is the ocr army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

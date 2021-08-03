package com.binwator.abstractfactory;

public class OrcCastle implements Castle{
    static final String DESCRIPTION = "This is the ocr castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

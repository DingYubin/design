package com.binwator.abstractfactory;

public class OrcKing implements King{
    static final String DESCRIPTION = "This is the ocr king!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

package com.company.wrapperCheck;

public class CatWrapperExtends extends Cat {

    public CatWrapperExtends(String name) {
        super(name);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return "Этого кота зовут " + super.getName() + ". Наследование";
    }
}
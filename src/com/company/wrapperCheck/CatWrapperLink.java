package com.company.wrapperCheck;

public class CatWrapperLink {
    private Cat cat;

    public CatWrapperLink (Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return "Этого кота зовут " + cat.getName() + ". Наследование";
    }

    public void setName(String name) {
        cat.setName(name);
    }
}

package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class AHasGetterSetter {
    private String name = "the one";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class AHasSetter {
    private String name = "the one";

    public void setName(String name) {
        this.name = name;
    }
}

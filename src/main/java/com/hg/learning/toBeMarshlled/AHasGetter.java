package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class AHasGetter {
    private String name = "the one";

    public String getName() {
        return name;
    }
}

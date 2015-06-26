package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class ANoGetterSetter {
    private String name = "the one";
}

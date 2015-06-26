package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class BAccessorField {
    private String name = "the one";
}

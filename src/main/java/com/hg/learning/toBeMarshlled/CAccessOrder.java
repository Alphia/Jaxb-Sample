package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "root")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlAccessorOrder(value = XmlAccessOrder.ALPHABETICAL)
public class CAccessOrder {
    private String name = "the one";
    private String gender = "male";
}

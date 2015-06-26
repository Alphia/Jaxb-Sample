package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "root")
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "gender"})
public class DPropertyOrder {
    private String gender = "male";
    private String name = "the one";
}

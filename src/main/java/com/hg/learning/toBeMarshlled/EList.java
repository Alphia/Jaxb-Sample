package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class EList {
    private String name = "the one";

    @XmlElementWrapper(name = "olds")
    @XmlElement(name = "password")
    private List<String> oldPasswords;

    public void setOldPasswords(List<String> oldPasswords) {
        this.oldPasswords = oldPasswords;
    }
}

package com.hg.learning.toBeMarshlled;

import javax.xml.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class FComplex {

    private String outterF1 = "outterFields1";
    private Simple simple = new Simple();

    @XmlRootElement(name = "inner")
    @XmlAccessorType(value = XmlAccessType.FIELD)
    public static class Simple {
        private String innerF1 = "innerFields1";
        @XmlElementWrapper(name = "innerList")
        @XmlElement(name = "item")
        private List<String> innerList = Arrays.asList("F2.1", "F2.2");
    }
}

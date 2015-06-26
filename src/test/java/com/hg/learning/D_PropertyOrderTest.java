package com.hg.learning;

import com.hg.learning.toBeMarshlled.DPropertyOrder;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class D_PropertyOrderTest {
    private CustomMarshaller<DPropertyOrder> marshaller;

    @Test
    public void should_marshall_as_given_property_order() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<root>\n" +
                "    <name>the one</name>\n" +
                "    <gender>male</gender>\n" +
                "</root>\n";
        marshaller = new CustomMarshaller<DPropertyOrder>(new DPropertyOrder());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }
}

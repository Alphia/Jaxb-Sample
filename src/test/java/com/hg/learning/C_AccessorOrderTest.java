package com.hg.learning;

import com.hg.learning.toBeMarshlled.BAccessorField;
import com.hg.learning.toBeMarshlled.CAccessOrder;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class C_AccessorOrderTest {

    private CustomMarshaller<CAccessOrder> marshaller;

    @Test
    public void should_Name() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<root>\n" +
                "    <gender>male</gender>\n" +
                "    <name>the one</name>\n" +
                "</root>\n";
        marshaller = new CustomMarshaller<CAccessOrder>(new CAccessOrder());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }
}

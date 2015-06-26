package com.hg.learning;

import com.hg.learning.toBeMarshlled.DPropertyOrder;
import com.hg.learning.toBeMarshlled.EList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class E_ListTest {
    private CustomMarshaller<EList> marshaller;

    @Test
    public void should_marshall_list() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<root>\n" +
                "    <name>the one</name>\n" +
                "    <olds>\n" +
                "        <password>someone</password>\n" +
                "        <password>123</password>\n" +
                "    </olds>\n" +
                "</root>\n";
        EList eList = new EList();
        List<String> oldPasswords = Arrays.asList("someone", "123");
        eList.setOldPasswords(oldPasswords);
        marshaller = new CustomMarshaller<EList>(eList);
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }
}

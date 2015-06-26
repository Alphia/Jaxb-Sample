package com.hg.learning;

import com.hg.learning.toBeMarshlled.FComplex;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class F_ComplexTest {
    private CustomMarshaller<FComplex> marshaller;

    @Test
    public void should_marshall_list() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<root>\n" +
                "    <outterF1>outterFields1</outterF1>\n" +
                "    <simple>\n" +
                "        <innerF1>innerFields1</innerF1>\n" +
                "        <innerList>\n" +
                "            <item>F2.1</item>\n" +
                "            <item>F2.2</item>\n" +
                "        </innerList>\n" +
                "    </simple>\n" +
                "</root>\n";
        marshaller = new CustomMarshaller<FComplex>(new FComplex());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }
}

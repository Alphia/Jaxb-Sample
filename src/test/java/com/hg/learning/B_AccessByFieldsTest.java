package com.hg.learning;

import com.hg.learning.toBeMarshlled.BAccessorField;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class B_AccessByFieldsTest {

    private CustomMarshaller<BAccessorField> marshaller;

    @Test
    public void should_marshall_AccessorField_one() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<root>\n    <name>the one</name>\n</root>\n";
        marshaller = new CustomMarshaller<BAccessorField>(new BAccessorField());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }
}

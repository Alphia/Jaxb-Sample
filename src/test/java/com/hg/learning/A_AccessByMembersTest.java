package com.hg.learning;

import com.hg.learning.toBeMarshlled.AHasGetter;
import com.hg.learning.toBeMarshlled.AHasGetterSetter;
import com.hg.learning.toBeMarshlled.AHasSetter;
import com.hg.learning.toBeMarshlled.ANoGetterSetter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class A_AccessByMembersTest {
    @Test
    public void should_marshall_OnlyField_one() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<root/>\n";
        CustomMarshaller<ANoGetterSetter> marshaller = new CustomMarshaller<ANoGetterSetter>(new ANoGetterSetter());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }

    @Test
    public void should_marshall_HasGetter_one() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<root/>\n";
        CustomMarshaller<AHasGetter> marshaller = new CustomMarshaller<AHasGetter>(new AHasGetter());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }

    @Test
    public void should_marshall_HasSetter_one() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<root/>\n";
        CustomMarshaller<AHasSetter> marshaller = new CustomMarshaller<AHasSetter>(new AHasSetter());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }

    @Test
    public void should_marshall_HasGetterSetter_one() throws Exception {
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<root>\n    <name>the one</name>\n</root>\n";
        CustomMarshaller<AHasGetterSetter> marshaller = new CustomMarshaller<AHasGetterSetter>(new AHasGetterSetter());
        String result = marshaller.marshal();
        System.out.println(result);
        assertThat(result, is(expected));
    }
}
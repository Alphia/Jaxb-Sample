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
/**
* <p>
* Maps a JavaBean property to a XML attribute.
*
* <p> <b>Usage</b> </p>
* <p>
* The <tt>@XmlAttribute</tt> annotation can be used with the
* following program elements:
* <ul>
*   <li> JavaBean property </li>
*   <li> field </li>
* </ul>
*
* <p> A static final field is mapped to a XML fixed attribute.
*
* <p>See "Package Specification" in javax.xml.bind.package javadoc for
* additional common information.</p>
*
* The usage is subject to the following constraints:
* <ul>
*   <li> If type of the field or the property is a collection
*        type, then the collection item type must be mapped to schema
*        simple type.
* <pre>
*     // Examples
*     &#64;XmlAttribute List&lt;Integer> items; //legal
*     &#64;XmlAttribute List&lt;Bar> foo; // illegal if Bar does not map to a schema simple type
* </pre>
*   </li>
*   <li> If the type of the field or the property is a non
*         collection type, then the type of the property or field
*         must map to a simple schema type.
* <pre>
*     // Examples
*     &#64;XmlAttribute int foo; // legal
*     &#64;XmlAttribute Foo foo; // illegal if Foo does not map to a schema simple type
* </pre>
*   </li>
*   <li> This annotation can be used with the following annotations:
*            {@link XmlID},
*            {@link XmlIDREF},
*            {@link XmlList},
*            {@link XmlSchemaType},
*            {@link XmlValue},
*            {@link XmlAttachmentRef},
*            {@link XmlMimeType},
*            {@link XmlInlineBinaryData},
*            {@link javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter}</li>.
* </ul>
* </p>
*
* <p> <b>Example 1: </b>Map a JavaBean property to an XML attribute.</p>
* <pre>
*     //Example: Code fragment
*     public class USPrice {
*         &#64;XmlAttribute
*         public java.math.BigDecimal getPrice() {...} ;
*         public void setPrice(java.math.BigDecimal ) {...};
*     }
*
*     &lt;!-- Example: XML Schema fragment -->
*     &lt;xs:complexType name="USPrice">
*       &lt;xs:sequence>
*       &lt;/xs:sequence>
*       &lt;xs:attribute name="price" type="xs:decimal"/>
*     &lt;/xs:complexType>
* </pre>
*
* <p> <b>Example 2: </b>Map a JavaBean property to an XML attribute with anonymous type.</p>
* See Example 7 in @{@link XmlType}.
*
* <p> <b>Example 3: </b>Map a JavaBean collection property to an XML attribute.</p>
* <pre>
*     // Example: Code fragment
*     class Foo {
*         ...
*         &#64;XmlAttribute List&lt;Integer> items;
*     }
*
*     &lt;!-- Example: XML Schema fragment -->
*     &lt;xs:complexType name="foo">
*     	 ...
*       &lt;xs:attribute name="items">
*         &lt;xs:simpleType>
*           &lt;xs:list itemType="xs:int"/>
*         &lt;/xs:simpleType>
*     &lt;/xs:complexType>
*
* </pre>
* @author Sekhar Vajjhala, Sun Microsystems, Inc.
* @version $Revision: 1.14 $
* @see XmlType
* @since JAXB2.0
*/

package client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for extensionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extensionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="jpg"/>
 *     &lt;enumeration value="jpeg"/>
 *     &lt;enumeration value="png"/>
 *     &lt;enumeration value="gif"/>
 *     &lt;enumeration value="svg"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extensionType")
@XmlEnum
public enum ExtensionType {

    jpg,
    jpeg,
    png,
    gif,
    svg;

    public String value() {
        return name();
    }

    public static ExtensionType fromValue(String v) {
        return valueOf(v);
    }

}

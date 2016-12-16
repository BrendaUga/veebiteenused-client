
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusMessage" type="{http://xsd.webservice.namespace}StatusType"/>
 *         &lt;element name="photo" type="{http://xsd.webservice.namespace}photoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusMessage",
    "photo"
})
@XmlRootElement(name = "GetPhotoResponse")
public class GetPhotoResponse {

    @XmlElement(name = "StatusMessage", required = true)
    protected StatusType statusMessage;
    protected PhotoType photo;

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatusMessage(StatusType value) {
        this.statusMessage = value;
    }

    /**
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoType }
     *     
     */
    public PhotoType getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoType }
     *     
     */
    public void setPhoto(PhotoType value) {
        this.photo = value;
    }

}

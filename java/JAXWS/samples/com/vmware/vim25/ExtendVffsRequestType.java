
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendVffsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendVffsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="vffsPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="devicePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spec" type="{urn:vim25}HostDiskPartitionSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendVffsRequestType", propOrder = {
    "_this",
    "vffsPath",
    "devicePath",
    "spec"
})
public class ExtendVffsRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String vffsPath;
    @XmlElement(required = true)
    protected String devicePath;
    protected HostDiskPartitionSpec spec;

    /**
     * Gets the value of the this property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedObjectReference }
     *     
     */
    public ManagedObjectReference getThis() {
        return _this;
    }

    /**
     * Sets the value of the this property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedObjectReference }
     *     
     */
    public void setThis(ManagedObjectReference value) {
        this._this = value;
    }

    /**
     * Gets the value of the vffsPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVffsPath() {
        return vffsPath;
    }

    /**
     * Sets the value of the vffsPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVffsPath(String value) {
        this.vffsPath = value;
    }

    /**
     * Gets the value of the devicePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePath() {
        return devicePath;
    }

    /**
     * Sets the value of the devicePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicePath(String value) {
        this.devicePath = value;
    }

    /**
     * Gets the value of the spec property.
     * 
     * @return
     *     possible object is
     *     {@link HostDiskPartitionSpec }
     *     
     */
    public HostDiskPartitionSpec getSpec() {
        return spec;
    }

    /**
     * Sets the value of the spec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDiskPartitionSpec }
     *     
     */
    public void setSpec(HostDiskPartitionSpec value) {
        this.spec = value;
    }

}

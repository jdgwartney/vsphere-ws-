
package com.vmware.vim25;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDatastoreRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDatastoreRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="_this" type="{urn:vim25}ManagedObjectReference"/>
 *         &lt;element name="datastorePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchSpec" type="{urn:vim25}HostDatastoreBrowserSearchSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDatastoreRequestType", propOrder = {
    "_this",
    "datastorePath",
    "searchSpec"
})
public class SearchDatastoreRequestType {

    @XmlElement(required = true)
    protected ManagedObjectReference _this;
    @XmlElement(required = true)
    protected String datastorePath;
    protected HostDatastoreBrowserSearchSpec searchSpec;

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
     * Gets the value of the datastorePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatastorePath() {
        return datastorePath;
    }

    /**
     * Sets the value of the datastorePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatastorePath(String value) {
        this.datastorePath = value;
    }

    /**
     * Gets the value of the searchSpec property.
     * 
     * @return
     *     possible object is
     *     {@link HostDatastoreBrowserSearchSpec }
     *     
     */
    public HostDatastoreBrowserSearchSpec getSearchSpec() {
        return searchSpec;
    }

    /**
     * Sets the value of the searchSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostDatastoreBrowserSearchSpec }
     *     
     */
    public void setSearchSpec(HostDatastoreBrowserSearchSpec value) {
        this.searchSpec = value;
    }

}

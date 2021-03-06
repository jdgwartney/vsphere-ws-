
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "LicenseServerUnavailableFault", targetNamespace = "urn:vim25")
public class LicenseServerUnavailableFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private LicenseServerUnavailable faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public LicenseServerUnavailableFaultMsg(String message, LicenseServerUnavailable faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public LicenseServerUnavailableFaultMsg(String message, LicenseServerUnavailable faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.LicenseServerUnavailable
     */
    public LicenseServerUnavailable getFaultInfo() {
        return faultInfo;
    }

}


package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RemoveFailedFault", targetNamespace = "urn:vim25")
public class RemoveFailedFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RemoveFailed faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RemoveFailedFaultMsg(String message, RemoveFailed faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RemoveFailedFaultMsg(String message, RemoveFailed faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.RemoveFailed
     */
    public RemoveFailed getFaultInfo() {
        return faultInfo;
    }

}

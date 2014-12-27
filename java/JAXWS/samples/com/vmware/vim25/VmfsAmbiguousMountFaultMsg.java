
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "VmfsAmbiguousMountFault", targetNamespace = "urn:vim25")
public class VmfsAmbiguousMountFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private VmfsAmbiguousMount faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public VmfsAmbiguousMountFaultMsg(String message, VmfsAmbiguousMount faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public VmfsAmbiguousMountFaultMsg(String message, VmfsAmbiguousMount faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.VmfsAmbiguousMount
     */
    public VmfsAmbiguousMount getFaultInfo() {
        return faultInfo;
    }

}

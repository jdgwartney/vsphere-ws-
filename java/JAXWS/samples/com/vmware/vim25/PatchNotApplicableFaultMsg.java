
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "PatchNotApplicableFault", targetNamespace = "urn:vim25")
public class PatchNotApplicableFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private PatchNotApplicable faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public PatchNotApplicableFaultMsg(String message, PatchNotApplicable faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public PatchNotApplicableFaultMsg(String message, PatchNotApplicable faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.PatchNotApplicable
     */
    public PatchNotApplicable getFaultInfo() {
        return faultInfo;
    }

}

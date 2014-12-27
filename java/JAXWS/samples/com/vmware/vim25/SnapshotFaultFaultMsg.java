
package com.vmware.vim25;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "SnapshotFaultFault", targetNamespace = "urn:vim25")
public class SnapshotFaultFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SnapshotFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SnapshotFaultFaultMsg(String message, SnapshotFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SnapshotFaultFaultMsg(String message, SnapshotFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vmware.vim25.SnapshotFault
     */
    public SnapshotFault getFaultInfo() {
        return faultInfo;
    }

}

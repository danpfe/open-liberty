//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:27 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:17 AM(foreman)-)
//


package com.ibm.was.wssample.sei.echo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "EchoServicePortType", 
            targetNamespace = "http://com/ibm/was/wssample/sei/echo/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EchoServicePortType {


    /**
     * 
     * @param parameter
     * @return
     *     returns com.ibm.was.wssample.sei.echo.EchoStringResponse
     */
    @WebMethod(action = "echoOperation")
    @WebResult(name = "echoStringResponse", targetNamespace = "http://com/ibm/was/wssample/sei/echo/", partName = "parameter")
    public EchoStringResponse echoOperation(
        @WebParam(name = "echoStringInput", targetNamespace = "http://com/ibm/was/wssample/sei/echo/", partName = "parameter")
        EchoStringInput parameter);

}

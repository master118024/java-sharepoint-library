package com.microsoft.schemas.sharepoint.soap.meetings;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:45.269+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "Meetings", 
                  wsdlLocation = "file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/meetings.wsdl",
                  targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/meetings/") 
public class Meetings extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "Meetings");
    public final static QName MeetingsSoap12 = new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap12");
    public final static QName MeetingsSoap = new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/meetings.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Meetings.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/meetings.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Meetings(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Meetings(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Meetings() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Meetings(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Meetings(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Meetings(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap12")
    public MeetingsSoap getMeetingsSoap12() {
        return super.getPort(MeetingsSoap12, MeetingsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap12")
    public MeetingsSoap getMeetingsSoap12(WebServiceFeature... features) {
        return super.getPort(MeetingsSoap12, MeetingsSoap.class, features);
    }
    /**
     *
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap")
    public MeetingsSoap getMeetingsSoap() {
        return super.getPort(MeetingsSoap, MeetingsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap")
    public MeetingsSoap getMeetingsSoap(WebServiceFeature... features) {
        return super.getPort(MeetingsSoap, MeetingsSoap.class, features);
    }

}

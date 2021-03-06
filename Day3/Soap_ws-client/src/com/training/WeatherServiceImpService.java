
package com.training;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WeatherServiceImpService", targetNamespace = "http://service.reaining.com/", wsdlLocation = "http://localhost:5050/weather?wsdl")
public class WeatherServiceImpService
    extends Service
{

    private final static URL WEATHERSERVICEIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEATHERSERVICEIMPSERVICE_EXCEPTION;
    private final static QName WEATHERSERVICEIMPSERVICE_QNAME = new QName("http://service.reaining.com/", "WeatherServiceImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5050/weather?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEATHERSERVICEIMPSERVICE_WSDL_LOCATION = url;
        WEATHERSERVICEIMPSERVICE_EXCEPTION = e;
    }

    public WeatherServiceImpService() {
        super(__getWsdlLocation(), WEATHERSERVICEIMPSERVICE_QNAME);
    }

    public WeatherServiceImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEATHERSERVICEIMPSERVICE_QNAME, features);
    }

    public WeatherServiceImpService(URL wsdlLocation) {
        super(wsdlLocation, WEATHERSERVICEIMPSERVICE_QNAME);
    }

    public WeatherServiceImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEATHERSERVICEIMPSERVICE_QNAME, features);
    }

    public WeatherServiceImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherServiceImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WeatherServices
     */
    @WebEndpoint(name = "WeatherServiceImpPort")
    public WeatherServices getWeatherServiceImpPort() {
        return super.getPort(new QName("http://service.reaining.com/", "WeatherServiceImpPort"), WeatherServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherServices
     */
    @WebEndpoint(name = "WeatherServiceImpPort")
    public WeatherServices getWeatherServiceImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.reaining.com/", "WeatherServiceImpPort"), WeatherServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEATHERSERVICEIMPSERVICE_EXCEPTION!= null) {
            throw WEATHERSERVICEIMPSERVICE_EXCEPTION;
        }
        return WEATHERSERVICEIMPSERVICE_WSDL_LOCATION;
    }

}

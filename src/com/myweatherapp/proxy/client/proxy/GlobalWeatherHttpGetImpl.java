
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.myweatherapp.proxy.client.proxy;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-15T17:44:24.145-05:00
 * Generated source version: 3.1.6
 * 
 */

@javax.jws.WebService(
                      serviceName = "GlobalWeather",
                      portName = "GlobalWeatherHttpGet",
                      targetNamespace = "http://www.webserviceX.NET",
                      wsdlLocation = "http://www.webservicex.net/globalweather.asmx?WSDL",
                      endpointInterface = "com.myweatherApp.proxy.GlobalWeatherHttpGet")
                      
public class GlobalWeatherHttpGetImpl implements GlobalWeatherHttpGet {

    private static final Logger LOG = Logger.getLogger(GlobalWeatherHttpGetImpl.class.getName());

    /* (non-Javadoc)
     * @see com.myweatherApp.proxy.GlobalWeatherHttpGet#getCitiesByCountry(java.lang.String  countryName )*
     */
    public java.lang.String getCitiesByCountry(java.lang.String countryName) { 
        LOG.info("Executing operation getCitiesByCountry");
        System.out.println(countryName);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.myweatherApp.proxy.GlobalWeatherHttpGet#getWeather(java.lang.String  cityName ,)java.lang.String  countryName )*
     */
    public java.lang.String getWeather(java.lang.String cityName,java.lang.String countryName) { 
        LOG.info("Executing operation getWeather");
        System.out.println(cityName);
        System.out.println(countryName);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

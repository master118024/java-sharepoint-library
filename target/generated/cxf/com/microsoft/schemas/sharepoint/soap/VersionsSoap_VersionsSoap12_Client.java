
package com.microsoft.schemas.sharepoint.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:48.116+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class VersionsSoap_VersionsSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://schemas.microsoft.com/sharepoint/soap/", "Versions");

    private VersionsSoap_VersionsSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Versions.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Versions ss = new Versions(wsdlURL, SERVICE_NAME);
        VersionsSoap port = ss.getVersionsSoap12();  
        
        {
        System.out.println("Invoking deleteAllVersions...");
        java.lang.String _deleteAllVersions_fileName = "";
        com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponse.DeleteAllVersionsResult _deleteAllVersions__return = port.deleteAllVersions(_deleteAllVersions_fileName);
        System.out.println("deleteAllVersions.result=" + _deleteAllVersions__return);


        }
        {
        System.out.println("Invoking getVersions...");
        java.lang.String _getVersions_fileName = "";
        com.microsoft.schemas.sharepoint.soap.GetVersionsResponse.GetVersionsResult _getVersions__return = port.getVersions(_getVersions_fileName);
        System.out.println("getVersions.result=" + _getVersions__return);


        }
        {
        System.out.println("Invoking restoreVersion...");
        java.lang.String _restoreVersion_fileName = "";
        java.lang.String _restoreVersion_fileVersion = "";
        com.microsoft.schemas.sharepoint.soap.RestoreVersionResponse.RestoreVersionResult _restoreVersion__return = port.restoreVersion(_restoreVersion_fileName, _restoreVersion_fileVersion);
        System.out.println("restoreVersion.result=" + _restoreVersion__return);


        }
        {
        System.out.println("Invoking deleteVersion...");
        java.lang.String _deleteVersion_fileName = "";
        java.lang.String _deleteVersion_fileVersion = "";
        com.microsoft.schemas.sharepoint.soap.DeleteVersionResponse.DeleteVersionResult _deleteVersion__return = port.deleteVersion(_deleteVersion_fileName, _deleteVersion_fileVersion);
        System.out.println("deleteVersion.result=" + _deleteVersion__return);


        }

        System.exit(0);
    }

}

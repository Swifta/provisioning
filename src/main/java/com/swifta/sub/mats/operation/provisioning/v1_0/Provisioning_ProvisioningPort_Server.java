
package com.swifta.sub.mats.operation.provisioning.v1_0;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-03-23T14:32:54.159+01:00
 * Generated source version: 3.0.1
 * 
 */
 
public class Provisioning_ProvisioningPort_Server{

    protected Provisioning_ProvisioningPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new ProvisioningPortImpl();
        String address = "http://localhost:9090/ProvisioningPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Provisioning_ProvisioningPort_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
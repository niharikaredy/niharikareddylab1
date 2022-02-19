/**
 * 
 */
package com.niharika.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author 13058
 *
 */
 
public class installprocess implements GenericComponent { 
	
	   private String sensors;
	   private String battery;
	   private String motor;
	  
	private Server myServer ;
	private SoftwareApplication myApplication;
	private Controlpanel myControlpanel;
	private User myUser;
	   
	   
	   public installprocess() {
		   
		   myUser = new User() ;
	       myServer =new Server() ;
	       myControlpanel = new Controlpanel() ;
	       myApplication = new SoftwareApplication() ;
	       
		   }


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return" Software application upate";
	}


	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myUser, myServer, myConrtolpanel,mySoftwareApplication); // add all your sub components
		return internalComponents;
	}
	   }
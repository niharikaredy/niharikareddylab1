package edu.fiu.jit;

import java.util.List;

import com.niharika.lab3.installprocess;

/**
 * A simple interface showing how to use the Self-check process.
 * A component is something that is self-check capable, and also
 * has internal compponents that should be checked. 
 * 
 * When you implement GenericComponent, you will need to implement 
 * the selfcheckcapable methods, as well as build a 
 * list of internal components that should be checked in order
 * for a complete self-check process.
 * 
 * Your main class should implement this interface so you can run
 * the unit tester.
 * 
 * @author asengupt
 *
 */
public interface GenericComponent extends SelfCheckCapable {
	installprocess internalComponents = new installprocess(); // create an empty list
	Collections.addAll(internalComponents, user, server, sftapplication, controlpanel);

	
	public List<SelfCheckCapable> getSubComponents();

}


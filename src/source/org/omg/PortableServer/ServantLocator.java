package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantLocator.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /private/tmp/openjdkA8-20220228-18546-1kfawkm/jdk8u322-ga/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Monday, 28 February 2022 15:07:36 o'clock GMT
*/


/**
	 * When the POA has the NON_RETAIN policy it uses servant 
	 * managers that are ServantLocators. Because the POA 
	 * knows that the servant returned by this servant 
	 * manager will be used only for a single request, 
	 * it can supply extra information to the servant 
	 * manager's operations and the servant manager's pair 
	 * of operations may be able to cooperate to do 
	 * something different than a ServantActivator. 
	 * When the POA uses the ServantLocator interface, 
	 * immediately after performing the operation invocation 
	 * on the servant returned by preinvoke, the POA will 
	 * invoke postinvoke on the servant manager, passing the 
	 * ObjectId value and the Servant value as parameters 
	 * (among others). This feature may be used to force 
	 * every request for objects associated with a POA to 
	 * be mediated by the servant manager.
	 */
public interface ServantLocator extends ServantLocatorOperations, org.omg.PortableServer.ServantManager, org.omg.CORBA.portable.IDLEntity 
{
} // interface ServantLocator
package org.omg.IOP;


/**
* org/omg/IOP/IOR.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /private/tmp/openjdkA8-20220228-18546-1kfawkm/jdk8u322-ga/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, 28 February 2022 15:07:35 o'clock GMT
*/

public final class IOR implements org.omg.CORBA.portable.IDLEntity
{

  /** The type id, represented as a String. */
  public String type_id = null;

  /** 
  	 * An array of tagged profiles associated with this 
  	 * object reference. 
  	 */
  public org.omg.IOP.TaggedProfile profiles[] = null;

  public IOR ()
  {
  } // ctor

  public IOR (String _type_id, org.omg.IOP.TaggedProfile[] _profiles)
  {
    type_id = _type_id;
    profiles = _profiles;
  } // ctor

} // class IOR

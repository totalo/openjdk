package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/RepositoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /private/tmp/openjdkA8-20220228-18546-1kfawkm/jdk8u322-ga/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, 28 February 2022 15:07:35 o'clock GMT
*/

public final class RepositoryHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.PortableActivationIDL.Repository value = null;

  public RepositoryHolder ()
  {
  }

  public RepositoryHolder (com.sun.corba.se.PortableActivationIDL.Repository initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.RepositoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.RepositoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.RepositoryHelper.type ();
  }

}

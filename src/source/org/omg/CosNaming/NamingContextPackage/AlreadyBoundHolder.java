package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/AlreadyBoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /private/tmp/openjdkA8-20220228-18546-1kfawkm/jdk8u322-ga/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, 28 February 2022 15:07:35 o'clock GMT
*/

public final class AlreadyBoundHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.NamingContextPackage.AlreadyBound value = null;

  public AlreadyBoundHolder ()
  {
  }

  public AlreadyBoundHolder (org.omg.CosNaming.NamingContextPackage.AlreadyBound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.NamingContextPackage.AlreadyBoundHelper.type ();
  }

}

package org.omg.CosNaming;

/**
* org/omg/CosNaming/BindingIteratorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /private/tmp/openjdkA8-20220228-18546-1kfawkm/jdk8u322-ga/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, 28 February 2022 15:07:35 o'clock GMT
*/


/**
   * The BindingIterator interface allows a client to iterate through
   * the bindings using the next_one or next_n operations.
   * 
   * The bindings iterator is obtained by using the <tt>list</tt>
   * method on the <tt>NamingContext</tt>. 
   * @see org.omg.CosNaming.NamingContext#list
   */
public final class BindingIteratorHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CosNaming.BindingIterator value = null;

  public BindingIteratorHolder ()
  {
  }

  public BindingIteratorHolder (org.omg.CosNaming.BindingIterator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CosNaming.BindingIteratorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CosNaming.BindingIteratorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CosNaming.BindingIteratorHelper.type ();
  }

}
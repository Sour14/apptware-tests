/** This class is expected to be a singleton. Please make necessary changes. */
package com.apptware.interview.singleton;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "s")
public class Singleton {
  private static  Singleton single_instance = null;

  public String s;

  // Throwing an exception is not expected.
  private Singleton() {
      s = "Hello I am a string part of Singleton class";
  }

  public static synchronized Singleton getInstance() {
    if (single_instance == null) single_instance = new Singleton();

    return single_instance;
  }
}

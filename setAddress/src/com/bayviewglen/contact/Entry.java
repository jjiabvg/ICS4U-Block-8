package com.bayviewglen.contact;

import java.util.*;

/**
 * Represents a single address book entry.
 * 
 * @author Josh Batchelor
 */
public class Entry
{
  private HashSet<String> entry;

  public Entry()
  {
    entry = new HashSet<String>();
  }

  public Entry(String string)
  {
    entry = new HashSet<String>();
    entry.add(string);
  }

  public Entry(String []strings)
  {
    entry = new HashSet<String>();
    for(int i = 0; i < strings.length; i++)
    {
      entry.add(strings[i]);
    }
  }

  public String toString()
  {
    return entry.toString();
  }

  public void addString(String string)
  {
    entry.add(string);
  }
}
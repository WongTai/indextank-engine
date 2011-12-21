/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.flaptor.indextank.rpc;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum IndexerStatus implements TEnum {
  started(0),
  recovering(1),
  ready(2),
  error(3);

  private final int value;

  private IndexerStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static IndexerStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return started;
      case 1:
        return recovering;
      case 2:
        return ready;
      case 3:
        return error;
      default:
        return null;
    }
  }
}
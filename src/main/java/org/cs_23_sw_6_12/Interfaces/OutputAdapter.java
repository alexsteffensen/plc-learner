package org.cs_23_sw_6_12.Interfaces;

public interface OutputAdapter<O> {
    O fromBytes(byte[] bytes);
}

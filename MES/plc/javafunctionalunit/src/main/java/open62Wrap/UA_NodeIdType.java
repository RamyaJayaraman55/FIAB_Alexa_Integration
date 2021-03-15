/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package open62Wrap;

public final class UA_NodeIdType {
  public final static UA_NodeIdType UA_NODEIDTYPE_NUMERIC = new UA_NodeIdType("UA_NODEIDTYPE_NUMERIC", open62541JNI.UA_NODEIDTYPE_NUMERIC_get());
  public final static UA_NodeIdType UA_NODEIDTYPE_STRING = new UA_NodeIdType("UA_NODEIDTYPE_STRING", open62541JNI.UA_NODEIDTYPE_STRING_get());
  public final static UA_NodeIdType UA_NODEIDTYPE_GUID = new UA_NodeIdType("UA_NODEIDTYPE_GUID", open62541JNI.UA_NODEIDTYPE_GUID_get());
  public final static UA_NodeIdType UA_NODEIDTYPE_BYTESTRING = new UA_NodeIdType("UA_NODEIDTYPE_BYTESTRING", open62541JNI.UA_NODEIDTYPE_BYTESTRING_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static UA_NodeIdType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + UA_NodeIdType.class + " with value " + swigValue);
  }

  private UA_NodeIdType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private UA_NodeIdType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private UA_NodeIdType(String swigName, UA_NodeIdType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static UA_NodeIdType[] swigValues = { UA_NODEIDTYPE_NUMERIC, UA_NODEIDTYPE_STRING, UA_NODEIDTYPE_GUID, UA_NODEIDTYPE_BYTESTRING };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


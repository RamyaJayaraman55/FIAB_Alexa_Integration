package fiab.mes.restendpoint;

import fiab.mes.restendpoint.requests.OrderCapabilityResponse;

public class OrderCapabilityResponseWrapper {
    private String value;
    private String rootOrderId;
    private String key;



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OrderCapabilityResponseWrapper(OrderCapabilityResponse e) {
      this.value=e.getValue();
      this.rootOrderId=e.getRootId();
      this.key=e.getKey();


    }

    public String getRootOrderId() {
        return rootOrderId;
    }

    public void setRootOrderId(String rootOrderId) {
        this.rootOrderId = rootOrderId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

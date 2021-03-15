package fiab.mes.restendpoint.requests;

import ProcessCore.CapabilityInvocation;
import fiab.mes.machine.AkkaActorBackedCoreModelAbstractActor;
import fiab.mes.order.OrderProcess;

public class OrderCapabilityResponse {
    private String value;
    private String rootOrderId;
    private String key;


    public OrderCapabilityResponse(String decodedId) {
        this.rootOrderId=decodedId;

    }

    public OrderCapabilityResponse(OrderCapabilityResponse e) {
        this.rootOrderId=e.getRootId();
        this.key=e.getKey();
        this.value=e.getValue();

    }


    public OrderCapabilityResponse(String rootOrderId, OrderProcess process) {
        if (!process.doAllLeafNodeStepsHaveInvokedCapability(process.getProcess())) {
            String msg = String.format("OrderProcess %s does not have all leaf nodes with capability invocations, thus cannot be completely mapped to machines, cancelling order", rootOrderId);
             } else {

            String msg = "Capability invocations have capabilities, thus able to map them to machines. rootOrderId: "+rootOrderId;
   }
    }


    public String getValue() {
        return value;
    }

    public String getRootId() {
        return rootOrderId;
    }

    public String getKey() {
        return key;
    }


    public void setKey(CapabilityInvocation key) {
        this.key = key.getID();
    }

    public void setValue(AkkaActorBackedCoreModelAbstractActor value) {
        this.value = value.getId();
    }

    public void setRootOrderId(String rootOrderId) {
        this.rootOrderId = rootOrderId;
    }

  }

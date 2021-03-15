package fiab.mes.restendpoint.requests;

import fiab.mes.machine.AkkaActorBackedCoreModelAbstractActor;

public class OrderAllocationRequest {
    private String OrderId;
    private String MachineId;
    private String StepId;
    private String orderAllocationResponse;

    public OrderAllocationRequest(String orderId, String MachineId, String StepId ) {
    this.OrderId=orderId;
    this.MachineId=MachineId;
    this.StepId=StepId;
    }

    public String getMachineId() {
        return MachineId;
    }

    public void setMachineId(String machineId) {
        MachineId = machineId;
    }

    public String getStepId() {
        return StepId;
    }

    public void setStepId(String stepId) {
        StepId = stepId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public String getOrderAllocationResponse() {
        return orderAllocationResponse;
    }

    public void setOrderAllocationResponse(String response) {
        orderAllocationResponse = response;
    }


}

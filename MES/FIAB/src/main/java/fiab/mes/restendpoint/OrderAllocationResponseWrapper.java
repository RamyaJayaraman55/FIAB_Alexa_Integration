package fiab.mes.restendpoint;

import fiab.mes.restendpoint.requests.OrderAllocationRequest;

public class OrderAllocationResponseWrapper {
    private String machineId;
    private String orderId;
    private String stepId;
    private String orderAllocationResponse;

    public OrderAllocationResponseWrapper(OrderAllocationRequest e) {
        this.orderId = e.getOrderId();
        this.stepId = e.getStepId();
        this.machineId = e.getMachineId();
        this.orderAllocationResponse = e.getOrderAllocationResponse();

    }

    public String getMachineId() {
        return machineId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStepId() {
        return stepId;
    }

    public String getOrderAllocationResponse() {
        return orderAllocationResponse;
    }
}

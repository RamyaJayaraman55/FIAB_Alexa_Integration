package fiab.mes.restendpoint;

import fiab.mes.restendpoint.requests.OrderAvailabilityRequest;


public class OrderAvailabilityResponseWrapper {
    private String orderId;
    private String stepId;
    private String stepName;
    private String stepStatus;
    private String processStepResponse;
    private String machineId;
    private String machineCapabilityResponse;


    public OrderAvailabilityResponseWrapper(OrderAvailabilityRequest e) {
        this.orderId = e.getOrderId();
        this.stepId = e.getStepId();
        this.stepName = e.getStepName();
        this.stepStatus = e.getStepStatus();
        this.processStepResponse = e.getAvailableProcessStepsResponse();
        this.machineId = e.getMachineCapabilityId();
        this.machineCapabilityResponse = e.getMachineCapabilityResponse();

    }

    public String getOrderId() {
        return orderId;
    }

    public String getStepId() {
        return stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public String getStepStatus() {
        return stepStatus;
    }

    public String getprocessStepResponse() {
        return processStepResponse;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getMachineCapabilityResponse() {
        return machineCapabilityResponse;
    }

}

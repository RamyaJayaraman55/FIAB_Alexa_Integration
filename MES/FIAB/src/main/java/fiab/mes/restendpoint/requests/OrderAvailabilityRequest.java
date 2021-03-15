package fiab.mes.restendpoint.requests;

import ProcessCore.CapabilityInvocation;
import fiab.mes.machine.AkkaActorBackedCoreModelAbstractActor;

public class OrderAvailabilityRequest {
    private String orderId;
    private String machineId;
    private String machineCapabilityResponse;
    private String processStepId;
    private String processStepName;
    private String availableProcessStepsResponse;
    private String stepStatus;

    public String getStepStatus() {
        return stepStatus;
    }

    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    public String getMachineCapabilityResponse() {
        return machineCapabilityResponse;
    }

    public void setMachineCapabilityResponse(String machineCapabilityResponse) {
        this.machineCapabilityResponse = machineCapabilityResponse;
    }

    public OrderAvailabilityRequest(String orderId) {
        this.orderId = orderId;

    }

    public String getStepName() {
        return processStepName;
    }

    public void setStepName(String processStepName) {
        this.processStepName = processStepName;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {

        return orderId;
    }

    public String getAvailableProcessStepsResponse() {
        return availableProcessStepsResponse;
    }

    public void setAvailableProcessStepsResponse(String response) {
        availableProcessStepsResponse = response;
    }

    public void setMachineCapabilityId(AkkaActorBackedCoreModelAbstractActor value) {
        this.machineId = value.getId();
    }

    public String getMachineCapabilityId() {
        return machineId;
    }

    public void setStepId(String processStepId) {
        this.processStepId = processStepId;
    }

    public String getStepId() {
        return processStepId;
    }
}

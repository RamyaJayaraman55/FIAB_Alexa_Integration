package fiab.mes.machine.msg;

import akka.http.javadsl.server.Route;
import fiab.core.capabilities.basicmachine.events.MachineEvent;
import fiab.core.capabilities.basicmachine.events.MachineEvent.MachineEventType;
import fiab.core.capabilities.basicmachine.events.MachineUpdateEvent;
import fiab.mes.planer.msg.PlanerStatusMessage;
import fiab.mes.transport.msg.TransportSystemStatusMessage;

public class IdleMachineEventWrapper {


    private String machineId;


    //MachineUpdateEvent additional fields

    private String newValue = "";

    public IdleMachineEventWrapper(MachineEvent e) {

        this.machineId = e.getMachineId();

        if (e instanceof MachineUpdateEvent) {
            MachineUpdateEvent mue = (MachineUpdateEvent) e;

            this.newValue = mue.getValue().toString();
        } else if (e instanceof PlanerStatusMessage) {
            PlanerStatusMessage se = (PlanerStatusMessage) e;

            this.newValue = se.getState().toString();
        } else if (e instanceof TransportSystemStatusMessage) {
            TransportSystemStatusMessage se = (TransportSystemStatusMessage) e;

            this.newValue = se.getState().toString();
        }

    }

    public String getMachineId() {
        return machineId;
    }

    public String getNewValue() {
        return newValue;
    }


}




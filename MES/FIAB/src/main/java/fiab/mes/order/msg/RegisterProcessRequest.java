package fiab.mes.order.msg;

import akka.actor.ActorRef;
import fiab.mes.order.OrderProcess;

public class RegisterProcessRequest {

	protected String rootOrderId;
//	protected String processId;
	protected OrderProcess process;
	protected ActorRef orderActor;

	
	public  RegisterProcessRequest(String rootOrderId, OrderProcess process, ActorRef requestor) {
		super();
		this.rootOrderId = rootOrderId;
//		this.processId = processId;
		this.process = process;
		this.orderActor = requestor;

	}



	public String getRootOrderId() {
		return rootOrderId;
	}
	public void setRootOrderId(String rootOrderId) {
		this.rootOrderId = rootOrderId;
	}
//	public String getProcessId() {
//		return processId;
//	}
//	public void setProcessId(String processId) {
//		this.processId = processId;
//	}
	public OrderProcess getProcess() {
		return process;
	}
	public void setProcess(OrderProcess process) {
		this.process = process;
	}
	public ActorRef getRequestor() {
		return orderActor;
	}
	public void setRequestor(ActorRef requestor) {
		this.orderActor = requestor;
	}
	
}

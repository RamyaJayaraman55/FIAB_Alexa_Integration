package fiab.mes.restendpoint;

public class ActionRequest {

	private String action;
	private String id;
    private String stepStatus;
	public String getAction() {
		return action;
	}

	public String getId() {
		return id;
	}

    public String getStepStatus(){return stepStatus;}
}

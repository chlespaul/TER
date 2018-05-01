package ter;

public class Task {

	private double effort;
	private Resource resource;
	
	public Task(double effort, Resource resource){
		this.effort = effort;
		this.resource = resource;
	}

	public double getEffort() {
		return effort;
	}

	public void setEffort(double effort) {
		this.effort = effort;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	
}

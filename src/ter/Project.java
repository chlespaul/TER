package ter;

import java.util.ArrayList;
import java.util.Date;

public class Project {

	private boolean demare;
    private ArrayList<Task> taches;
    private Date debut;
    private Date fin;
    private double resources;
    private String name;
	
    public Project(Date debut, Date fin, String name) {
    	this.demare = false;
    	resources = 0.0;
    	taches = new ArrayList<Task>();
    	this.debut = debut;
    	this.fin = fin;
    	this.name = name;
    }

	public boolean isDemare() {
		return demare;
	}

	public void setDemare(boolean demare) {
		this.demare = demare;
	}

	public ArrayList<Task> getTaches() {
		return taches;
	}

	public void setTaches(ArrayList<Task> taches) {
		this.taches = taches;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public double getResources() {
		return resources;
	}

	public void setResources(double resources) {
		this.resources = resources;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public void addTask(Task task) {
    	this.taches.add(task);
    	this.resources += task.getEffort();
    }
}

package ter;

public class Resource {

	public final static int R_DEC = 22;
    public final static int R_JAN = 22;
    public final static int R_FEV = 20;
    public final static int R_MAR = 22;
    public final static int R_APR = 21;
    public final static int R_MAY = 23;
    public final static int R_JUN = 22;
    
    private String name;
    private double dec;
    private double jan;
    private double fev;
    private double mar;
    private double apr;
    private double may;
    private double jun;
    
    public Resource(String name, double dec, double jan, double fev, double mar, double apr, double may, double jun){
        
        this.name = name;
        this.dec = dec;
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
        this.apr = apr;
        this.may = may;
        this.jun = jun;
        
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDec() {
		return dec;
	}

	public void setDec(double dec) {
		this.dec = dec;
	}

	public double getJan() {
		return jan;
	}

	public void setJan(double jan) {
		this.jan = jan;
	}

	public double getFev() {
		return fev;
	}

	public void setFev(double fev) {
		this.fev = fev;
	}

	public double getMar() {
		return mar;
	}

	public void setMar(double mar) {
		this.mar = mar;
	}

	public double getApr() {
		return apr;
	}

	public void setApr(double apr) {
		this.apr = apr;
	}

	public double getMay() {
		return may;
	}

	public void setMay(double may) {
		this.may = may;
	}

	public double getJun() {
		return jun;
	}

	public void setJun(double jun) {
		this.jun = jun;
	}
    
    public double getRes (){
    	return getJan() + getFev() + getMar() + getApr() + getMay() + getJun() + getDec();
	}
	
}

package ter;

public class Resource {

	public final static int DEC = 22;
    public final static int JAN = 22;
    public final static int FEV = 20;
    public final static int MAR = 22;
    public final static int APR = 21;
    public final static int MAY = 23;
    public final static int JUN = 22;
    
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
	
}

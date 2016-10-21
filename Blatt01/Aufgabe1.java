package Blatt01;

public class Aufgabe1 {
	private static double [] outsideTemp = new double [] { 10.0, 25.0, 30.0 };
	private double tMin=15.0;
	private double tMax=20.0;
	private double current=18.0;
	
public static void main(String[] args){
	Aufgabe1 o=new Aufgabe1();
	o.run();
}
	
	private void run(){
		for(int i=0;i<10;i++){
			setCurrent((outsideTemp[i%3]+getCurrent())/2);
			if(getCurrent()>gettMax()){
				System.out.print("New Temp: "+getCurrent());
				cool();
				System.out.println(" Current Temp: "+getCurrent());
			}
			else if(getCurrent()<gettMin()){
				System.out.print("New Temp: "+getCurrent());
				heat();
				System.out.println(" Current Temp: "+getCurrent());
			}
			else {
				System.out.print("New Temp: "+getCurrent());
				passiv();
				System.out.println(" Current Temp: "+getCurrent());
			}
		}
	}
	
	private void cool(){
		setCurrent(getCurrent() - 5);
	}
	private void heat(){
		setCurrent(getCurrent() + 5);
	}

	private void passiv(){
		setCurrent(getCurrent() + 0);
	}

	public double gettMin() {
		return tMin;
	}

	public void settMin(double tMin) {
		this.tMin = tMin;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public double gettMax() {
		return tMax;
	}

	public void settMax(double tMax) {
		this.tMax = tMax;
	}
}

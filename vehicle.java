
public class vehicle{
    public String vName, vColor;
    public double  vPrice, topSpeed;
    public int nGears;
    vehicle(String vName,String vColor,float vPrice,float topSpeed,int nGears){
        this.vName = vName;
        this.vColor = vColor;
        this.vPrice = vPrice;
        this.topSpeed = topSpeed;
        this.nGears = nGears;
    }
    public void displayVehicle(){
        System.out.println("Name : " + vName +  "\nColor : " + vColor + "\nPrice : " + vPrice + "Rupees  " + "\nTop Speed : " + topSpeed + " MPH"
         + "\nNo of Gears : " + nGears + "\n");
    }
    public static void main(String []args){
        vehicle v1 = new vehicle("Nissan GTR", "Black", 21200000, 198 , 6 );
        vehicle v2 = new vehicle("Kawasaki Ninja 650", "Green", 627934 , 132 ,6);
        v1.displayVehicle();
        v2.displayVehicle();

    }
}
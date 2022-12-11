public class Plane {

    private int location;

    public Plane(){
        location = 0;
    }
    public Plane(int loc){
        if (loc >= -2000 && loc <= 2000){
            location = loc;
        }else {
            location = 0;
        }
    }
    public void upward(){
        if (location +100 <= 2000){
            location += 100;
        }
    }
    public void downward(){
        if (location - 100 >= -2000){
            location-= 100;
        }
    }
    public int getLocation(){
        return location;
    }

    // For every 100 past -2000, add a space
    public String toString(){
        int loc = location + 2000;
        String str = "";
        for (int i = 0; i < loc /100; i++){
            str += " ";
        }
        str += "@";
        return str;
    }
}

public class Oven
{
    private int maxTemp;


    private int currentTemp;

    public Oven(int maxTemperature, int startTemperature)
    {
        if (maxTemperature < 500 && maxTemperature>= 0){
            maxTemp = maxTemperature;
        } else {
            maxTemp = 500;
        }
        if (startTemperature > maxTemp){
            currentTemp = maxTemp;
        } else if (startTemperature < 0){
            currentTemp = 0;
        } else {
            currentTemp = startTemperature;
        }
    }

    public int getMaxTemp()
    {
        return this.maxTemp;
    }

    public int getCurrentTemp()
    {
        return this.currentTemp;
    }

    public void turnOff()
    {
        this.currentTemp = 0;
    }

    public boolean isOn()
    {
        return this.currentTemp > 0;
    }

    public void preheat(int temp)
    {
        if (temp > 0){
            if (temp < maxTemp){
                currentTemp = temp;
            }else {
                currentTemp = maxTemp;
            }
        }
    }
}

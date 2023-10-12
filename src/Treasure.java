public class Treasure
{
   private String myDescription;
   private double myWeight;
   private double myValue;
   private boolean legallyAcquired;

    public Treasure(String myDescription, double myWeight, double myValue)
    {
        this.myDescription = myDescription;
        this.myWeight = myWeight;
        this.myValue = myValue;
        this.legallyAcquired = true;
    }

    public String getMyDescription()
    {
        return myDescription;
    }

    public void setMyDescription(String myDescription)
    {
        this.myDescription = myDescription;
    }

    public double getMyWeight()
    {
        return myWeight;
    }

    public void setMyWeight(double myWeight)
    {
        this.myWeight = myWeight;
    }

    public double getMyValue()
    {
        return myValue;
    }

    public void setMyValue(double myValue)
    {
        this.myValue = myValue;
    }

    public boolean isLegallyAcquired()
    {
        return legallyAcquired;
    }

    public void setLegallyAcquired(boolean legallyAcquired)
    {
        this.legallyAcquired = legallyAcquired;
    }

    @Override
    public String toString()
    {
        return "Treasure{" +
                "myDescription='" + myDescription + '\'' +
                ", myWeight=" + myWeight +
                ", myValue=" + myValue +
                ", legallyAcquired=" + legallyAcquired +
                '}';
    }
}

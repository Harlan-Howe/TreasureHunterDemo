public class Collector
{
    private Treasure[] myLoot;
    private final int MAX_WEIGHT = 100;
    private final int MAX_OBJECTS = 25;
    private int numObjects;

    public Collector()
    {
        myLoot = new Treasure[MAX_OBJECTS];
        numObjects = 0;
    }

    /**
     * Adds a treasure to this collector's loot, if there is space for it; otherwise, nothing changes.
     * @param t - the object to add.
     */
    public void addObject(Treasure t)
    {
        if (numObjects == MAX_OBJECTS)
        {
            System.out.println("You already have all the objects you can hold.");
            return;
        }
        if (getWeight() + t.getMyWeight() > MAX_WEIGHT)
        {
            System.out.println("That would be too heavy.");
            return;
        }
        myLoot[numObjects] = t;
        numObjects++;
    }

    /**
     * finds the total weight of all this collector's loot.
     * @return the sum of the loot objects' weights.
     */
    public double getWeight()
    {
        double total = 0;
        for (int i = 0; i < numObjects; i++)
        {
            total += myLoot[i].getMyWeight();
        }
        return total;
    }

    /**
     * gets the total amount of money that this collection of loot is worth.
     * @return the sum of all the values of the loot.
     */
    public double getValue()
    {
        double total = 0;
        for (int i = 0; i < numObjects; i++)
        {
            total += myLoot[i].getMyValue();
        }
        return total;
    }

    /**
     * removes a particular object from this collector's loot, if he/she has it.
     * @param t - the treasure object to remove.
     */
    public void removeObject(Treasure t)
    {
        boolean foundIt = false;
        for (int i = 0; i < numObjects; i++)
        {
            if (!foundIt && myLoot[i] == t)
                foundIt = true;
            else if (foundIt)
            {
                myLoot[i - 1] = myLoot[i];
            }
        }
        if (foundIt)
        {
            numObjects--;
            myLoot[numObjects] = null;
        }
        else
            System.out.println("Did not find " + t);
    }

    /**
     * removes the treasure object stored at a specific location in the the loot pile.
     * @param idx - the index of the object to remove.
     */
    public void removeObjectAtIndex(int idx)
    {
        if (idx<0 || idx>=numObjects)
        {
            throw new ArrayIndexOutOfBoundsException("Tried to remove item at "+idx+
                    " but there are only "+numObjects+"items.");
        }
        for (int i=idx; i<numObjects; i++)
            myLoot[i] = myLoot[i+1];
        myLoot[numObjects] = null;
        numObjects--;
    }

    public String toString()
    {
        if (numObjects == 0)
            return "\tI have no loot.";
        String result = "";
        for (Treasure t: myLoot)
        {
            if (t == null)
                break;
            result+="\t"+t+"\n";
        }
        result += "That's "+numObjects+" objects with a total weight of "+getWeight()+" lbs and a total value of $"+
                getValue()+".";
        return result;
    }

}
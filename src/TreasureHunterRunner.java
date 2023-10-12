public class TreasureHunterRunner
{
    public static void main(String[] args)
    {
        Collector indy = new Collector();
        Collector belloq = new Collector();
        Collector panamaHat = new Collector();
        Treasure ark = new Treasure("ark",38,1000000);
        Treasure cross = new Treasure("gold cross",14, 50000);
        ark.setLegallyAcquired(false);
        belloq.addObject(new Treasure("gold idol",5, 50000));
        belloq.addObject(ark);
        indy.addObject(new Treasure("stones",12, 8000));
        panamaHat.addObject(cross);
        indy.addObject(new Treasure("grail",3,20000000));
        indy.addObject(new Treasure("crystal skull",19.75,7.50));
        indy.addObject(new Treasure("dial",12, 30000));
        System.out.println("Belloq:\n"+belloq);
        System.out.println("Indy:\n"+indy);
        System.out.println("Panama Hat:\n"+panamaHat);

        System.out.println("Indy steals the ark back!");
        System.out.println("Indy steals the cross back!");
        belloq.removeObject(ark);
        indy.addObject(ark);
        panamaHat.removeObjectAtIndex(0);
        indy.addObject(cross);

        System.out.println("Belloq:\n"+belloq);
        System.out.println("Indy:\n"+indy);
        System.out.println("Panama Hat:\n"+panamaHat);

    }
}

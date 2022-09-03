package CreationalPatterns.BuilderDesignPattern.CD;

/**
 * Builds CD by company type
 */
public class CDBuilder {

    /**
     * Build SOny CDs
     * @return Sony CDs
     */
    public CDType buildSonyCD(){
        CDType cds=new CDType();
        cds.addItem(new Sony());
        cds.addItem(new MusicCD());
        return cds;
    }

    /**
     * Build Samsung CDs
     * @return Samsung CDs
     */
    public CDType buildSamsungCD(){
        CDType cds=new CDType();
        cds.addItem(new Samsung());
        cds.addItem(new VideoCD());
        return cds;
    }

    /**
     * Build Panasonic CDs
     * @return Panasonic CDs
     */
    public CDType buildPanasonicCD(){
        CDType cds = new CDType();
        cds.addItem(new Panasonic());
        cds.addItem(new DataCD());
        return cds;
    }

}

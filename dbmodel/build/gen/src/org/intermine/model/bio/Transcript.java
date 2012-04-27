package org.intermine.model.bio;

public interface Transcript extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.Protein getProtein();
    public void setProtein(final org.intermine.model.bio.Protein protein);
    public void proxyProtein(final org.intermine.objectstore.proxy.ProxyReference protein);
    public org.intermine.model.InterMineObject proxGetProtein();

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.Intron> getIntrons();
    public void setIntrons(final java.util.Set<org.intermine.model.bio.Intron> introns);
    public void addIntrons(final org.intermine.model.bio.Intron arg);

    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

    public java.util.Set<org.intermine.model.bio.Exon> getExons();
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons);
    public void addExons(final org.intermine.model.bio.Exon arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.StopCodon> getStopCodons();
    public void setStopCodons(final java.util.Set<org.intermine.model.bio.StopCodon> stopCodons);
    public void addStopCodons(final org.intermine.model.bio.StopCodon arg);

    public java.util.Set<org.intermine.model.bio.StartCodon> getStartCodons();
    public void setStartCodons(final java.util.Set<org.intermine.model.bio.StartCodon> startCodons);
    public void addStartCodons(final org.intermine.model.bio.StartCodon arg);

}

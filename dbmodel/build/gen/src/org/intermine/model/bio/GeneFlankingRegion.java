package org.intermine.model.bio;

public interface GeneFlankingRegion extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.Boolean getIncludeGene();
    public void setIncludeGene(final java.lang.Boolean includeGene);

    public java.lang.String getDistance();
    public void setDistance(final java.lang.String distance);

    public java.lang.String getDirection();
    public void setDirection(final java.lang.String direction);

    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}

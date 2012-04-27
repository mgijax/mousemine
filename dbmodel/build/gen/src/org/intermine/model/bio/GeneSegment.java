package org.intermine.model.bio;

public interface GeneSegment extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

}

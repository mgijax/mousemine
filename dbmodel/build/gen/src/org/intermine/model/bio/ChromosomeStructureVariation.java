package org.intermine.model.bio;

public interface ChromosomeStructureVariation extends org.intermine.model.bio.SequenceCollection
{
    public org.intermine.model.bio.Chromosome getChromosome();
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome);
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome);
    public org.intermine.model.InterMineObject proxGetChromosome();

}

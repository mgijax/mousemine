package org.intermine.model.bio;

public interface SequenceFeature extends org.intermine.model.bio.BioEntity
{
    public java.lang.Integer getLength();
    public void setLength(final java.lang.Integer length);

    public java.lang.String getScoreType();
    public void setScoreType(final java.lang.String scoreType);

    public java.lang.Double getScore();
    public void setScore(final java.lang.Double score);

    public org.intermine.model.bio.Chromosome getChromosome();
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome);
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome);
    public org.intermine.model.InterMineObject proxGetChromosome();

    public org.intermine.model.bio.Location getChromosomeLocation();
    public void setChromosomeLocation(final org.intermine.model.bio.Location chromosomeLocation);
    public void proxyChromosomeLocation(final org.intermine.objectstore.proxy.ProxyReference chromosomeLocation);
    public org.intermine.model.InterMineObject proxGetChromosomeLocation();

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm();
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm);
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm);
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm();

    public java.util.Set<org.intermine.model.bio.Allele> getAlleles();
    public void setAlleles(final java.util.Set<org.intermine.model.bio.Allele> alleles);
    public void addAlleles(final org.intermine.model.bio.Allele arg);

    public java.util.Set<org.intermine.model.bio.SequenceFeature> getOverlappingFeatures();
    public void setOverlappingFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures);
    public void addOverlappingFeatures(final org.intermine.model.bio.SequenceFeature arg);

}

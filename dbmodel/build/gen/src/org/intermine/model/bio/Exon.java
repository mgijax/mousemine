package org.intermine.model.bio;

public interface Exon extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.Gene getGene();
    public void setGene(final org.intermine.model.bio.Gene gene);
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene);
    public org.intermine.model.InterMineObject proxGetGene();

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

}

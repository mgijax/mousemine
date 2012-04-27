package org.intermine.model.bio;

public interface Protein extends org.intermine.model.bio.BioEntity
{
    public java.lang.Integer getMolecularWeight();
    public void setMolecularWeight(final java.lang.Integer molecularWeight);

    public java.lang.String getMd5checksum();
    public void setMd5checksum(final java.lang.String md5checksum);

    public java.lang.Integer getLength();
    public void setLength(final java.lang.Integer length);

    public java.lang.String getPrimaryAccession();
    public void setPrimaryAccession(final java.lang.String primaryAccession);

    public org.intermine.model.bio.Sequence getSequence();
    public void setSequence(final org.intermine.model.bio.Sequence sequence);
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence);
    public org.intermine.model.InterMineObject proxGetSequence();

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.Gene> getGenes();
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes);
    public void addGenes(final org.intermine.model.bio.Gene arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

}

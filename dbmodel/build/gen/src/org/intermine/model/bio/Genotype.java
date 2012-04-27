package org.intermine.model.bio;

public interface Genotype extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getExistsAs();
    public void setExistsAs(final java.lang.String existsAs);

    public java.lang.Boolean getIsConditional();
    public void setIsConditional(final java.lang.Boolean isConditional);

    public java.lang.String getNote();
    public void setNote(final java.lang.String note);

    public org.intermine.model.bio.Strain getBackground();
    public void setBackground(final org.intermine.model.bio.Strain background);
    public void proxyBackground(final org.intermine.objectstore.proxy.ProxyReference background);
    public org.intermine.model.InterMineObject proxGetBackground();

    public java.util.Set<org.intermine.model.bio.Allele> getAlleles();
    public void setAlleles(final java.util.Set<org.intermine.model.bio.Allele> alleles);
    public void addAlleles(final org.intermine.model.bio.Allele arg);

    public java.util.Set<org.intermine.model.bio.GenotypeAllelePair> getAllelePairs();
    public void setAllelePairs(final java.util.Set<org.intermine.model.bio.GenotypeAllelePair> allelePairs);
    public void addAllelePairs(final org.intermine.model.bio.GenotypeAllelePair arg);

}

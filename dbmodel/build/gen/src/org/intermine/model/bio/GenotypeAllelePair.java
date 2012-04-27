package org.intermine.model.bio;

public interface GenotypeAllelePair extends org.intermine.model.InterMineObject
{
    public java.lang.String getPairState();
    public void setPairState(final java.lang.String pairState);

    public org.intermine.model.bio.SequenceFeature getFeature();
    public void setFeature(final org.intermine.model.bio.SequenceFeature feature);
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature);
    public org.intermine.model.InterMineObject proxGetFeature();

    public org.intermine.model.bio.Allele getAllele2();
    public void setAllele2(final org.intermine.model.bio.Allele allele2);
    public void proxyAllele2(final org.intermine.objectstore.proxy.ProxyReference allele2);
    public org.intermine.model.InterMineObject proxGetAllele2();

    public org.intermine.model.bio.Allele getAllele1();
    public void setAllele1(final org.intermine.model.bio.Allele allele1);
    public void proxyAllele1(final org.intermine.objectstore.proxy.ProxyReference allele1);
    public org.intermine.model.InterMineObject proxGetAllele1();

    public org.intermine.model.bio.Genotype getGenotype();
    public void setGenotype(final org.intermine.model.bio.Genotype genotype);
    public void proxyGenotype(final org.intermine.objectstore.proxy.ProxyReference genotype);
    public org.intermine.model.InterMineObject proxGetGenotype();

}

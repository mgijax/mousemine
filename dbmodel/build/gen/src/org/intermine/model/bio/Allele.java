package org.intermine.model.bio;

public interface Allele extends org.intermine.model.bio.SequenceCollection
{
    public java.lang.String getAlleleType();
    public void setAlleleType(final java.lang.String alleleType);

    public java.lang.Boolean getIsWildType();
    public void setIsWildType(final java.lang.Boolean isWildType);

    public org.intermine.model.bio.Strain getStrainOfOrigin();
    public void setStrainOfOrigin(final org.intermine.model.bio.Strain strainOfOrigin);
    public void proxyStrainOfOrigin(final org.intermine.objectstore.proxy.ProxyReference strainOfOrigin);
    public org.intermine.model.InterMineObject proxGetStrainOfOrigin();

    public org.intermine.model.bio.SequenceFeature getFeature();
    public void setFeature(final org.intermine.model.bio.SequenceFeature feature);
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature);
    public org.intermine.model.InterMineObject proxGetFeature();

    public java.util.Set<org.intermine.model.bio.Genotype> getGenotypes();
    public void setGenotypes(final java.util.Set<org.intermine.model.bio.Genotype> genotypes);
    public void addGenotypes(final org.intermine.model.bio.Genotype arg);

}

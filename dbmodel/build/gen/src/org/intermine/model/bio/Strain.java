package org.intermine.model.bio;

public interface Strain extends org.intermine.model.bio.BioEntity
{
    public java.lang.String getStrainType();
    public void setStrainType(final java.lang.String strainType);

    public java.util.Set<org.intermine.model.bio.Genotype> getGenotypes();
    public void setGenotypes(final java.util.Set<org.intermine.model.bio.Genotype> genotypes);
    public void addGenotypes(final org.intermine.model.bio.Genotype arg);

}

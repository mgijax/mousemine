package org.intermine.model.bio;

public interface BioEntity extends org.intermine.model.InterMineObject
{
    public java.lang.String getSecondaryIdentifier();
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier);

    public java.lang.String getSymbol();
    public void setSymbol(final java.lang.String symbol);

    public java.lang.String getPrimaryIdentifier();
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public org.intermine.model.bio.Organism getOrganism();
    public void setOrganism(final org.intermine.model.bio.Organism organism);
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism);
    public org.intermine.model.InterMineObject proxGetOrganism();

    public java.util.Set<org.intermine.model.bio.Location> getLocatedFeatures();
    public void setLocatedFeatures(final java.util.Set<org.intermine.model.bio.Location> locatedFeatures);
    public void addLocatedFeatures(final org.intermine.model.bio.Location arg);

    public java.util.Set<org.intermine.model.bio.Location> getLocations();
    public void setLocations(final java.util.Set<org.intermine.model.bio.Location> locations);
    public void addLocations(final org.intermine.model.bio.Location arg);

    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations();
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations);
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg);

    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms();
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms);
    public void addSynonyms(final org.intermine.model.bio.Synonym arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

    public java.util.Set<org.intermine.model.bio.CrossReference> getCrossReferences();
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.CrossReference> crossReferences);
    public void addCrossReferences(final org.intermine.model.bio.CrossReference arg);

}

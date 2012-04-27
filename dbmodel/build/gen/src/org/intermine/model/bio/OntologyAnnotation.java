package org.intermine.model.bio;

public interface OntologyAnnotation extends org.intermine.model.InterMineObject
{
    public java.lang.String getQualifier();
    public void setQualifier(final java.lang.String qualifier);

    public org.intermine.model.bio.OntologyTerm getOntologyTerm();
    public void setOntologyTerm(final org.intermine.model.bio.OntologyTerm ontologyTerm);
    public void proxyOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference ontologyTerm);
    public org.intermine.model.InterMineObject proxGetOntologyTerm();

    public org.intermine.model.bio.BioEntity getSubject();
    public void setSubject(final org.intermine.model.bio.BioEntity subject);
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject);
    public org.intermine.model.InterMineObject proxGetSubject();

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

    public java.util.Set<org.intermine.model.bio.OntologyAnnotationEvidence> getEvidence();
    public void setEvidence(final java.util.Set<org.intermine.model.bio.OntologyAnnotationEvidence> evidence);
    public void addEvidence(final org.intermine.model.bio.OntologyAnnotationEvidence arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}

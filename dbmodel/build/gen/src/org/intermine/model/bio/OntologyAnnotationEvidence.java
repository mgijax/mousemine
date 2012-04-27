package org.intermine.model.bio;

public interface OntologyAnnotationEvidence extends org.intermine.model.InterMineObject
{
    public java.lang.String getInferredFrom();
    public void setInferredFrom(final java.lang.String inferredFrom);

    public org.intermine.model.bio.OntologyAnnotationEvidenceCode getCode();
    public void setCode(final org.intermine.model.bio.OntologyAnnotationEvidenceCode code);
    public void proxyCode(final org.intermine.objectstore.proxy.ProxyReference code);
    public org.intermine.model.InterMineObject proxGetCode();

    public org.intermine.model.bio.OntologyAnnotation getAnnotation();
    public void setAnnotation(final org.intermine.model.bio.OntologyAnnotation annotation);
    public void proxyAnnotation(final org.intermine.objectstore.proxy.ProxyReference annotation);
    public org.intermine.model.InterMineObject proxGetAnnotation();

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}

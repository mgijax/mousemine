package org.intermine.model.bio;

public interface OrthologueEvidence extends org.intermine.model.InterMineObject
{
    public org.intermine.model.bio.OrthologueEvidenceCode getEvidenceCode();
    public void setEvidenceCode(final org.intermine.model.bio.OrthologueEvidenceCode evidenceCode);
    public void proxyEvidenceCode(final org.intermine.objectstore.proxy.ProxyReference evidenceCode);
    public org.intermine.model.InterMineObject proxGetEvidenceCode();

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}

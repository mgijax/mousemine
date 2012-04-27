package org.intermine.model.bio;

public interface OntologyRelation extends org.intermine.model.InterMineObject
{
    public java.lang.String getRelationship();
    public void setRelationship(final java.lang.String relationship);

    public java.lang.Boolean getRedundant();
    public void setRedundant(final java.lang.Boolean redundant);

    public java.lang.Boolean getDirect();
    public void setDirect(final java.lang.Boolean direct);

    public org.intermine.model.bio.OntologyTerm getChildTerm();
    public void setChildTerm(final org.intermine.model.bio.OntologyTerm childTerm);
    public void proxyChildTerm(final org.intermine.objectstore.proxy.ProxyReference childTerm);
    public org.intermine.model.InterMineObject proxGetChildTerm();

    public org.intermine.model.bio.OntologyTerm getParentTerm();
    public void setParentTerm(final org.intermine.model.bio.OntologyTerm parentTerm);
    public void proxyParentTerm(final org.intermine.objectstore.proxy.ProxyReference parentTerm);
    public org.intermine.model.InterMineObject proxGetParentTerm();

}

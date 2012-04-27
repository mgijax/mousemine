package org.intermine.model.bio;

public interface SequenceCollection extends org.intermine.model.bio.BioEntity
{
    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm();
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm);
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm);
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm();

}

package org.intermine.model.bio;

public interface SyntenicRegion extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.SyntenicRegion getPartner();
    public void setPartner(final org.intermine.model.bio.SyntenicRegion partner);
    public void proxyPartner(final org.intermine.objectstore.proxy.ProxyReference partner);
    public org.intermine.model.InterMineObject proxGetPartner();

}

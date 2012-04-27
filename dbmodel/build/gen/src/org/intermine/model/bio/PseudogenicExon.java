package org.intermine.model.bio;

public interface PseudogenicExon extends org.intermine.model.bio.PseudogenicRegion
{
    public org.intermine.model.bio.PseudogenicTranscript getPseudogenicTranscript();
    public void setPseudogenicTranscript(final org.intermine.model.bio.PseudogenicTranscript pseudogenicTranscript);
    public void proxyPseudogenicTranscript(final org.intermine.objectstore.proxy.ProxyReference pseudogenicTranscript);
    public org.intermine.model.InterMineObject proxGetPseudogenicTranscript();

}

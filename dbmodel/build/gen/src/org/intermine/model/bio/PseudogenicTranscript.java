package org.intermine.model.bio;

public interface PseudogenicTranscript extends org.intermine.model.bio.PseudogenicRegion
{
    public org.intermine.model.bio.Pseudogene getPseudogene();
    public void setPseudogene(final org.intermine.model.bio.Pseudogene pseudogene);
    public void proxyPseudogene(final org.intermine.objectstore.proxy.ProxyReference pseudogene);
    public org.intermine.model.InterMineObject proxGetPseudogene();

    public java.util.Set<org.intermine.model.bio.PseudogenicExon> getPseudogenicExons();
    public void setPseudogenicExons(final java.util.Set<org.intermine.model.bio.PseudogenicExon> pseudogenicExons);
    public void addPseudogenicExons(final org.intermine.model.bio.PseudogenicExon arg);

}

package org.intermine.model.bio;

public interface StartCodon extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.CDS getcDS();
    public void setcDS(final org.intermine.model.bio.CDS CDS);
    public void proxycDS(final org.intermine.objectstore.proxy.ProxyReference CDS);
    public org.intermine.model.InterMineObject proxGetcDS();

    public org.intermine.model.bio.Transcript getTranscript();
    public void setTranscript(final org.intermine.model.bio.Transcript transcript);
    public void proxyTranscript(final org.intermine.objectstore.proxy.ProxyReference transcript);
    public org.intermine.model.InterMineObject proxGetTranscript();

}

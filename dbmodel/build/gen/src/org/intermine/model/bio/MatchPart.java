package org.intermine.model.bio;

public interface MatchPart extends org.intermine.model.bio.SequenceFeature
{
    public org.intermine.model.bio.Match getMatch();
    public void setMatch(final org.intermine.model.bio.Match match);
    public void proxyMatch(final org.intermine.objectstore.proxy.ProxyReference match);
    public org.intermine.model.InterMineObject proxGetMatch();

}

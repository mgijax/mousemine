package org.intermine.model.bio;

public interface CrossReference extends org.intermine.model.InterMineObject
{
    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public org.intermine.model.bio.BioEntity getSubject();
    public void setSubject(final org.intermine.model.bio.BioEntity subject);
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject);
    public org.intermine.model.InterMineObject proxGetSubject();

    public org.intermine.model.bio.DataSource getSource();
    public void setSource(final org.intermine.model.bio.DataSource source);
    public void proxySource(final org.intermine.objectstore.proxy.ProxyReference source);
    public org.intermine.model.InterMineObject proxGetSource();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}

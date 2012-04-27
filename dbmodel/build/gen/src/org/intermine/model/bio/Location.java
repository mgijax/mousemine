package org.intermine.model.bio;

public interface Location extends org.intermine.model.InterMineObject
{
    public java.lang.Integer getStart();
    public void setStart(final java.lang.Integer start);

    public java.lang.Integer getEnd();
    public void setEnd(final java.lang.Integer end);

    public java.lang.String getStrand();
    public void setStrand(final java.lang.String strand);

    public org.intermine.model.bio.BioEntity getFeature();
    public void setFeature(final org.intermine.model.bio.BioEntity feature);
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature);
    public org.intermine.model.InterMineObject proxGetFeature();

    public org.intermine.model.bio.BioEntity getLocatedOn();
    public void setLocatedOn(final org.intermine.model.bio.BioEntity locatedOn);
    public void proxyLocatedOn(final org.intermine.objectstore.proxy.ProxyReference locatedOn);
    public org.intermine.model.InterMineObject proxGetLocatedOn();

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}

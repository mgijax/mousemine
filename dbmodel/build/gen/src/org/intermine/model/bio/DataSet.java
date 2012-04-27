package org.intermine.model.bio;

public interface DataSet extends org.intermine.model.InterMineObject
{
    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getVersion();
    public void setVersion(final java.lang.String version);

    public java.lang.String getUrl();
    public void setUrl(final java.lang.String url);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public org.intermine.model.bio.DataSource getDataSource();
    public void setDataSource(final org.intermine.model.bio.DataSource dataSource);
    public void proxyDataSource(final org.intermine.objectstore.proxy.ProxyReference dataSource);
    public org.intermine.model.InterMineObject proxGetDataSource();

    public java.util.Set<org.intermine.model.bio.BioEntity> getBioEntities();
    public void setBioEntities(final java.util.Set<org.intermine.model.bio.BioEntity> bioEntities);
    public void addBioEntities(final org.intermine.model.bio.BioEntity arg);

}

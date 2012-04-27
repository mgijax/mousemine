package org.intermine.model.bio;

public interface DataSource extends org.intermine.model.InterMineObject
{
    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getUrl();
    public void setUrl(final java.lang.String url);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}

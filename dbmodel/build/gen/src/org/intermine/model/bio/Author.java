package org.intermine.model.bio;

public interface Author extends org.intermine.model.InterMineObject
{
    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.util.Set<org.intermine.model.bio.Publication> getPublications();
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications);
    public void addPublications(final org.intermine.model.bio.Publication arg);

}

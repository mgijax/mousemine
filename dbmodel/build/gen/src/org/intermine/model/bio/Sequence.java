package org.intermine.model.bio;

public interface Sequence extends org.intermine.model.InterMineObject
{
    public java.lang.String getMd5checksum();
    public void setMd5checksum(final java.lang.String md5checksum);

    public int getLength();
    public void setLength(final int length);

    public org.intermine.objectstore.query.ClobAccess getResidues();
    public void setResidues(final org.intermine.objectstore.query.ClobAccess residues);

}

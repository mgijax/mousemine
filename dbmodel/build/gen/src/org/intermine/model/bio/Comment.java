package org.intermine.model.bio;

public interface Comment extends org.intermine.model.InterMineObject
{
    public java.lang.String getType();
    public void setType(final java.lang.String type);

    public java.lang.String getText();
    public void setText(final java.lang.String text);

}

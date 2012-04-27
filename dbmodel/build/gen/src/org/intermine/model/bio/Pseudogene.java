package org.intermine.model.bio;

public interface Pseudogene extends org.intermine.model.bio.PseudogenicRegion
{
    public java.util.Set<org.intermine.model.bio.PseudogenicTranscript> getPseudogenicTranscripts();
    public void setPseudogenicTranscripts(final java.util.Set<org.intermine.model.bio.PseudogenicTranscript> pseudogenicTranscripts);
    public void addPseudogenicTranscripts(final org.intermine.model.bio.PseudogenicTranscript arg);

}

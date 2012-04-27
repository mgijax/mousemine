package org.intermine.model.bio;

public interface Gene extends org.intermine.model.bio.SequenceFeature
{
    public java.lang.String getNcbiGeneNumber();
    public void setNcbiGeneNumber(final java.lang.String ncbiGeneNumber);

    public org.intermine.model.bio.IntergenicRegion getDownstreamIntergenicRegion();
    public void setDownstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion downstreamIntergenicRegion);
    public void proxyDownstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference downstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetDownstreamIntergenicRegion();

    public org.intermine.model.bio.IntergenicRegion getUpstreamIntergenicRegion();
    public void setUpstreamIntergenicRegion(final org.intermine.model.bio.IntergenicRegion upstreamIntergenicRegion);
    public void proxyUpstreamIntergenicRegion(final org.intermine.objectstore.proxy.ProxyReference upstreamIntergenicRegion);
    public org.intermine.model.InterMineObject proxGetUpstreamIntergenicRegion();

    public java.util.Set<org.intermine.model.bio.GeneSegment> getGeneSegments();
    public void setGeneSegments(final java.util.Set<org.intermine.model.bio.GeneSegment> geneSegments);
    public void addGeneSegments(final org.intermine.model.bio.GeneSegment arg);

    public java.util.Set<org.intermine.model.bio.GOAnnotation> getGoAnnotation();
    public void setGoAnnotation(final java.util.Set<org.intermine.model.bio.GOAnnotation> goAnnotation);
    public void addGoAnnotation(final org.intermine.model.bio.GOAnnotation arg);

    public java.util.Set<org.intermine.model.bio.Transcript> getTranscripts();
    public void setTranscripts(final java.util.Set<org.intermine.model.bio.Transcript> transcripts);
    public void addTranscripts(final org.intermine.model.bio.Transcript arg);

    public java.util.Set<org.intermine.model.bio.Protein> getProteins();
    public void setProteins(final java.util.Set<org.intermine.model.bio.Protein> proteins);
    public void addProteins(final org.intermine.model.bio.Protein arg);

    public java.util.Set<org.intermine.model.bio.UTR> getuTRs();
    public void setuTRs(final java.util.Set<org.intermine.model.bio.UTR> UTRs);
    public void adduTRs(final org.intermine.model.bio.UTR arg);

    public java.util.Set<org.intermine.model.bio.CDS> getcDSs();
    public void setcDSs(final java.util.Set<org.intermine.model.bio.CDS> CDSs);
    public void addcDSs(final org.intermine.model.bio.CDS arg);

    public java.util.Set<org.intermine.model.bio.Homologue> getHomologues();
    public void setHomologues(final java.util.Set<org.intermine.model.bio.Homologue> homologues);
    public void addHomologues(final org.intermine.model.bio.Homologue arg);

    public java.util.Set<org.intermine.model.bio.Exon> getExons();
    public void setExons(final java.util.Set<org.intermine.model.bio.Exon> exons);
    public void addExons(final org.intermine.model.bio.Exon arg);

    public java.util.Set<org.intermine.model.bio.GeneFlankingRegion> getFlankingRegions();
    public void setFlankingRegions(final java.util.Set<org.intermine.model.bio.GeneFlankingRegion> flankingRegions);
    public void addFlankingRegions(final org.intermine.model.bio.GeneFlankingRegion arg);

    public java.util.Set<org.intermine.model.bio.Intron> getIntrons();
    public void setIntrons(final java.util.Set<org.intermine.model.bio.Intron> introns);
    public void addIntrons(final org.intermine.model.bio.Intron arg);

}

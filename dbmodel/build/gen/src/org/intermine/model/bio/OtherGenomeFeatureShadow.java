package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class OtherGenomeFeatureShadow implements OtherGenomeFeature, ShadowClass
{
    public static final Class<OtherGenomeFeature> shadowOf = OtherGenomeFeature.class;
    // Attr: org.intermine.model.bio.SequenceFeature.length
    protected java.lang.Integer length;
    public java.lang.Integer getLength() { return length; }
    public void setLength(final java.lang.Integer length) { this.length = length; }

    // Attr: org.intermine.model.bio.SequenceFeature.scoreType
    protected java.lang.String scoreType;
    public java.lang.String getScoreType() { return scoreType; }
    public void setScoreType(final java.lang.String scoreType) { this.scoreType = scoreType; }

    // Attr: org.intermine.model.bio.SequenceFeature.score
    protected java.lang.Double score;
    public java.lang.Double getScore() { return score; }
    public void setScore(final java.lang.Double score) { this.score = score; }

    // Ref: org.intermine.model.bio.SequenceFeature.chromosome
    protected org.intermine.model.InterMineObject chromosome;
    public org.intermine.model.bio.Chromosome getChromosome() { if (chromosome instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Chromosome) ((org.intermine.objectstore.proxy.ProxyReference) chromosome).getObject()); }; return (org.intermine.model.bio.Chromosome) chromosome; }
    public void setChromosome(final org.intermine.model.bio.Chromosome chromosome) { this.chromosome = chromosome; }
    public void proxyChromosome(final org.intermine.objectstore.proxy.ProxyReference chromosome) { this.chromosome = chromosome; }
    public org.intermine.model.InterMineObject proxGetChromosome() { return chromosome; }

    // Ref: org.intermine.model.bio.SequenceFeature.chromosomeLocation
    protected org.intermine.model.InterMineObject chromosomeLocation;
    public org.intermine.model.bio.Location getChromosomeLocation() { if (chromosomeLocation instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Location) ((org.intermine.objectstore.proxy.ProxyReference) chromosomeLocation).getObject()); }; return (org.intermine.model.bio.Location) chromosomeLocation; }
    public void setChromosomeLocation(final org.intermine.model.bio.Location chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public void proxyChromosomeLocation(final org.intermine.objectstore.proxy.ProxyReference chromosomeLocation) { this.chromosomeLocation = chromosomeLocation; }
    public org.intermine.model.InterMineObject proxGetChromosomeLocation() { return chromosomeLocation; }

    // Ref: org.intermine.model.bio.SequenceFeature.sequence
    protected org.intermine.model.InterMineObject sequence;
    public org.intermine.model.bio.Sequence getSequence() { if (sequence instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Sequence) ((org.intermine.objectstore.proxy.ProxyReference) sequence).getObject()); }; return (org.intermine.model.bio.Sequence) sequence; }
    public void setSequence(final org.intermine.model.bio.Sequence sequence) { this.sequence = sequence; }
    public void proxySequence(final org.intermine.objectstore.proxy.ProxyReference sequence) { this.sequence = sequence; }
    public org.intermine.model.InterMineObject proxGetSequence() { return sequence; }

    // Ref: org.intermine.model.bio.SequenceFeature.sequenceOntologyTerm
    protected org.intermine.model.InterMineObject sequenceOntologyTerm;
    public org.intermine.model.bio.SOTerm getSequenceOntologyTerm() { if (sequenceOntologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.SOTerm) ((org.intermine.objectstore.proxy.ProxyReference) sequenceOntologyTerm).getObject()); }; return (org.intermine.model.bio.SOTerm) sequenceOntologyTerm; }
    public void setSequenceOntologyTerm(final org.intermine.model.bio.SOTerm sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public void proxySequenceOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference sequenceOntologyTerm) { this.sequenceOntologyTerm = sequenceOntologyTerm; }
    public org.intermine.model.InterMineObject proxGetSequenceOntologyTerm() { return sequenceOntologyTerm; }

    // Col: org.intermine.model.bio.SequenceFeature.alleles
    protected java.util.Set<org.intermine.model.bio.Allele> alleles = new java.util.HashSet<org.intermine.model.bio.Allele>();
    public java.util.Set<org.intermine.model.bio.Allele> getAlleles() { return alleles; }
    public void setAlleles(final java.util.Set<org.intermine.model.bio.Allele> alleles) { this.alleles = alleles; }
    public void addAlleles(final org.intermine.model.bio.Allele arg) { alleles.add(arg); }

    // Col: org.intermine.model.bio.SequenceFeature.overlappingFeatures
    protected java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures = new java.util.HashSet<org.intermine.model.bio.SequenceFeature>();
    public java.util.Set<org.intermine.model.bio.SequenceFeature> getOverlappingFeatures() { return overlappingFeatures; }
    public void setOverlappingFeatures(final java.util.Set<org.intermine.model.bio.SequenceFeature> overlappingFeatures) { this.overlappingFeatures = overlappingFeatures; }
    public void addOverlappingFeatures(final org.intermine.model.bio.SequenceFeature arg) { overlappingFeatures.add(arg); }

    // Attr: org.intermine.model.bio.BioEntity.secondaryIdentifier
    protected java.lang.String secondaryIdentifier;
    public java.lang.String getSecondaryIdentifier() { return secondaryIdentifier; }
    public void setSecondaryIdentifier(final java.lang.String secondaryIdentifier) { this.secondaryIdentifier = secondaryIdentifier; }

    // Attr: org.intermine.model.bio.BioEntity.symbol
    protected java.lang.String symbol;
    public java.lang.String getSymbol() { return symbol; }
    public void setSymbol(final java.lang.String symbol) { this.symbol = symbol; }

    // Attr: org.intermine.model.bio.BioEntity.primaryIdentifier
    protected java.lang.String primaryIdentifier;
    public java.lang.String getPrimaryIdentifier() { return primaryIdentifier; }
    public void setPrimaryIdentifier(final java.lang.String primaryIdentifier) { this.primaryIdentifier = primaryIdentifier; }

    // Attr: org.intermine.model.bio.BioEntity.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Ref: org.intermine.model.bio.BioEntity.organism
    protected org.intermine.model.InterMineObject organism;
    public org.intermine.model.bio.Organism getOrganism() { if (organism instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Organism) ((org.intermine.objectstore.proxy.ProxyReference) organism).getObject()); }; return (org.intermine.model.bio.Organism) organism; }
    public void setOrganism(final org.intermine.model.bio.Organism organism) { this.organism = organism; }
    public void proxyOrganism(final org.intermine.objectstore.proxy.ProxyReference organism) { this.organism = organism; }
    public org.intermine.model.InterMineObject proxGetOrganism() { return organism; }

    // Col: org.intermine.model.bio.BioEntity.locatedFeatures
    protected java.util.Set<org.intermine.model.bio.Location> locatedFeatures = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocatedFeatures() { return locatedFeatures; }
    public void setLocatedFeatures(final java.util.Set<org.intermine.model.bio.Location> locatedFeatures) { this.locatedFeatures = locatedFeatures; }
    public void addLocatedFeatures(final org.intermine.model.bio.Location arg) { locatedFeatures.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.locations
    protected java.util.Set<org.intermine.model.bio.Location> locations = new java.util.HashSet<org.intermine.model.bio.Location>();
    public java.util.Set<org.intermine.model.bio.Location> getLocations() { return locations; }
    public void setLocations(final java.util.Set<org.intermine.model.bio.Location> locations) { this.locations = locations; }
    public void addLocations(final org.intermine.model.bio.Location arg) { locations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.ontologyAnnotations
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations = new java.util.HashSet<org.intermine.model.bio.OntologyAnnotation>();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations() { return ontologyAnnotations; }
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations) { this.ontologyAnnotations = ontologyAnnotations; }
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg) { ontologyAnnotations.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.synonyms
    protected java.util.Set<org.intermine.model.bio.Synonym> synonyms = new java.util.HashSet<org.intermine.model.bio.Synonym>();
    public java.util.Set<org.intermine.model.bio.Synonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.Synonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.Synonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.BioEntity.crossReferences
    protected java.util.Set<org.intermine.model.bio.CrossReference> crossReferences = new java.util.HashSet<org.intermine.model.bio.CrossReference>();
    public java.util.Set<org.intermine.model.bio.CrossReference> getCrossReferences() { return crossReferences; }
    public void setCrossReferences(final java.util.Set<org.intermine.model.bio.CrossReference> crossReferences) { this.crossReferences = crossReferences; }
    public void addCrossReferences(final org.intermine.model.bio.CrossReference arg) { crossReferences.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof OtherGenomeFeature && id != null) ? id.equals(((OtherGenomeFeature)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "OtherGenomeFeature [chromosome=" + (chromosome == null ? "null" : (chromosome.getId() == null ? "no id" : chromosome.getId().toString())) + ", chromosomeLocation=" + (chromosomeLocation == null ? "null" : (chromosomeLocation.getId() == null ? "no id" : chromosomeLocation.getId().toString())) + ", id=\"" + id + "\", length=\"" + length + "\", name=\"" + name + "\", organism=" + (organism == null ? "null" : (organism.getId() == null ? "no id" : organism.getId().toString())) + ", primaryIdentifier=\"" + primaryIdentifier + "\", score=\"" + score + "\", scoreType=\"" + scoreType + "\", secondaryIdentifier=\"" + secondaryIdentifier + "\", sequence=" + (sequence == null ? "null" : (sequence.getId() == null ? "no id" : sequence.getId().toString())) + ", sequenceOntologyTerm=" + (sequenceOntologyTerm == null ? "null" : (sequenceOntologyTerm.getId() == null ? "no id" : sequenceOntologyTerm.getId().toString())) + ", symbol=\"" + symbol + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("chromosome".equals(fieldName)) {
            if (chromosome instanceof ProxyReference) {
                return ((ProxyReference) chromosome).getObject();
            } else {
                return chromosome;
            }
        }
        if ("chromosomeLocation".equals(fieldName)) {
            if (chromosomeLocation instanceof ProxyReference) {
                return ((ProxyReference) chromosomeLocation).getObject();
            } else {
                return chromosomeLocation;
            }
        }
        if ("sequence".equals(fieldName)) {
            if (sequence instanceof ProxyReference) {
                return ((ProxyReference) sequence).getObject();
            } else {
                return sequence;
            }
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            if (sequenceOntologyTerm instanceof ProxyReference) {
                return ((ProxyReference) sequenceOntologyTerm).getObject();
            } else {
                return sequenceOntologyTerm;
            }
        }
        if ("alleles".equals(fieldName)) {
            return alleles;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("organism".equals(fieldName)) {
            if (organism instanceof ProxyReference) {
                return ((ProxyReference) organism).getObject();
            } else {
                return organism;
            }
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OtherGenomeFeature.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("length".equals(fieldName)) {
            return length;
        }
        if ("scoreType".equals(fieldName)) {
            return scoreType;
        }
        if ("score".equals(fieldName)) {
            return score;
        }
        if ("chromosome".equals(fieldName)) {
            return chromosome;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return chromosomeLocation;
        }
        if ("sequence".equals(fieldName)) {
            return sequence;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return sequenceOntologyTerm;
        }
        if ("alleles".equals(fieldName)) {
            return alleles;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return overlappingFeatures;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return secondaryIdentifier;
        }
        if ("symbol".equals(fieldName)) {
            return symbol;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return primaryIdentifier;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("organism".equals(fieldName)) {
            return organism;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return locatedFeatures;
        }
        if ("locations".equals(fieldName)) {
            return locations;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("crossReferences".equals(fieldName)) {
            return crossReferences;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OtherGenomeFeature.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("length".equals(fieldName)) {
            length = (java.lang.Integer) value;
        } else if ("scoreType".equals(fieldName)) {
            scoreType = (java.lang.String) value;
        } else if ("score".equals(fieldName)) {
            score = (java.lang.Double) value;
        } else if ("chromosome".equals(fieldName)) {
            chromosome = (org.intermine.model.InterMineObject) value;
        } else if ("chromosomeLocation".equals(fieldName)) {
            chromosomeLocation = (org.intermine.model.InterMineObject) value;
        } else if ("sequence".equals(fieldName)) {
            sequence = (org.intermine.model.InterMineObject) value;
        } else if ("sequenceOntologyTerm".equals(fieldName)) {
            sequenceOntologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("alleles".equals(fieldName)) {
            alleles = (java.util.Set) value;
        } else if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures = (java.util.Set) value;
        } else if ("secondaryIdentifier".equals(fieldName)) {
            secondaryIdentifier = (java.lang.String) value;
        } else if ("symbol".equals(fieldName)) {
            symbol = (java.lang.String) value;
        } else if ("primaryIdentifier".equals(fieldName)) {
            primaryIdentifier = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("organism".equals(fieldName)) {
            organism = (org.intermine.model.InterMineObject) value;
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures = (java.util.Set) value;
        } else if ("locations".equals(fieldName)) {
            locations = (java.util.Set) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.OtherGenomeFeature.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("length".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("scoreType".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("score".equals(fieldName)) {
            return java.lang.Double.class;
        }
        if ("chromosome".equals(fieldName)) {
            return org.intermine.model.bio.Chromosome.class;
        }
        if ("chromosomeLocation".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("sequence".equals(fieldName)) {
            return org.intermine.model.bio.Sequence.class;
        }
        if ("sequenceOntologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.SOTerm.class;
        }
        if ("alleles".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("secondaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("symbol".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("primaryIdentifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("organism".equals(fieldName)) {
            return org.intermine.model.bio.Organism.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("locations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.OtherGenomeFeature.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.OtherGenomeFeature.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.OtherGenomeFeatureShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.OtherGenomeFeature");
        if (length != null) {
            sb.append("$_^alength$_^").append(length);
        }
        if (scoreType != null) {
            sb.append("$_^ascoreType$_^");
            String string = scoreType;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (score != null) {
            sb.append("$_^ascore$_^").append(score);
        }
        if (chromosome != null) {
            sb.append("$_^rchromosome$_^").append(chromosome.getId());
        }
        if (chromosomeLocation != null) {
            sb.append("$_^rchromosomeLocation$_^").append(chromosomeLocation.getId());
        }
        if (sequence != null) {
            sb.append("$_^rsequence$_^").append(sequence.getId());
        }
        if (sequenceOntologyTerm != null) {
            sb.append("$_^rsequenceOntologyTerm$_^").append(sequenceOntologyTerm.getId());
        }
        if (secondaryIdentifier != null) {
            sb.append("$_^asecondaryIdentifier$_^");
            String string = secondaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (symbol != null) {
            sb.append("$_^asymbol$_^");
            String string = symbol;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (primaryIdentifier != null) {
            sb.append("$_^aprimaryIdentifier$_^");
            String string = primaryIdentifier;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (name != null) {
            sb.append("$_^aname$_^");
            String string = name;
            while (string != null) {
                int delimPosition = string.indexOf("$_^");
                if (delimPosition == -1) {
                    sb.append(string);
                    string = null;
                } else {
                    sb.append(string.substring(0, delimPosition + 3));
                    sb.append("d");
                    string = string.substring(delimPosition + 3);
                }
            }
        }
        if (organism != null) {
            sb.append("$_^rorganism$_^").append(organism.getId());
        }
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.OtherGenomeFeatureShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.OtherGenomeFeature)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ascoreType".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                scoreType = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ascore".equals(notXml[i])) {
                i++;
                score = Double.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rchromosome".equals(notXml[i])) {
                i++;
                chromosome = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Chromosome.class);
                i++;
            };
            if ((i < notXml.length) &&"rchromosomeLocation".equals(notXml[i])) {
                i++;
                chromosomeLocation = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Location.class);
                i++;
            };
            if ((i < notXml.length) &&"rsequence".equals(notXml[i])) {
                i++;
                sequence = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Sequence.class);
                i++;
            };
            if ((i < notXml.length) &&"rsequenceOntologyTerm".equals(notXml[i])) {
                i++;
                sequenceOntologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.SOTerm.class);
                i++;
            };
            if ((i < notXml.length) && "asecondaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                secondaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "asymbol".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                symbol = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aprimaryIdentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                primaryIdentifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aname".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                name = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rorganism".equals(notXml[i])) {
                i++;
                organism = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Organism.class);
                i++;
            };
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        alleles = new ProxyCollection<org.intermine.model.bio.Allele>(os, this, "alleles", org.intermine.model.bio.Allele.class);
        overlappingFeatures = new ProxyCollection<org.intermine.model.bio.SequenceFeature>(os, this, "overlappingFeatures", org.intermine.model.bio.SequenceFeature.class);
        locatedFeatures = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locatedFeatures", org.intermine.model.bio.Location.class);
        locations = new ProxyCollection<org.intermine.model.bio.Location>(os, this, "locations", org.intermine.model.bio.Location.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        synonyms = new ProxyCollection<org.intermine.model.bio.Synonym>(os, this, "synonyms", org.intermine.model.bio.Synonym.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
        crossReferences = new ProxyCollection<org.intermine.model.bio.CrossReference>(os, this, "crossReferences", org.intermine.model.bio.CrossReference.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("alleles".equals(fieldName)) {
            alleles.add((org.intermine.model.bio.Allele) element);
        } else if ("overlappingFeatures".equals(fieldName)) {
            overlappingFeatures.add((org.intermine.model.bio.SequenceFeature) element);
        } else if ("locatedFeatures".equals(fieldName)) {
            locatedFeatures.add((org.intermine.model.bio.Location) element);
        } else if ("locations".equals(fieldName)) {
            locations.add((org.intermine.model.bio.Location) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.Synonym) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("crossReferences".equals(fieldName)) {
            crossReferences.add((org.intermine.model.bio.CrossReference) element);
        } else {
            if (!org.intermine.model.bio.OtherGenomeFeature.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("alleles".equals(fieldName)) {
            return org.intermine.model.bio.Allele.class;
        }
        if ("overlappingFeatures".equals(fieldName)) {
            return org.intermine.model.bio.SequenceFeature.class;
        }
        if ("locatedFeatures".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("locations".equals(fieldName)) {
            return org.intermine.model.bio.Location.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.Synonym.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("crossReferences".equals(fieldName)) {
            return org.intermine.model.bio.CrossReference.class;
        }
        if (!org.intermine.model.bio.OtherGenomeFeature.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.OtherGenomeFeature.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

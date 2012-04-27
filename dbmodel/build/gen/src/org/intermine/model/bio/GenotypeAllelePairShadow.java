package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class GenotypeAllelePairShadow implements GenotypeAllelePair, ShadowClass
{
    public static final Class<GenotypeAllelePair> shadowOf = GenotypeAllelePair.class;
    // Attr: org.intermine.model.bio.GenotypeAllelePair.pairState
    protected java.lang.String pairState;
    public java.lang.String getPairState() { return pairState; }
    public void setPairState(final java.lang.String pairState) { this.pairState = pairState; }

    // Ref: org.intermine.model.bio.GenotypeAllelePair.feature
    protected org.intermine.model.InterMineObject feature;
    public org.intermine.model.bio.SequenceFeature getFeature() { if (feature instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.SequenceFeature) ((org.intermine.objectstore.proxy.ProxyReference) feature).getObject()); }; return (org.intermine.model.bio.SequenceFeature) feature; }
    public void setFeature(final org.intermine.model.bio.SequenceFeature feature) { this.feature = feature; }
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature) { this.feature = feature; }
    public org.intermine.model.InterMineObject proxGetFeature() { return feature; }

    // Ref: org.intermine.model.bio.GenotypeAllelePair.allele2
    protected org.intermine.model.InterMineObject allele2;
    public org.intermine.model.bio.Allele getAllele2() { if (allele2 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Allele) ((org.intermine.objectstore.proxy.ProxyReference) allele2).getObject()); }; return (org.intermine.model.bio.Allele) allele2; }
    public void setAllele2(final org.intermine.model.bio.Allele allele2) { this.allele2 = allele2; }
    public void proxyAllele2(final org.intermine.objectstore.proxy.ProxyReference allele2) { this.allele2 = allele2; }
    public org.intermine.model.InterMineObject proxGetAllele2() { return allele2; }

    // Ref: org.intermine.model.bio.GenotypeAllelePair.allele1
    protected org.intermine.model.InterMineObject allele1;
    public org.intermine.model.bio.Allele getAllele1() { if (allele1 instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Allele) ((org.intermine.objectstore.proxy.ProxyReference) allele1).getObject()); }; return (org.intermine.model.bio.Allele) allele1; }
    public void setAllele1(final org.intermine.model.bio.Allele allele1) { this.allele1 = allele1; }
    public void proxyAllele1(final org.intermine.objectstore.proxy.ProxyReference allele1) { this.allele1 = allele1; }
    public org.intermine.model.InterMineObject proxGetAllele1() { return allele1; }

    // Ref: org.intermine.model.bio.GenotypeAllelePair.genotype
    protected org.intermine.model.InterMineObject genotype;
    public org.intermine.model.bio.Genotype getGenotype() { if (genotype instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Genotype) ((org.intermine.objectstore.proxy.ProxyReference) genotype).getObject()); }; return (org.intermine.model.bio.Genotype) genotype; }
    public void setGenotype(final org.intermine.model.bio.Genotype genotype) { this.genotype = genotype; }
    public void proxyGenotype(final org.intermine.objectstore.proxy.ProxyReference genotype) { this.genotype = genotype; }
    public org.intermine.model.InterMineObject proxGetGenotype() { return genotype; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GenotypeAllelePair && id != null) ? id.equals(((GenotypeAllelePair)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GenotypeAllelePair [allele1=" + (allele1 == null ? "null" : (allele1.getId() == null ? "no id" : allele1.getId().toString())) + ", allele2=" + (allele2 == null ? "null" : (allele2.getId() == null ? "no id" : allele2.getId().toString())) + ", feature=" + (feature == null ? "null" : (feature.getId() == null ? "no id" : feature.getId().toString())) + ", genotype=" + (genotype == null ? "null" : (genotype.getId() == null ? "no id" : genotype.getId().toString())) + ", id=\"" + id + "\", pairState=\"" + pairState + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("pairState".equals(fieldName)) {
            return pairState;
        }
        if ("feature".equals(fieldName)) {
            if (feature instanceof ProxyReference) {
                return ((ProxyReference) feature).getObject();
            } else {
                return feature;
            }
        }
        if ("allele2".equals(fieldName)) {
            if (allele2 instanceof ProxyReference) {
                return ((ProxyReference) allele2).getObject();
            } else {
                return allele2;
            }
        }
        if ("allele1".equals(fieldName)) {
            if (allele1 instanceof ProxyReference) {
                return ((ProxyReference) allele1).getObject();
            } else {
                return allele1;
            }
        }
        if ("genotype".equals(fieldName)) {
            if (genotype instanceof ProxyReference) {
                return ((ProxyReference) genotype).getObject();
            } else {
                return genotype;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GenotypeAllelePair.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("pairState".equals(fieldName)) {
            return pairState;
        }
        if ("feature".equals(fieldName)) {
            return feature;
        }
        if ("allele2".equals(fieldName)) {
            return allele2;
        }
        if ("allele1".equals(fieldName)) {
            return allele1;
        }
        if ("genotype".equals(fieldName)) {
            return genotype;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GenotypeAllelePair.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("pairState".equals(fieldName)) {
            pairState = (java.lang.String) value;
        } else if ("feature".equals(fieldName)) {
            feature = (org.intermine.model.InterMineObject) value;
        } else if ("allele2".equals(fieldName)) {
            allele2 = (org.intermine.model.InterMineObject) value;
        } else if ("allele1".equals(fieldName)) {
            allele1 = (org.intermine.model.InterMineObject) value;
        } else if ("genotype".equals(fieldName)) {
            genotype = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GenotypeAllelePair.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("pairState".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("feature".equals(fieldName)) {
            return org.intermine.model.bio.SequenceFeature.class;
        }
        if ("allele2".equals(fieldName)) {
            return org.intermine.model.bio.Allele.class;
        }
        if ("allele1".equals(fieldName)) {
            return org.intermine.model.bio.Allele.class;
        }
        if ("genotype".equals(fieldName)) {
            return org.intermine.model.bio.Genotype.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GenotypeAllelePair.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GenotypeAllelePair.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GenotypeAllelePairShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GenotypeAllelePair");
        if (pairState != null) {
            sb.append("$_^apairState$_^");
            String string = pairState;
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
        if (feature != null) {
            sb.append("$_^rfeature$_^").append(feature.getId());
        }
        if (allele2 != null) {
            sb.append("$_^rallele2$_^").append(allele2.getId());
        }
        if (allele1 != null) {
            sb.append("$_^rallele1$_^").append(allele1.getId());
        }
        if (genotype != null) {
            sb.append("$_^rgenotype$_^").append(genotype.getId());
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
        if (!org.intermine.model.bio.GenotypeAllelePairShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GenotypeAllelePair)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "apairState".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pairState = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rfeature".equals(notXml[i])) {
                i++;
                feature = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.SequenceFeature.class);
                i++;
            };
            if ((i < notXml.length) &&"rallele2".equals(notXml[i])) {
                i++;
                allele2 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Allele.class);
                i++;
            };
            if ((i < notXml.length) &&"rallele1".equals(notXml[i])) {
                i++;
                allele1 = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Allele.class);
                i++;
            };
            if ((i < notXml.length) &&"rgenotype".equals(notXml[i])) {
                i++;
                genotype = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Genotype.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        {
            if (!org.intermine.model.bio.GenotypeAllelePair.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.GenotypeAllelePair.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GenotypeAllelePair.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class SequenceVariantShadow implements SequenceVariant, ShadowClass
{
    public static final Class<SequenceVariant> shadowOf = SequenceVariant.class;
    // Col: org.intermine.model.bio.SequenceVariant.genes
    protected java.util.Set<org.intermine.model.bio.Gene> genes = new java.util.HashSet<org.intermine.model.bio.Gene>();
    public java.util.Set<org.intermine.model.bio.Gene> getGenes() { return genes; }
    public void setGenes(final java.util.Set<org.intermine.model.bio.Gene> genes) { this.genes = genes; }
    public void addGenes(final org.intermine.model.bio.Gene arg) { genes.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof SequenceVariant && id != null) ? id.equals(((SequenceVariant)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "SequenceVariant [id=\"" + id + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SequenceVariant.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("genes".equals(fieldName)) {
            return genes;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.SequenceVariant.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("genes".equals(fieldName)) {
            genes = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.SequenceVariant.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("genes".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.SequenceVariant.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.SequenceVariant.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.SequenceVariantShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.SequenceVariant");
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.SequenceVariantShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.SequenceVariant)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aid".equals(notXml[i])) {
                i++;
                id = Integer.valueOf(notXml[i]);
                i++;
            }
            if (startI == i) {
                throw new IllegalArgumentException("Unknown field " + notXml[i]);
            }
        }
        genes = new ProxyCollection<org.intermine.model.bio.Gene>(os, this, "genes", org.intermine.model.bio.Gene.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("genes".equals(fieldName)) {
            genes.add((org.intermine.model.bio.Gene) element);
        } else {
            if (!org.intermine.model.bio.SequenceVariant.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("genes".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if (!org.intermine.model.bio.SequenceVariant.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.SequenceVariant.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

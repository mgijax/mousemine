package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class OntologyRelationShadow implements OntologyRelation, ShadowClass
{
    public static final Class<OntologyRelation> shadowOf = OntologyRelation.class;
    // Attr: org.intermine.model.bio.OntologyRelation.relationship
    protected java.lang.String relationship;
    public java.lang.String getRelationship() { return relationship; }
    public void setRelationship(final java.lang.String relationship) { this.relationship = relationship; }

    // Attr: org.intermine.model.bio.OntologyRelation.redundant
    protected java.lang.Boolean redundant;
    public java.lang.Boolean getRedundant() { return redundant; }
    public void setRedundant(final java.lang.Boolean redundant) { this.redundant = redundant; }

    // Attr: org.intermine.model.bio.OntologyRelation.direct
    protected java.lang.Boolean direct;
    public java.lang.Boolean getDirect() { return direct; }
    public void setDirect(final java.lang.Boolean direct) { this.direct = direct; }

    // Ref: org.intermine.model.bio.OntologyRelation.childTerm
    protected org.intermine.model.InterMineObject childTerm;
    public org.intermine.model.bio.OntologyTerm getChildTerm() { if (childTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) childTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) childTerm; }
    public void setChildTerm(final org.intermine.model.bio.OntologyTerm childTerm) { this.childTerm = childTerm; }
    public void proxyChildTerm(final org.intermine.objectstore.proxy.ProxyReference childTerm) { this.childTerm = childTerm; }
    public org.intermine.model.InterMineObject proxGetChildTerm() { return childTerm; }

    // Ref: org.intermine.model.bio.OntologyRelation.parentTerm
    protected org.intermine.model.InterMineObject parentTerm;
    public org.intermine.model.bio.OntologyTerm getParentTerm() { if (parentTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) parentTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) parentTerm; }
    public void setParentTerm(final org.intermine.model.bio.OntologyTerm parentTerm) { this.parentTerm = parentTerm; }
    public void proxyParentTerm(final org.intermine.objectstore.proxy.ProxyReference parentTerm) { this.parentTerm = parentTerm; }
    public org.intermine.model.InterMineObject proxGetParentTerm() { return parentTerm; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof OntologyRelation && id != null) ? id.equals(((OntologyRelation)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "OntologyRelation [childTerm=" + (childTerm == null ? "null" : (childTerm.getId() == null ? "no id" : childTerm.getId().toString())) + ", direct=\"" + direct + "\", id=\"" + id + "\", parentTerm=" + (parentTerm == null ? "null" : (parentTerm.getId() == null ? "no id" : parentTerm.getId().toString())) + ", redundant=\"" + redundant + "\", relationship=\"" + relationship + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("relationship".equals(fieldName)) {
            return relationship;
        }
        if ("redundant".equals(fieldName)) {
            return redundant;
        }
        if ("direct".equals(fieldName)) {
            return direct;
        }
        if ("childTerm".equals(fieldName)) {
            if (childTerm instanceof ProxyReference) {
                return ((ProxyReference) childTerm).getObject();
            } else {
                return childTerm;
            }
        }
        if ("parentTerm".equals(fieldName)) {
            if (parentTerm instanceof ProxyReference) {
                return ((ProxyReference) parentTerm).getObject();
            } else {
                return parentTerm;
            }
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OntologyRelation.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("relationship".equals(fieldName)) {
            return relationship;
        }
        if ("redundant".equals(fieldName)) {
            return redundant;
        }
        if ("direct".equals(fieldName)) {
            return direct;
        }
        if ("childTerm".equals(fieldName)) {
            return childTerm;
        }
        if ("parentTerm".equals(fieldName)) {
            return parentTerm;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.OntologyRelation.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("relationship".equals(fieldName)) {
            relationship = (java.lang.String) value;
        } else if ("redundant".equals(fieldName)) {
            redundant = (java.lang.Boolean) value;
        } else if ("direct".equals(fieldName)) {
            direct = (java.lang.Boolean) value;
        } else if ("childTerm".equals(fieldName)) {
            childTerm = (org.intermine.model.InterMineObject) value;
        } else if ("parentTerm".equals(fieldName)) {
            parentTerm = (org.intermine.model.InterMineObject) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.OntologyRelation.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("relationship".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("redundant".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("direct".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("childTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("parentTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.OntologyRelation.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.OntologyRelation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.OntologyRelationShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.OntologyRelation");
        if (relationship != null) {
            sb.append("$_^arelationship$_^");
            String string = relationship;
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
        if (redundant != null) {
            sb.append("$_^aredundant$_^").append(redundant);
        }
        if (direct != null) {
            sb.append("$_^adirect$_^").append(direct);
        }
        if (childTerm != null) {
            sb.append("$_^rchildTerm$_^").append(childTerm.getId());
        }
        if (parentTerm != null) {
            sb.append("$_^rparentTerm$_^").append(parentTerm.getId());
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
        if (!org.intermine.model.bio.OntologyRelationShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.OntologyRelation)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "arelationship".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                relationship = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aredundant".equals(notXml[i])) {
                i++;
                redundant = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "adirect".equals(notXml[i])) {
                i++;
                direct = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) &&"rchildTerm".equals(notXml[i])) {
                i++;
                childTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rparentTerm".equals(notXml[i])) {
                i++;
                parentTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
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
            if (!org.intermine.model.bio.OntologyRelation.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.OntologyRelation.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.OntologyRelation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

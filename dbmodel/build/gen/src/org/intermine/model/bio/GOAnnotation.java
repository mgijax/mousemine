package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;

public class GOAnnotation implements org.intermine.model.bio.OntologyAnnotation
{
    // Attr: org.intermine.model.bio.GOAnnotation.withText
    protected java.lang.String withText;
    public java.lang.String getWithText() { return withText; }
    public void setWithText(final java.lang.String withText) { this.withText = withText; }

    // Ref: org.intermine.model.bio.GOAnnotation.with
    protected org.intermine.model.InterMineObject with;
    public org.intermine.model.bio.BioEntity getWith() { if (with instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) with).getObject()); }; return (org.intermine.model.bio.BioEntity) with; }
    public void setWith(final org.intermine.model.bio.BioEntity with) { this.with = with; }
    public void proxyWith(final org.intermine.objectstore.proxy.ProxyReference with) { this.with = with; }
    public org.intermine.model.InterMineObject proxGetWith() { return with; }

    // Attr: org.intermine.model.bio.OntologyAnnotation.qualifier
    protected java.lang.String qualifier;
    public java.lang.String getQualifier() { return qualifier; }
    public void setQualifier(final java.lang.String qualifier) { this.qualifier = qualifier; }

    // Ref: org.intermine.model.bio.OntologyAnnotation.ontologyTerm
    protected org.intermine.model.InterMineObject ontologyTerm;
    public org.intermine.model.bio.OntologyTerm getOntologyTerm() { if (ontologyTerm instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.OntologyTerm) ((org.intermine.objectstore.proxy.ProxyReference) ontologyTerm).getObject()); }; return (org.intermine.model.bio.OntologyTerm) ontologyTerm; }
    public void setOntologyTerm(final org.intermine.model.bio.OntologyTerm ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public void proxyOntologyTerm(final org.intermine.objectstore.proxy.ProxyReference ontologyTerm) { this.ontologyTerm = ontologyTerm; }
    public org.intermine.model.InterMineObject proxGetOntologyTerm() { return ontologyTerm; }

    // Ref: org.intermine.model.bio.OntologyAnnotation.subject
    protected org.intermine.model.InterMineObject subject;
    public org.intermine.model.bio.BioEntity getSubject() { if (subject instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) subject).getObject()); }; return (org.intermine.model.bio.BioEntity) subject; }
    public void setSubject(final org.intermine.model.bio.BioEntity subject) { this.subject = subject; }
    public void proxySubject(final org.intermine.objectstore.proxy.ProxyReference subject) { this.subject = subject; }
    public org.intermine.model.InterMineObject proxGetSubject() { return subject; }

    // Col: org.intermine.model.bio.OntologyAnnotation.publications
    protected java.util.Set<org.intermine.model.bio.Publication> publications = new java.util.HashSet<org.intermine.model.bio.Publication>();
    public java.util.Set<org.intermine.model.bio.Publication> getPublications() { return publications; }
    public void setPublications(final java.util.Set<org.intermine.model.bio.Publication> publications) { this.publications = publications; }
    public void addPublications(final org.intermine.model.bio.Publication arg) { publications.add(arg); }

    // Col: org.intermine.model.bio.OntologyAnnotation.evidence
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotationEvidence> evidence = new java.util.HashSet<org.intermine.model.bio.OntologyAnnotationEvidence>();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotationEvidence> getEvidence() { return evidence; }
    public void setEvidence(final java.util.Set<org.intermine.model.bio.OntologyAnnotationEvidence> evidence) { this.evidence = evidence; }
    public void addEvidence(final org.intermine.model.bio.OntologyAnnotationEvidence arg) { evidence.add(arg); }

    // Col: org.intermine.model.bio.OntologyAnnotation.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof GOAnnotation && id != null) ? id.equals(((GOAnnotation)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "GOAnnotation [id=\"" + id + "\", ontologyTerm=" + (ontologyTerm == null ? "null" : (ontologyTerm.getId() == null ? "no id" : ontologyTerm.getId().toString())) + ", qualifier=\"" + qualifier + "\", subject=" + (subject == null ? "null" : (subject.getId() == null ? "no id" : subject.getId().toString())) + ", with=" + (with == null ? "null" : (with.getId() == null ? "no id" : with.getId().toString())) + ", withText=\"" + withText + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("withText".equals(fieldName)) {
            return withText;
        }
        if ("with".equals(fieldName)) {
            if (with instanceof ProxyReference) {
                return ((ProxyReference) with).getObject();
            } else {
                return with;
            }
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("ontologyTerm".equals(fieldName)) {
            if (ontologyTerm instanceof ProxyReference) {
                return ((ProxyReference) ontologyTerm).getObject();
            } else {
                return ontologyTerm;
            }
        }
        if ("subject".equals(fieldName)) {
            if (subject instanceof ProxyReference) {
                return ((ProxyReference) subject).getObject();
            } else {
                return subject;
            }
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("withText".equals(fieldName)) {
            return withText;
        }
        if ("with".equals(fieldName)) {
            return with;
        }
        if ("qualifier".equals(fieldName)) {
            return qualifier;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return ontologyTerm;
        }
        if ("subject".equals(fieldName)) {
            return subject;
        }
        if ("publications".equals(fieldName)) {
            return publications;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("withText".equals(fieldName)) {
            withText = (java.lang.String) value;
        } else if ("with".equals(fieldName)) {
            with = (org.intermine.model.InterMineObject) value;
        } else if ("qualifier".equals(fieldName)) {
            qualifier = (java.lang.String) value;
        } else if ("ontologyTerm".equals(fieldName)) {
            ontologyTerm = (org.intermine.model.InterMineObject) value;
        } else if ("subject".equals(fieldName)) {
            subject = (org.intermine.model.InterMineObject) value;
        } else if ("publications".equals(fieldName)) {
            publications = (java.util.Set) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("withText".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("with".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("qualifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ontologyTerm".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("subject".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("publications".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("evidence".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.GOAnnotation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.GOAnnotation");
        if (withText != null) {
            sb.append("$_^awithText$_^");
            String string = withText;
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
        if (with != null) {
            sb.append("$_^rwith$_^").append(with.getId());
        }
        if (qualifier != null) {
            sb.append("$_^aqualifier$_^");
            String string = qualifier;
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
        if (ontologyTerm != null) {
            sb.append("$_^rontologyTerm$_^").append(ontologyTerm.getId());
        }
        if (subject != null) {
            sb.append("$_^rsubject$_^").append(subject.getId());
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
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.GOAnnotation)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "awithText".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                withText = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rwith".equals(notXml[i])) {
                i++;
                with = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
                i++;
            };
            if ((i < notXml.length) && "aqualifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                qualifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rontologyTerm".equals(notXml[i])) {
                i++;
                ontologyTerm = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.OntologyTerm.class);
                i++;
            };
            if ((i < notXml.length) &&"rsubject".equals(notXml[i])) {
                i++;
                subject = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
        publications = new ProxyCollection<org.intermine.model.bio.Publication>(os, this, "publications", org.intermine.model.bio.Publication.class);
        evidence = new ProxyCollection<org.intermine.model.bio.OntologyAnnotationEvidence>(os, this, "evidence", org.intermine.model.bio.OntologyAnnotationEvidence.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("publications".equals(fieldName)) {
            publications.add((org.intermine.model.bio.Publication) element);
        } else if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.OntologyAnnotationEvidence) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("publications".equals(fieldName)) {
            return org.intermine.model.bio.Publication.class;
        }
        if ("evidence".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotationEvidence.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.GOAnnotation.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.GOAnnotation.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

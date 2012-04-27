package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class HomologueShadow implements Homologue, ShadowClass
{
    public static final Class<Homologue> shadowOf = Homologue.class;
    // Attr: org.intermine.model.bio.Homologue.type
    protected java.lang.String type;
    public java.lang.String getType() { return type; }
    public void setType(final java.lang.String type) { this.type = type; }

    // Ref: org.intermine.model.bio.Homologue.gene
    protected org.intermine.model.InterMineObject gene;
    public org.intermine.model.bio.Gene getGene() { if (gene instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) gene).getObject()); }; return (org.intermine.model.bio.Gene) gene; }
    public void setGene(final org.intermine.model.bio.Gene gene) { this.gene = gene; }
    public void proxyGene(final org.intermine.objectstore.proxy.ProxyReference gene) { this.gene = gene; }
    public org.intermine.model.InterMineObject proxGetGene() { return gene; }

    // Ref: org.intermine.model.bio.Homologue.homologue
    protected org.intermine.model.InterMineObject homologue;
    public org.intermine.model.bio.Gene getHomologue() { if (homologue instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Gene) ((org.intermine.objectstore.proxy.ProxyReference) homologue).getObject()); }; return (org.intermine.model.bio.Gene) homologue; }
    public void setHomologue(final org.intermine.model.bio.Gene homologue) { this.homologue = homologue; }
    public void proxyHomologue(final org.intermine.objectstore.proxy.ProxyReference homologue) { this.homologue = homologue; }
    public org.intermine.model.InterMineObject proxGetHomologue() { return homologue; }

    // Col: org.intermine.model.bio.Homologue.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Col: org.intermine.model.bio.Homologue.evidence
    protected java.util.Set<org.intermine.model.bio.OrthologueEvidence> evidence = new java.util.HashSet<org.intermine.model.bio.OrthologueEvidence>();
    public java.util.Set<org.intermine.model.bio.OrthologueEvidence> getEvidence() { return evidence; }
    public void setEvidence(final java.util.Set<org.intermine.model.bio.OrthologueEvidence> evidence) { this.evidence = evidence; }
    public void addEvidence(final org.intermine.model.bio.OrthologueEvidence arg) { evidence.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Homologue && id != null) ? id.equals(((Homologue)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Homologue [gene=" + (gene == null ? "null" : (gene.getId() == null ? "no id" : gene.getId().toString())) + ", homologue=" + (homologue == null ? "null" : (homologue.getId() == null ? "no id" : homologue.getId().toString())) + ", id=\"" + id + "\", type=\"" + type + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("gene".equals(fieldName)) {
            if (gene instanceof ProxyReference) {
                return ((ProxyReference) gene).getObject();
            } else {
                return gene;
            }
        }
        if ("homologue".equals(fieldName)) {
            if (homologue instanceof ProxyReference) {
                return ((ProxyReference) homologue).getObject();
            } else {
                return homologue;
            }
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Homologue.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("type".equals(fieldName)) {
            return type;
        }
        if ("gene".equals(fieldName)) {
            return gene;
        }
        if ("homologue".equals(fieldName)) {
            return homologue;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("evidence".equals(fieldName)) {
            return evidence;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Homologue.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("type".equals(fieldName)) {
            type = (java.lang.String) value;
        } else if ("gene".equals(fieldName)) {
            gene = (org.intermine.model.InterMineObject) value;
        } else if ("homologue".equals(fieldName)) {
            homologue = (org.intermine.model.InterMineObject) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("evidence".equals(fieldName)) {
            evidence = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Homologue.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("type".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("gene".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("homologue".equals(fieldName)) {
            return org.intermine.model.bio.Gene.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("evidence".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Homologue.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Homologue.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.HomologueShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Homologue");
        if (type != null) {
            sb.append("$_^atype$_^");
            String string = type;
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
        if (gene != null) {
            sb.append("$_^rgene$_^").append(gene.getId());
        }
        if (homologue != null) {
            sb.append("$_^rhomologue$_^").append(homologue.getId());
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
        if (!org.intermine.model.bio.HomologueShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Homologue)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "atype".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                type = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rgene".equals(notXml[i])) {
                i++;
                gene = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
                i++;
            };
            if ((i < notXml.length) &&"rhomologue".equals(notXml[i])) {
                i++;
                homologue = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Gene.class);
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
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
        evidence = new ProxyCollection<org.intermine.model.bio.OrthologueEvidence>(os, this, "evidence", org.intermine.model.bio.OrthologueEvidence.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else if ("evidence".equals(fieldName)) {
            evidence.add((org.intermine.model.bio.OrthologueEvidence) element);
        } else {
            if (!org.intermine.model.bio.Homologue.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if ("evidence".equals(fieldName)) {
            return org.intermine.model.bio.OrthologueEvidence.class;
        }
        if (!org.intermine.model.bio.Homologue.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Homologue.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

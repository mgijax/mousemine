package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class MPTermShadow implements MPTerm, ShadowClass
{
    public static final Class<MPTerm> shadowOf = MPTerm.class;
    // Attr: org.intermine.model.bio.OntologyTerm.identifier
    protected java.lang.String identifier;
    public java.lang.String getIdentifier() { return identifier; }
    public void setIdentifier(final java.lang.String identifier) { this.identifier = identifier; }

    // Attr: org.intermine.model.bio.OntologyTerm.obsolete
    protected java.lang.Boolean obsolete;
    public java.lang.Boolean getObsolete() { return obsolete; }
    public void setObsolete(final java.lang.Boolean obsolete) { this.obsolete = obsolete; }

    // Attr: org.intermine.model.bio.OntologyTerm.namespace
    protected java.lang.String namespace;
    public java.lang.String getNamespace() { return namespace; }
    public void setNamespace(final java.lang.String namespace) { this.namespace = namespace; }

    // Attr: org.intermine.model.bio.OntologyTerm.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.OntologyTerm.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Ref: org.intermine.model.bio.OntologyTerm.ontology
    protected org.intermine.model.InterMineObject ontology;
    public org.intermine.model.bio.Ontology getOntology() { if (ontology instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.Ontology) ((org.intermine.objectstore.proxy.ProxyReference) ontology).getObject()); }; return (org.intermine.model.bio.Ontology) ontology; }
    public void setOntology(final org.intermine.model.bio.Ontology ontology) { this.ontology = ontology; }
    public void proxyOntology(final org.intermine.objectstore.proxy.ProxyReference ontology) { this.ontology = ontology; }
    public org.intermine.model.InterMineObject proxGetOntology() { return ontology; }

    // Col: org.intermine.model.bio.OntologyTerm.relations
    protected java.util.Set<org.intermine.model.bio.OntologyRelation> relations = new java.util.HashSet<org.intermine.model.bio.OntologyRelation>();
    public java.util.Set<org.intermine.model.bio.OntologyRelation> getRelations() { return relations; }
    public void setRelations(final java.util.Set<org.intermine.model.bio.OntologyRelation> relations) { this.relations = relations; }
    public void addRelations(final org.intermine.model.bio.OntologyRelation arg) { relations.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.synonyms
    protected java.util.Set<org.intermine.model.bio.OntologyTermSynonym> synonyms = new java.util.HashSet<org.intermine.model.bio.OntologyTermSynonym>();
    public java.util.Set<org.intermine.model.bio.OntologyTermSynonym> getSynonyms() { return synonyms; }
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.OntologyTermSynonym> synonyms) { this.synonyms = synonyms; }
    public void addSynonyms(final org.intermine.model.bio.OntologyTermSynonym arg) { synonyms.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.ontologyAnnotations
    protected java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations = new java.util.HashSet<org.intermine.model.bio.OntologyAnnotation>();
    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations() { return ontologyAnnotations; }
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations) { this.ontologyAnnotations = ontologyAnnotations; }
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg) { ontologyAnnotations.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.parents
    protected java.util.Set<org.intermine.model.bio.OntologyTerm> parents = new java.util.HashSet<org.intermine.model.bio.OntologyTerm>();
    public java.util.Set<org.intermine.model.bio.OntologyTerm> getParents() { return parents; }
    public void setParents(final java.util.Set<org.intermine.model.bio.OntologyTerm> parents) { this.parents = parents; }
    public void addParents(final org.intermine.model.bio.OntologyTerm arg) { parents.add(arg); }

    // Col: org.intermine.model.bio.OntologyTerm.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof MPTerm && id != null) ? id.equals(((MPTerm)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "MPTerm [description=\"" + description + "\", id=\"" + id + "\", identifier=\"" + identifier + "\", name=\"" + name + "\", namespace=\"" + namespace + "\", obsolete=\"" + obsolete + "\", ontology=" + (ontology == null ? "null" : (ontology.getId() == null ? "no id" : ontology.getId().toString())) + "]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("obsolete".equals(fieldName)) {
            return obsolete;
        }
        if ("namespace".equals(fieldName)) {
            return namespace;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("ontology".equals(fieldName)) {
            if (ontology instanceof ProxyReference) {
                return ((ProxyReference) ontology).getObject();
            } else {
                return ontology;
            }
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("parents".equals(fieldName)) {
            return parents;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MPTerm.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("identifier".equals(fieldName)) {
            return identifier;
        }
        if ("obsolete".equals(fieldName)) {
            return obsolete;
        }
        if ("namespace".equals(fieldName)) {
            return namespace;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("ontology".equals(fieldName)) {
            return ontology;
        }
        if ("relations".equals(fieldName)) {
            return relations;
        }
        if ("synonyms".equals(fieldName)) {
            return synonyms;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return ontologyAnnotations;
        }
        if ("parents".equals(fieldName)) {
            return parents;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.MPTerm.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("identifier".equals(fieldName)) {
            identifier = (java.lang.String) value;
        } else if ("obsolete".equals(fieldName)) {
            obsolete = (java.lang.Boolean) value;
        } else if ("namespace".equals(fieldName)) {
            namespace = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("ontology".equals(fieldName)) {
            ontology = (org.intermine.model.InterMineObject) value;
        } else if ("relations".equals(fieldName)) {
            relations = (java.util.Set) value;
        } else if ("synonyms".equals(fieldName)) {
            synonyms = (java.util.Set) value;
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations = (java.util.Set) value;
        } else if ("parents".equals(fieldName)) {
            parents = (java.util.Set) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.MPTerm.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("identifier".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("obsolete".equals(fieldName)) {
            return java.lang.Boolean.class;
        }
        if ("namespace".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("ontology".equals(fieldName)) {
            return org.intermine.model.bio.Ontology.class;
        }
        if ("relations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("synonyms".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("parents".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.MPTerm.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.MPTerm.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.MPTermShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.MPTerm");
        if (identifier != null) {
            sb.append("$_^aidentifier$_^");
            String string = identifier;
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
        if (obsolete != null) {
            sb.append("$_^aobsolete$_^").append(obsolete);
        }
        if (namespace != null) {
            sb.append("$_^anamespace$_^");
            String string = namespace;
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
        if (description != null) {
            sb.append("$_^adescription$_^");
            String string = description;
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
        if (ontology != null) {
            sb.append("$_^rontology$_^").append(ontology.getId());
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
        if (!org.intermine.model.bio.MPTermShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.MPTerm)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "aidentifier".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                identifier = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aobsolete".equals(notXml[i])) {
                i++;
                obsolete = Boolean.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "anamespace".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                namespace = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) && "adescription".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                description = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rontology".equals(notXml[i])) {
                i++;
                ontology = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.Ontology.class);
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
        relations = new ProxyCollection<org.intermine.model.bio.OntologyRelation>(os, this, "relations", org.intermine.model.bio.OntologyRelation.class);
        synonyms = new ProxyCollection<org.intermine.model.bio.OntologyTermSynonym>(os, this, "synonyms", org.intermine.model.bio.OntologyTermSynonym.class);
        ontologyAnnotations = new ProxyCollection<org.intermine.model.bio.OntologyAnnotation>(os, this, "ontologyAnnotations", org.intermine.model.bio.OntologyAnnotation.class);
        parents = new ProxyCollection<org.intermine.model.bio.OntologyTerm>(os, this, "parents", org.intermine.model.bio.OntologyTerm.class);
        dataSets = new ProxyCollection<org.intermine.model.bio.DataSet>(os, this, "dataSets", org.intermine.model.bio.DataSet.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("relations".equals(fieldName)) {
            relations.add((org.intermine.model.bio.OntologyRelation) element);
        } else if ("synonyms".equals(fieldName)) {
            synonyms.add((org.intermine.model.bio.OntologyTermSynonym) element);
        } else if ("ontologyAnnotations".equals(fieldName)) {
            ontologyAnnotations.add((org.intermine.model.bio.OntologyAnnotation) element);
        } else if ("parents".equals(fieldName)) {
            parents.add((org.intermine.model.bio.OntologyTerm) element);
        } else if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.MPTerm.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("relations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyRelation.class;
        }
        if ("synonyms".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTermSynonym.class;
        }
        if ("ontologyAnnotations".equals(fieldName)) {
            return org.intermine.model.bio.OntologyAnnotation.class;
        }
        if ("parents".equals(fieldName)) {
            return org.intermine.model.bio.OntologyTerm.class;
        }
        if ("dataSets".equals(fieldName)) {
            return org.intermine.model.bio.DataSet.class;
        }
        if (!org.intermine.model.bio.MPTerm.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.MPTerm.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

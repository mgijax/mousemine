package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class OrganismShadow implements Organism, ShadowClass
{
    public static final Class<Organism> shadowOf = Organism.class;
    // Attr: org.intermine.model.bio.Organism.taxonId
    protected java.lang.Integer taxonId;
    public java.lang.Integer getTaxonId() { return taxonId; }
    public void setTaxonId(final java.lang.Integer taxonId) { this.taxonId = taxonId; }

    // Attr: org.intermine.model.bio.Organism.shortName
    protected java.lang.String shortName;
    public java.lang.String getShortName() { return shortName; }
    public void setShortName(final java.lang.String shortName) { this.shortName = shortName; }

    // Attr: org.intermine.model.bio.Organism.genus
    protected java.lang.String genus;
    public java.lang.String getGenus() { return genus; }
    public void setGenus(final java.lang.String genus) { this.genus = genus; }

    // Attr: org.intermine.model.bio.Organism.species
    protected java.lang.String species;
    public java.lang.String getSpecies() { return species; }
    public void setSpecies(final java.lang.String species) { this.species = species; }

    // Attr: org.intermine.model.bio.Organism.commonName
    protected java.lang.String commonName;
    public java.lang.String getCommonName() { return commonName; }
    public void setCommonName(final java.lang.String commonName) { this.commonName = commonName; }

    // Attr: org.intermine.model.bio.Organism.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Organism && id != null) ? id.equals(((Organism)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Organism [commonName=\"" + commonName + "\", genus=\"" + genus + "\", id=\"" + id + "\", name=\"" + name + "\", shortName=\"" + shortName + "\", species=\"" + species + "\", taxonId=\"" + taxonId + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("taxonId".equals(fieldName)) {
            return taxonId;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("genus".equals(fieldName)) {
            return genus;
        }
        if ("species".equals(fieldName)) {
            return species;
        }
        if ("commonName".equals(fieldName)) {
            return commonName;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("taxonId".equals(fieldName)) {
            return taxonId;
        }
        if ("shortName".equals(fieldName)) {
            return shortName;
        }
        if ("genus".equals(fieldName)) {
            return genus;
        }
        if ("species".equals(fieldName)) {
            return species;
        }
        if ("commonName".equals(fieldName)) {
            return commonName;
        }
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("taxonId".equals(fieldName)) {
            taxonId = (java.lang.Integer) value;
        } else if ("shortName".equals(fieldName)) {
            shortName = (java.lang.String) value;
        } else if ("genus".equals(fieldName)) {
            genus = (java.lang.String) value;
        } else if ("species".equals(fieldName)) {
            species = (java.lang.String) value;
        } else if ("commonName".equals(fieldName)) {
            commonName = (java.lang.String) value;
        } else if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("taxonId".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("shortName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("genus".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("species".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("commonName".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Organism.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.OrganismShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Organism");
        if (taxonId != null) {
            sb.append("$_^ataxonId$_^").append(taxonId);
        }
        if (shortName != null) {
            sb.append("$_^ashortName$_^");
            String string = shortName;
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
        if (genus != null) {
            sb.append("$_^agenus$_^");
            String string = genus;
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
        if (species != null) {
            sb.append("$_^aspecies$_^");
            String string = species;
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
        if (commonName != null) {
            sb.append("$_^acommonName$_^");
            String string = commonName;
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
        if (id != null) {
            sb.append("$_^aid$_^").append(id);
        }
        return sb;
    }
    public void setoBJECT(String notXml, ObjectStore os) {
        setoBJECT(NotXmlParser.SPLITTER.split(notXml), os);
    }
    public void setoBJECT(final String[] notXml, final ObjectStore os) {
        if (!org.intermine.model.bio.OrganismShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Organism)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "ataxonId".equals(notXml[i])) {
                i++;
                taxonId = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "ashortName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                shortName = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "agenus".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                genus = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aspecies".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                species = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "acommonName".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                commonName = string == null ? notXml[i] : string.toString();
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
            if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Organism.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Organism.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

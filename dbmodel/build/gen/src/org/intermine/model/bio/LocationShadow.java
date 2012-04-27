package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class LocationShadow implements Location, ShadowClass
{
    public static final Class<Location> shadowOf = Location.class;
    // Attr: org.intermine.model.bio.Location.start
    protected java.lang.Integer start;
    public java.lang.Integer getStart() { return start; }
    public void setStart(final java.lang.Integer start) { this.start = start; }

    // Attr: org.intermine.model.bio.Location.end
    protected java.lang.Integer end;
    public java.lang.Integer getEnd() { return end; }
    public void setEnd(final java.lang.Integer end) { this.end = end; }

    // Attr: org.intermine.model.bio.Location.strand
    protected java.lang.String strand;
    public java.lang.String getStrand() { return strand; }
    public void setStrand(final java.lang.String strand) { this.strand = strand; }

    // Ref: org.intermine.model.bio.Location.feature
    protected org.intermine.model.InterMineObject feature;
    public org.intermine.model.bio.BioEntity getFeature() { if (feature instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) feature).getObject()); }; return (org.intermine.model.bio.BioEntity) feature; }
    public void setFeature(final org.intermine.model.bio.BioEntity feature) { this.feature = feature; }
    public void proxyFeature(final org.intermine.objectstore.proxy.ProxyReference feature) { this.feature = feature; }
    public org.intermine.model.InterMineObject proxGetFeature() { return feature; }

    // Ref: org.intermine.model.bio.Location.locatedOn
    protected org.intermine.model.InterMineObject locatedOn;
    public org.intermine.model.bio.BioEntity getLocatedOn() { if (locatedOn instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.BioEntity) ((org.intermine.objectstore.proxy.ProxyReference) locatedOn).getObject()); }; return (org.intermine.model.bio.BioEntity) locatedOn; }
    public void setLocatedOn(final org.intermine.model.bio.BioEntity locatedOn) { this.locatedOn = locatedOn; }
    public void proxyLocatedOn(final org.intermine.objectstore.proxy.ProxyReference locatedOn) { this.locatedOn = locatedOn; }
    public org.intermine.model.InterMineObject proxGetLocatedOn() { return locatedOn; }

    // Col: org.intermine.model.bio.Location.dataSets
    protected java.util.Set<org.intermine.model.bio.DataSet> dataSets = new java.util.HashSet<org.intermine.model.bio.DataSet>();
    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets() { return dataSets; }
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets) { this.dataSets = dataSets; }
    public void addDataSets(final org.intermine.model.bio.DataSet arg) { dataSets.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Location && id != null) ? id.equals(((Location)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Location [end=\"" + end + "\", feature=" + (feature == null ? "null" : (feature.getId() == null ? "no id" : feature.getId().toString())) + ", id=\"" + id + "\", locatedOn=" + (locatedOn == null ? "null" : (locatedOn.getId() == null ? "no id" : locatedOn.getId().toString())) + ", start=\"" + start + "\", strand=\"" + strand + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("strand".equals(fieldName)) {
            return strand;
        }
        if ("feature".equals(fieldName)) {
            if (feature instanceof ProxyReference) {
                return ((ProxyReference) feature).getObject();
            } else {
                return feature;
            }
        }
        if ("locatedOn".equals(fieldName)) {
            if (locatedOn instanceof ProxyReference) {
                return ((ProxyReference) locatedOn).getObject();
            } else {
                return locatedOn;
            }
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("start".equals(fieldName)) {
            return start;
        }
        if ("end".equals(fieldName)) {
            return end;
        }
        if ("strand".equals(fieldName)) {
            return strand;
        }
        if ("feature".equals(fieldName)) {
            return feature;
        }
        if ("locatedOn".equals(fieldName)) {
            return locatedOn;
        }
        if ("dataSets".equals(fieldName)) {
            return dataSets;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("start".equals(fieldName)) {
            start = (java.lang.Integer) value;
        } else if ("end".equals(fieldName)) {
            end = (java.lang.Integer) value;
        } else if ("strand".equals(fieldName)) {
            strand = (java.lang.String) value;
        } else if ("feature".equals(fieldName)) {
            feature = (org.intermine.model.InterMineObject) value;
        } else if ("locatedOn".equals(fieldName)) {
            locatedOn = (org.intermine.model.InterMineObject) value;
        } else if ("dataSets".equals(fieldName)) {
            dataSets = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Location.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("start".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("end".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("strand".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("feature".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("locatedOn".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if ("dataSets".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Location.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.LocationShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Location");
        if (start != null) {
            sb.append("$_^astart$_^").append(start);
        }
        if (end != null) {
            sb.append("$_^aend$_^").append(end);
        }
        if (strand != null) {
            sb.append("$_^astrand$_^");
            String string = strand;
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
        if (locatedOn != null) {
            sb.append("$_^rlocatedOn$_^").append(locatedOn.getId());
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
        if (!org.intermine.model.bio.LocationShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Location)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "astart".equals(notXml[i])) {
                i++;
                start = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aend".equals(notXml[i])) {
                i++;
                end = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "astrand".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                strand = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) &&"rfeature".equals(notXml[i])) {
                i++;
                feature = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
                i++;
            };
            if ((i < notXml.length) &&"rlocatedOn".equals(notXml[i])) {
                i++;
                locatedOn = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.BioEntity.class);
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
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("dataSets".equals(fieldName)) {
            dataSets.add((org.intermine.model.bio.DataSet) element);
        } else {
            if (!org.intermine.model.bio.Location.class.equals(getClass())) {
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
        if (!org.intermine.model.bio.Location.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Location.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

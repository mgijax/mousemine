package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.objectstore.proxy.ProxyReference;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class DataSetShadow implements DataSet, ShadowClass
{
    public static final Class<DataSet> shadowOf = DataSet.class;
    // Attr: org.intermine.model.bio.DataSet.name
    protected java.lang.String name;
    public java.lang.String getName() { return name; }
    public void setName(final java.lang.String name) { this.name = name; }

    // Attr: org.intermine.model.bio.DataSet.version
    protected java.lang.String version;
    public java.lang.String getVersion() { return version; }
    public void setVersion(final java.lang.String version) { this.version = version; }

    // Attr: org.intermine.model.bio.DataSet.url
    protected java.lang.String url;
    public java.lang.String getUrl() { return url; }
    public void setUrl(final java.lang.String url) { this.url = url; }

    // Attr: org.intermine.model.bio.DataSet.description
    protected java.lang.String description;
    public java.lang.String getDescription() { return description; }
    public void setDescription(final java.lang.String description) { this.description = description; }

    // Ref: org.intermine.model.bio.DataSet.dataSource
    protected org.intermine.model.InterMineObject dataSource;
    public org.intermine.model.bio.DataSource getDataSource() { if (dataSource instanceof org.intermine.objectstore.proxy.ProxyReference) { return ((org.intermine.model.bio.DataSource) ((org.intermine.objectstore.proxy.ProxyReference) dataSource).getObject()); }; return (org.intermine.model.bio.DataSource) dataSource; }
    public void setDataSource(final org.intermine.model.bio.DataSource dataSource) { this.dataSource = dataSource; }
    public void proxyDataSource(final org.intermine.objectstore.proxy.ProxyReference dataSource) { this.dataSource = dataSource; }
    public org.intermine.model.InterMineObject proxGetDataSource() { return dataSource; }

    // Col: org.intermine.model.bio.DataSet.bioEntities
    protected java.util.Set<org.intermine.model.bio.BioEntity> bioEntities = new java.util.HashSet<org.intermine.model.bio.BioEntity>();
    public java.util.Set<org.intermine.model.bio.BioEntity> getBioEntities() { return bioEntities; }
    public void setBioEntities(final java.util.Set<org.intermine.model.bio.BioEntity> bioEntities) { this.bioEntities = bioEntities; }
    public void addBioEntities(final org.intermine.model.bio.BioEntity arg) { bioEntities.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof DataSet && id != null) ? id.equals(((DataSet)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "DataSet [dataSource=" + (dataSource == null ? "null" : (dataSource.getId() == null ? "no id" : dataSource.getId().toString())) + ", description=\"" + description + "\", id=\"" + id + "\", name=\"" + name + "\", url=\"" + url + "\", version=\"" + version + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("version".equals(fieldName)) {
            return version;
        }
        if ("url".equals(fieldName)) {
            return url;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("dataSource".equals(fieldName)) {
            if (dataSource instanceof ProxyReference) {
                return ((ProxyReference) dataSource).getObject();
            } else {
                return dataSource;
            }
        }
        if ("bioEntities".equals(fieldName)) {
            return bioEntities;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.DataSet.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("name".equals(fieldName)) {
            return name;
        }
        if ("version".equals(fieldName)) {
            return version;
        }
        if ("url".equals(fieldName)) {
            return url;
        }
        if ("description".equals(fieldName)) {
            return description;
        }
        if ("dataSource".equals(fieldName)) {
            return dataSource;
        }
        if ("bioEntities".equals(fieldName)) {
            return bioEntities;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.DataSet.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("name".equals(fieldName)) {
            name = (java.lang.String) value;
        } else if ("version".equals(fieldName)) {
            version = (java.lang.String) value;
        } else if ("url".equals(fieldName)) {
            url = (java.lang.String) value;
        } else if ("description".equals(fieldName)) {
            description = (java.lang.String) value;
        } else if ("dataSource".equals(fieldName)) {
            dataSource = (org.intermine.model.InterMineObject) value;
        } else if ("bioEntities".equals(fieldName)) {
            bioEntities = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.DataSet.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("name".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("version".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("url".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("description".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("dataSource".equals(fieldName)) {
            return org.intermine.model.bio.DataSource.class;
        }
        if ("bioEntities".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.DataSet.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.DataSet.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.DataSetShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.DataSet");
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
        if (version != null) {
            sb.append("$_^aversion$_^");
            String string = version;
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
        if (url != null) {
            sb.append("$_^aurl$_^");
            String string = url;
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
        if (dataSource != null) {
            sb.append("$_^rdataSource$_^").append(dataSource.getId());
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
        if (!org.intermine.model.bio.DataSetShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.DataSet)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
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
            if ((i < notXml.length) && "aversion".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                version = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aurl".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                url = string == null ? notXml[i] : string.toString();
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
            if ((i < notXml.length) &&"rdataSource".equals(notXml[i])) {
                i++;
                dataSource = new ProxyReference(os, Integer.valueOf(notXml[i]), org.intermine.model.bio.DataSource.class);
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
        bioEntities = new ProxyCollection<org.intermine.model.bio.BioEntity>(os, this, "bioEntities", org.intermine.model.bio.BioEntity.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("bioEntities".equals(fieldName)) {
            bioEntities.add((org.intermine.model.bio.BioEntity) element);
        } else {
            if (!org.intermine.model.bio.DataSet.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("bioEntities".equals(fieldName)) {
            return org.intermine.model.bio.BioEntity.class;
        }
        if (!org.intermine.model.bio.DataSet.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.DataSet.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

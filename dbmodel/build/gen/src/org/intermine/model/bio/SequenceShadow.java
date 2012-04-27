package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class SequenceShadow implements Sequence, ShadowClass
{
    public static final Class<Sequence> shadowOf = Sequence.class;
    // Attr: org.intermine.model.bio.Sequence.md5checksum
    protected java.lang.String md5checksum;
    public java.lang.String getMd5checksum() { return md5checksum; }
    public void setMd5checksum(final java.lang.String md5checksum) { this.md5checksum = md5checksum; }

    // Attr: org.intermine.model.bio.Sequence.length
    protected int length;
    public int getLength() { return length; }
    public void setLength(final int length) { this.length = length; }

    // Attr: org.intermine.model.bio.Sequence.residues
    protected org.intermine.objectstore.query.ClobAccess residues;
    public org.intermine.objectstore.query.ClobAccess getResidues() { return residues; }
    public void setResidues(final org.intermine.objectstore.query.ClobAccess residues) { this.residues = residues; }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Sequence && id != null) ? id.equals(((Sequence)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Sequence [id=\"" + id + "\", length=\"" + length + "\", md5checksum=\"" + md5checksum + "\", residues=\"" + residues + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("md5checksum".equals(fieldName)) {
            return md5checksum;
        }
        if ("length".equals(fieldName)) {
            return Integer.valueOf(length);
        }
        if ("residues".equals(fieldName)) {
            return residues;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Sequence.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("md5checksum".equals(fieldName)) {
            return md5checksum;
        }
        if ("length".equals(fieldName)) {
            return Integer.valueOf(length);
        }
        if ("residues".equals(fieldName)) {
            return residues;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Sequence.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("md5checksum".equals(fieldName)) {
            md5checksum = (java.lang.String) value;
        } else if ("length".equals(fieldName)) {
            length = ((Integer) value).intValue();
        } else if ("residues".equals(fieldName)) {
            residues = (org.intermine.objectstore.query.ClobAccess) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Sequence.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("md5checksum".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("length".equals(fieldName)) {
            return Integer.TYPE;
        }
        if ("residues".equals(fieldName)) {
            return org.intermine.objectstore.query.ClobAccess.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Sequence.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Sequence.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.SequenceShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Sequence");
        if (md5checksum != null) {
            sb.append("$_^amd5checksum$_^");
            String string = md5checksum;
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
        sb.append("$_^alength$_^").append(length);
        if (residues != null) {
            sb.append("$_^aresidues$_^" + residues.getDbDescription());
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
        if (!org.intermine.model.bio.SequenceShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Sequence)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "amd5checksum".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                md5checksum = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "alength".equals(notXml[i])) {
                i++;
                length = Integer.parseInt(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "aresidues".equals(notXml[i])) {
                i++;
                residues = org.intermine.objectstore.query.ClobAccess.decodeDbDescription(os, notXml[i]);
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
            if (!org.intermine.model.bio.Sequence.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if (!org.intermine.model.bio.Sequence.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Sequence.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

package org.intermine.model.bio;

import org.intermine.objectstore.ObjectStore;
import org.intermine.objectstore.intermine.NotXmlParser;
import org.intermine.objectstore.intermine.NotXmlRenderer;
import org.intermine.objectstore.proxy.ProxyCollection;
import org.intermine.util.StringConstructor;
import org.intermine.util.TypeUtil;
import org.intermine.model.ShadowClass;

public class PublicationShadow implements Publication, ShadowClass
{
    public static final Class<Publication> shadowOf = Publication.class;
    // Attr: org.intermine.model.bio.Publication.pages
    protected java.lang.String pages;
    public java.lang.String getPages() { return pages; }
    public void setPages(final java.lang.String pages) { this.pages = pages; }

    // Attr: org.intermine.model.bio.Publication.year
    protected java.lang.Integer year;
    public java.lang.Integer getYear() { return year; }
    public void setYear(final java.lang.Integer year) { this.year = year; }

    // Attr: org.intermine.model.bio.Publication.volume
    protected java.lang.String volume;
    public java.lang.String getVolume() { return volume; }
    public void setVolume(final java.lang.String volume) { this.volume = volume; }

    // Attr: org.intermine.model.bio.Publication.issue
    protected java.lang.String issue;
    public java.lang.String getIssue() { return issue; }
    public void setIssue(final java.lang.String issue) { this.issue = issue; }

    // Attr: org.intermine.model.bio.Publication.pubMedId
    protected java.lang.String pubMedId;
    public java.lang.String getPubMedId() { return pubMedId; }
    public void setPubMedId(final java.lang.String pubMedId) { this.pubMedId = pubMedId; }

    // Attr: org.intermine.model.bio.Publication.mgiId
    protected java.lang.String mgiId;
    public java.lang.String getMgiId() { return mgiId; }
    public void setMgiId(final java.lang.String mgiId) { this.mgiId = mgiId; }

    // Attr: org.intermine.model.bio.Publication.journal
    protected java.lang.String journal;
    public java.lang.String getJournal() { return journal; }
    public void setJournal(final java.lang.String journal) { this.journal = journal; }

    // Attr: org.intermine.model.bio.Publication.title
    protected java.lang.String title;
    public java.lang.String getTitle() { return title; }
    public void setTitle(final java.lang.String title) { this.title = title; }

    // Attr: org.intermine.model.bio.Publication.firstAuthor
    protected java.lang.String firstAuthor;
    public java.lang.String getFirstAuthor() { return firstAuthor; }
    public void setFirstAuthor(final java.lang.String firstAuthor) { this.firstAuthor = firstAuthor; }

    // Attr: org.intermine.model.bio.Publication.abstractText
    protected java.lang.String abstractText;
    public java.lang.String getAbstractText() { return abstractText; }
    public void setAbstractText(final java.lang.String abstractText) { this.abstractText = abstractText; }

    // Col: org.intermine.model.bio.Publication.authors
    protected java.util.Set<org.intermine.model.bio.Author> authors = new java.util.HashSet<org.intermine.model.bio.Author>();
    public java.util.Set<org.intermine.model.bio.Author> getAuthors() { return authors; }
    public void setAuthors(final java.util.Set<org.intermine.model.bio.Author> authors) { this.authors = authors; }
    public void addAuthors(final org.intermine.model.bio.Author arg) { authors.add(arg); }

    // Attr: org.intermine.model.InterMineObject.id
    protected java.lang.Integer id;
    public java.lang.Integer getId() { return id; }
    public void setId(final java.lang.Integer id) { this.id = id; }

    @Override public boolean equals(Object o) { return (o instanceof Publication && id != null) ? id.equals(((Publication)o).getId()) : this == o; }
    @Override public int hashCode() { return (id != null) ? id.hashCode() : super.hashCode(); }
    @Override public String toString() { return "Publication [abstractText=\"" + abstractText + "\", firstAuthor=\"" + firstAuthor + "\", id=\"" + id + "\", issue=\"" + issue + "\", journal=\"" + journal + "\", mgiId=\"" + mgiId + "\", pages=\"" + pages + "\", pubMedId=\"" + pubMedId + "\", title=\"" + title + "\", volume=\"" + volume + "\", year=\"" + year + "\"]"; }
    public Object getFieldValue(final String fieldName) throws IllegalAccessException {
        if ("pages".equals(fieldName)) {
            return pages;
        }
        if ("year".equals(fieldName)) {
            return year;
        }
        if ("volume".equals(fieldName)) {
            return volume;
        }
        if ("issue".equals(fieldName)) {
            return issue;
        }
        if ("pubMedId".equals(fieldName)) {
            return pubMedId;
        }
        if ("mgiId".equals(fieldName)) {
            return mgiId;
        }
        if ("journal".equals(fieldName)) {
            return journal;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("firstAuthor".equals(fieldName)) {
            return firstAuthor;
        }
        if ("abstractText".equals(fieldName)) {
            return abstractText;
        }
        if ("authors".equals(fieldName)) {
            return authors;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getFieldValue(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public Object getFieldProxy(final String fieldName) throws IllegalAccessException {
        if ("pages".equals(fieldName)) {
            return pages;
        }
        if ("year".equals(fieldName)) {
            return year;
        }
        if ("volume".equals(fieldName)) {
            return volume;
        }
        if ("issue".equals(fieldName)) {
            return issue;
        }
        if ("pubMedId".equals(fieldName)) {
            return pubMedId;
        }
        if ("mgiId".equals(fieldName)) {
            return mgiId;
        }
        if ("journal".equals(fieldName)) {
            return journal;
        }
        if ("title".equals(fieldName)) {
            return title;
        }
        if ("firstAuthor".equals(fieldName)) {
            return firstAuthor;
        }
        if ("abstractText".equals(fieldName)) {
            return abstractText;
        }
        if ("authors".equals(fieldName)) {
            return authors;
        }
        if ("id".equals(fieldName)) {
            return id;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getFieldProxy(this, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public void setFieldValue(final String fieldName, final Object value) {
        if ("pages".equals(fieldName)) {
            pages = (java.lang.String) value;
        } else if ("year".equals(fieldName)) {
            year = (java.lang.Integer) value;
        } else if ("volume".equals(fieldName)) {
            volume = (java.lang.String) value;
        } else if ("issue".equals(fieldName)) {
            issue = (java.lang.String) value;
        } else if ("pubMedId".equals(fieldName)) {
            pubMedId = (java.lang.String) value;
        } else if ("mgiId".equals(fieldName)) {
            mgiId = (java.lang.String) value;
        } else if ("journal".equals(fieldName)) {
            journal = (java.lang.String) value;
        } else if ("title".equals(fieldName)) {
            title = (java.lang.String) value;
        } else if ("firstAuthor".equals(fieldName)) {
            firstAuthor = (java.lang.String) value;
        } else if ("abstractText".equals(fieldName)) {
            abstractText = (java.lang.String) value;
        } else if ("authors".equals(fieldName)) {
            authors = (java.util.Set) value;
        } else if ("id".equals(fieldName)) {
            id = (java.lang.Integer) value;
        } else {
            if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
                TypeUtil.setFieldValue(this, fieldName, value);
                return;
            }
            throw new IllegalArgumentException("Unknown field " + fieldName);
        }
    }
    public Class<?> getFieldType(final String fieldName) {
        if ("pages".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("year".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if ("volume".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("issue".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("pubMedId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("mgiId".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("journal".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("title".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("firstAuthor".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("abstractText".equals(fieldName)) {
            return java.lang.String.class;
        }
        if ("authors".equals(fieldName)) {
            return java.util.Set.class;
        }
        if ("id".equals(fieldName)) {
            return java.lang.Integer.class;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getFieldType(org.intermine.model.bio.Publication.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
    public StringConstructor getoBJECT() {
        if (!org.intermine.model.bio.PublicationShadow.class.equals(getClass())) {
            return NotXmlRenderer.render(this);
        }
        StringConstructor sb = new StringConstructor();
        sb.append("$_^org.intermine.model.bio.Publication");
        if (pages != null) {
            sb.append("$_^apages$_^");
            String string = pages;
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
        if (year != null) {
            sb.append("$_^ayear$_^").append(year);
        }
        if (volume != null) {
            sb.append("$_^avolume$_^");
            String string = volume;
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
        if (issue != null) {
            sb.append("$_^aissue$_^");
            String string = issue;
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
        if (pubMedId != null) {
            sb.append("$_^apubMedId$_^");
            String string = pubMedId;
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
        if (mgiId != null) {
            sb.append("$_^amgiId$_^");
            String string = mgiId;
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
        if (journal != null) {
            sb.append("$_^ajournal$_^");
            String string = journal;
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
        if (title != null) {
            sb.append("$_^atitle$_^");
            String string = title;
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
        if (firstAuthor != null) {
            sb.append("$_^afirstAuthor$_^");
            String string = firstAuthor;
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
        if (abstractText != null) {
            sb.append("$_^aabstractText$_^");
            String string = abstractText;
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
        if (!org.intermine.model.bio.PublicationShadow.class.equals(getClass())) {
            throw new IllegalStateException("Class " + getClass().getName() + " does not match code (org.intermine.model.bio.Publication)");
        }
        for (int i = 2; i < notXml.length;) {
            int startI = i;
            if ((i < notXml.length) && "apages".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pages = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ayear".equals(notXml[i])) {
                i++;
                year = Integer.valueOf(notXml[i]);
                i++;
            }
            if ((i < notXml.length) && "avolume".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                volume = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aissue".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                issue = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "apubMedId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                pubMedId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "amgiId".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                mgiId = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "ajournal".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                journal = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "atitle".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                title = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "afirstAuthor".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                firstAuthor = string == null ? notXml[i] : string.toString();
                i++;
            }
            if ((i < notXml.length) && "aabstractText".equals(notXml[i])) {
                i++;
                StringBuilder string = null;
                while ((i + 1 < notXml.length) && (notXml[i + 1].charAt(0) == 'd')) {
                    if (string == null) string = new StringBuilder(notXml[i]);
                    i++;
                    string.append("$_^").append(notXml[i].substring(1));
                }
                abstractText = string == null ? notXml[i] : string.toString();
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
        authors = new ProxyCollection<org.intermine.model.bio.Author>(os, this, "authors", org.intermine.model.bio.Author.class);
    }
    public void addCollectionElement(final String fieldName, final org.intermine.model.InterMineObject element) {
        if ("authors".equals(fieldName)) {
            authors.add((org.intermine.model.bio.Author) element);
        } else {
            if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
                TypeUtil.addCollectionElement(this, fieldName, element);
                return;
            }
            throw new IllegalArgumentException("Unknown collection " + fieldName);
        }
    }
    public Class<?> getElementType(final String fieldName) {
        if ("authors".equals(fieldName)) {
            return org.intermine.model.bio.Author.class;
        }
        if (!org.intermine.model.bio.Publication.class.equals(getClass())) {
            return TypeUtil.getElementType(org.intermine.model.bio.Publication.class, fieldName);
        }
        throw new IllegalArgumentException("Unknown field " + fieldName);
    }
}

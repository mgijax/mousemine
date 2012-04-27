package org.intermine.model.bio;

public interface OntologyTerm extends org.intermine.model.InterMineObject
{
    public java.lang.String getIdentifier();
    public void setIdentifier(final java.lang.String identifier);

    public java.lang.Boolean getObsolete();
    public void setObsolete(final java.lang.Boolean obsolete);

    public java.lang.String getNamespace();
    public void setNamespace(final java.lang.String namespace);

    public java.lang.String getName();
    public void setName(final java.lang.String name);

    public java.lang.String getDescription();
    public void setDescription(final java.lang.String description);

    public org.intermine.model.bio.Ontology getOntology();
    public void setOntology(final org.intermine.model.bio.Ontology ontology);
    public void proxyOntology(final org.intermine.objectstore.proxy.ProxyReference ontology);
    public org.intermine.model.InterMineObject proxGetOntology();

    public java.util.Set<org.intermine.model.bio.OntologyRelation> getRelations();
    public void setRelations(final java.util.Set<org.intermine.model.bio.OntologyRelation> relations);
    public void addRelations(final org.intermine.model.bio.OntologyRelation arg);

    public java.util.Set<org.intermine.model.bio.OntologyTermSynonym> getSynonyms();
    public void setSynonyms(final java.util.Set<org.intermine.model.bio.OntologyTermSynonym> synonyms);
    public void addSynonyms(final org.intermine.model.bio.OntologyTermSynonym arg);

    public java.util.Set<org.intermine.model.bio.OntologyAnnotation> getOntologyAnnotations();
    public void setOntologyAnnotations(final java.util.Set<org.intermine.model.bio.OntologyAnnotation> ontologyAnnotations);
    public void addOntologyAnnotations(final org.intermine.model.bio.OntologyAnnotation arg);

    public java.util.Set<org.intermine.model.bio.OntologyTerm> getParents();
    public void setParents(final java.util.Set<org.intermine.model.bio.OntologyTerm> parents);
    public void addParents(final org.intermine.model.bio.OntologyTerm arg);

    public java.util.Set<org.intermine.model.bio.DataSet> getDataSets();
    public void setDataSets(final java.util.Set<org.intermine.model.bio.DataSet> dataSets);
    public void addDataSets(final org.intermine.model.bio.DataSet arg);

}

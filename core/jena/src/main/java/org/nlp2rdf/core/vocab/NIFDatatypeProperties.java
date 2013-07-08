package org.nlp2rdf.core.vocab;

import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.OntModel;

/**
 * This class was automatically generated from http://persistence.uni-leipzig.org/nlp2rdf/ontologies/nif-core#
 * @author croeder
 *
*/

public enum NIFDatatypeProperties {

    /**
     * Part of speech tag -> To include the pos tag as it comes out of the NLP tool as RDF Literal. This property is discouraged to use alone, please use oliaLink and oliaCategory.  
     */
    posTag,

    /**
     * lemma -> The lemma(s) of the nif:String.
     */
    lemma,

    /**
     * begin index -> The begin index of a character range as defined in http://tools.ietf.org/html/rfc5147#section-2.2.1 and http://tools.ietf.org/html/rfc5147#section-2.2.2, measured as the gap between two characters, starting to count from 0 (the position before the first character of a text). 
    Example: Index "2" is the postion between "Mr" and "."  in "Mr. Sandman".
    Note: RFC 5147 is re-used for the definition of character ranges. RFC 5147 is assuming a text/plain MIME type. NIF builds upon Unicode and is content agnostic. 
    Requirement (1): This property has the same value the "Character position" of RFC 5147 and it must therefore be an xsd:nonNegativeInteger .  
    Requirement (2): The index of the subject string MUST be calculated relative to the nif:referenceContext of the subject. If available, this is the rdf:Literal of the nif:isString property.
     */
    beginIndex,

    /**
     * sentiment value -> Between -1 negative and 1 positive 
     */
    sentimentValue,

    /**
     * end index -> The end index of a character range as defined in http://tools.ietf.org/html/rfc5147#section-2.2.1 and http://tools.ietf.org/html/rfc5147#section-2.2.2, measured as the gap between two characters, starting to count from 0 (the position before the first character of a text). 
    Example: Index "2" is the postion between "Mr" and "."  in "Mr. Sandman".
    Note: RFC 5147 is re-used for the definition of character ranges. RFC 5147 is assuming a text/plain MIME type. NIF builds upon Unicode and is content agnostic. 
    Requirement (1): This property has the same value the "Character position" of RFC 5147 and it must therefore be an xsd:nonNegativeInteger .  
    Requirement (2): The index of the subject string MUST be calculated relative to the nif:referenceContext of the subject. If available, this is the rdf:Literal of the nif:isString property.
     */
    endIndex,

    /**
     * stem -> The stem(s) of the nif:String.
     */
    stem,

    /**
     * contextAsLiteral -> 
      The string that the nif:anchorOf is embedded in. FILTER ( strlen (nif:referenceContext [ nif:isString ] ) ) 
    
     */
    contextAsLiteral,

    /**
     * confidence -> The confidence of the nif:Annotation. If this property is attached to a nif:String, this property indicates the likelyness that the assigned indices and the nif:Structures are correct. If there are problems with URI minting use nif:ArbitraryString
     */
    confidence,

    /**
     * before -> For each string you can include a snippet (e.g. 10-40 characters of text), that occurs immediately before the subject string.
     */
    before,

    /**
     * literalAnnotation -> 
      see Towards Web-Scale Collaborative Knowledge Extraction  http://svn.aksw.org/papers/2012/PeoplesWeb/public_preprint.pdf‎ page 5 .
    
     */
    literalAnnotation,

    /**
     * anchor of -> The string, which the uri is representing as an RDF Literal. Some use cases require this property, as it is necessary for certain sparql queries. 
     */
    anchorOf,

    /**
     * head -> 
      The first few chars of the nif:anchorOf. Typically used if the nif:anchorOf
      is to long for inclusion as RDF literal.
    
     */
    head,

    /**
     * after -> For each string you can include a snippet (e.g. 10-40 characters of text), that occurs immediately after the subject string.
     */
    after,

    /**
     * confidence of OLiA link -> The confidence is relative to the tool and can be between 0.0 and 1.0 
     */
    oliaLinkConf,

    /**
     * confidence of OLiA category -> The confidence is relative to the tool and can be between 0.0 and 1.0 
     */
    oliaCategoryConf,

    /**
     * is string -> The reference text as rdf:Literal for this nif:Context resource.  
    NIF highly recommends to always include the reference text (i.e. the context) as an rdf:Literal.
    Note, that the isString property is *the* place to keep the string itself in RDF.
    All other nif:Strings and nif:URISchemes relate to the text of this property to calculate character position and indices. 
     */
    isString;

    String uri;

    NIFDatatypeProperties() {
        this.uri = "http://persistence.uni-leipzig.org/nlp2rdf/ontologies/nif-core#" + name();
    }

    public String getUri() {
        return uri;
    }

    @Override
    public String toString() {
        return "nif:" + name();
    }

    public DatatypeProperty getDatatypeProperty(OntModel model) {
        return model.createDatatypeProperty(getUri());
    }
}

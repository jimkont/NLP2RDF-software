/***************************************************************************/
/*  Copyright (C) 2010-2011, Sebastian Hellmann                            */
/*  Note: If you need parts of NLP2RDF in another licence due to licence   */
/*  incompatibility, please mail hellmann@informatik.uni-leipzig.de        */
/*                                                                         */
/*  This file is part of NLP2RDF.                                          */
/*                                                                         */
/*  NLP2RDF is free software; you can redistribute it and/or modify        */
/*  it under the terms of the GNU General Public License as published by   */
/*  the Free Software Foundation; either version 3 of the License, or      */
/*  (at your option) any later version.                                    */
/*                                                                         */
/*  NLP2RDF is distributed in the hope that it will be useful,             */
/*  but WITHOUT ANY WARRANTY; without even the implied warranty of         */
/*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the           */
/*  GNU General Public License for more details.                           */
/*                                                                         */
/*  You should have received a copy of the GNU General Public License      */
/*  along with this program. If not, see <http://www.gnu.org/licenses/>.   */
/***************************************************************************/

package org.nlp2rdf.implementation;


import com.hp.hpl.jena.ontology.OntModel;
import org.nlp2rdf.webservice.NIFParameters;
import org.nlp2rdf.webservice.NIFServlet;


/**
 * What did you expect?
 * Of course there are helper functions in the core package.
 * You should have a look at NIFParameters
 * It is fairly well documented and gives you most of the parameters + your additional parameters
 */
public class NIFConverter extends NIFServlet {

    @Override
    public void execute(NIFParameters nifParameters, OntModel diff) throws Exception {
        diff.add(nifParameters.getInputModel());
    }


}

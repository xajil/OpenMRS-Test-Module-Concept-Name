/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.conceptname.web.controller;

import org.openmrs.Concept;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
// import org.openmrs.api.context.Context;
import org.springframework.stereotype.Controller;
// import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.ModelAttribute;
// org.springframework.web.bind.annotation.RequestMapping;
// org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * The main controller.
 */
@Controller
public class  ConceptNameManageController {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	@ModelAttribute
	public Concept getConcept(@RequestParam (required=false, value="conceptId") Concept concept ){
	return concept;	
		
	}
	
	@RequestMapping(value = "/module/conceptname/viewConceptNames", method = RequestMethod.GET)
	public void showForm(){
		
	}
}

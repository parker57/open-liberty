/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.health20.internal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Microprofile Health Check Service
 */
public interface HealthCheck20Service {

    /**
     * Performs the health check for a given http request, ie. http://hostname:port/health
     * and returns a health response in httpResponse
     *
     * @param request
     * @param httpResponse
     */
    void performHealthCheck(HttpServletRequest request, HttpServletResponse httpResponse);

    /**
     * Performs the health check for a given health check procedure
     * and returns a health response in httpResponse
     *
     * @param request
     * @param httpResponse
     * @param healthCheckProcedure
     */
    void performHealthCheck(HttpServletRequest request, HttpServletResponse httpResponse, String healthCheckProcedure);

}
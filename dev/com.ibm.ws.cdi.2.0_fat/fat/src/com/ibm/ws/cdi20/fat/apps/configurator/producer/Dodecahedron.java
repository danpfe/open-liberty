/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.cdi20.fat.apps.configurator.producer;

import javax.enterprise.inject.Vetoed;

@Vetoed
public class Dodecahedron {

    private ParameterInjectedBean paramInjectedBean;

    public Dodecahedron(ParameterInjectedBean paramInjectedBean) {
        this.paramInjectedBean = paramInjectedBean;
    }

    public ParameterInjectedBean getParamInjectedBean() {
        return paramInjectedBean;
    }
}

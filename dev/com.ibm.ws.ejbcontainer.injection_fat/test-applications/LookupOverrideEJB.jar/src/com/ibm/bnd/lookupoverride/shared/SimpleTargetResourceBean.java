/*******************************************************************************
 * Copyright (c) 2010, 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.bnd.lookupoverride.shared;

import javax.ejb.Stateless;

@Stateless
public class SimpleTargetResourceBean implements SimpleTargetResource {

    @Override
    public int ping() {

        // Caller knows to expect this hard-coded value
        return 54;

    }

}

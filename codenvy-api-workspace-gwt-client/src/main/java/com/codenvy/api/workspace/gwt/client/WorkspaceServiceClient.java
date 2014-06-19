/*******************************************************************************
 * Copyright (c) 2012-2014 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package com.codenvy.api.workspace.gwt.client;

import com.codenvy.api.workspace.shared.dto.Workspace;
import com.codenvy.ide.rest.AsyncRequestCallback;

/**
 * GWT Client for Workspace Service.
 *
 * @author Roman Nikitenko
 */
public interface WorkspaceServiceClient {
    /**
     * Get workspace information by ID.
     *
     * @param wsId workspace's id
     * @param callback
     */
    public void getWorkspace(String wsId, AsyncRequestCallback<Workspace> callback);
}
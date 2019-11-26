/*******************************************************************************
 * Copyright (c) 2019 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package com.redhat.devtools.intellij.tektoncd.tkn;

import java.util.Optional;

public interface TaskRun {
    String getName();
    Optional<Boolean> isCompleted();

    public static TaskRun of(String name, Optional<Boolean> completed) {
        return new TaskRun() {

            @Override
            public String getName() {
                return name;
            }

            @Override
            public Optional<Boolean> isCompleted() {
                return completed;
            }
        };
    }
}

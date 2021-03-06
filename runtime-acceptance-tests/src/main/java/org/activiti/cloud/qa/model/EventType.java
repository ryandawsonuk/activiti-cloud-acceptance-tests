/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.qa.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {

    TASK_COMPLETED("TaskCompletedEvent"),
    PROCESS_STARTED("ProcessStartedEvent"),
    PROCESS_COMPLETED("ProcessCompletedEvent"),
    PROCESS_CANCELLED("ProcessCancelledEvent"),
    TASK_CREATED("TaskCreatedEvent"),
    TASK_ASSIGNED("TaskAssignedEvent"),
    TASK_CANCELLED("TaskCancelledEvent"),
    ACTIVITY_STARTED("ActivityStartedEvent"),
    ACTIVITY_CANCELLED("ActivityCancelledEvent"),
    ACTIVITY_COMPLETED("ActivityCompletedEvent"),
    ACTIVITY_CANCELLED_EVENT("ActivityCancelledEvent"),
    SEQUENCE_FLOW_TAKEN("SequenceFlowTakenEvent"),
    TASK_CANDIDATE_GROUP_REMOVED("TaskCandidateGroupRemovedEvent"),
    TASK_CANDIDATE_GROUP_ADDED("TaskCandidateGroupAddedEvent"),
    VARIABLE_CREATED("VariableCreatedEvent");

    private final String type;

    EventType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return this.type;
    }

}

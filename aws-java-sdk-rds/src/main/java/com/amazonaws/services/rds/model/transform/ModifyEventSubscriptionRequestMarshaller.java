/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ModifyEventSubscriptionRequest Marshaller
 */

public class ModifyEventSubscriptionRequestMarshaller
        implements
        Marshaller<Request<ModifyEventSubscriptionRequest>, ModifyEventSubscriptionRequest> {

    public Request<ModifyEventSubscriptionRequest> marshall(
            ModifyEventSubscriptionRequest modifyEventSubscriptionRequest) {

        if (modifyEventSubscriptionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ModifyEventSubscriptionRequest> request = new DefaultRequest<ModifyEventSubscriptionRequest>(
                modifyEventSubscriptionRequest, "AmazonRDS");
        request.addParameter("Action", "ModifyEventSubscription");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (modifyEventSubscriptionRequest.getSubscriptionName() != null) {
            request.addParameter("SubscriptionName", StringUtils
                    .fromString(modifyEventSubscriptionRequest
                            .getSubscriptionName()));
        }

        if (modifyEventSubscriptionRequest.getSnsTopicArn() != null) {
            request.addParameter("SnsTopicArn",
                    StringUtils.fromString(modifyEventSubscriptionRequest
                            .getSnsTopicArn()));
        }

        if (modifyEventSubscriptionRequest.getSourceType() != null) {
            request.addParameter("SourceType", StringUtils
                    .fromString(modifyEventSubscriptionRequest.getSourceType()));
        }

        com.amazonaws.internal.SdkInternalList<String> eventCategoriesList = (com.amazonaws.internal.SdkInternalList<String>) modifyEventSubscriptionRequest
                .getEventCategories();
        if (!eventCategoriesList.isEmpty()
                || !eventCategoriesList.isAutoConstruct()) {
            int eventCategoriesListIndex = 1;

            for (String eventCategoriesListValue : eventCategoriesList) {
                if (eventCategoriesListValue != null) {
                    request.addParameter("EventCategories.EventCategory."
                            + eventCategoriesListIndex,
                            StringUtils.fromString(eventCategoriesListValue));
                }
                eventCategoriesListIndex++;
            }
        }

        if (modifyEventSubscriptionRequest.getEnabled() != null) {
            request.addParameter("Enabled", StringUtils
                    .fromBoolean(modifyEventSubscriptionRequest.getEnabled()));
        }

        return request;
    }

}

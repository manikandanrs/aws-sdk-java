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

package com.amazonaws.services.cloudsearchv2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchv2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * UpdateScalingParametersRequest Marshaller
 */

public class UpdateScalingParametersRequestMarshaller
        implements
        Marshaller<Request<UpdateScalingParametersRequest>, UpdateScalingParametersRequest> {

    public Request<UpdateScalingParametersRequest> marshall(
            UpdateScalingParametersRequest updateScalingParametersRequest) {

        if (updateScalingParametersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<UpdateScalingParametersRequest> request = new DefaultRequest<UpdateScalingParametersRequest>(
                updateScalingParametersRequest, "AmazonCloudSearchv2");
        request.addParameter("Action", "UpdateScalingParameters");
        request.addParameter("Version", "2013-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (updateScalingParametersRequest.getDomainName() != null) {
            request.addParameter("DomainName", StringUtils
                    .fromString(updateScalingParametersRequest.getDomainName()));
        }

        ScalingParameters scalingParameters = updateScalingParametersRequest
                .getScalingParameters();
        if (scalingParameters != null) {

            if (scalingParameters.getDesiredInstanceType() != null) {
                request.addParameter("ScalingParameters.DesiredInstanceType",
                        StringUtils.fromString(scalingParameters
                                .getDesiredInstanceType()));
            }

            if (scalingParameters.getDesiredReplicationCount() != null) {
                request.addParameter(
                        "ScalingParameters.DesiredReplicationCount",
                        StringUtils.fromInteger(scalingParameters
                                .getDesiredReplicationCount()));
            }

            if (scalingParameters.getDesiredPartitionCount() != null) {
                request.addParameter("ScalingParameters.DesiredPartitionCount",
                        StringUtils.fromInteger(scalingParameters
                                .getDesiredPartitionCount()));
            }
        }

        return request;
    }

}

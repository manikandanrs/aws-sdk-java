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

package com.amazonaws.services.machinelearning.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3DataSpec JSON Unmarshaller
 */
public class S3DataSpecJsonUnmarshaller implements
        Unmarshaller<S3DataSpec, JsonUnmarshallerContext> {

    public S3DataSpec unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        S3DataSpec s3DataSpec = new S3DataSpec();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DataLocationS3", targetDepth)) {
                    context.nextToken();
                    s3DataSpec.setDataLocationS3(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("DataRearrangement", targetDepth)) {
                    context.nextToken();
                    s3DataSpec.setDataRearrangement(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("DataSchema", targetDepth)) {
                    context.nextToken();
                    s3DataSpec.setDataSchema(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
                if (context.testExpression("DataSchemaLocationS3", targetDepth)) {
                    context.nextToken();
                    s3DataSpec.setDataSchemaLocationS3(context.getUnmarshaller(
                            String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return s3DataSpec;
    }

    private static S3DataSpecJsonUnmarshaller instance;

    public static S3DataSpecJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3DataSpecJsonUnmarshaller();
        return instance;
    }
}

package com.github.mpnsk;

import io.redskap.java.aws.dynamodb.example.local.testing.AwsDynamoDbLocalTestUtils;
import software.amazon.awssdk.extensions.dynamodb.mappingclient.functionaltests.LocalDynamoDb;

public class DynamoDbEmbeddedUtils {
    public static void initSqLite() {
        AwsDynamoDbLocalTestUtils.initSqLite();
    }

    public static LocalDynamoDb local() {
        return new LocalDynamoDb();
    }
}

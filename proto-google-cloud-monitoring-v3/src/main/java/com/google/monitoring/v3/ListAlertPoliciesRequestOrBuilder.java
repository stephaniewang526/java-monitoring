// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/alert_service.proto

package com.google.monitoring.v3;

public interface ListAlertPoliciesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListAlertPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The project whose alert policies are to be listed. The format is
   *     projects/[PROJECT_ID]
   * Note that this field names the parent container in which the alerting
   * policies to be listed are stored. To retrieve a single alerting policy
   * by name, use the
   * [GetAlertPolicy][google.monitoring.v3.AlertPolicyService.GetAlertPolicy]
   * operation, instead.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The project whose alert policies are to be listed. The format is
   *     projects/[PROJECT_ID]
   * Note that this field names the parent container in which the alerting
   * policies to be listed are stored. To retrieve a single alerting policy
   * by name, use the
   * [GetAlertPolicy][google.monitoring.v3.AlertPolicyService.GetAlertPolicy]
   * operation, instead.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by
   * alert policies to be included in the response.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * If provided, this field specifies the criteria that must be met by
   * alert policies to be included in the response.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string filter = 5;</code>
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * A comma-separated list of fields by which to sort the result. Supports
   * the same set of field references as the `filter` field. Entries can be
   * prefixed with a minus sign to sort by the field in descending order.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * A comma-separated list of fields by which to sort the result. Supports
   * the same set of field references as the `filter` field. Entries can be
   * prefixed with a minus sign to sort by the field in descending order.
   * For more details, see [sorting and
   * filtering](/monitoring/api/v3/sorting-and-filtering).
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * The maximum number of results to return in a single response.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return more results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return more results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}

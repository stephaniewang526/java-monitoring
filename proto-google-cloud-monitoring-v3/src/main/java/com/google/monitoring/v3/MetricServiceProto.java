/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public final class MetricServiceProto {
  private MetricServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/monitoring/v3/metric_service.pr"
          + "oto\022\024google.monitoring.v3\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\027googl"
          + "e/api/metric.proto\032#google/api/monitored"
          + "_resource.proto\032\031google/api/resource.pro"
          + "to\032 google/monitoring/v3/alert.proto\032!go"
          + "ogle/monitoring/v3/common.proto\032!google/"
          + "monitoring/v3/metric.proto\032\036google/proto"
          + "buf/duration.proto\032\033google/protobuf/empt"
          + "y.proto\032\027google/rpc/status.proto\"\255\001\n\'Lis"
          + "tMonitoredResourceDescriptorsRequest\022K\n\004"
          + "name\030\005 \001(\tB=\340A\002\372A7\0225monitoring.googleapi"
          + "s.com/MonitoredResourceDescriptor\022\016\n\006fil"
          + "ter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_tok"
          + "en\030\004 \001(\t\"\212\001\n(ListMonitoredResourceDescri"
          + "ptorsResponse\022E\n\024resource_descriptors\030\001 "
          + "\003(\0132\'.google.api.MonitoredResourceDescri"
          + "ptor\022\027\n\017next_page_token\030\002 \001(\t\"t\n%GetMoni"
          + "toredResourceDescriptorRequest\022K\n\004name\030\003"
          + " \001(\tB=\340A\002\372A7\n5monitoring.googleapis.com/"
          + "MonitoredResourceDescriptor\"\227\001\n\034ListMetr"
          + "icDescriptorsRequest\022@\n\004name\030\005 \001(\tB2\340A\002\372"
          + "A,\022*monitoring.googleapis.com/MetricDesc"
          + "riptor\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003 \001("
          + "\005\022\022\n\npage_token\030\004 \001(\t\"r\n\035ListMetricDescr"
          + "iptorsResponse\0228\n\022metric_descriptors\030\001 \003"
          + "(\0132\034.google.api.MetricDescriptor\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"^\n\032GetMetricDescriptor"
          + "Request\022@\n\004name\030\003 \001(\tB2\340A\002\372A,\n*monitorin"
          + "g.googleapis.com/MetricDescriptor\"\237\001\n\035Cr"
          + "eateMetricDescriptorRequest\022@\n\004name\030\003 \001("
          + "\tB2\340A\002\372A,\022*monitoring.googleapis.com/Met"
          + "ricDescriptor\022<\n\021metric_descriptor\030\002 \001(\013"
          + "2\034.google.api.MetricDescriptorB\003\340A\002\"a\n\035D"
          + "eleteMetricDescriptorRequest\022@\n\004name\030\003 \001"
          + "(\tB2\340A\002\372A,\n*monitoring.googleapis.com/Me"
          + "tricDescriptor\"\223\003\n\025ListTimeSeriesRequest"
          + "\022A\n\004name\030\n \001(\tB3\340A\002\372A-\n+cloudresourceman"
          + "ager.googleapis.com/Project\022\023\n\006filter\030\002 "
          + "\001(\tB\003\340A\002\0229\n\010interval\030\004 \001(\0132\".google.moni"
          + "toring.v3.TimeIntervalB\003\340A\002\0226\n\013aggregati"
          + "on\030\005 \001(\0132!.google.monitoring.v3.Aggregat"
          + "ion\022\020\n\010order_by\030\006 \001(\t\022M\n\004view\030\007 \001(\0162:.go"
          + "ogle.monitoring.v3.ListTimeSeriesRequest"
          + ".TimeSeriesViewB\003\340A\002\022\021\n\tpage_size\030\010 \001(\005\022"
          + "\022\n\npage_token\030\t \001(\t\"\'\n\016TimeSeriesView\022\010\n"
          + "\004FULL\020\000\022\013\n\007HEADERS\020\001\"\226\001\n\026ListTimeSeriesR"
          + "esponse\0225\n\013time_series\030\001 \003(\0132 .google.mo"
          + "nitoring.v3.TimeSeries\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\022,\n\020execution_errors\030\003 \003(\0132\022.goog"
          + "le.rpc.Status\"\230\001\n\027CreateTimeSeriesReques"
          + "t\022A\n\004name\030\003 \001(\tB3\340A\002\372A-\n+cloudresourcema"
          + "nager.googleapis.com/Project\022:\n\013time_ser"
          + "ies\030\002 \003(\0132 .google.monitoring.v3.TimeSer"
          + "iesB\003\340A\002\"z\n\025CreateTimeSeriesError\0229\n\013tim"
          + "e_series\030\001 \001(\0132 .google.monitoring.v3.Ti"
          + "meSeriesB\002\030\001\022&\n\006status\030\002 \001(\0132\022.google.rp"
          + "c.StatusB\002\030\001\"\330\001\n\027CreateTimeSeriesSummary"
          + "\022\031\n\021total_point_count\030\001 \001(\005\022\033\n\023success_p"
          + "oint_count\030\002 \001(\005\022C\n\006errors\030\003 \003(\01323.googl"
          + "e.monitoring.v3.CreateTimeSeriesSummary."
          + "Error\032@\n\005Error\022\"\n\006status\030\001 \001(\0132\022.google."
          + "rpc.Status\022\023\n\013point_count\030\002 \001(\0052\276\r\n\rMetr"
          + "icService\022\344\001\n ListMonitoredResourceDescr"
          + "iptors\022=.google.monitoring.v3.ListMonito"
          + "redResourceDescriptorsRequest\032>.google.m"
          + "onitoring.v3.ListMonitoredResourceDescri"
          + "ptorsResponse\"A\202\323\344\223\0024\0222/v3/{name=project"
          + "s/*}/monitoredResourceDescriptors\332A\004name"
          + "\022\314\001\n\036GetMonitoredResourceDescriptor\022;.go"
          + "ogle.monitoring.v3.GetMonitoredResourceD"
          + "escriptorRequest\032\'.google.api.MonitoredR"
          + "esourceDescriptor\"D\202\323\344\223\0027\0225/v3/{name=pro"
          + "jects/*/monitoredResourceDescriptors/**}"
          + "\332A\004name\022\270\001\n\025ListMetricDescriptors\0222.goog"
          + "le.monitoring.v3.ListMetricDescriptorsRe"
          + "quest\0323.google.monitoring.v3.ListMetricD"
          + "escriptorsResponse\"6\202\323\344\223\002)\022\'/v3/{name=pr"
          + "ojects/*}/metricDescriptors\332A\004name\022\240\001\n\023G"
          + "etMetricDescriptor\0220.google.monitoring.v"
          + "3.GetMetricDescriptorRequest\032\034.google.ap"
          + "i.MetricDescriptor\"9\202\323\344\223\002,\022*/v3/{name=pr"
          + "ojects/*/metricDescriptors/**}\332A\004name\022\310\001"
          + "\n\026CreateMetricDescriptor\0223.google.monito"
          + "ring.v3.CreateMetricDescriptorRequest\032\034."
          + "google.api.MetricDescriptor\"[\202\323\344\223\002<\"\'/v3"
          + "/{name=projects/*}/metricDescriptors:\021me"
          + "tric_descriptor\332A\026name,metric_descriptor"
          + "\022\240\001\n\026DeleteMetricDescriptor\0223.google.mon"
          + "itoring.v3.DeleteMetricDescriptorRequest"
          + "\032\026.google.protobuf.Empty\"9\202\323\344\223\002,**/v3/{n"
          + "ame=projects/*/metricDescriptors/**}\332A\004n"
          + "ame\022\261\001\n\016ListTimeSeries\022+.google.monitori"
          + "ng.v3.ListTimeSeriesRequest\032,.google.mon"
          + "itoring.v3.ListTimeSeriesResponse\"D\202\323\344\223\002"
          + "\"\022 /v3/{name=projects/*}/timeSeries\332A\031na"
          + "me,filter,interval,view\022\231\001\n\020CreateTimeSe"
          + "ries\022-.google.monitoring.v3.CreateTimeSe"
          + "riesRequest\032\026.google.protobuf.Empty\">\202\323\344"
          + "\223\002%\" /v3/{name=projects/*}/timeSeries:\001*"
          + "\332A\020name,time_series\032\332\001\312A\031monitoring.goog"
          + "leapis.com\322A\272\001https://www.googleapis.com"
          + "/auth/cloud-platform,https://www.googlea"
          + "pis.com/auth/monitoring,https://www.goog"
          + "leapis.com/auth/monitoring.read,https://"
          + "www.googleapis.com/auth/monitoring.write"
          + "B\331\005\n\030com.google.monitoring.v3B\022MetricSer"
          + "viceProtoP\001Z>google.golang.org/genproto/"
          + "googleapis/monitoring/v3;monitoring\252\002\032Go"
          + "ogle.Cloud.Monitoring.V3\312\002\032Google\\Cloud\\"
          + "Monitoring\\V3\352A\360\001\n*monitoring.googleapis"
          + ".com/MetricDescriptor\022;projects/{project"
          + "}/metricDescriptors/{metric_descriptor=*"
          + "*}\022Eorganizations/{organization}/metricD"
          + "escriptors/{metric_descriptor=**}\0229folde"
          + "rs/{folder}/metricDescriptors/{metric_de"
          + "scriptor=**}\022\001* \001\352A\267\002\n5monitoring.google"
          + "apis.com/MonitoredResourceDescriptor\022Opr"
          + "ojects/{project}/monitoredResourceDescri"
          + "ptors/{monitored_resource_descriptor}\022Yo"
          + "rganizations/{organization}/monitoredRes"
          + "ourceDescriptors/{monitored_resource_des"
          + "criptor}\022Mfolders/{folder}/monitoredReso"
          + "urceDescriptors/{monitored_resource_desc"
          + "riptor}\022\001* \001b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.MetricProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.AlertProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
              com.google.monitoring.v3.MetricProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "ResourceDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetMonitoredResourceDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMetricDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListMetricDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "MetricDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_GetMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name", "MetricDescriptor",
            });
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteMetricDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_ListTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name",
              "Filter",
              "Interval",
              "Aggregation",
              "OrderBy",
              "View",
              "PageSize",
              "PageToken",
            });
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_ListTimeSeriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListTimeSeriesResponse_descriptor,
            new java.lang.String[] {
              "TimeSeries", "NextPageToken", "ExecutionErrors",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_CreateTimeSeriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesRequest_descriptor,
            new java.lang.String[] {
              "Name", "TimeSeries",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_CreateTimeSeriesError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesError_descriptor,
            new java.lang.String[] {
              "TimeSeries", "Status",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor,
            new java.lang.String[] {
              "TotalPointCount", "SuccessPointCount", "Errors",
            });
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor =
        internal_static_google_monitoring_v3_CreateTimeSeriesSummary_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateTimeSeriesSummary_Error_descriptor,
            new java.lang.String[] {
              "Status", "PointCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.AlertProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.MetricProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

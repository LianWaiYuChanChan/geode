/*=========================================================================
 * Copyright (c) 2012-2014 Pivotal Software, Inc. All Rights Reserved.
 * This product is protected by U.S. and international copyright
 * and intellectual property laws. Pivotal products are covered by
 * one or more patents listed at http://www.pivotal.io/patents.
 *=========================================================================
 */
package com.vmware.gemfire.tools.pulse.tests;

/**
 * Region on members mbean
 *
 * @author rbhandekar
 *
 */
public interface RegionOnMemberMBean {

  String getName();

  String getRegionType(); // Ideally should be an Enum

  String getFullPath();

  String getMember();

  long getEntrySize();

  long getEntryCount();

  float getGetsRate();

  float getPutsRate();

  float getDiskReadsRate();

  float getDiskWritesRate();

  int getLocalMaxMemory();
}
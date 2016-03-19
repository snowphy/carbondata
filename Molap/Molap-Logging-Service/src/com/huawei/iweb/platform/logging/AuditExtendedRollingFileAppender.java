/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 *
 * Copyright Notice
 * =====================================
 * This file contains proprietary information of
 * Huawei Technologies India Pvt Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2012
 * =====================================
 *
 */
package com.huawei.iweb.platform.logging;

import org.apache.log4j.spi.LoggingEvent;

/**
 * 
 * Copied form log4j and modified for renaming files and restriction only for
 * audit logging
 * 
 * @author k00742797
 * 
 */
public class AuditExtendedRollingFileAppender extends ExtendedRollingFileAppender
{

    /**
     * Call RollingFileAppender method to append the log...
     * 
     * @see org.apache.log4j.RollingFileAppender#subAppend(org.apache.log4j.spi.LoggingEvent)
     * 
     */
    protected void subAppend(LoggingEvent event)
    {
        if(event.getLevel().toInt() == AuditLevel.AUDIT.toInt())
        {
            currentLevel = AuditLevel.AUDIT.toInt();
            super.subAppend(event);
        }
    }
}
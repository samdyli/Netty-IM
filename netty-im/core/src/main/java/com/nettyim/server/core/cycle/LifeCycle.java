package com.nettyim.server.core.cycle;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */

import java.security.cert.CertificateException;

/**
 * Class implements {@link LifeCycle} can be started , stoped and restarted like service
 *
 */
public interface LifeCycle {
     void start() throws CertificateException, Exception;
     void stop();
     void restart();
}

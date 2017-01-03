package com.nettyim.core.message;

import me.imyun.message.MessageHeader;

/**
 * Copyright © Netty-IM team. All rights reserved.
 *
 * @author samdyli
 */
public class SimpleMessageHeader implements MessageHeader {
    public Byte getMagic() {
        return null;
    }

    public int getMillionTime() {
        return 0;
    }

    public int getVersion() {
        return 0;
    }
}

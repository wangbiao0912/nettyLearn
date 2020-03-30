package com.after00.im.attribute;

import com.after00.im.session.Session;
import io.netty.util.AttributeKey;


public interface Attributes {
    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");
}

package com.after00.im.serialize.impl;

import com.alibaba.fastjson.JSON;
import com.after00.im.serialize.Serializer;
import com.after00.im.serialize.SerializerAlgorithm;

/**
 *
 * @date 18-12-3 下午3:25
 */
public class JSONSerializer implements Serializer {
    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serialize(Object object) {

        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {

        return JSON.parseObject(bytes, clazz);
    }
}

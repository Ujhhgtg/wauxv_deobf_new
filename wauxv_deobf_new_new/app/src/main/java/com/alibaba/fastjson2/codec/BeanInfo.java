package com.alibaba.fastjson2.codec;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class BeanInfo {
    public boolean alphabetic;
    public Class<? extends JSONReader.AutoTypeBeforeHandler> autoTypeBeforeHandler;
    public Method buildMethod;
    public Class builder;
    public String builderWithPrefix;
    public Method createMethod;
    public String[] createParameterNames;
    public Constructor creatorConstructor;
    public Class deserializer;
    public String format;
    public String[] ignores;
    public String[] includes;
    public boolean kotlin;
    public Locale locale;
    public Constructor markerConstructor;
    public boolean mixIn;
    public String namingStrategy;
    public String objectReaderFieldName;
    public String objectWriterFieldName;
    public String[] orders;
    public long readerFeatures;
    public String rootName;
    public String schema;
    public Class[] seeAlso;
    public Class seeAlsoDefault;
    public String[] seeAlsoNames;
    public Class<? extends Filter>[] serializeFilters;
    public Class serializer;
    public boolean skipTransient;
    public String typeKey;
    public String typeName;
    public boolean writeEnumAsJavaBean;
    public long writerFeatures;

    public BeanInfo() {
        this.alphabetic = true;
        this.skipTransient = true;
        if (JSONFactory.isDisableAutoType()) {
            this.writerFeatures |= FieldInfo.DISABLE_AUTO_TYPE;
            this.readerFeatures |= FieldInfo.DISABLE_AUTO_TYPE;
        }
        if (JSONFactory.isDisableReferenceDetect()) {
            this.writerFeatures |= FieldInfo.DISABLE_REFERENCE_DETECT;
            this.readerFeatures |= FieldInfo.DISABLE_REFERENCE_DETECT;
        }
        if (JSONFactory.isDisableJSONB()) {
            this.writerFeatures |= FieldInfo.DISABLE_JSONB;
            this.readerFeatures |= FieldInfo.DISABLE_JSONB;
        }
        if (JSONFactory.isDisableArrayMapping()) {
            this.writerFeatures |= FieldInfo.DISABLE_ARRAY_MAPPING;
            this.readerFeatures |= FieldInfo.DISABLE_ARRAY_MAPPING;
        }
        if (JSONFactory.isDisableSmartMatch()) {
            this.readerFeatures |= FieldInfo.DISABLE_SMART_MATCH;
        }
    }

    public void required(String str) {
        String str2 = this.schema;
        if (str2 == null) {
            this.schema = JSONObject.of("required", (Object) JSONArray.of((Object) str)).toString();
            return;
        }
        JSONObject object = JSONObject.parseObject(str2);
        object.getJSONArray("required").add(str);
        this.schema = object.toString();
    }

    public BeanInfo(ObjectReaderProvider objectReaderProvider) {
        this.alphabetic = true;
        this.skipTransient = true;
        if (objectReaderProvider.isDisableAutoType()) {
            this.readerFeatures |= FieldInfo.DISABLE_AUTO_TYPE;
        }
        if (objectReaderProvider.isDisableReferenceDetect()) {
            this.readerFeatures |= FieldInfo.DISABLE_REFERENCE_DETECT;
        }
        if (objectReaderProvider.isDisableJSONB()) {
            this.readerFeatures |= FieldInfo.DISABLE_JSONB;
        }
        if (objectReaderProvider.isDisableArrayMapping()) {
            this.readerFeatures |= FieldInfo.DISABLE_ARRAY_MAPPING;
        }
        if (objectReaderProvider.isDisableSmartMatch()) {
            this.readerFeatures |= FieldInfo.DISABLE_SMART_MATCH;
        }
        PropertyNamingStrategy namingStrategy = objectReaderProvider.getNamingStrategy();
        if (namingStrategy != null) {
            this.namingStrategy = namingStrategy.name();
        }
    }

    public BeanInfo(ObjectWriterProvider objectWriterProvider) {
        this.alphabetic = true;
        this.skipTransient = true;
        if (objectWriterProvider.isDisableAutoType()) {
            this.writerFeatures |= FieldInfo.DISABLE_AUTO_TYPE;
        }
        if (objectWriterProvider.isDisableReferenceDetect()) {
            this.writerFeatures |= FieldInfo.DISABLE_REFERENCE_DETECT;
        }
        if (objectWriterProvider.isDisableJSONB()) {
            this.writerFeatures |= FieldInfo.DISABLE_JSONB;
        }
        if (objectWriterProvider.isDisableArrayMapping()) {
            this.writerFeatures |= FieldInfo.DISABLE_ARRAY_MAPPING;
        }
        this.alphabetic = objectWriterProvider.isAlphabetic();
        this.skipTransient = objectWriterProvider.isSkipTransient();
    }
}

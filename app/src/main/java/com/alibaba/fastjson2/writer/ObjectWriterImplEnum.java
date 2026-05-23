package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplEnum<E extends Enum<E>> extends ObjectWriterPrimitiveImpl {
    final String[] annotationNames;
    final Class defineClass;
    final Enum[] enumConstants;
    final Class enumType;
    final long features;
    final long[] hashCodes;
    byte[][] jsonbNames;
    final String[] names;
    long typeNameHash;
    byte[] typeNameJSONB;
    final Member valueField;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectWriterImplEnum(Class cls, Class cls2, Member member, String[] strArr, long j) {
        this.defineClass = cls;
        this.enumType = cls2;
        this.features = j;
        this.valueField = member;
        if (member instanceof AccessibleObject) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
        this.enumConstants = enumArr;
        this.names = new String[enumArr.length];
        this.hashCodes = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.enumConstants;
            if (i >= enumArr2.length) {
                this.annotationNames = strArr;
                return;
            }
            String strName = enumArr2[i].name();
            this.names[i] = strName;
            this.hashCodes[i] = Fnv.hashCode64(strName);
            i++;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Enum r8 = (Enum) obj;
        if (r8 == null) {
            jSONWriter.writeNull();
            return;
        }
        Member member = this.valueField;
        String strName = null;
        if (member != null) {
            try {
                Object objInvoke = member instanceof Field ? ((Field) member).get(obj) : ((Method) member).invoke(obj, null);
                if (objInvoke != obj) {
                    jSONWriter.writeAny(objInvoke);
                    return;
                }
            } catch (Exception e) {
                throw new JSONException("getEnumValue error", e);
            }
        }
        long features = jSONWriter.getFeatures(j | this.features);
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & features) != 0) {
            jSONWriter.writeString(r8.toString());
            return;
        }
        if ((features & JSONWriter.Feature.WriteEnumUsingOrdinal.mask) != 0) {
            jSONWriter.writeInt32(r8.ordinal());
            return;
        }
        if (this.annotationNames != null) {
            int iOrdinal = r8.ordinal();
            String[] strArr = this.annotationNames;
            if (iOrdinal < strArr.length) {
                strName = strArr[iOrdinal];
            }
        }
        if (strName == null) {
            strName = r8.name();
        }
        jSONWriter.writeString(strName);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
            if (this.typeNameJSONB == null) {
                String typeName = TypeUtils.getTypeName(this.enumType);
                this.typeNameJSONB = JSONB.toBytes(typeName);
                this.typeNameHash = Fnv.hashCode64(typeName);
            }
            jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
        }
        Enum r2 = (Enum) obj;
        if (jSONWriter.isEnabled(JSONWriter.Feature.WriteEnumUsingToString)) {
            jSONWriter.writeString(r2.toString());
            return;
        }
        if (this.jsonbNames == null) {
            this.jsonbNames = new byte[this.names.length][];
        }
        int iOrdinal = r2.ordinal();
        byte[] bytes = this.jsonbNames[iOrdinal];
        if (bytes == null) {
            bytes = JSONB.toBytes(this.names[iOrdinal]);
            this.jsonbNames[iOrdinal] = bytes;
        }
        jSONWriter.writeRaw(bytes);
    }
}

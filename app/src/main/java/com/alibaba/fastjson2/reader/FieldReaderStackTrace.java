package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderStackTrace extends FieldReaderObject {
    public FieldReaderStackTrace(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, BiConsumer biConsumer) {
        super(str, type, cls, i, j, str2, locale, obj, jSONSchema, method, field, biConsumer);
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(Object obj, Object obj2) {
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(obj2);
        }
        if (obj2 != null || (this.features & JSONReader.Feature.IgnoreSetNullValue.mask) == 0) {
            if (obj2 instanceof Collection) {
                Collection collection = (Collection) obj2;
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next() == null) {
                        i++;
                    }
                }
                if (i == collection.size()) {
                    obj2 = new StackTraceElement[0];
                } else {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[collection.size()];
                    collection.toArray(stackTraceElementArr);
                    obj2 = stackTraceElementArr;
                }
            }
            this.propertyAccessor.setObject(obj, obj2);
        }
    }
}

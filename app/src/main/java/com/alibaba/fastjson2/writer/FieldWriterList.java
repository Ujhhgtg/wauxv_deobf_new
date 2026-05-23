package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class FieldWriterList<T> extends FieldWriter<T> {
    private static final Class<?> EMPTY_LIST_CLASS = Collections.EMPTY_LIST.getClass();
    private static final Class<?> EMPTY_SET_CLASS = Collections.EMPTY_SET.getClass();
    final Class<?> contentAs;
    final Class itemClass;
    final boolean itemClassNotReferenceDetect;
    ObjectWriter itemObjectWriter;
    final Type itemType;
    ObjectWriter listWriter;
    final boolean writeAsString;

    public FieldWriterList(String str, Type type, int i, long j, String str2, Locale locale, String str3, Type type2, Class cls, Field field, Method method, Function function, Class<?> cls2) {
        super(str, i, j, str2, null, str3, type2, cls, field, method, function);
        this.contentAs = cls2;
        boolean z = false;
        this.writeAsString = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j) != 0;
        Type type3 = type == null ? Object.class : type;
        this.itemType = type3;
        if (type3 instanceof Class) {
            Class cls3 = (Class) type;
            this.itemClass = cls3;
            if (cls3 != null) {
                if (Enum.class.isAssignableFrom(cls3)) {
                    this.listWriter = new ObjectWriterImplListEnum(cls, cls3, j);
                } else if (cls3 == String.class) {
                    this.listWriter = ObjectWriterImplListStr.INSTANCE;
                } else {
                    this.listWriter = new ObjectWriterImplList(cls, type2, cls3, type, j);
                }
            }
        } else {
            this.itemClass = TypeUtils.getMapping(type);
        }
        Class cls4 = this.itemClass;
        if (cls4 != null && ObjectWriterProvider.isNotReferenceDetect(cls4)) {
            z = true;
        }
        this.itemClassNotReferenceDetect = z;
        if (str2 == null || this.itemClass != Date.class) {
            return;
        }
        this.itemObjectWriter = new ObjectWriterImplDate(str2, null);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t) {
        try {
            return TypeUtils.toList(this.propertyAccessor.getObject(t));
        } catch (Throwable th) {
            throw errorOnGet(th);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final Class getItemClass() {
        return this.itemClass;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final Type getItemType() {
        return this.itemType;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        Class cls = this.contentAs;
        if (cls != null) {
            ObjectWriter objectWriter = this.itemObjectWriter;
            if (objectWriter != null) {
                return objectWriter;
            }
            ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(cls, cls);
            this.itemObjectWriter = objectWriter2;
            return objectWriter2;
        }
        if (type != null && type != this.itemType) {
            return jSONWriter.getObjectWriter(type, TypeUtils.getClass(type));
        }
        ObjectWriter objectWriter3 = this.itemObjectWriter;
        if (objectWriter3 != null) {
            return objectWriter3;
        }
        if (this.format != null) {
            return jSONWriter.getContext().getProvider().getObjectWriter(type, this.format, (Locale) null);
        }
        ObjectWriter objectWriter4 = jSONWriter.getObjectWriter(this.itemType, this.itemClass);
        this.itemObjectWriter = objectWriter4;
        return objectWriter4;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        ObjectWriter objectWriter = this.listWriter;
        if (objectWriter != null && this.fieldClass.isAssignableFrom(cls)) {
            return objectWriter;
        }
        if (objectWriter != null || cls != this.fieldClass) {
            return jSONWriter.getObjectWriter(cls);
        }
        ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(cls);
        this.listWriter = objectWriter2;
        return objectWriter2;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final boolean isRefDetect(Object obj, long j) {
        Class<?> cls;
        long j2 = j | this.features;
        return ((JSONWriter.Feature.ReferenceDetection.mask & j2) == 0 || (j2 & 144115188075855872L) != 0 || obj == null || (cls = obj.getClass()) == EMPTY_LIST_CLASS || cls == EMPTY_SET_CLASS) ? false : true;
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t) throws Exception {
        long features = this.features | jSONWriter.getFeatures();
        try {
            List<String> list = (List) getFieldValue(t);
            if (list == null) {
                if ((4194384 & features) == 0) {
                    return false;
                }
                writeFieldName(jSONWriter);
                jSONWriter.writeArrayNull(features);
                return true;
            }
            String path = jSONWriter.setPath(this, list);
            if (path != null) {
                writeFieldName(jSONWriter);
                jSONWriter.writeReference(path);
                jSONWriter.popPath(list);
                return true;
            }
            if (this.itemType == String.class) {
                writeListStr(jSONWriter, true, list);
            } else {
                writeList(jSONWriter, list);
            }
            jSONWriter.popPath(list);
            return true;
        } catch (Exception e) {
            if ((features & 32768L) != 0) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeList(JSONWriter jSONWriter, List list) {
        Class<?> cls;
        JSONWriter jSONWriter2;
        ObjectWriter objectWriter;
        if (jSONWriter.jsonb) {
            writeListJSONB(jSONWriter, list);
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & features) == 0 || !list.isEmpty()) {
            writeFieldName(jSONWriter);
            int i = 0;
            boolean zIsRefDetect = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
            jSONWriter.startArray();
            Class<?> cls2 = null;
            ObjectWriter itemWriter = null;
            while (i < list.size()) {
                if (i != 0) {
                    jSONWriter.writeComma();
                }
                Object obj = list.get(i);
                if (obj == null) {
                    jSONWriter.writeNull();
                } else {
                    Class<?> cls3 = obj.getClass();
                    if (cls3 == String.class) {
                        jSONWriter.writeString((String) obj);
                    } else {
                        if (cls3 == cls2) {
                            cls = cls2;
                        } else {
                            zIsRefDetect = jSONWriter.isRefDetect();
                            itemWriter = getItemWriter(jSONWriter, cls3);
                            if (zIsRefDetect) {
                                zIsRefDetect = !ObjectWriterProvider.isNotReferenceDetect(cls3);
                            }
                            cls = cls3;
                        }
                        ObjectWriter objectWriter2 = itemWriter;
                        if (zIsRefDetect) {
                            if (jSONWriter.writeReference(i, obj)) {
                                jSONWriter2 = jSONWriter;
                            }
                            objectWriter = objectWriter2;
                            cls2 = cls;
                        } else if (this.managedReference) {
                            jSONWriter.addManagerReference(obj);
                        }
                        jSONWriter2 = jSONWriter;
                        objectWriter2.write(jSONWriter2, obj, null, this.itemType, features);
                        if (zIsRefDetect) {
                            jSONWriter2.popPath(obj);
                        }
                        objectWriter = objectWriter2;
                        cls2 = cls;
                    }
                    i++;
                    JSONWriter jSONWriter3 = jSONWriter2;
                    itemWriter = objectWriter;
                    jSONWriter = jSONWriter3;
                }
                ObjectWriter objectWriter3 = itemWriter;
                jSONWriter2 = jSONWriter;
                objectWriter = objectWriter3;
                i++;
                JSONWriter jSONWriter4 = jSONWriter2;
                itemWriter = objectWriter;
                jSONWriter = jSONWriter4;
            }
            jSONWriter.endArray();
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeListJSONB(JSONWriter jSONWriter, List list) {
        boolean z;
        Class<?> cls;
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        ObjectWriter itemWriter;
        long features = jSONWriter.getFeatures(this.features);
        int i = 0;
        boolean z2 = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        int size = list.size();
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & features) == 0 || size != 0) {
            writeFieldName(jSONWriter);
            boolean z3 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
            if (jSONWriter.isWriteTypeInfo((Object) list, this.fieldClass)) {
                jSONWriter.writeTypeName(TypeUtils.getTypeName(list.getClass()));
            }
            jSONWriter.startArray(size);
            Class<?> cls2 = null;
            ObjectWriter objectWriter2 = null;
            while (i < size) {
                ObjectWriter objectWriter3 = objectWriter2;
                Object obj = list.get(i);
                if (obj == null) {
                    jSONWriter.writeNull();
                    cls = cls2;
                    objectWriter2 = objectWriter3;
                    jSONWriter2 = jSONWriter;
                } else {
                    Class<?> cls3 = obj.getClass();
                    if (cls3 != cls2) {
                        boolean zIsRefDetect = jSONWriter.isRefDetect();
                        if (cls3 != this.itemType || (itemWriter = this.itemObjectWriter) == null) {
                            itemWriter = getItemWriter(jSONWriter, cls3);
                        }
                        if (zIsRefDetect) {
                            zIsRefDetect = !(cls3 == this.itemClass ? this.itemClassNotReferenceDetect : ObjectWriterProvider.isNotReferenceDetect(cls3));
                        }
                        z = zIsRefDetect;
                        objectWriter = itemWriter;
                        cls = cls3;
                    } else {
                        z = z3;
                        cls = cls2;
                        objectWriter = objectWriter3;
                    }
                    if (z && jSONWriter.writeReference(i, obj)) {
                        jSONWriter2 = jSONWriter;
                    } else {
                        if (z2) {
                            jSONWriter2 = jSONWriter;
                            objectWriter.writeArrayMappingJSONB(jSONWriter2, obj, Integer.valueOf(i), this.itemType, features);
                        } else {
                            jSONWriter2 = jSONWriter;
                            objectWriter.writeJSONB(jSONWriter2, obj, Integer.valueOf(i), this.itemType, features);
                        }
                        if (z) {
                            jSONWriter2.popPath(obj);
                        }
                    }
                    objectWriter2 = objectWriter;
                    z3 = z;
                }
                i++;
                jSONWriter = jSONWriter2;
                cls2 = cls;
            }
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeListStr(JSONWriter jSONWriter, boolean z, List<String> list) {
        if (!list.isEmpty() || (jSONWriter.getFeatures(this.features) & 67108864L) == 0) {
            if (z) {
                writeFieldName(jSONWriter);
            }
            if (jSONWriter.jsonb && jSONWriter.isWriteTypeInfo((Object) list, this.fieldClass)) {
                jSONWriter.writeTypeName(TypeUtils.getTypeName(list.getClass()));
            }
            jSONWriter.writeString(list);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeListValue(JSONWriter jSONWriter, List list) {
        Class<?> cls;
        if (jSONWriter.jsonb) {
            writeListValueJSONB(jSONWriter, list);
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        boolean z = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        jSONWriter.startArray();
        Class<?> cls2 = null;
        ObjectWriter itemWriter = null;
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                jSONWriter.writeComma();
            }
            Object obj = list.get(i);
            if (obj == null) {
                jSONWriter.writeNull();
            } else {
                Class<?> cls3 = obj.getClass();
                if (cls3 == String.class) {
                    jSONWriter.writeString((String) obj);
                } else if (this.writeAsString) {
                    jSONWriter.writeString(obj.toString());
                } else {
                    if (cls3 == cls2) {
                        cls = cls2;
                    } else {
                        z = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
                        itemWriter = getItemWriter(jSONWriter, cls3);
                        if (z) {
                            z = !ObjectWriterProvider.isNotReferenceDetect(cls3);
                        }
                        cls = cls3;
                    }
                    boolean z2 = z;
                    ObjectWriter objectWriter = itemWriter;
                    if (!z2 || !jSONWriter.writeReference(i, obj)) {
                        if (this.managedReference) {
                            jSONWriter.addManagerReference(obj);
                        }
                        objectWriter.write(jSONWriter, obj, null, this.itemType, features);
                        if (z2) {
                            jSONWriter.popPath(obj);
                        }
                    }
                    itemWriter = objectWriter;
                    z = z2;
                    cls2 = cls;
                }
            }
        }
        jSONWriter.endArray();
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeListValueJSONB(JSONWriter jSONWriter, List list) {
        boolean z;
        Class<?> cls;
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        ObjectWriter itemWriter;
        long features = jSONWriter.getFeatures(this.features);
        int i = 0;
        boolean z2 = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        int size = list.size();
        boolean z3 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        if (jSONWriter.isWriteTypeInfo((Object) list, this.fieldClass)) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName(list.getClass()));
        }
        jSONWriter.startArray(size);
        Class<?> cls2 = null;
        ObjectWriter objectWriter2 = null;
        while (i < size) {
            ObjectWriter objectWriter3 = objectWriter2;
            Object obj = list.get(i);
            if (obj == null) {
                jSONWriter.writeNull();
                cls = cls2;
                objectWriter2 = objectWriter3;
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls3 = obj.getClass();
                if (cls3 != cls2) {
                    boolean zIsRefDetect = jSONWriter.isRefDetect();
                    if (cls3 != this.itemType || (itemWriter = this.itemObjectWriter) == null) {
                        itemWriter = getItemWriter(jSONWriter, cls3);
                    }
                    if (zIsRefDetect) {
                        zIsRefDetect = !(cls3 == this.itemClass ? this.itemClassNotReferenceDetect : ObjectWriterProvider.isNotReferenceDetect(cls3));
                    }
                    z = zIsRefDetect;
                    objectWriter = itemWriter;
                    cls = cls3;
                } else {
                    z = z3;
                    cls = cls2;
                    objectWriter = objectWriter3;
                }
                if (z && jSONWriter.writeReference(i, obj)) {
                    jSONWriter2 = jSONWriter;
                } else {
                    if (z2) {
                        jSONWriter2 = jSONWriter;
                        objectWriter.writeArrayMappingJSONB(jSONWriter2, obj, Integer.valueOf(i), this.itemType, features);
                    } else {
                        jSONWriter2 = jSONWriter;
                        objectWriter.writeJSONB(jSONWriter2, obj, Integer.valueOf(i), this.itemType, features);
                    }
                    if (z) {
                        jSONWriter2.popPath(obj);
                    }
                }
                objectWriter2 = objectWriter;
                z3 = z;
            }
            i++;
            jSONWriter = jSONWriter2;
            cls2 = cls;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t) {
        String path;
        List list = (List) this.propertyAccessor.getObject(t);
        if (list == null) {
            jSONWriter.writeNull();
            return;
        }
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        if (zIsRefDetect && (path = jSONWriter.setPath(this.fieldName, list)) != null) {
            jSONWriter.writeReference(path);
            jSONWriter.popPath(list);
        } else {
            writeListValue(jSONWriter, list);
            if (zIsRefDetect) {
                jSONWriter.popPath(list);
            }
        }
    }
}

package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.SymbolTable;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.filter.AfterFilter;
import com.alibaba.fastjson2.filter.BeanContext;
import com.alibaba.fastjson2.filter.BeforeFilter;
import com.alibaba.fastjson2.filter.ContextNameFilter;
import com.alibaba.fastjson2.filter.ContextValueFilter;
import com.alibaba.fastjson2.filter.LabelFilter;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.PropertyFilter;
import com.alibaba.fastjson2.filter.PropertyPreFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterAdapter<T> implements ObjectWriter<T> {
    static final String TYPE = "@type";
    final boolean containsNoneFieldGetter;
    final long features;
    protected final FieldWriter[] fieldWriterArray;
    final List<FieldWriter> fieldWriters;
    final boolean googleCollection;
    boolean hasFilter;
    final boolean hasValueField;
    final long[] hashCodes;
    byte[] jsonbClassInfo;
    final short[] mapping;
    NameFilter nameFilter;
    char[] nameWithColonUTF16;
    byte[] nameWithColonUTF8;
    final Class objectClass;
    PropertyFilter propertyFilter;
    PropertyPreFilter propertyPreFilter;
    final boolean serializable;
    final String typeKey;
    byte[] typeKeyJSONB;
    protected final String typeName;
    protected final long typeNameHash;
    protected final byte[] typeNameJSONB;
    protected long typeNameSymbolCache;
    ValueFilter valueFilter;

    public ObjectWriterAdapter(Class<T> cls, List<FieldWriter> list) {
        this(cls, null, null, 0L, list);
    }

    private boolean writeClassInfoSymbol(JSONWriter jSONWriter, SymbolTable symbolTable) {
        int ordinalByHashCode;
        int iIdentityHashCode = System.identityHashCode(symbolTable);
        long j = this.typeNameSymbolCache;
        if (j == 0) {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.typeNameHash);
            if (ordinalByHashCode != -1) {
                this.typeNameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            }
        } else if (((int) j) == iIdentityHashCode) {
            ordinalByHashCode = (int) (j >> 32);
        } else {
            ordinalByHashCode = symbolTable.getOrdinalByHashCode(this.typeNameHash);
            if (ordinalByHashCode != -1) {
                this.typeNameSymbolCache = (((long) ordinalByHashCode) << 32) | ((long) iIdentityHashCode);
            }
        }
        if (ordinalByHashCode == -1) {
            return false;
        }
        jSONWriter.writeRaw(-110);
        jSONWriter.writeInt32(-ordinalByHashCode);
        return true;
    }

    public void errorOnNoneSerializable() {
        throw new JSONException("not support none serializable class ".concat(this.objectClass.getName()));
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public long getFeatures() {
        return this.features;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public FieldWriter getFieldWriter(long j) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldWriterArray[this.mapping[iBinarySearch]];
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public List<FieldWriter> getFieldWriters() {
        return this.fieldWriters;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public final boolean hasFilter(JSONWriter jSONWriter) {
        return jSONWriter.hasFilter(this.containsNoneFieldGetter) | this.hasFilter;
    }

    public final boolean hasFilter0(JSONWriter jSONWriter) {
        return jSONWriter.hasFilter() | this.hasFilter;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setNameFilter(NameFilter nameFilter) {
        this.nameFilter = nameFilter;
        if (nameFilter != null) {
            this.hasFilter = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyFilter(PropertyFilter propertyFilter) {
        this.propertyFilter = propertyFilter;
        if (propertyFilter != null) {
            this.hasFilter = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyPreFilter(PropertyPreFilter propertyPreFilter) {
        this.propertyPreFilter = propertyPreFilter;
        if (propertyPreFilter != null) {
            this.hasFilter = true;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setValueFilter(ValueFilter valueFilter) {
        this.valueFilter = valueFilter;
        if (valueFilter != null) {
            this.hasFilter = true;
        }
    }

    public JSONObject toJSONObject(T t) {
        return toJSONObject(t, 0L);
    }

    public Map<String, Object> toMap(Object obj) {
        int size = this.fieldWriters.size();
        JSONObject jSONObject = new JSONObject(size, 1.0f);
        for (int i = 0; i < size; i++) {
            FieldWriter fieldWriter = this.fieldWriters.get(i);
            jSONObject.put(fieldWriter.fieldName, fieldWriter.getFieldValue(obj));
        }
        return jSONObject;
    }

    public String toString() {
        return this.objectClass.getName();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (this.hasValueField) {
            this.fieldWriterArray[0].writeValue(jSONWriter, obj);
            return;
        }
        long features = this.features | j | jSONWriter.getFeatures();
        boolean z = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        if (jSONWriter.jsonb) {
            if (z) {
                writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j);
                return;
            } else {
                writeJSONB(jSONWriter, obj, obj2, type, j);
                return;
            }
        }
        if (this.googleCollection) {
            ObjectWriterImplCollection.INSTANCE.write(jSONWriter, (Collection) obj, obj2, type, j);
            return;
        }
        if (z) {
            writeArrayMapping(jSONWriter, obj, obj2, type, j);
            return;
        }
        if (!this.serializable) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & features) != 0) {
                errorOnNoneSerializable();
                return;
            } else if ((features & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
                jSONWriter.writeNull();
                return;
            }
        }
        if (hasFilter(jSONWriter)) {
            writeWithFilter(jSONWriter, obj, obj2, type, j);
            return;
        }
        jSONWriter.startObject();
        if (jSONWriter.isWriteTypeInfo(obj, this.features | j)) {
            writeTypeInfo(jSONWriter);
        }
        int size = this.fieldWriters.size();
        for (int i = 0; i < size; i++) {
            this.fieldWriters.get(i).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
            writeClassInfo(jSONWriter);
        }
        int size = this.fieldWriters.size();
        jSONWriter.startArray(size);
        for (int i = 0; i < size; i++) {
            this.fieldWriters.get(i).writeValue(jSONWriter, obj);
        }
    }

    public final void writeClassInfo(JSONWriter jSONWriter) {
        SymbolTable symbolTable = jSONWriter.symbolTable;
        if (symbolTable == null || !writeClassInfoSymbol(jSONWriter, symbolTable)) {
            jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        long features = this.features | j | jSONWriter.getFeatures();
        if (!this.serializable) {
            if ((JSONWriter.Feature.ErrorOnNoneSerializable.mask & features) != 0) {
                errorOnNoneSerializable();
                return;
            } else if ((JSONWriter.Feature.IgnoreNoneSerializable.mask & features) != 0) {
                jSONWriter.writeNull();
                return;
            }
        }
        if ((features & JSONWriter.Feature.IgnoreNoneSerializable.mask) != 0) {
            writeWithFilter(jSONWriter, obj, obj2, type, j);
            return;
        }
        int length = this.fieldWriterArray.length;
        if (jSONWriter.isWriteTypeInfo(obj, type, j)) {
            writeClassInfo(jSONWriter);
        }
        jSONWriter.startObject();
        for (int i = 0; i < length; i++) {
            this.fieldWriters.get(i).write(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public boolean writeTypeInfo(JSONWriter jSONWriter) {
        if (jSONWriter.utf8) {
            if (this.nameWithColonUTF8 == null) {
                int length = this.typeKey.length();
                int length2 = this.typeName.length();
                int i = length + length2;
                byte[] bArr = new byte[i + 5];
                bArr[0] = 34;
                this.typeKey.getBytes(0, length, bArr, 1);
                bArr[length + 1] = 34;
                bArr[length + 2] = 58;
                bArr[length + 3] = 34;
                this.typeName.getBytes(0, length2, bArr, length + 4);
                bArr[i + 4] = 34;
                this.nameWithColonUTF8 = bArr;
            }
            jSONWriter.writeNameRaw(this.nameWithColonUTF8);
            return true;
        }
        if (!jSONWriter.utf16) {
            if (!jSONWriter.jsonb) {
                jSONWriter.writeString(this.typeKey);
                jSONWriter.writeColon();
                jSONWriter.writeString(this.typeName);
                return true;
            }
            if (this.typeKeyJSONB == null) {
                this.typeKeyJSONB = JSONB.toBytes(this.typeKey);
            }
            jSONWriter.writeRaw(this.typeKeyJSONB);
            jSONWriter.writeRaw(this.typeNameJSONB);
            return true;
        }
        if (this.nameWithColonUTF16 == null) {
            int length3 = this.typeKey.length();
            int length4 = this.typeName.length();
            int i2 = length3 + length4;
            char[] cArr = new char[i2 + 5];
            cArr[0] = '\"';
            this.typeKey.getChars(0, length3, cArr, 1);
            cArr[length3 + 1] = '\"';
            cArr[length3 + 2] = ':';
            cArr[length3 + 3] = '\"';
            this.typeName.getChars(0, length4, cArr, length3 + 4);
            cArr[i2 + 4] = '\"';
            this.nameWithColonUTF16 = cArr;
        }
        jSONWriter.writeNameRaw(this.nameWithColonUTF16);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[PHI: r19
      0x00c6: PHI (r19v6 int) = (r19v1 int), (r19v1 int), (r19v1 int), (r19v1 int), (r19v7 int) binds: [B:80:0x0109, B:76:0x00fb, B:69:0x00ee, B:61:0x00db, B:52:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeWithFilter(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        int i;
        PropertyPreFilter propertyPreFilter;
        ValueFilter valueFilter;
        ContextValueFilter contextValueFilter;
        BeanContext beanContext;
        Field declaredField;
        BeanContext beanContext2;
        String str;
        ObjectWriterAdapter<T> objectWriterAdapter = this;
        JSONWriter jSONWriter2 = jSONWriter;
        if (obj == null) {
            jSONWriter2.writeNull();
            return;
        }
        if (!jSONWriter2.isWriteTypeInfo(obj, type, objectWriterAdapter.features | j)) {
            jSONWriter2.startObject();
        } else if (jSONWriter2.jsonb) {
            writeClassInfo(jSONWriter);
            jSONWriter2.startObject();
        } else {
            jSONWriter2.startObject();
            writeTypeInfo(jSONWriter);
        }
        JSONWriter.Context context = jSONWriter2.context;
        long features = context.getFeatures() | j;
        boolean z = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        boolean z2 = (features & JSONWriter.Feature.IgnoreNonFieldGetter.mask) != 0;
        BeforeFilter beforeFilter = context.getBeforeFilter();
        if (beforeFilter != null) {
            beforeFilter.writeBefore(jSONWriter2, obj);
        }
        PropertyPreFilter propertyPreFilter2 = context.getPropertyPreFilter();
        if (propertyPreFilter2 == null) {
            propertyPreFilter2 = objectWriterAdapter.propertyPreFilter;
        }
        PropertyPreFilter propertyPreFilter3 = propertyPreFilter2;
        NameFilter nameFilter = context.getNameFilter();
        if (nameFilter == null) {
            nameFilter = objectWriterAdapter.nameFilter;
        } else {
            NameFilter nameFilter2 = objectWriterAdapter.nameFilter;
            if (nameFilter2 != null) {
                nameFilter = NameFilter.compose(nameFilter2, nameFilter);
            }
        }
        NameFilter nameFilter3 = nameFilter;
        ContextNameFilter contextNameFilter = context.getContextNameFilter();
        ValueFilter valueFilter2 = context.getValueFilter();
        if (valueFilter2 == null) {
            valueFilter2 = objectWriterAdapter.valueFilter;
        } else {
            ValueFilter valueFilter3 = objectWriterAdapter.valueFilter;
            if (valueFilter3 != null) {
                valueFilter2 = ValueFilter.compose(valueFilter3, valueFilter2);
            }
        }
        ValueFilter valueFilter4 = valueFilter2;
        ContextValueFilter contextValueFilter2 = context.getContextValueFilter();
        PropertyFilter propertyFilter = context.getPropertyFilter();
        if (propertyFilter == null) {
            propertyFilter = objectWriterAdapter.propertyFilter;
        }
        PropertyFilter propertyFilter2 = propertyFilter;
        LabelFilter labelFilter = context.getLabelFilter();
        int i2 = 0;
        while (i2 < objectWriterAdapter.fieldWriters.size()) {
            FieldWriter fieldWriter = objectWriterAdapter.fieldWriters.get(i2);
            Field field = fieldWriter.field;
            if (!z2 || fieldWriter.method == null) {
                i = i2;
            } else {
                i = i2;
                if ((fieldWriter.features & 4503599627370496L) == 0) {
                    propertyPreFilter = propertyPreFilter3;
                    nameFilter3 = nameFilter3;
                    contextNameFilter = contextNameFilter;
                    valueFilter = valueFilter4;
                    contextValueFilter = contextValueFilter2;
                }
                valueFilter4 = valueFilter;
                contextValueFilter2 = contextValueFilter;
                propertyPreFilter3 = propertyPreFilter;
                nameFilter3 = nameFilter3;
                contextNameFilter = contextNameFilter;
                objectWriterAdapter = this;
                i2 = i + 1;
            }
            String str2 = fieldWriter.fieldName;
            if ((propertyPreFilter3 == null || propertyPreFilter3.process(jSONWriter2, obj, str2)) && (labelFilter == null || (str = fieldWriter.label) == null || str.isEmpty() || labelFilter.apply(str))) {
                if (nameFilter3 == null && propertyFilter2 == null && contextValueFilter2 == null && contextNameFilter == null && valueFilter4 == null) {
                    fieldWriter.write(jSONWriter2, obj);
                } else {
                    try {
                        Object fieldValue = fieldWriter.getFieldValue(obj);
                        if (fieldValue != null || jSONWriter2.isWriteNulls()) {
                            propertyPreFilter = propertyPreFilter3;
                            if (z || (!"this$0".equals(str2) && !"this$1".equals(str2) && !"this$2".equals(str2))) {
                                String strProcess = nameFilter3 != null ? nameFilter3.process(obj, str2, fieldValue) : str2;
                                if (contextNameFilter != null) {
                                    declaredField = (false || fieldWriter.method == null) ? field : BeanUtils.getDeclaredField(objectWriterAdapter.objectClass, fieldWriter.fieldName);
                                    beanContext = new BeanContext(objectWriterAdapter.objectClass, fieldWriter.method, declaredField, fieldWriter.fieldName, fieldWriter.label, fieldWriter.fieldClass, fieldWriter.fieldType, fieldWriter.features, fieldWriter.format);
                                    strProcess = contextNameFilter.process(beanContext, obj, strProcess, fieldValue);
                                } else {
                                    beanContext = null;
                                    declaredField = field;
                                }
                                if (propertyFilter2 == null || propertyFilter2.apply(obj, str2, fieldValue)) {
                                    boolean z3 = (strProcess == null || strProcess == str2) ? false : true;
                                    Object objApply = valueFilter4 != null ? valueFilter4.apply(obj, str2, fieldValue) : fieldValue;
                                    if (contextValueFilter2 != null) {
                                        if (beanContext == null) {
                                            if (declaredField == null && fieldWriter.method != null) {
                                                declaredField = BeanUtils.getDeclaredField(objectWriterAdapter.objectClass, fieldWriter.fieldName);
                                            }
                                            beanContext2 = new BeanContext(objectWriterAdapter.objectClass, fieldWriter.method, declaredField, fieldWriter.fieldName, fieldWriter.label, fieldWriter.fieldClass, fieldWriter.fieldType, fieldWriter.features, fieldWriter.format);
                                        } else {
                                            beanContext2 = beanContext;
                                        }
                                        objApply = contextValueFilter2.process(beanContext2, obj, strProcess, objApply);
                                    } else {
                                        contextNameFilter = contextNameFilter;
                                    }
                                    if (objApply != fieldValue) {
                                        if (z3) {
                                            jSONWriter2 = jSONWriter;
                                            jSONWriter2.writeName(strProcess);
                                            jSONWriter2.writeColon();
                                        } else {
                                            jSONWriter2 = jSONWriter;
                                            fieldWriter.writeFieldName(jSONWriter2);
                                        }
                                        if (objApply == null) {
                                            jSONWriter2.writeNull();
                                            valueFilter = valueFilter4;
                                            contextValueFilter = contextValueFilter2;
                                        } else {
                                            valueFilter = valueFilter4;
                                            contextValueFilter = contextValueFilter2;
                                            fieldWriter.getObjectWriter(jSONWriter2, objApply.getClass()).write(jSONWriter2, objApply, obj2, type, j);
                                        }
                                    } else {
                                        valueFilter = valueFilter4;
                                        contextValueFilter = contextValueFilter2;
                                        if (z3) {
                                            jSONWriter.writeName(strProcess);
                                            jSONWriter.writeColon();
                                            if (fieldValue == null) {
                                                jSONWriter2 = jSONWriter;
                                                fieldWriter.getObjectWriter(jSONWriter, fieldWriter.fieldClass).write(jSONWriter2, null, obj2, type, j);
                                            } else {
                                                jSONWriter2 = jSONWriter;
                                                fieldWriter.getObjectWriter(jSONWriter2, fieldValue.getClass()).write(jSONWriter2, fieldValue, obj2, type, j);
                                            }
                                        } else {
                                            fieldWriter.write(jSONWriter, obj);
                                            jSONWriter2 = jSONWriter;
                                        }
                                    }
                                } else {
                                    jSONWriter2 = jSONWriter;
                                }
                            }
                            contextNameFilter = contextNameFilter;
                            valueFilter = valueFilter4;
                            contextValueFilter = contextValueFilter2;
                        }
                        nameFilter3 = nameFilter3;
                        contextNameFilter = contextNameFilter;
                        valueFilter = valueFilter4;
                        contextValueFilter = contextValueFilter2;
                    } catch (Throwable th) {
                        propertyPreFilter = propertyPreFilter3;
                        nameFilter3 = nameFilter3;
                        contextNameFilter = contextNameFilter;
                        valueFilter = valueFilter4;
                        contextValueFilter = contextValueFilter2;
                        if ((context.getFeatures() & JSONWriter.Feature.IgnoreErrorGetter.mask) == 0) {
                            throw th;
                        }
                    }
                }
                propertyPreFilter = propertyPreFilter3;
                nameFilter3 = nameFilter3;
                contextNameFilter = contextNameFilter;
                valueFilter = valueFilter4;
                contextValueFilter = contextValueFilter2;
            } else {
                propertyPreFilter = propertyPreFilter3;
                nameFilter3 = nameFilter3;
                contextNameFilter = contextNameFilter;
                valueFilter = valueFilter4;
                contextValueFilter = contextValueFilter2;
            }
            valueFilter4 = valueFilter;
            contextValueFilter2 = contextValueFilter;
            propertyPreFilter3 = propertyPreFilter;
            nameFilter3 = nameFilter3;
            contextNameFilter = contextNameFilter;
            objectWriterAdapter = this;
            i2 = i + 1;
        }
        AfterFilter afterFilter = context.getAfterFilter();
        if (afterFilter != null) {
            afterFilter.writeAfter(jSONWriter2, obj);
        }
        jSONWriter2.endObject();
    }

    public ObjectWriterAdapter(Class<T> cls, String str, String str2, long j, List<FieldWriter> list) {
        if (str2 == null && cls != null) {
            str2 = (!Enum.class.isAssignableFrom(cls) || cls.isEnum()) ? TypeUtils.getTypeName(cls) : cls.getSuperclass().getName();
        }
        this.objectClass = cls;
        this.typeKey = (str == null || str.isEmpty()) ? "@type" : str;
        this.typeName = str2;
        this.typeNameHash = str2 != null ? Fnv.hashCode64(str2) : 0L;
        this.typeNameJSONB = JSONB.toBytes(str2);
        this.features = j;
        this.fieldWriters = list;
        this.serializable = cls == null || Serializable.class.isAssignableFrom(cls);
        this.googleCollection = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2);
        FieldWriter[] fieldWriterArr = new FieldWriter[list.size()];
        this.fieldWriterArray = fieldWriterArr;
        list.toArray(fieldWriterArr);
        this.hasValueField = fieldWriterArr.length == 1 && (fieldWriterArr[0].features & 281474976710656L) != 0;
        int length = fieldWriterArr.length;
        long[] jArr = new long[length];
        int i = 0;
        boolean z = false;
        while (true) {
            FieldWriter[] fieldWriterArr2 = this.fieldWriterArray;
            if (i >= fieldWriterArr2.length) {
                break;
            }
            FieldWriter fieldWriter = fieldWriterArr2[i];
            jArr[i] = Fnv.hashCode64(fieldWriter.fieldName);
            if (fieldWriter.method != null && (fieldWriter.features & 4503599627370496L) == 0) {
                z = true;
            }
            i++;
        }
        this.containsNoneFieldGetter = z;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i2])] = (short) i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject toJSONObject(T t, long j) {
        JSONObject jSONObject = new JSONObject();
        int size = this.fieldWriters.size();
        for (int i = 0; i < size; i++) {
            FieldWriter fieldWriter = this.fieldWriters.get(i);
            Object fieldValue = fieldWriter.getFieldValue(t);
            String str = fieldWriter.format;
            Class cls = fieldWriter.fieldClass;
            if (str != null) {
                if (cls == Date.class) {
                    fieldValue = "millis".equals(str) ? Long.valueOf(((Date) fieldValue).getTime()) : DateUtils.format((Date) fieldValue, str);
                } else if (cls == LocalDate.class) {
                    fieldValue = DateUtils.format((LocalDate) fieldValue, str);
                } else if (cls == LocalDateTime.class) {
                    fieldValue = DateUtils.format((LocalDateTime) fieldValue, str);
                }
            }
            if ((fieldWriter.features & 562949953421312L) == 0) {
                if (fieldValue != null) {
                    String name = fieldValue.getClass().getName();
                    if (Collection.class.isAssignableFrom(cls) && fieldValue.getClass() != JSONObject.class && !name.equals("com.alibaba.fastjson.JSONObject")) {
                        Collection collection = (Collection) fieldValue;
                        JSONArray jSONArray = new JSONArray(collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            jSONArray.add(next == t ? jSONObject : JSON.toJSON(next));
                        }
                        fieldValue = jSONArray;
                    }
                }
                if (fieldValue != null || ((this.features | j) & JSONWriter.Feature.WriteNulls.mask) != 0) {
                    if (fieldValue == t) {
                        fieldValue = jSONObject;
                    }
                    if ((fieldValue instanceof Enum) && (JSONWriter.Feature.WriteEnumsUsingName.mask & j) != 0) {
                        fieldValue = ((Enum) fieldValue).name();
                    }
                    if ((fieldWriter instanceof FieldWriterObject) && fieldValue != null && !(fieldValue instanceof Map)) {
                        ObjectWriter initWriter = fieldWriter.getInitWriter();
                        if (initWriter == null) {
                            initWriter = JSONFactory.getObjectWriter(fieldWriter.fieldType, this.features | j);
                        }
                        if (initWriter instanceof ObjectWriterAdapter) {
                            ObjectWriterAdapter objectWriterAdapter = (ObjectWriterAdapter) initWriter;
                            fieldValue = !objectWriterAdapter.getFieldWriters().isEmpty() ? objectWriterAdapter.toJSONObject(fieldValue) : JSON.toJSON(fieldValue);
                        }
                    }
                    jSONObject.put(fieldWriter.fieldName, fieldValue);
                }
            } else if (fieldValue instanceof Map) {
                jSONObject.putAll((Map) fieldValue);
            } else {
                ObjectWriter initWriter2 = fieldWriter.getInitWriter();
                if (initWriter2 == null) {
                    initWriter2 = JSONFactory.getDefaultObjectWriterProvider().getObjectWriter(cls);
                }
                List<FieldWriter> fieldWriters = initWriter2.getFieldWriters();
                int size2 = fieldWriters.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    FieldWriter fieldWriter2 = fieldWriters.get(i2);
                    jSONObject.put(fieldWriter2.fieldName, fieldWriter2.getFieldValue(fieldValue));
                }
            }
        }
        return jSONObject;
    }
}

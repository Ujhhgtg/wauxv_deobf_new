package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.GuavaSupport;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import p000.AbstractC1194;
import p000.C2247;
import p000.C2255;
import p000.C2257;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplList implements ObjectReader {
    static final Class CLASS_ARRAYS_LIST;
    static final Class CLASS_EMPTY_LIST;
    static final Class CLASS_EMPTY_SET;
    static final Class CLASS_SINGLETON;
    static final Class CLASS_SINGLETON_LIST;
    static final Class CLASS_UNMODIFIABLE_COLLECTION;
    static final Class CLASS_UNMODIFIABLE_LIST;
    static final Class CLASS_UNMODIFIABLE_NAVIGABLE_SET;
    static final Class CLASS_UNMODIFIABLE_SET;
    static final Class CLASS_UNMODIFIABLE_SORTED_SET;
    public static ObjectReaderImplList INSTANCE;
    static List kotlinEmptyList;
    static Set kotlinEmptySet;
    final Function builder;
    volatile Constructor constructor;
    volatile boolean instanceError;
    final Class instanceType;
    final long instanceTypeHash;
    final Class itemClass;
    final String itemClassName;
    final long itemClassNameHash;
    ObjectReader itemObjectReader;
    final Type itemType;
    final Class listClass;
    Object listSingleton;
    final Type listType;

    static {
        Set set = Collections.EMPTY_SET;
        CLASS_EMPTY_SET = set.getClass();
        List list = Collections.EMPTY_LIST;
        CLASS_EMPTY_LIST = list.getClass();
        CLASS_SINGLETON = Collections.singleton(0).getClass();
        CLASS_SINGLETON_LIST = Collections.singletonList(0).getClass();
        CLASS_ARRAYS_LIST = Arrays.asList(0).getClass();
        CLASS_UNMODIFIABLE_COLLECTION = Collections.unmodifiableCollection(list).getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(list).getClass();
        CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(set).getClass();
        CLASS_UNMODIFIABLE_SORTED_SET = Collections.unmodifiableSortedSet(Collections.emptySortedSet()).getClass();
        CLASS_UNMODIFIABLE_NAVIGABLE_SET = Collections.unmodifiableNavigableSet(Collections.emptyNavigableSet()).getClass();
        INSTANCE = new ObjectReaderImplList(ArrayList.class, ArrayList.class, ArrayList.class, Object.class, null);
    }

    public ObjectReaderImplList(Class cls, Object obj) {
        this(cls, cls, cls, Object.class, null);
        this.listSingleton = obj;
    }

    public static List getKotlinEmptyList(Class cls) {
        List list = kotlinEmptyList;
        if (list != null) {
            return list;
        }
        try {
            Field field = cls.getField("INSTANCE");
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            List list2 = (List) field.get(null);
            kotlinEmptyList = list2;
            return list2;
        } catch (IllegalAccessException e) {
            e = e;
            throw new IllegalStateException(AbstractC1194.m2782(cls, "Failed to get singleton of "), e);
        } catch (NoSuchFieldException e2) {
            e = e2;
            throw new IllegalStateException(AbstractC1194.m2782(cls, "Failed to get singleton of "), e);
        }
    }

    public static Set getKotlinEmptySet(Class cls) {
        Set set = kotlinEmptySet;
        if (set != null) {
            return set;
        }
        try {
            Field field = cls.getField("INSTANCE");
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            Set set2 = (Set) field.get(null);
            kotlinEmptySet = set2;
            return set2;
        } catch (IllegalAccessException e) {
            e = e;
            throw new IllegalStateException(AbstractC1194.m2782(cls, "Failed to get singleton of "), e);
        } catch (NoSuchFieldException e2) {
            e = e2;
            throw new IllegalStateException(AbstractC1194.m2782(cls, "Failed to get singleton of "), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$0(Type type, Object obj) {
        Collection collection = (Collection) obj;
        return (collection.isEmpty() && (type instanceof Class)) ? EnumSet.noneOf((Class) type) : EnumSet.copyOf(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$1(Object obj) {
        return Collections.singleton(((List) obj).get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$2(Object obj) {
        return Collections.singletonList(((List) obj).get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$3(Object obj) {
        return Arrays.asList(((List) obj).toArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$4(Object obj) {
        return Collections.unmodifiableCollection((Collection) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$5(Object obj) {
        return Collections.unmodifiableList((List) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$6(Object obj) {
        return Collections.unmodifiableSet((Set) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$7(Object obj) {
        return Collections.unmodifiableSortedSet((SortedSet) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$of$8(Object obj) {
        return Collections.unmodifiableNavigableSet((NavigableSet) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$0(Collection collection) {
        return Collections.singleton(collection.iterator().next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$readJSONBObject$1(List list) {
        return Collections.singletonList(list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$readJSONBObject$2(Collection collection) {
        return Collections.singletonList(collection.iterator().next());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$readJSONBObject$3(Object obj) {
        Collection collection = (Collection) obj;
        if (collection.isEmpty()) {
            Type type = this.itemType;
            if (type instanceof Class) {
                return EnumSet.noneOf((Class) type);
            }
        }
        return EnumSet.copyOf(collection);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x019c  */
    /* JADX WARN: Code duplicated, block: B:118:0x01af  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:137:0x0203  */
    /* JADX WARN: Code duplicated, block: B:138:0x0205  */
    /* JADX WARN: Code duplicated, block: B:142:0x0211  */
    /* JADX WARN: Code duplicated, block: B:144:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x022f  */
    /* JADX WARN: Code duplicated, block: B:156:0x023b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0245  */
    /* JADX WARN: Code duplicated, block: B:160:0x024f  */
    /* JADX WARN: Code duplicated, block: B:162:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public static ObjectReader of(Type type, Class cls, long j) {
        Type type2;
        Type rawType;
        Class cls2;
        Class cls3;
        Function c2247;
        String typeName;
        if (cls == type && cls.getSimpleName().isEmpty()) {
            type = cls.getGenericSuperclass();
            cls = cls.getSuperclass();
        }
        Type type3 = type;
        int i = 0;
        int i2 = 1;
        Type type4 = Object.class;
        if (!(type3 instanceof ParameterizedType)) {
            if (cls != null) {
                Type genericSuperclass = cls.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
                    rawType = parameterizedType.getRawType();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        type4 = actualTypeArguments[0];
                    }
                }
                if (cls == null) {
                    cls = TypeUtils.getClass(rawType);
                }
                cls2 = cls;
                int i3 = 3;
                int i4 = 2;
                cls3 = ArrayList.class;
                c2247 = null;
                if (cls2 != Iterable.class && cls2 != Collection.class && cls2 != List.class && cls2 != AbstractCollection.class && cls2 != AbstractList.class) {
                    if (cls2 != Queue.class || cls2 == Deque.class || cls2 == AbstractSequentialList.class) {
                        cls3 = LinkedList.class;
                    } else if (cls2 == Set.class || cls2 == AbstractSet.class) {
                        cls3 = HashSet.class;
                    } else {
                        if (cls2 == EnumSet.class) {
                            c2247 = new C2255(i4, type2);
                        } else if (cls2 == NavigableSet.class || cls2 == SortedSet.class) {
                            cls3 = TreeSet.class;
                        } else if (cls2 == CLASS_SINGLETON) {
                            c2247 = new C2247(29);
                        } else if (cls2 == CLASS_SINGLETON_LIST) {
                            c2247 = new C2257(i);
                        } else {
                            Class cls4 = CLASS_ARRAYS_LIST;
                            if (cls2 == cls4) {
                                c2247 = new C2257(i2);
                                cls3 = cls4;
                            } else if (cls2 == CLASS_UNMODIFIABLE_COLLECTION) {
                                c2247 = new C2257(i4);
                            } else if (cls2 == CLASS_UNMODIFIABLE_LIST) {
                                c2247 = new C2257(i3);
                            } else if (cls2 == CLASS_UNMODIFIABLE_SET) {
                                c2247 = new C2247(13);
                                cls3 = LinkedHashSet.class;
                            } else {
                                if (cls2 == CLASS_UNMODIFIABLE_SORTED_SET) {
                                    c2247 = new C2247(14);
                                } else if (cls2 == CLASS_UNMODIFIABLE_NAVIGABLE_SET) {
                                    c2247 = new C2247(15);
                                } else {
                                    String typeName2 = cls2.getTypeName();
                                    typeName2.getClass();
                                    if (!typeName2.equals("java.util.AbstractList$RandomAccessSubList")) {
                                        if (typeName2.equals("java.util.Collections$SynchronizedSortedSet")) {
                                            c2247 = new C2247(27);
                                        } else if (typeName2.equals("com.google.common.collect.ImmutableList")) {
                                            c2247 = GuavaSupport.immutableListConverter();
                                        } else if (typeName2.equals("java.util.Collections$SynchronizedSet")) {
                                            c2247 = new C2247(26);
                                        } else if (typeName2.equals("com.google.common.collect.RegularImmutableList")) {
                                            c2247 = GuavaSupport.immutableListConverter();
                                        } else if (typeName2.equals("java.util.Collections$SynchronizedCollection")) {
                                            c2247 = new C2247(23);
                                        } else if (typeName2.equals("com.google.common.collect.SingletonImmutableSet")) {
                                            c2247 = GuavaSupport.immutableSetConverter();
                                        } else if (typeName2.equals("java.util.Collections$SynchronizedRandomAccessList")) {
                                            c2247 = new C2247(16);
                                        } else if (typeName2.equals("java.util.Collections$SynchronizedNavigableSet")) {
                                            c2247 = new C2247(28);
                                        } else if (!typeName2.equals("java.util.SubList")) {
                                            if (typeName2.equals("com.google.common.collect.SingletonImmutableList")) {
                                                c2247 = GuavaSupport.immutableListConverter();
                                            } else if (!typeName2.equals("java.util.RandomAccessSubList") && !typeName2.equals("java.util.AbstractList$SubList")) {
                                                if (typeName2.equals("com.google.common.collect.ImmutableSet")) {
                                                    c2247 = GuavaSupport.immutableSetConverter();
                                                } else if (!typeName2.equals("com.google.common.collect.Lists$TransformingRandomAccessList")) {
                                                    if (typeName2.equals("com.google.common.collect.Lists.TransformingSequentialList")) {
                                                        cls3 = LinkedList.class;
                                                    } else if (typeName2.equals("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList")) {
                                                        c2247 = GuavaSupport.immutableListConverter();
                                                    } else if (typeName2.equals("com.google.common.collect.RegularImmutableSet")) {
                                                        c2247 = GuavaSupport.immutableSetConverter();
                                                    } else {
                                                        cls3 = cls2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                cls3 = TreeSet.class;
                            }
                        }
                        cls3 = HashSet.class;
                    }
                }
                typeName = type3.getTypeName();
                typeName.getClass();
                switch (typeName.hashCode()) {
                    case -1815537371:
                        if (!typeName.equals("kotlin.collections.EmptyList")) {
                            i = -1;
                        }
                        break;
                    case -413656092:
                        if (!typeName.equals("java.util.Collections$EmptySet")) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                        break;
                    case 61358428:
                        if (!typeName.equals("java.util.Collections$EmptyList")) {
                            i = -1;
                        } else {
                            i = 2;
                        }
                        break;
                    case 357082875:
                        if (!typeName.equals("kotlin.collections.EmptySet")) {
                            i = -1;
                        } else {
                            i = 3;
                        }
                        break;
                    default:
                        i = -1;
                        break;
                }
                switch (i) {
                    case 0:
                        Class cls5 = (Class) type3;
                        return new ObjectReaderImplList(cls5, getKotlinEmptyList(cls5));
                    case 1:
                        return new ObjectReaderImplList((Class) type3, Collections.EMPTY_SET);
                    case 2:
                        return new ObjectReaderImplList((Class) type3, Collections.EMPTY_LIST);
                    case 3:
                        Class cls6 = (Class) type3;
                        return new ObjectReaderImplList(cls6, getKotlinEmptySet(cls6));
                    default:
                        if (type2 == String.class || c2247 != null) {
                            return (type2 == Long.class || c2247 != null) ? new ObjectReaderImplList(type3, cls2, cls3, type2, c2247) : new ObjectReaderImplListInt64(cls2, cls3);
                        }
                        return new ObjectReaderImplListStr(cls2, cls3);
                }
            }
            type2 = type4;
            rawType = type3;
            if (cls == null) {
                cls = TypeUtils.getClass(rawType);
            }
            cls2 = cls;
            int i5 = 3;
            int i6 = 2;
            cls3 = ArrayList.class;
            c2247 = null;
            if (cls2 != Iterable.class) {
                if (cls2 != Queue.class) {
                    cls3 = LinkedList.class;
                } else {
                    cls3 = LinkedList.class;
                }
            }
            typeName = type3.getTypeName();
            typeName.getClass();
            switch (typeName.hashCode()) {
                case -1815537371:
                    if (!typeName.equals("kotlin.collections.EmptyList")) {
                        i = -1;
                    }
                    break;
                case -413656092:
                    if (!typeName.equals("java.util.Collections$EmptySet")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    break;
                case 61358428:
                    if (!typeName.equals("java.util.Collections$EmptyList")) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                    break;
                case 357082875:
                    if (!typeName.equals("kotlin.collections.EmptySet")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    Class cls7 = (Class) type3;
                    return new ObjectReaderImplList(cls7, getKotlinEmptyList(cls7));
                case 1:
                    return new ObjectReaderImplList((Class) type3, Collections.EMPTY_SET);
                case 2:
                    return new ObjectReaderImplList((Class) type3, Collections.EMPTY_LIST);
                case 3:
                    Class cls8 = (Class) type3;
                    return new ObjectReaderImplList(cls8, getKotlinEmptySet(cls8));
                default:
                    if (type2 == String.class) {
                    }
                    if (type2 == Long.class) {
                    }
            }
        }
        ParameterizedType parameterizedType2 = (ParameterizedType) type3;
        rawType = parameterizedType2.getRawType();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        if (actualTypeArguments2.length == 1) {
            type4 = actualTypeArguments2[0];
        }
        type2 = type4;
        if (cls == null) {
            cls = TypeUtils.getClass(rawType);
        }
        cls2 = cls;
        int i7 = 3;
        int i8 = 2;
        cls3 = ArrayList.class;
        c2247 = null;
        if (cls2 != Iterable.class) {
            if (cls2 != Queue.class) {
                cls3 = LinkedList.class;
            } else {
                cls3 = LinkedList.class;
            }
        }
        typeName = type3.getTypeName();
        typeName.getClass();
        switch (typeName.hashCode()) {
            case -1815537371:
                if (!typeName.equals("kotlin.collections.EmptyList")) {
                    i = -1;
                }
                break;
            case -413656092:
                if (!typeName.equals("java.util.Collections$EmptySet")) {
                    i = 1;
                } else {
                    i = -1;
                }
                break;
            case 61358428:
                if (!typeName.equals("java.util.Collections$EmptyList")) {
                    i = 2;
                } else {
                    i = -1;
                }
                break;
            case 357082875:
                if (!typeName.equals("kotlin.collections.EmptySet")) {
                    i = 3;
                } else {
                    i = -1;
                }
                break;
            default:
                i = -1;
                break;
        }
        switch (i) {
            case 0:
                Class cls9 = (Class) type3;
                return new ObjectReaderImplList(cls9, getKotlinEmptyList(cls9));
            case 1:
                return new ObjectReaderImplList((Class) type3, Collections.EMPTY_SET);
            case 2:
                return new ObjectReaderImplList((Class) type3, Collections.EMPTY_LIST);
            case 3:
                Class cls10 = (Class) type3;
                return new ObjectReaderImplList(cls10, getKotlinEmptySet(cls10));
            default:
                if (type2 == String.class) {
                }
                if (type2 == Long.class) {
                }
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j) {
        if (collection.size() == 0 && this.listClass == List.class) {
            ArrayList arrayList = new ArrayList();
            Function function = this.builder;
            return function != null ? function.apply(arrayList) : arrayList;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Collection arrayList2 = this.instanceType == ArrayList.class ? new ArrayList(collection.size()) : (Collection) createInstance(0L);
        for (Object objCreateInstance : collection) {
            if (objCreateInstance == null) {
                arrayList2.add(null);
            } else {
                Class<?> cls = objCreateInstance.getClass();
                if ((cls == JSONObject.class || cls == TypeUtils.CLASS_JSON_OBJECT_1x) && this.itemClass != cls) {
                    if (this.itemObjectReader == null) {
                        this.itemObjectReader = defaultObjectReaderProvider.getObjectReader(this.itemType);
                    }
                    objCreateInstance = this.itemObjectReader.createInstance((Map) objCreateInstance, j);
                } else {
                    Type type = this.itemType;
                    if (cls != type) {
                        Function typeConvert = defaultObjectReaderProvider.getTypeConvert(cls, type);
                        if (typeConvert != null) {
                            objCreateInstance = typeConvert.apply(objCreateInstance);
                        } else if (objCreateInstance instanceof Map) {
                            Map map = (Map) objCreateInstance;
                            if (this.itemObjectReader == null) {
                                this.itemObjectReader = defaultObjectReaderProvider.getObjectReader(this.itemType);
                            }
                            objCreateInstance = this.itemObjectReader.createInstance(map, 0L);
                        } else if (objCreateInstance instanceof Collection) {
                            if (this.itemObjectReader == null) {
                                this.itemObjectReader = defaultObjectReaderProvider.getObjectReader(this.itemType);
                            }
                            objCreateInstance = this.itemObjectReader.createInstance((Collection) objCreateInstance, j);
                        } else if (!this.itemClass.isInstance(objCreateInstance)) {
                            if (!Enum.class.isAssignableFrom(this.itemClass)) {
                                throw new JSONException("can not convert from " + cls + " to " + this.itemType);
                            }
                            if (this.itemObjectReader == null) {
                                this.itemObjectReader = defaultObjectReaderProvider.getObjectReader(this.itemType);
                            }
                            ObjectReader objectReader = this.itemObjectReader;
                            if (!(objectReader instanceof ObjectReaderImplEnum)) {
                                throw new JSONException("can not convert from " + cls + " to " + this.itemType);
                            }
                            objCreateInstance = ((ObjectReaderImplEnum) objectReader).getEnum((String) objCreateInstance);
                        }
                    }
                }
                arrayList2.add(objCreateInstance);
            }
        }
        Function function2 = this.builder;
        return function2 != null ? function2.apply(arrayList2) : arrayList2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Function getBuildFunction() {
        return this.builder;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return this.listClass;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x020d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0213  */
    /* JADX WARN: Code duplicated, block: B:123:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x021f  */
    /* JADX WARN: Code duplicated, block: B:126:0x022a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0230  */
    /* JADX WARN: Code duplicated, block: B:129:0x0233  */
    /* JADX WARN: Code duplicated, block: B:131:0x0241  */
    /* JADX WARN: Code duplicated, block: B:132:0x0255  */
    /* JADX WARN: Code duplicated, block: B:137:0x026f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0274 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:146:0x026d A[EDGE_INSN: B:146:0x026d->B:136:0x026d BREAK  A[LOOP:1: B:135:0x026a->B:134:0x0266], SYNTHETIC] */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Class cls;
        Collection arrayList;
        Function c2247;
        JSONArray jSONArray;
        ObjectReader objectReader;
        Type type2;
        ObjectReader objectReader2;
        Type type3;
        ObjectReader objectReaderCheckAutoType;
        Object jSONBObject;
        String reference;
        Collection collection;
        Type[] actualTypeArguments;
        Collection kotlinEmptyList2;
        ArrayList arrayList2;
        Object jSONBObject2;
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(this.listClass, 0L, j);
        Function c2255 = this.builder;
        Class objectClass = this.instanceType;
        int i = 18;
        if (objectReaderCheckAutoType2 == null) {
            cls = objectClass;
        } else {
            if (objectReaderCheckAutoType2 instanceof ObjectReaderImplList) {
                ObjectReaderImplList objectReaderImplList = (ObjectReaderImplList) objectReaderCheckAutoType2;
                objectClass = objectReaderImplList.instanceType;
                c2255 = objectReaderImplList.builder;
            } else {
                objectClass = objectReaderCheckAutoType2.getObjectClass();
            }
            if (objectClass == CLASS_UNMODIFIABLE_COLLECTION) {
                c2255 = new C2247(17);
            } else if (objectClass == CLASS_UNMODIFIABLE_LIST) {
                c2255 = new C2247(i);
            } else if (objectClass == CLASS_UNMODIFIABLE_SET) {
                c2255 = new C2247(19);
                cls = LinkedHashSet.class;
            } else {
                if (objectClass == CLASS_UNMODIFIABLE_SORTED_SET) {
                    c2255 = new C2247(20);
                } else if (objectClass == CLASS_UNMODIFIABLE_NAVIGABLE_SET) {
                    c2255 = new C2247(21);
                } else if (objectClass == CLASS_SINGLETON) {
                    c2255 = new C2247(22);
                } else if (objectClass == CLASS_SINGLETON_LIST) {
                    c2255 = new C2247(24);
                } else {
                    String typeName = objectClass.getTypeName();
                    typeName.getClass();
                    if (typeName.equals("ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲇᤞᛸᲈ") || typeName.equals("ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲇᲈᤞᛸ")) {
                        return objectReaderCheckAutoType2.readObject(jSONReader, type, obj, j);
                    }
                    cls = objectClass;
                }
                cls = TreeSet.class;
            }
            cls = ArrayList.class;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray > 0 && this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader.getContext().getObjectReader(this.itemType);
        }
        int i2 = 0;
        if (cls == CLASS_ARRAYS_LIST) {
            Object[] objArr = new Object[iStartArray];
            List listAsList = Arrays.asList(objArr);
            while (i2 < iStartArray) {
                if (jSONReader.isReference()) {
                    String reference2 = jSONReader.readReference();
                    if ("..".equals(reference2)) {
                        jSONBObject2 = listAsList;
                    } else {
                        jSONReader.addResolveTask(listAsList, i2, JSONPath.of(reference2));
                        jSONBObject2 = null;
                    }
                } else {
                    jSONBObject2 = this.itemObjectReader.readJSONBObject(jSONReader, this.itemType, Integer.valueOf(i2), j);
                }
                objArr[i2] = jSONBObject2;
                i2++;
            }
            return listAsList;
        }
        if (cls == ArrayList.class) {
            if (iStartArray > 0) {
                kotlinEmptyList2 = arrayList2;
                arrayList2 = new ArrayList(iStartArray);
            } else {
                kotlinEmptyList2 = arrayList2;
                arrayList2 = new ArrayList();
            }
        } else if (cls == JSONArray.class) {
            if (iStartArray > 0) {
                kotlinEmptyList2 = jSONArray;
                jSONArray = new JSONArray(iStartArray);
            } else {
                kotlinEmptyList2 = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (cls == HashSet.class) {
            kotlinEmptyList2 = new HashSet();
        } else if (cls == LinkedHashSet.class) {
            kotlinEmptyList2 = new LinkedHashSet();
        } else if (cls == TreeSet.class) {
            kotlinEmptyList2 = new TreeSet();
        } else if (cls == CLASS_EMPTY_SET) {
            kotlinEmptyList2 = Collections.EMPTY_SET;
        } else if (cls == CLASS_EMPTY_LIST) {
            kotlinEmptyList2 = Collections.EMPTY_LIST;
        } else {
            if (cls != CLASS_SINGLETON_LIST) {
                if (cls == CLASS_UNMODIFIABLE_LIST) {
                    arrayList = new ArrayList();
                    c2247 = new C2247(i);
                } else if (cls != null && EnumSet.class.isAssignableFrom(cls)) {
                    HashSet hashSet = new HashSet();
                    c2255 = new C2255(3, this);
                    kotlinEmptyList2 = hashSet;
                } else if (cls == null || cls == this.listType) {
                    kotlinEmptyList2 = (Collection) createInstance(jSONReader.getContext().getFeatures() | j);
                } else {
                    String name = cls.getName();
                    if (name.equals("ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲇᤞᛸᲈ")) {
                        kotlinEmptyList2 = getKotlinEmptyList(cls);
                    } else if (name.equals("ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲇᲈᤞᛸ")) {
                        kotlinEmptyList2 = getKotlinEmptySet(cls);
                    } else {
                        try {
                            kotlinEmptyList2 = (Collection) cls.newInstance();
                        } catch (IllegalAccessException | InstantiationException e) {
                            throw new JSONException(jSONReader.info("create instance error " + cls), e);
                        }
                    }
                }
                objectReader = this.itemObjectReader;
                type2 = this.itemType;
                if (type instanceof ParameterizedType) {
                    actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 1 && (type2 = actualTypeArguments[0]) != this.itemType) {
                        objectReader = jSONReader.getObjectReader(type2);
                    }
                }
                while (true) {
                    objectReader2 = objectReader;
                    type3 = type2;
                    if (i2 < iStartArray) {
                        break;
                    }
                    if (jSONReader.isReference()) {
                        reference = jSONReader.readReference();
                        if ("..".equals(reference)) {
                            collection = arrayList;
                        } else {
                            jSONReader.addResolveTask(arrayList, i2, JSONPath.of(reference));
                            if (arrayList instanceof List) {
                                collection = null;
                            } else {
                                objectReader = objectReader2;
                                type2 = type3;
                            }
                            i2++;
                            jSONReader = jSONReader;
                        }
                        Collection collection2 = collection;
                        objectReader = objectReader2;
                        jSONBObject = collection2;
                        type2 = type3;
                    } else {
                        objectReaderCheckAutoType = jSONReader.checkAutoType(this.itemClass, this.itemClassNameHash, j);
                        if (objectReaderCheckAutoType != null) {
                            type2 = type3;
                            objectReader = objectReader2;
                            jSONBObject = objectReaderCheckAutoType.readJSONBObject(jSONReader, type2, Integer.valueOf(i2), j);
                        } else {
                            type2 = type3;
                            objectReader = objectReader2;
                            jSONBObject = objectReader.readJSONBObject(jSONReader, type2, Integer.valueOf(i2), j);
                        }
                    }
                    arrayList.add(jSONBObject);
                    i2++;
                    jSONReader = jSONReader;
                }
                if (c2247 != null) {
                    return c2247.apply(arrayList);
                }
                return arrayList;
            }
            ArrayList arrayList3 = new ArrayList();
            c2255 = new C2247(25);
            kotlinEmptyList2 = arrayList3;
        }
        c2247 = c2255;
        arrayList = kotlinEmptyList2;
        objectReader = this.itemObjectReader;
        type2 = this.itemType;
        if (type instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                objectReader = jSONReader.getObjectReader(type2);
            }
        }
        while (true) {
            objectReader2 = objectReader;
            type3 = type2;
            if (i2 < iStartArray) {
                break;
                break;
            }
            if (jSONReader.isReference()) {
                reference = jSONReader.readReference();
                if ("..".equals(reference)) {
                    collection = arrayList;
                } else {
                    jSONReader.addResolveTask(arrayList, i2, JSONPath.of(reference));
                    if (arrayList instanceof List) {
                        collection = null;
                    } else {
                        objectReader = objectReader2;
                        type2 = type3;
                    }
                    i2++;
                    jSONReader = jSONReader;
                }
                Collection collection3 = collection;
                objectReader = objectReader2;
                jSONBObject = collection3;
                type2 = type3;
            } else {
                objectReaderCheckAutoType = jSONReader.checkAutoType(this.itemClass, this.itemClassNameHash, j);
                if (objectReaderCheckAutoType != null) {
                    type2 = type3;
                    objectReader = objectReader2;
                    jSONBObject = objectReaderCheckAutoType.readJSONBObject(jSONReader, type2, Integer.valueOf(i2), j);
                } else {
                    type2 = type3;
                    objectReader = objectReader2;
                    jSONBObject = objectReader.readJSONBObject(jSONReader, type2, Integer.valueOf(i2), j);
                }
            }
            arrayList.add(jSONBObject);
            i2++;
            jSONReader = jSONReader;
        }
        if (c2247 != null) {
            return c2247.apply(arrayList);
        }
        return arrayList;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        Object object;
        JSONReader.Context context = jSONReader.getContext();
        if (this.itemObjectReader == null) {
            this.itemObjectReader = context.getObjectReader(this.itemType);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        if (jSONReader.readIfNull()) {
            return null;
        }
        Collection hashSet = jSONReader.nextIfSet() ? new HashSet() : (Collection) createInstance(context.getFeatures() | j);
        char cCurrent = jSONReader.current();
        if (cCurrent == '\"') {
            String string = jSONReader.readString();
            if (this.itemClass == String.class) {
                jSONReader.nextIfComma();
                hashSet.add(string);
                return hashSet;
            }
            if (string.isEmpty()) {
                jSONReader.nextIfComma();
                return null;
            }
            ObjectReaderProvider provider = context.getProvider();
            if (this.itemClass.isEnum()) {
                ObjectReader objectReader = provider.getObjectReader(this.itemClass);
                if (objectReader instanceof ObjectReaderImplEnum) {
                    Enum r0 = ((ObjectReaderImplEnum) objectReader).getEnum(string);
                    if (r0 != null) {
                        hashSet.add(r0);
                        return hashSet;
                    }
                    if (JSONReader.Feature.ErrorOnEnumNotMatch.isEnabled(jSONReader.features(j))) {
                        throw new JSONException(jSONReader.info("enum not match : ".concat(string)));
                    }
                    return null;
                }
            }
            Function typeConvert = provider.getTypeConvert(String.class, this.itemType);
            if (typeConvert == null) {
                throw new JSONException(jSONReader.info());
            }
            Object objApply = typeConvert.apply(string);
            jSONReader.nextIfComma();
            hashSet.add(objApply);
            return hashSet;
        }
        int i = 0;
        if (cCurrent != '[') {
            Class cls = this.itemClass;
            if ((cls == Object.class || this.itemObjectReader == null) && !(cls == Object.class && jSONReader.isObject())) {
                throw new JSONException(jSONReader.info());
            }
            hashSet.add(this.itemObjectReader.readObject(jSONReader, this.itemType, 0, 0L));
            Function function = this.builder;
            return function != null ? (Collection) function.apply(hashSet) : hashSet;
        }
        jSONReader.next();
        ObjectReader objectReader2 = this.itemObjectReader;
        Type type2 = this.itemType;
        if (type != this.listType && (type instanceof ParameterizedType)) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 1 && (type2 = actualTypeArguments[0]) != this.itemType) {
                objectReader2 = jSONReader.getObjectReader(type2);
            }
        }
        ObjectReader objectReader3 = objectReader2;
        Type type3 = type2;
        while (!jSONReader.nextIfArrayEnd()) {
            if (type3 == String.class) {
                object = jSONReader.readString();
            } else {
                if (objectReader3 == null) {
                    throw new JSONException(jSONReader.info("TODO : " + type3));
                }
                if (jSONReader.isReference()) {
                    String reference = jSONReader.readReference();
                    if ("..".equals(reference)) {
                        object = this;
                    } else {
                        jSONReader.addResolveTask(hashSet, i, JSONPath.of(reference));
                    }
                    i++;
                } else {
                    object = objectReader3.readObject(jSONReader, type3, Integer.valueOf(i), 0L);
                }
            }
            hashSet.add(object);
            i++;
        }
        jSONReader.nextIfComma();
        Function function2 = this.builder;
        return function2 != null ? function2.apply(hashSet) : hashSet;
    }

    public ObjectReaderImplList(Type type, Class cls, Class cls2, Type type2, Function function) {
        this.listType = type;
        this.listClass = cls;
        this.instanceType = cls2;
        this.instanceTypeHash = Fnv.hashCode64(TypeUtils.getTypeName(cls2));
        this.itemType = type2;
        Class<?> cls3 = TypeUtils.getClass(type2);
        this.itemClass = cls3;
        this.builder = function;
        String typeName = cls3 != null ? TypeUtils.getTypeName(cls3) : null;
        this.itemClassName = typeName;
        this.itemClassNameHash = typeName != null ? Fnv.hashCode64(typeName) : 0L;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(long j) {
        Class cls = this.instanceType;
        if (cls == ArrayList.class) {
            return JDKUtils.JVM_VERSION == 8 ? new ArrayList(10) : new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        if (cls == HashSet.class) {
            return new HashSet();
        }
        if (cls == LinkedHashSet.class) {
            return new LinkedHashSet();
        }
        if (cls == TreeSet.class) {
            return new TreeSet();
        }
        Object obj = this.listSingleton;
        if (obj != null) {
            return obj;
        }
        if (cls != null) {
            if (this.constructor == null && !BeanUtils.hasPublicDefaultConstructor(this.instanceType)) {
                this.constructor = BeanUtils.getDefaultConstructor(this.instanceType, false);
                this.constructor.setAccessible(true);
            }
            JSONException jSONException = null;
            if (!this.instanceError) {
                try {
                    if (this.constructor != null) {
                        return this.constructor.newInstance(null);
                    }
                    return this.instanceType.newInstance();
                } catch (IllegalAccessException | InstantiationException | RuntimeException | InvocationTargetException unused) {
                    this.instanceError = true;
                    jSONException = new JSONException("create list error, type " + this.instanceType);
                }
            }
            if (this.instanceError && List.class.isAssignableFrom(this.instanceType.getSuperclass())) {
                try {
                    return this.instanceType.getSuperclass().newInstance();
                } catch (IllegalAccessException | InstantiationException unused2) {
                    this.instanceError = true;
                    jSONException = new JSONException("create list error, type " + this.instanceType);
                }
            }
            if (jSONException != null) {
                throw jSONException;
            }
        }
        return new ArrayList();
    }
}

package p000;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.HttpUrl;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲀᲈᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1651 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2103 f5593 = new C2103(2);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Object f5594 = AbstractC1898.m3694(new C2315("boolean", Boolean.TYPE), new C2315("byte", Byte.TYPE), new C2315("char", Character.TYPE), new C2315("short", Short.TYPE), new C2315("int", Integer.TYPE), new C2315("long", Long.TYPE), new C2315("float", Float.TYPE), new C2315("double", Double.TYPE), new C2315("void", Void.TYPE));

    /* JADX WARN: Code duplicated, block: B:17:0x003a A[PHI: r3
      0x003a: PHI (r3v29 java.lang.Object) = (r3v41 java.lang.Object), (r3v42 java.lang.Object) binds: [B:24:0x0054, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x008b A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00de A[Catch: all -> 0x0074, LOOP:0: B:51:0x00d6->B:53:0x00de, LOOP_END, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f5 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd A[Catch: all -> 0x0074, LOOP:1: B:58:0x00fb->B:59:0x00fd, LOOP_END, TryCatch #1 {all -> 0x0074, blocks: (B:27:0x0061, B:29:0x0067, B:31:0x006d, B:36:0x007a, B:38:0x008b, B:40:0x00ac, B:42:0x00b2, B:43:0x00ba, B:45:0x00c1, B:47:0x00c9, B:51:0x00d6, B:53:0x00de, B:54:0x00eb, B:56:0x00f5, B:59:0x00fd, B:60:0x0108, B:44:0x00bd), top: B:69:0x0061 }] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Class m3379(ClassLoader classLoader, String str) {
        C0147 c0147;
        Object objM1192;
        WeakHashMap weakHashMap;
        Map map;
        C0147 c0148;
        String strSubstring;
        int i;
        Class<?> clsLoadClass;
        int i2;
        Class<?> cls;
        Object objM1193;
        Object map2;
        WeakReference weakReference;
        ClassLoader classLoader2;
        Object obj;
        Object obj2;
        C0147 c0149;
        Object objM1194;
        C2103 c2103 = f5593;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c2103.f6935;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            WeakHashMap weakHashMap2 = (WeakHashMap) c2103.f6938;
            if (weakHashMap2 == null) {
                WeakReference weakReference2 = (WeakReference) c2103.f6936;
                if ((weakReference2 != null ? (ClassLoader) weakReference2.get() : null) != classLoader || (c0149 = (C0147) ((HashMap) c2103.f6937).get(str)) == null || (objM1194 = c0149.m1192()) == null) {
                    obj2 = objM1192;
                    obj2 = objM1194;
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        weakHashMap = (WeakHashMap) c2103.f6938;
                        if (weakHashMap == null) {
                            weakReference = (WeakReference) c2103.f6936;
                            if (weakReference != null) {
                                classLoader2 = (ClassLoader) weakReference.get();
                            } else {
                                classLoader2 = null;
                            }
                            if (classLoader2 == null) {
                                c2103.f6936 = new WeakReference(classLoader);
                                ((HashMap) c2103.f6937).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap = new WeakHashMap();
                                weakHashMap.put(classLoader2, (HashMap) c2103.f6937);
                                weakHashMap.put(classLoader, new HashMap());
                                c2103.f6938 = weakHashMap;
                                c2103.f6936 = null;
                                c2103.f6937 = new HashMap();
                            }
                        }
                        if (weakHashMap != null) {
                            map2 = weakHashMap.get(classLoader);
                            if (map2 == null) {
                                map2 = new HashMap();
                                weakHashMap.put(classLoader, map2);
                            }
                            map = (Map) map2;
                        } else {
                            map = (HashMap) c2103.f6937;
                        }
                        c0148 = (C0147) map.get(str);
                        if (c0148 != null || (objM1193 = c0148.m1192()) == null) {
                            Object obj3 = objM1193;
                            strSubstring = str;
                            i = 0;
                            while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                                i++;
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                            }
                            clsLoadClass = (Class) f5594.get(strSubstring);
                            if (clsLoadClass == null) {
                                clsLoadClass = classLoader.loadClass(strSubstring);
                            }
                            i2 = 0;
                            cls = clsLoadClass;
                            while (i2 < i) {
                                i2++;
                                cls = Array.newInstance(cls, 0).getClass();
                            }
                            map.put(str, new C0147(cls));
                            obj3 = cls;
                        }
                    } finally {
                        writeLock.unlock();
                    }
                } else {
                    obj2 = objM1192;
                    obj2 = objM1194;
                    lock.unlock();
                    obj = obj2;
                }
            } else {
                Map map3 = (Map) weakHashMap2.get(classLoader);
                if (map3 == null || (c0147 = (C0147) map3.get(str)) == null || (objM1192 = c0147.m1192()) == null) {
                    obj2 = objM1192;
                    obj2 = objM1194;
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
                    writeLock2.lock();
                    weakHashMap = (WeakHashMap) c2103.f6938;
                    if (weakHashMap == null) {
                        weakReference = (WeakReference) c2103.f6936;
                        if (weakReference != null) {
                            classLoader2 = (ClassLoader) weakReference.get();
                        } else {
                            classLoader2 = null;
                        }
                        if (classLoader2 == null) {
                            c2103.f6936 = new WeakReference(classLoader);
                            ((HashMap) c2103.f6937).clear();
                        } else if (classLoader2 != classLoader) {
                            weakHashMap = new WeakHashMap();
                            weakHashMap.put(classLoader2, (HashMap) c2103.f6937);
                            weakHashMap.put(classLoader, new HashMap());
                            c2103.f6938 = weakHashMap;
                            c2103.f6936 = null;
                            c2103.f6937 = new HashMap();
                        }
                    }
                    if (weakHashMap != null) {
                        map2 = weakHashMap.get(classLoader);
                        if (map2 == null) {
                            map2 = new HashMap();
                            weakHashMap.put(classLoader, map2);
                        }
                        map = (Map) map2;
                    } else {
                        map = (HashMap) c2103.f6937;
                    }
                    c0148 = (C0147) map.get(str);
                    if (c0148 != null) {
                        Object obj4 = objM1193;
                        strSubstring = str;
                        i = 0;
                        while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                            i++;
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        }
                        clsLoadClass = (Class) f5594.get(strSubstring);
                        if (clsLoadClass == null) {
                            clsLoadClass = classLoader.loadClass(strSubstring);
                        }
                        i2 = 0;
                        cls = clsLoadClass;
                        while (i2 < i) {
                            i2++;
                            cls = Array.newInstance(cls, 0).getClass();
                        }
                        map.put(str, new C0147(cls));
                        obj4 = cls;
                    } else {
                        Object obj5 = objM1193;
                        strSubstring = str;
                        i = 0;
                        while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                            i++;
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        }
                        clsLoadClass = (Class) f5594.get(strSubstring);
                        if (clsLoadClass == null) {
                            clsLoadClass = classLoader.loadClass(strSubstring);
                        }
                        i2 = 0;
                        cls = clsLoadClass;
                        while (i2 < i) {
                            i2++;
                            cls = Array.newInstance(cls, 0).getClass();
                        }
                        map.put(str, new C0147(cls));
                        obj5 = cls;
                    }
                } else {
                    obj2 = objM1192;
                    obj2 = objM1194;
                    lock.unlock();
                    obj = obj2;
                }
            }
            return (Class) obj;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Serializable m3380(ClassLoader classLoader, ArrayList arrayList) {
        Object c2585;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                c2585 = m3379(classLoader, (String) it.next());
            } catch (Throwable th) {
                c2585 = new C2585(th);
            }
            Throwable thM4594 = C2586.m4594(c2585);
            if (thM4594 != null) {
                return new C2585(thM4594);
            }
            arrayList2.add((Class) c2585);
        }
        return arrayList2.toArray(new Class[0]);
    }
}

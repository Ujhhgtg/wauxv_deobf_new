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

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱᛳ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0668Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C0416Ujhhgtgfeyxiexzf f2783Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(2);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object f2784Ujhhgtgfeyxiexzf = AbstractC0202Ujhhgtgfeyxiexzf.m1281Ujhhgtgfeyxiexzf(new C1381feyxiexzfUjhhgtg("boolean", Boolean.TYPE), new C1381feyxiexzfUjhhgtg("byte", Byte.TYPE), new C1381feyxiexzfUjhhgtg("char", Character.TYPE), new C1381feyxiexzfUjhhgtg("short", Short.TYPE), new C1381feyxiexzfUjhhgtg("int", Integer.TYPE), new C1381feyxiexzfUjhhgtg("long", Long.TYPE), new C1381feyxiexzfUjhhgtg("float", Float.TYPE), new C1381feyxiexzfUjhhgtg("double", Double.TYPE), new C1381feyxiexzfUjhhgtg("void", Void.TYPE));

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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Class m1934Ujhhgtgfeyxiexzf(ClassLoader classLoader, String str) {
        C3018Ujhhgtgfeyxiexzf c3018Ujhhgtgfeyxiexzf;
        Object objM4502Ujhhgtgfeyxiexzf;
        WeakHashMap weakHashMap;
        Map map;
        C3018Ujhhgtgfeyxiexzf c3018Ujhhgtgfeyxiexzf2;
        String strSubstring;
        int i;
        Class<?> clsLoadClass;
        int i2;
        Class<?> cls;
        Object objM4502Ujhhgtgfeyxiexzf2;
        Object map2;
        WeakReference weakReference;
        ClassLoader classLoader2;
        Object obj;
        Object obj2;
        C3018Ujhhgtgfeyxiexzf c3018Ujhhgtgfeyxiexzf3;
        Object objM4502Ujhhgtgfeyxiexzf3;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = f2783Ujhhgtgfeyxiexzf;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) c0416Ujhhgtgfeyxiexzf.f2243Ujhhgtgfeyxiexzf;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            WeakHashMap weakHashMap2 = (WeakHashMap) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
            if (weakHashMap2 == null) {
                WeakReference weakReference2 = (WeakReference) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf;
                if ((weakReference2 != null ? (ClassLoader) weakReference2.get() : null) != classLoader || (c3018Ujhhgtgfeyxiexzf3 = (C3018Ujhhgtgfeyxiexzf) ((HashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf).get(str)) == null || (objM4502Ujhhgtgfeyxiexzf3 = c3018Ujhhgtgfeyxiexzf3.m4502Ujhhgtgfeyxiexzf()) == null) {
                    obj2 = objM4502Ujhhgtgfeyxiexzf;
                    obj2 = objM4502Ujhhgtgfeyxiexzf3;
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        weakHashMap = (WeakHashMap) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
                        if (weakHashMap == null) {
                            weakReference = (WeakReference) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf;
                            if (weakReference != null) {
                                classLoader2 = (ClassLoader) weakReference.get();
                            } else {
                                classLoader2 = null;
                            }
                            if (classLoader2 == null) {
                                c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf = new WeakReference(classLoader);
                                ((HashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf).clear();
                            } else if (classLoader2 != classLoader) {
                                weakHashMap = new WeakHashMap();
                                weakHashMap.put(classLoader2, (HashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf);
                                weakHashMap.put(classLoader, new HashMap());
                                c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf = weakHashMap;
                                c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf = null;
                                c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf = new HashMap();
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
                            map = (HashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf;
                        }
                        c3018Ujhhgtgfeyxiexzf2 = (C3018Ujhhgtgfeyxiexzf) map.get(str);
                        if (c3018Ujhhgtgfeyxiexzf2 != null || (objM4502Ujhhgtgfeyxiexzf2 = c3018Ujhhgtgfeyxiexzf2.m4502Ujhhgtgfeyxiexzf()) == null) {
                            Object obj3 = objM4502Ujhhgtgfeyxiexzf2;
                            strSubstring = str;
                            i = 0;
                            while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                                i++;
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                            }
                            clsLoadClass = (Class) f2784Ujhhgtgfeyxiexzf.get(strSubstring);
                            if (clsLoadClass == null) {
                                clsLoadClass = classLoader.loadClass(strSubstring);
                            }
                            i2 = 0;
                            cls = clsLoadClass;
                            while (i2 < i) {
                                i2++;
                                cls = Array.newInstance(cls, 0).getClass();
                            }
                            map.put(str, new C3018Ujhhgtgfeyxiexzf(cls));
                            obj3 = cls;
                        }
                    } finally {
                        writeLock.unlock();
                    }
                } else {
                    obj2 = objM4502Ujhhgtgfeyxiexzf;
                    obj2 = objM4502Ujhhgtgfeyxiexzf3;
                    lock.unlock();
                    obj = obj2;
                }
            } else {
                Map map3 = (Map) weakHashMap2.get(classLoader);
                if (map3 == null || (c3018Ujhhgtgfeyxiexzf = (C3018Ujhhgtgfeyxiexzf) map3.get(str)) == null || (objM4502Ujhhgtgfeyxiexzf = c3018Ujhhgtgfeyxiexzf.m4502Ujhhgtgfeyxiexzf()) == null) {
                    obj2 = objM4502Ujhhgtgfeyxiexzf;
                    obj2 = objM4502Ujhhgtgfeyxiexzf3;
                    lock.unlock();
                    ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
                    writeLock2.lock();
                    weakHashMap = (WeakHashMap) c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf;
                    if (weakHashMap == null) {
                        weakReference = (WeakReference) c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf;
                        if (weakReference != null) {
                            classLoader2 = (ClassLoader) weakReference.get();
                        } else {
                            classLoader2 = null;
                        }
                        if (classLoader2 == null) {
                            c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf = new WeakReference(classLoader);
                            ((HashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf).clear();
                        } else if (classLoader2 != classLoader) {
                            weakHashMap = new WeakHashMap();
                            weakHashMap.put(classLoader2, (HashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf);
                            weakHashMap.put(classLoader, new HashMap());
                            c0416Ujhhgtgfeyxiexzf.f2246Ujhhgtgfeyxiexzf = weakHashMap;
                            c0416Ujhhgtgfeyxiexzf.f2244Ujhhgtgfeyxiexzf = null;
                            c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf = new HashMap();
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
                        map = (HashMap) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf;
                    }
                    c3018Ujhhgtgfeyxiexzf2 = (C3018Ujhhgtgfeyxiexzf) map.get(str);
                    if (c3018Ujhhgtgfeyxiexzf2 != null) {
                        Object obj4 = objM4502Ujhhgtgfeyxiexzf2;
                        strSubstring = str;
                        i = 0;
                        while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                            i++;
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        }
                        clsLoadClass = (Class) f2784Ujhhgtgfeyxiexzf.get(strSubstring);
                        if (clsLoadClass == null) {
                            clsLoadClass = classLoader.loadClass(strSubstring);
                        }
                        i2 = 0;
                        cls = clsLoadClass;
                        while (i2 < i) {
                            i2++;
                            cls = Array.newInstance(cls, 0).getClass();
                        }
                        map.put(str, new C3018Ujhhgtgfeyxiexzf(cls));
                        obj4 = cls;
                    } else {
                        Object obj5 = objM4502Ujhhgtgfeyxiexzf2;
                        strSubstring = str;
                        i = 0;
                        while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                            i++;
                            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                        }
                        clsLoadClass = (Class) f2784Ujhhgtgfeyxiexzf.get(strSubstring);
                        if (clsLoadClass == null) {
                            clsLoadClass = classLoader.loadClass(strSubstring);
                        }
                        i2 = 0;
                        cls = clsLoadClass;
                        while (i2 < i) {
                            i2++;
                            cls = Array.newInstance(cls, 0).getClass();
                        }
                        map.put(str, new C3018Ujhhgtgfeyxiexzf(cls));
                        obj5 = cls;
                    }
                } else {
                    obj2 = objM4502Ujhhgtgfeyxiexzf;
                    obj2 = objM4502Ujhhgtgfeyxiexzf3;
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Serializable m1935Ujhhgtgfeyxiexzf(ClassLoader classLoader, ArrayList arrayList) {
        Object c0919feyxiexzfUjhhgtg;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                c0919feyxiexzfUjhhgtg = m1934Ujhhgtgfeyxiexzf(classLoader, (String) it.next());
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
            }
            Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
            if (thM2409Ujhhgtgfeyxiexzf != null) {
                return new C0919feyxiexzfUjhhgtg(thM2409Ujhhgtgfeyxiexzf);
            }
            arrayList2.add((Class) c0919feyxiexzfUjhhgtg);
        }
        return arrayList2.toArray(new Class[0]);
    }
}

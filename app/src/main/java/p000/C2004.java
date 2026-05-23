package p000;

import android.app.Application;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2004 extends ClassLoader {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C2004 f6673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final LinkedHashSet f6674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final LinkedHashSet f6675;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f6674 = linkedHashSet;
        f6675 = new LinkedHashSet();
        linkedHashSet.add("androidx.lifecycle.ReportFragment");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2004() {
        super(C0251.m1336());
        
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0080 A[EXC_TOP_SPLITTER, PHI: r0
      0x0080: PHI (r0v7 java.lang.ClassLoader) = (r0v6 java.lang.ClassLoader), (r0v14 java.lang.ClassLoader) binds: [B:27:0x005a, B:30:0x0064] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader classLoader;
        LinkedHashSet linkedHashSet;
        Object c2585;
        Class<?> cls;
        Class<?> clsLoadClass;
        Iterator it;
        boolean z2 = C3692.f11601;
        if (!C3692.m5357()) {
            
            return C0251.m1336().loadClass(str);
        }
        
        Application applicationM1337 = C0251.m1337();
        if (applicationM1337 != null && (classLoader = applicationM1337.getClassLoader()) != null) {
            LinkedHashSet linkedHashSet2 = f6674;
            if (linkedHashSet2.isEmpty()) {
                linkedHashSet2 = null;
            }
            if (linkedHashSet2 != null) {
                Iterator it2 = linkedHashSet2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        linkedHashSet = f6675;
                        if (linkedHashSet.isEmpty()) {
                            linkedHashSet = null;
                        }
                        if (linkedHashSet != null) {
                            it = linkedHashSet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    try {
                                        try {
                                            
                                            clsLoadClass = C0251.m1336().loadClass(str);
                                        } catch (Throwable th) {
                                            c2585 = new C2585(th);
                                            cls = (Class) (true ? null : c2585);
                                            if (true) {
                                                clsLoadClass = classLoader.loadClass(str);
                                            } else {
                                                clsLoadClass = cls;
                                            }
                                        }
                                    } catch (Throwable unused) {
                                        
                                        c2585 = C0251.m1336().loadClass(str);
                                        cls = (Class) (false ? null : c2585);
                                        if (cls == null) {
                                            clsLoadClass = classLoader.loadClass(str);
                                        } else {
                                            clsLoadClass = cls;
                                        }
                                        if (clsLoadClass != null) {
                                            return clsLoadClass;
                                        }
                                        return super.loadClass(str, z);
                                    }
                                } else if (AbstractC2207.m4087(str, (String) it.next())) {
                                    
                                    clsLoadClass = C0251.m1336().loadClass(str);
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            
                            clsLoadClass = C0251.m1336().loadClass(str);
                        }
                    } else if (AbstractC2207.m4087(str, (String) it2.next())) {
                        clsLoadClass = classLoader.loadClass(str);
                    } else {
                        continue;
                    }
                }
            } else {
                linkedHashSet = f6675;
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = null;
                }
                if (linkedHashSet != null) {
                    it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            
                            clsLoadClass = C0251.m1336().loadClass(str);
                        } else if (AbstractC2207.m4087(str, (String) it.next())) {
                            
                            clsLoadClass = C0251.m1336().loadClass(str);
                        } else {
                            continue;
                        }
                    }
                } else {
                    
                    clsLoadClass = C0251.m1336().loadClass(str);
                }
            }
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        }
        return super.loadClass(str, z);
    }
}

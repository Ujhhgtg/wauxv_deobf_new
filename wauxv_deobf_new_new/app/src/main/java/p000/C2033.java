package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᤝᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2033 extends ClassLoader {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static C2033 f6771;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f6772;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f6773;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2033(ClassLoader classLoader, int i) {
        super(classLoader);
        this.f6772 = i;
        switch (i) {
            case 1:
                super(classLoader);
                this.f6773 = new ConcurrentHashMap();
                break;
            default:
                this.f6773 = classLoader;
                break;
        }
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        switch (this.f6772) {
            case 1:
                Class cls = (Class) ((ConcurrentHashMap) this.f6773).get(str);
                if (cls != null) {
                    return cls;
                }
                throw new ClassNotFoundException(str);
            default:
                return super.findClass(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.f6772) {
            case 0:
                try {
                    Class<?> clsLoadClass = ((ClassLoader) this.f6773).loadClass(str);
                    if (clsLoadClass != null) {
                        return clsLoadClass;
                    }
                } catch (Throwable unused) {
                }
                return super.loadClass(str, z);
            default:
                return super.loadClass(str, z);
        }
    }
}

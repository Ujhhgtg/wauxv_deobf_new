package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2003 extends ClassLoader {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C2003 f6671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ClassLoader f6672;

    public C2003(ClassLoader classLoader) {
        super(classLoader);
        this.f6672 = classLoader;
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        try {
            Class<?> clsLoadClass = this.f6672.loadClass(str);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
        } catch (Throwable unused) {
        }
        return super.loadClass(str, z);
    }
}

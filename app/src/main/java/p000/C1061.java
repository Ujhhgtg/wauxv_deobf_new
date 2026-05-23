package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᤞᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1061 extends C0479 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C1061 f3846;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C0491 f3847;

    @Override // p000.C0479, java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        AbstractC0488 abstractC0488M1725 = this.f3847.m1725(str);
        return abstractC0488M1725 != null ? AbstractC0499.m1744(str, abstractC0488M1725.mo1723(str)) : super.findClass(str);
    }

    public final String toString() {
        return super.toString() + "for files: " + this.f3847;
    }
}

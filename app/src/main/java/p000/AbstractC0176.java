package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0918 f1212 = C0918.m2431(C3448.m4961("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C0918 f1213 = C0918.m2431(C3448.m4961("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0918 f1214 = C0918.m2431(C3448.m4961("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0918 f1215 = C0918.m2431(C3448.m4961("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0918 f1216 = C0918.m2431(C3448.m4961("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0918 f1217 = C0918.m2431(C3448.m4961("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0918 f1218 = C0918.m2431(C3448.m4961("Ldalvik/annotation/SourceDebugExtension;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0918 f1219 = C0918.m2431(C3448.m4961("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0917 f1220 = new C0917("accessFlags");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0917 f1221 = new C0917("name");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C0917 f1222 = new C0917("value");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C0890 m1226(InterfaceC3454 interfaceC3454) {
        int size = interfaceC3454.size();
        C0889 c0889 = new C0889(size);
        for (int i = 0; i < size; i++) {
            c0889.m3063(i, C0918.m2431(interfaceC3454.getType(i)));
        }
        c0889.f6944 = false;
        return new C0890(c0889);
    }
}

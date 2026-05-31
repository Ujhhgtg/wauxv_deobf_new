package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0184 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C0917 f1280 = C0917.m2548(C3505.m5023("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C0917 f1281 = C0917.m2548(C3505.m5023("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0917 f1282 = C0917.m2548(C3505.m5023("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final C0917 f1283 = C0917.m2548(C3505.m5023("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0917 f1284 = C0917.m2548(C3505.m5023("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0917 f1285 = C0917.m2548(C3505.m5023("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0917 f1286 = C0917.m2548(C3505.m5023("Ldalvik/annotation/SourceDebugExtension;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C0917 f1287 = C0917.m2548(C3505.m5023("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final C0916 f1288 = new C0916("accessFlags");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final C0916 f1289 = new C0916("name");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C0916 f1290 = new C0916("value");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C0889 m1372(InterfaceC3510 interfaceC3510) {
        int size = interfaceC3510.size();
        C0888 c0888 = new C0888(size);
        for (int i = 0; i < size; i++) {
            c0888.m3166(i, C0917.m2548(interfaceC3510.getType(i)));
        }
        c0888.f7068 = false;
        return new C0889(c0888);
    }
}

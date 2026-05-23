package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0176 {

    public static final C0918 f1212 = C0918.m2431(C3448.m4961("Ldalvik/annotation/AnnotationDefault;"));

    public static final C0918 f1213 = C0918.m2431(C3448.m4961("Ldalvik/annotation/EnclosingClass;"));

    public static final C0918 f1214 = C0918.m2431(C3448.m4961("Ldalvik/annotation/EnclosingMethod;"));

    public static final C0918 f1215 = C0918.m2431(C3448.m4961("Ldalvik/annotation/InnerClass;"));

    public static final C0918 f1216 = C0918.m2431(C3448.m4961("Ldalvik/annotation/MemberClasses;"));

    public static final C0918 f1217 = C0918.m2431(C3448.m4961("Ldalvik/annotation/Signature;"));

    public static final C0918 f1218 = C0918.m2431(C3448.m4961("Ldalvik/annotation/SourceDebugExtension;"));

    public static final C0918 f1219 = C0918.m2431(C3448.m4961("Ldalvik/annotation/Throws;"));

    public static final C0917 f1220 = new C0917("accessFlags");

    public static final C0917 f1221 = new C0917("name");

    public static final C0917 f1222 = new C0917("value");

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

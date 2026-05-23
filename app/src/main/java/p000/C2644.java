package p000;

import bsh.AbstractC0009;
import bsh.AbstractC0010;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᛸᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2644 extends C3523 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f8538 = 0;

    public C2644(String str) {
        super(AbstractC2784.m4757("SecurityError: ", str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m4640(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Object[] objArr2 = AbstractC0009.f516;
            Class clsM419 = AbstractC0010.m419(obj, false);
            strArr[i] = clsM419 != null ? clsM419.getTypeName() : "null";
        }
        return String.join(", ", strArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C2644 m4641(Class cls, Object[] objArr) {
        return new C2644("Can't call this construct using reflection: new " + cls.getName() + "(" + m4640(objArr) + ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C2644 m4642(Object obj, String str) {
        return new C2644("Can't get this field using reflection: " + obj.getClass().getTypeName() + "." + str);
    }

    @Override // p000.C3523
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1229 mo4643(InterfaceC2225 interfaceC2225, C0550 c0550) {
        return new C1229(getMessage(), interfaceC2225, c0550);
    }

    @Override // p000.C3523
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1229 mo4644(String str, InterfaceC2225 interfaceC2225, C0550 c0550) {
        return new C1229(getMessage(), interfaceC2225, c0550);
    }
}

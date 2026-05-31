package p000;

import bsh.AbstractC0016;
import bsh.AbstractC0017;
import bsh.Node;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤞᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2705 extends C3581 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f8703 = 0;

    public C2705(String str) {
        super(AbstractC2844.m4790("SecurityError: ", str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m4674(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Object[] objArr2 = AbstractC0016.f568;
            Class clsM563 = AbstractC0017.m563(obj, false);
            strArr[i] = clsM563 != null ? clsM563.getTypeName() : "null";
        }
        return String.join(", ", strArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C2705 m4675(Class cls, Object[] objArr) {
        return new C2705("Can't call this construct using reflection: new " + cls.getName() + "(" + m4674(objArr) + ")");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C2705 m4676(Object obj, String str) {
        return new C2705("Can't get this field using reflection: " + obj.getClass().getTypeName() + "." + str);
    }

    @Override // p000.C3581
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C1231 mo4677(Node node, C0527 c0527) {
        return new C1231(getMessage(), node, c0527);
    }

    @Override // p000.C3581
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1231 mo4678(String str, Node node, C0527 c0527) {
        return new C1231(getMessage(), node, c0527);
    }
}

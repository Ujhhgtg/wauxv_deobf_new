package p000;

import java.util.Iterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᤞᲇᛸᲁ[], still in use, count: 1, list:
  (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᤞᲇᛸᲁ[]) from 0x003c: CONSTRUCTOR (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᤞᲇᛸᲁ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᲀᤞᲇ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᤞᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2434 {
    INVALID(-1),
    VARINT(0),
    i64(1),
    SIZE_DELIMITED(2),
    i32(5);


    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final EnumC2434[] f7727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ C1225 f7734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f7735;

    static {
        Object next;
        f7734 = new C1225(enumC2434Arr);
        EnumC2434[] enumC2434Arr = new EnumC2434[8];
        for (int i = 0; i < 8; i++) {
            Iterator it = f7734.iterator();
            do {
                C0060 c0060 = (C0060) it;
                if (!c0060.hasNext()) {
                    next = null;
                    break;
                }
                next = c0060.next();
            } while (((EnumC2434) next).f7735 != i);
            EnumC2434 enumC2434 = (EnumC2434) next;
            if (enumC2434 == null) {
                enumC2434 = INVALID;
            }
            enumC2434Arr[i] = enumC2434;
        }
        f7727 = enumC2434Arr;
    }

    public EnumC2434(int i) {
        super(str, i);
        this.f7735 = i;
    }

    public static EnumC2434 valueOf(String str) {
        return (EnumC2434) Enum.valueOf(EnumC2434.class, str);
    }

    public static EnumC2434[] values() {
        return (EnumC2434[]) f7733.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return AbstractC2784.m4750(sb, this.f7735, ')');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m4388(int i) {
        return (i << 3) | this.f7735;
    }
}

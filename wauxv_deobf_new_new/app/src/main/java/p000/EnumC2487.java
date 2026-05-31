package p000;

import java.util.Iterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲁᲇᛸᲈ[], still in use, count: 1, list:
  (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲁᲇᛸᲈ[]) from 0x003c: CONSTRUCTOR (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲁᲇᛸᲈ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᤞᲀᛸ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲁᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2487 {
    INVALID(-1),
    VARINT(0),
    i64(1),
    SIZE_DELIMITED(2),
    i32(5);


    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final EnumC2487[] f7871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ C1227 f7878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f7879;

    static {
        Object next;
        f7878 = new C1227(enumC2487Arr);
        EnumC2487[] enumC2487Arr = new EnumC2487[8];
        for (int i = 0; i < 8; i++) {
            Iterator it = f7878.iterator();
            do {
                C0067 c0067 = (C0067) it;
                if (!c0067.hasNext()) {
                    next = null;
                    break;
                }
                next = c0067.next();
            } while (((EnumC2487) next).f7879 != i);
            EnumC2487 enumC2487 = (EnumC2487) next;
            if (enumC2487 == null) {
                enumC2487 = INVALID;
            }
            enumC2487Arr[i] = enumC2487;
        }
        f7871 = enumC2487Arr;
    }

    public EnumC2487(int i) {
        super(str, i);
        this.f7879 = i;
    }

    public static EnumC2487 valueOf(String str) {
        return (EnumC2487) Enum.valueOf(EnumC2487.class, str);
    }

    public static EnumC2487[] values() {
        return (EnumC2487[]) f7877.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append('(');
        return AbstractC2844.m4784(sb, this.f7879, ')');
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int m4409(int i) {
        return (i << 3) | this.f7879;
    }
}

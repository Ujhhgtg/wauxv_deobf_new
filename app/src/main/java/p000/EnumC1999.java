package p000;

import com.umeng.analytics.pro.bc;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᲁᛸᲈ[], still in use, count: 1, list:
  (r0v1 ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᲁᛸᲈ[]) from 0x0084: CONSTRUCTOR (r0v1 ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲀᲁᛸᲈ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:133) call: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᲀᤞᲇ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1999 {
    PUBLIC(1),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(2),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(4),
    STATIC(8),
    FINAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    SYNCHRONIZED(32),
    /* JADX INFO: Fake field, exist only in values array */
    VOLATILE(64),
    /* JADX INFO: Fake field, exist only in values array */
    TRANSIENT(128),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE(bc.e),
    /* JADX INFO: Fake field, exist only in values array */
    INTERFACE(512),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(1024),
    /* JADX INFO: Fake field, exist only in values array */
    STRICT(2048);


    public static final /* synthetic */ C1225 f6663;

    public final int f6664;

    static {
        f6663 = new C1225(enumC1999Arr);
    }

    public EnumC1999(int i) {
        super(str, i);
        this.f6664 = i;
    }

    public static EnumC1999 valueOf(String str) {
        return (EnumC1999) Enum.valueOf(EnumC1999.class, str);
    }

    public static EnumC1999[] values() {
        return (EnumC1999[]) f6662.clone();
    }
}

package p000;

import com.umeng.analytics.pro.bc;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᤝᲁᛸᲈ[], still in use, count: 1, list:
  (r0v1 ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᤝᲁᛸᲈ[]) from 0x0084: CONSTRUCTOR (r0v1 ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᤝᲁᛸᲈ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:133) call: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᤞᲀᛸ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᲀᤝᲁᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2030 {
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


    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ C1227 f6768;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f6769;

    static {
        f6768 = new C1227(enumC2030Arr);
    }

    public EnumC2030(int i) {
        super(str, i);
        this.f6769 = i;
    }

    public static EnumC2030 valueOf(String str) {
        return (EnumC2030) Enum.valueOf(EnumC2030.class, str);
    }

    public static EnumC2030[] values() {
        return (EnumC2030[]) f6767.clone();
    }
}

package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᲁᲀᤞ[], still in use, count: 1, list:
  (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᲁᲀᤞ[]) from 0x0038: CONSTRUCTOR (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᲁᲀᤞ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᛸᲀᤞᲇ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤝᲈᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3672 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ C1225 f11466;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final char f11467;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final char f11468;

    static {
        f11466 = new C1225(enumC3672Arr);
    }

    public EnumC3672(char c, char c2) {
        super(str, i);
        this.f11467 = c;
        this.f11468 = c2;
    }

    public static EnumC3672 valueOf(String str) {
        return (EnumC3672) Enum.valueOf(EnumC3672.class, str);
    }

    public static EnumC3672[] values() {
        return (EnumC3672[]) f11465.clone();
    }
}

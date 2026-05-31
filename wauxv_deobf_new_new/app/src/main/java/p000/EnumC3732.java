package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤝᲈᤞᲀ[], still in use, count: 1, list:
  (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤝᲈᤞᲀ[]) from 0x0038: CONSTRUCTOR (r0v1 ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤝᲈᤞᲀ[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᲈᤞᲀᛸ.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᤝᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3732 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ C1227 f11615;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final char f11616;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final char f11617;

    static {
        f11615 = new C1227(enumC3732Arr);
    }

    public EnumC3732(char c, char c2) {
        super(str, i);
        this.f11616 = c;
        this.f11617 = c2;
    }

    public static EnumC3732 valueOf(String str) {
        return (EnumC3732) Enum.valueOf(EnumC3732.class, str);
    }

    public static EnumC3732[] values() {
        return (EnumC3732[]) f11614.clone();
    }
}

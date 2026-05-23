package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᲈᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2588 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f8194;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public String f8195;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public Object f8196;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0351 f8197;

    public final String toString() {
        String strM2779;
        StringBuilder sb = new StringBuilder("ReturnControl: ");
        int i = this.f8194;
        if (i == 13) {
            strM2779 = "BREAK ";
        } else if (i == 49) {
            strM2779 = "RETURN ";
        } else {
            strM2779 = i == 20 ? "CONTINUE " : AbstractC1194.m2779(i, "DUNNO?? ");
        }
        sb.append(strM2779);
        sb.append(this.f8195);
        sb.append(": from: ");
        sb.append(this.f8197);
        return sb.toString();
    }
}

package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲇᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2254 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC2254 f7333 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public AbstractC2254 f7334 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public AbstractC2254 f7335 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public AbstractC2254 f7336 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public AbstractC2254 f7337 = null;

    public final String toString() {
        return getClass().getSimpleName() + "{" + mo3507() + "}";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract void mo1741(C2136 c2136);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4272(AbstractC2254 abstractC2254) {
        abstractC2254.m4273();
        abstractC2254.mo1739(this);
        AbstractC2254 abstractC2255 = this.f7335;
        if (abstractC2255 == null) {
            this.f7334 = abstractC2254;
            this.f7335 = abstractC2254;
        } else {
            abstractC2255.f7337 = abstractC2254;
            abstractC2254.f7336 = abstractC2255;
            this.f7335 = abstractC2254;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public AbstractC2254 mo1738() {
        return this.f7333;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo1739(AbstractC2254 abstractC2254) {
        this.f7333 = abstractC2254;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public String mo3507() {
        return "";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4273() {
        AbstractC2254 abstractC2254 = this.f7336;
        if (abstractC2254 != null) {
            abstractC2254.f7337 = this.f7337;
        } else {
            AbstractC2254 abstractC2255 = this.f7333;
            if (abstractC2255 != null) {
                abstractC2255.f7334 = this.f7337;
            }
        }
        AbstractC2254 abstractC2256 = this.f7337;
        if (abstractC2256 != null) {
            abstractC2256.f7336 = abstractC2254;
        } else {
            AbstractC2254 abstractC2257 = this.f7333;
            if (abstractC2257 != null) {
                abstractC2257.f7335 = abstractC2254;
            }
        }
        this.f7333 = null;
        this.f7337 = null;
        this.f7336 = null;
    }
}

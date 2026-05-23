package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᲇᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2224 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public AbstractC2224 f7218 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public AbstractC2224 f7219 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public AbstractC2224 f7220 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public AbstractC2224 f7221 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public AbstractC2224 f7222 = null;

    public final String toString() {
        return getClass().getSimpleName() + "{" + mo3343() + "}";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract void mo1635(C2103 c2103);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m4143(AbstractC2224 abstractC2224) {
        abstractC2224.m4144();
        abstractC2224.mo1633(this);
        AbstractC2224 abstractC2225 = this.f7220;
        if (abstractC2225 == null) {
            this.f7219 = abstractC2224;
            this.f7220 = abstractC2224;
        } else {
            abstractC2225.f7222 = abstractC2224;
            abstractC2224.f7221 = abstractC2225;
            this.f7220 = abstractC2224;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public AbstractC2224 mo1632() {
        return this.f7218;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo1633(AbstractC2224 abstractC2224) {
        this.f7218 = abstractC2224;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public String mo3343() {
        return "";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m4144() {
        AbstractC2224 abstractC2224 = this.f7221;
        if (abstractC2224 != null) {
            abstractC2224.f7222 = this.f7222;
        } else {
            AbstractC2224 abstractC2225 = this.f7218;
            if (abstractC2225 != null) {
                abstractC2225.f7219 = this.f7222;
            }
        }
        AbstractC2224 abstractC2226 = this.f7222;
        if (abstractC2226 != null) {
            abstractC2226.f7221 = abstractC2224;
        } else {
            AbstractC2224 abstractC2227 = this.f7218;
            if (abstractC2227 != null) {
                abstractC2227.f7220 = abstractC2224;
            }
        }
        this.f7218 = null;
        this.f7222 = null;
        this.f7221 = null;
    }
}

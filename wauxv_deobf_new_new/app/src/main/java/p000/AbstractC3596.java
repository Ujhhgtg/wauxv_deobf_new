package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᲀᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3596 extends AbstractC3595 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2380[] f11238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f11239;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f11240;

    public AbstractC3596() {
        this.f11238 = null;
        this.f11240 = 0;
    }

    public C2380[] getPathData() {
        return this.f11238;
    }

    public String getPathName() {
        return this.f11239;
    }

    public void setPathData(C2380[] c2380Arr) {
        if (!AbstractC1471.m3377(this.f11238, c2380Arr)) {
            this.f11238 = AbstractC1471.m3381(c2380Arr);
            return;
        }
        C2380[] c2380Arr2 = this.f11238;
        for (int i = 0; i < c2380Arr.length; i++) {
            c2380Arr2[i].f7640 = c2380Arr[i].f7640;
            int i2 = 0;
            while (true) {
                float[] fArr = c2380Arr[i].f7641;
                if (i2 < fArr.length) {
                    c2380Arr2[i].f7641[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC3596(AbstractC3596 abstractC3596) {
        this.f11238 = null;
        this.f11240 = 0;
        this.f11239 = abstractC3596.f11239;
        this.f11238 = AbstractC1471.m3381(abstractC3596.f11238);
    }
}

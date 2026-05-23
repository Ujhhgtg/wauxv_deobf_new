package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤞᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3538 extends AbstractC3537 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C2341[] f11089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public String f11090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f11091;

    public AbstractC3538() {
        this.f11089 = null;
        this.f11091 = 0;
    }

    public C2341[] getPathData() {
        return this.f11089;
    }

    public String getPathName() {
        return this.f11090;
    }

    public void setPathData(C2341[] c2341Arr) {
        if (!AbstractC3681.m5316(this.f11089, c2341Arr)) {
            this.f11089 = AbstractC3681.m5321(c2341Arr);
            return;
        }
        C2341[] c2341Arr2 = this.f11089;
        for (int i = 0; i < c2341Arr.length; i++) {
            c2341Arr2[i].f7527 = c2341Arr[i].f7527;
            int i2 = 0;
            while (true) {
                float[] fArr = c2341Arr[i].f7528;
                if (i2 < fArr.length) {
                    c2341Arr2[i].f7528[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC3538(AbstractC3538 abstractC3538) {
        this.f11089 = null;
        this.f11091 = 0;
        this.f11090 = abstractC3538.f11090;
        this.f11089 = AbstractC3681.m5321(abstractC3538.f11089);
    }
}

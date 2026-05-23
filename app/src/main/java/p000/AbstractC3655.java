package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3655 {

    public final C3669 f11424;

    public C1646[] f11425;

    public final Rect[][] f11426;

    public final Rect[][] f11427;

    public AbstractC3655() {
        this(new C3669());
    }

    public final void m5253() {
        C1646[] c1646Arr = this.f11425;
        if (c1646Arr != null) {
            C1646 c1646Mo5265 = c1646Arr[0];
            C1646 c1646Mo5266 = c1646Arr[1];
            C3669 c3669 = this.f11424;
            if (c1646Mo5266 == null) {
                c1646Mo5266 = c3669.f11452.mo5265(2);
            }
            if (c1646Mo5265 == null) {
                c1646Mo5265 = c3669.f11452.mo5265(1);
            }
            mo5247(C1646.m3374(c1646Mo5265, c1646Mo5266));
            C1646 c1646 = this.f11425[AbstractC2665.m4666(16)];
            if (c1646 != null) {
                mo5249(c1646);
            }
            C1646 c1647 = this.f11425[AbstractC2665.m4666(32)];
            if (c1647 != null) {
                mo5248(c1647);
            }
            C1646 c1648 = this.f11425[AbstractC2665.m4666(64)];
            if (c1648 != null) {
                mo5250(c1648);
            }
        }
    }

    public abstract C3669 mo5245();

    public void mo5252(C3669 c3669) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo5263 = c3669.f11452.mo5263(i);
            int iM4666 = AbstractC2665.m4666(i);
            this.f11426[iM4666] = (Rect[]) listMo5263.toArray(new Rect[listMo5263.size()]);
            if (i != 8) {
                List<Rect> listMo5264 = c3669.f11452.mo5264(i);
                this.f11427[iM4666] = (Rect[]) listMo5264.toArray(new Rect[listMo5264.size()]);
            }
        }
    }

    public void mo5251(int i, C1646 c1646) {
        if (this.f11425 == null) {
            this.f11425 = new C1646[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f11425[AbstractC2665.m4666(i2)] = c1646;
            }
        }
    }

    public abstract void mo5246(C1646 c1646);

    public abstract void mo5247(C1646 c1646);

    public AbstractC3655(C3669 c3669) {
        this.f11426 = new Rect[10][];
        this.f11427 = new Rect[10][];
        this.f11424 = c3669;
        mo5252(c3669);
    }

    public void mo5248(C1646 c1646) {
    }

    public void mo5249(C1646 c1646) {
    }

    public void mo5250(C1646 c1646) {
    }
}

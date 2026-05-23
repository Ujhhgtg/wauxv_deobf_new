package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Field;
import java.util.Comparator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0171 implements Comparator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1202;

    public /* synthetic */ C0171(int i) {
        this.f1202 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1202) {
            case 0:
                int iM3345 = ((C0172) obj).f1205.m3345();
                int iM3346 = ((C0172) obj2).f1205.m3345();
                if (iM3345 < iM3346) {
                    return -1;
                }
                return iM3345 > iM3346 ? 1 : 0;
            case 1:
                Field field = AbstractC3578.f11184;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 2:
                return AbstractC1574.m3291(((AbstractC1557) obj).getClass().getSimpleName(), ((AbstractC1557) obj2).getClass().getSimpleName());
            case 3:
                return ((C2382) obj).f7642 - ((C2382) obj2).f7642;
            case 4:
                return ((C1827) obj).f6112.f8055 - ((C1827) obj2).f6112.f8055;
            case 5:
                return AbstractC1574.m3291(((C0698) obj).f2649, ((C0698) obj2).f2649);
            case 6:
                return AbstractC1574.m3291(((C1974) obj).f6546, ((C1974) obj2).f6546);
            case 7:
                return AbstractC1574.m3291(Integer.valueOf(((C1357) obj).f4853), Integer.valueOf(((C1357) obj2).f4853));
            case 8:
                C1440 c1440 = (C1440) obj;
                C1440 c1441 = (C1440) obj2;
                RecyclerView recyclerView = c1440.f5102;
                if ((recyclerView == null) == (c1441.f5102 == null)) {
                    boolean z3 = c1440.f5099;
                    if (z3 == c1441.f5099) {
                        int i = c1441.f5100 - c1440.f5100;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = c1440.f5101 - c1441.f5101;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 9:
                return AbstractC1574.m3291(Integer.valueOf(((C1484) obj).f5260), Integer.valueOf(((C1484) obj2).f5260));
            case 10:
                return ((AbstractC2270) obj).mo1222().compareTo(((AbstractC2270) obj2).mo1222());
            case 11:
                return ((C2785) obj).f8886 - ((C2785) obj2).f8886;
            case Opcodes.FCONST_1 /* 12 */:
                return AbstractC1574.m3291(((C2355) obj).f7554, ((C2355) obj2).f7554);
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        switch (this.f1202) {
            case 3:
                return obj == this;
            case 4:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }
}

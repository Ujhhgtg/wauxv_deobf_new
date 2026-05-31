package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.Locale;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0179 implements Comparator {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1270;

    public /* synthetic */ C0179(int i) {
        this.f1270 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1270) {
            case 0:
                int iM3509 = ((C0180) obj).f1273.m3509();
                int iM35010 = ((C0180) obj2).f1273.m3509();
                if (iM3509 < iM35010) {
                    return -1;
                }
                return iM3509 > iM35010 ? 1 : 0;
            case 1:
                return AbstractC1272.m3095(Integer.valueOf(((C1496) obj).f5293), Integer.valueOf(((C1496) obj2).f5293));
            case 2:
                return AbstractC1272.m3095(Integer.valueOf(((C1496) obj).f5293), Integer.valueOf(((C1496) obj2).f5293));
            case 3:
                return AbstractC1272.m3095(Integer.valueOf(((C1496) obj).f5293), Integer.valueOf(((C1496) obj2).f5293));
            case 4:
                Field field = AbstractC3638.f11333;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 5:
                return AbstractC1272.m3095(((AbstractC1569) obj).getClass().getSimpleName(), ((AbstractC1569) obj2).getClass().getSimpleName());
            case 6:
                return ((C2435) obj).f7786 - ((C2435) obj2).f7786;
            case 7:
                return ((C1854) obj).f6187.f8205 - ((C1854) obj2).f6187.f8205;
            case 8:
                return AbstractC1272.m3095(((C0694) obj).f2650, ((C0694) obj2).f2650);
            case 9:
                return AbstractC1272.m3095(((C2005) obj).f6651, ((C2005) obj2).f6651);
            case 10:
                return AbstractC1272.m3095(Integer.valueOf(((C1363) obj).f4875), Integer.valueOf(((C1363) obj2).f4875));
            case 11:
                return AbstractC1272.m3095(Integer.valueOf(((C1363) obj).f4875), Integer.valueOf(((C1363) obj2).f4875));
            case Opcodes.FCONST_1 /* 12 */:
                C1448 c1448 = (C1448) obj;
                C1448 c1449 = (C1448) obj2;
                RecyclerView recyclerView = c1448.f5131;
                if ((recyclerView == null) == (c1449.f5131 == null)) {
                    boolean z3 = c1448.f5128;
                    if (z3 == c1449.f5128) {
                        int i = c1449.f5129 - c1448.f5129;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = c1448.f5130 - c1449.f5130;
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
            case 13:
                return AbstractC1272.m3095(Integer.valueOf(((C1496) obj).f5293), Integer.valueOf(((C1496) obj2).f5293));
            case Opcodes.DCONST_0 /* 14 */:
                return ((AbstractC2302) obj).mo1368().compareTo(((AbstractC2302) obj2).mo1368());
            case 15:
                return AbstractC1272.m3095(Integer.valueOf(((C2358) obj).f7583), Integer.valueOf(((C2358) obj2).f7583));
            case 16:
                return AbstractC1272.m3095(Integer.valueOf(((C2358) obj).f7583), Integer.valueOf(((C2358) obj2).f7583));
            case Opcodes.SIPUSH /* 17 */:
                String name = ((File) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                String[] strArr = AbstractC1471.f5234;
                "toLowerCase(...)";
                String lowerCase2 = ((File) obj2).getName().toLowerCase(locale);
                "toLowerCase(...)";
                return AbstractC1272.m3095(lowerCase, lowerCase2);
            case Opcodes.LDC /* 18 */:
                return ((C2845) obj).f9048 - ((C2845) obj2).f9048;
            case 19:
                return AbstractC1272.m3095(((C2400) obj).f7684, ((C2400) obj2).f7684);
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        switch (this.f1270) {
            case 6:
                return obj == this;
            case 7:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }
}

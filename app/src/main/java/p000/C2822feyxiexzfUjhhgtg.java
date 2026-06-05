package p000;

import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2822feyxiexzfUjhhgtg implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8975Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8976Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f8977Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2822feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f8975Ujhhgtgfeyxiexzf = i;
        this.f8976Ujhhgtgfeyxiexzf = obj;
        this.f8977Ujhhgtgfeyxiexzf = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f8975Ujhhgtgfeyxiexzf) {
            case 0:
                C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg = (C2823feyxiexzfUjhhgtg) this.f8976Ujhhgtgfeyxiexzf;
                C2831feyxiexzfUjhhgtg c2831feyxiexzfUjhhgtg = (C2831feyxiexzfUjhhgtg) this.f8977Ujhhgtgfeyxiexzf;
                Set set = (Set) c2823feyxiexzfUjhhgtg.f8980Ujhhgtgfeyxiexzf;
                if (!z) {
                    set.remove(c2831feyxiexzfUjhhgtg.f8998Ujhhgtgfeyxiexzf);
                } else {
                    set.add(c2831feyxiexzfUjhhgtg.f8998Ujhhgtgfeyxiexzf);
                }
                break;
            case 1:
                C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg = (C3663feyxiexzfUjhhgtg) this.f8976Ujhhgtgfeyxiexzf;
                C3662feyxiexzfUjhhgtg c3662feyxiexzfUjhhgtg = (C3662feyxiexzfUjhhgtg) this.f8977Ujhhgtgfeyxiexzf;
                c3663feyxiexzfUjhhgtg.f11660Ujhhgtgfeyxiexzf = z;
                c3662feyxiexzfUjhhgtg.f11656Ujhhgtgfeyxiexzf.m5367Ujhhgtgfeyxiexzf();
                c3662feyxiexzfUjhhgtg.f11656Ujhhgtgfeyxiexzf.m5365Ujhhgtgfeyxiexzf();
                break;
            case 2:
                C3480feyxiexzfUjhhgtg c3480feyxiexzfUjhhgtg = (C3480feyxiexzfUjhhgtg) this.f8976Ujhhgtgfeyxiexzf;
                C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg = (C3476feyxiexzfUjhhgtg) this.f8977Ujhhgtgfeyxiexzf;
                ArrayList arrayList = c3476feyxiexzfUjhhgtg.f10804Ujhhgtgfeyxiexzf;
                int iM2172Ujhhgtgfeyxiexzf = c3480feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                if (iM2172Ujhhgtgfeyxiexzf != -1) {
                    arrayList.set(iM2172Ujhhgtgfeyxiexzf, C3485Ujhhgtgfeyxiexzf.m4972Ujhhgtgfeyxiexzf((C3485Ujhhgtgfeyxiexzf) arrayList.get(iM2172Ujhhgtgfeyxiexzf), 0, z, 31));
                    C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf.getClass();
                    C3613Ujhhgtgfeyxiexzf.m5252feyxiexzfUjhhgtg(arrayList, c3476feyxiexzfUjhhgtg);
                    break;
                }
                break;
            default:
                C1363feyxiexzfUjhhgtg c1363feyxiexzfUjhhgtg = (C1363feyxiexzfUjhhgtg) this.f8976Ujhhgtgfeyxiexzf;
                C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg2 = (C2823feyxiexzfUjhhgtg) this.f8977Ujhhgtgfeyxiexzf;
                int iM2172Ujhhgtgfeyxiexzf2 = c1363feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                if (iM2172Ujhhgtgfeyxiexzf2 != -1) {
                    ArrayList arrayList2 = (ArrayList) c2823feyxiexzfUjhhgtg2.f8979Ujhhgtgfeyxiexzf;
                    arrayList2.set(iM2172Ujhhgtgfeyxiexzf2, C1364feyxiexzfUjhhgtg.m2869Ujhhgtgfeyxiexzf((C1364feyxiexzfUjhhgtg) arrayList2.get(iM2172Ujhhgtgfeyxiexzf2), null, 0, z, 7));
                    c2823feyxiexzfUjhhgtg2.f3111Ujhhgtgfeyxiexzf.m2133Ujhhgtgfeyxiexzf(iM2172Ujhhgtgfeyxiexzf2, 1);
                    ((C1382feyxiexzfUjhhgtg) c2823feyxiexzfUjhhgtg2.f8980Ujhhgtgfeyxiexzf).invoke();
                    break;
                }
                break;
        }
    }
}

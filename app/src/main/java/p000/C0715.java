package p000;

import android.widget.CompoundButton;
import java.util.Set;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0715 implements CompoundButton.OnCheckedChangeListener {

    public final /* synthetic */ int f2719;

    public final /* synthetic */ Object f2720;

    public final /* synthetic */ Object f2721;

    public /* synthetic */ C0715(Object obj, int i, Object obj2) {
        this.f2719 = i;
        this.f2720 = obj;
        this.f2721 = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f2719) {
            case 0:
                C0718 c0718 = (C0718) this.f2720;
                C0719 c0719 = (C0719) this.f2721;
                Set set = (Set) c0718.f2727;
                if (!z) {
                    set.remove(c0719.f2728);
                } else {
                    set.add(c0719.f2728);
                }
                break;
            default:
                C0801 c0801 = (C0801) this.f2720;
                C0800 c0800 = (C0800) this.f2721;
                c0801.f3163 = z;
                c0800.f3159.m2366();
                c0800.f3159.m2364();
                break;
        }
    }
}

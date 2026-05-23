package p000;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0690 implements CompoundButton.OnCheckedChangeListener {

    public final /* synthetic */ int f2575;

    public final /* synthetic */ Object f2576;

    public /* synthetic */ C0690(int i, Object obj) {
        this.f2575 = i;
        this.f2576 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f2575;
        Object obj = this.f2576;
        switch (i) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) obj).f689;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                C2355 c2355 = ((C0396) obj).f1885;
                if (compoundButton.isPressed()) {
                    if (!z) {
                        c2355.m4335(false);
                        ArrayList arrayList = AbstractC2371.f7619;
                        AbstractC2371.m4342(c2355);
                    } else {
                        ArrayList arrayList2 = AbstractC2371.f7619;
                        if (!AbstractC2371.m4341(c2355)) {
                            compoundButton.setChecked(false);
                            c2355.m4335(false);
                            AbstractC2371.m4342(c2355);
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = AbstractC1574.f5469;
                            sb.append("加载[");
                            sb.append(c2355.f7554);
                            sb.append("]失败, 已自动关闭");
                            AbstractC2834.m4823(null, 3, sb.toString());
                        } else {
                            c2355.m4335(true);
                        }
                    }
                    break;
                }
                break;
        }
    }
}

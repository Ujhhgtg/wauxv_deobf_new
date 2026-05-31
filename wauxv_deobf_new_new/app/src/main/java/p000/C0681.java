package p000;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᤝᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0681 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2574;

    public /* synthetic */ C0681(Object obj, int i) {
        this.f2573 = i;
        this.f2574 = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f2573;
        Object obj = this.f2574;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                InterfaceC1944 interfaceC1944 = chip.f749;
                if (interfaceC1944 != null) {
                    C0674 c0674 = (C0674) ((C0102) interfaceC1944).f1117;
                    if (!z ? c0674.m2161(chip, c0674.f2564) : c0674.m2157(chip)) {
                        c0674.m2160();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f748;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                C2400 c2400 = ((C0371) obj).f1856;
                if (compoundButton.isPressed()) {
                    if (!z) {
                        c2400.m4347(false);
                        LinkedHashMap linkedHashMap = AbstractC2419.f7753;
                        AbstractC2419.m4359(c2400);
                    } else {
                        LinkedHashMap linkedHashMap2 = AbstractC2419.f7753;
                        if (!AbstractC2419.m4357(c2400)) {
                            compoundButton.setChecked(false);
                            c2400.m4347(false);
                            AbstractC2419.m4359(c2400);
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = AbstractC1471.f5234;
                            sb.append("加载[");
                            sb.append(c2400.f7684);
                            sb.append("]失败, 已自动关闭");
                            AbstractC2894.m4856(null, 3, sb.toString());
                        } else {
                            c2400.m4347(true);
                        }
                    }
                    break;
                }
                break;
        }
    }
}

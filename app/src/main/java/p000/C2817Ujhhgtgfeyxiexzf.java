package p000;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import java.util.LinkedHashMap;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2817Ujhhgtgfeyxiexzf implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8967Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8968Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2817Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f8967Ujhhgtgfeyxiexzf = i;
        this.f8968Ujhhgtgfeyxiexzf = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.f8967Ujhhgtgfeyxiexzf;
        Object obj = this.f8968Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                InterfaceC0227Ujhhgtgfeyxiexzf interfaceC0227Ujhhgtgfeyxiexzf = chip.f763Ujhhgtgfeyxiexzf;
                if (interfaceC0227Ujhhgtgfeyxiexzf != null) {
                    C2912Ujhhgtgfeyxiexzf c2912Ujhhgtgfeyxiexzf = (C2912Ujhhgtgfeyxiexzf) ((C2965Ujhhgtgfeyxiexzf) interfaceC0227Ujhhgtgfeyxiexzf).f9276Ujhhgtgfeyxiexzf;
                    if (!z ? c2912Ujhhgtgfeyxiexzf.m4284Ujhhgtgfeyxiexzf(chip, c2912Ujhhgtgfeyxiexzf.f9195Ujhhgtgfeyxiexzf) : c2912Ujhhgtgfeyxiexzf.m4280Ujhhgtgfeyxiexzf(chip)) {
                        c2912Ujhhgtgfeyxiexzf.m4283Ujhhgtgfeyxiexzf();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f762Ujhhgtgfeyxiexzf;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
                break;
            default:
                C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg = ((C2489feyxiexzfUjhhgtg) obj).f8126Ujhhgtgfeyxiexzf;
                if (compoundButton.isPressed()) {
                    if (!z) {
                        c1414feyxiexzfUjhhgtg.m2926Ujhhgtgfeyxiexzf(false);
                        LinkedHashMap linkedHashMap = AbstractC1453feyxiexzfUjhhgtg.f5062Ujhhgtgfeyxiexzf;
                        AbstractC1453feyxiexzfUjhhgtg.m2967Ujhhgtgfeyxiexzf(c1414feyxiexzfUjhhgtg);
                    } else {
                        LinkedHashMap linkedHashMap2 = AbstractC1453feyxiexzfUjhhgtg.f5062Ujhhgtgfeyxiexzf;
                        if (!AbstractC1453feyxiexzfUjhhgtg.m2965Ujhhgtgfeyxiexzf(c1414feyxiexzfUjhhgtg)) {
                            compoundButton.setChecked(false);
                            c1414feyxiexzfUjhhgtg.m2926Ujhhgtgfeyxiexzf(false);
                            AbstractC1453feyxiexzfUjhhgtg.m2967Ujhhgtgfeyxiexzf(c1414feyxiexzfUjhhgtg);
                            StringBuilder sb = new StringBuilder();
                            String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                            sb.append("加载[");
                            sb.append(c1414feyxiexzfUjhhgtg.f4968Ujhhgtgfeyxiexzf);
                            sb.append("]失败, 已自动关闭");
                            AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, sb.toString());
                        } else {
                            c1414feyxiexzfUjhhgtg.m2926Ujhhgtgfeyxiexzf(true);
                        }
                    }
                    break;
                }
                break;
        }
    }
}

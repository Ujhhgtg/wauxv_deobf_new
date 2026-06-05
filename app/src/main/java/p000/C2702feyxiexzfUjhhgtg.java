package p000;

import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2702feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8622Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8623Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C0976feyxiexzfUjhhgtg f8624Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0330Ujhhgtgfeyxiexzf f8625Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2702feyxiexzfUjhhgtg(ArrayList arrayList, C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg, C0330Ujhhgtgfeyxiexzf c0330Ujhhgtgfeyxiexzf, int i) {
        this.f8622Ujhhgtgfeyxiexzf = i;
        this.f8623Ujhhgtgfeyxiexzf = arrayList;
        this.f8624Ujhhgtgfeyxiexzf = c0976feyxiexzfUjhhgtg;
        this.f8625Ujhhgtgfeyxiexzf = c0330Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        final C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf = (C0627Ujhhgtgfeyxiexzf) obj;
        switch (this.f8622Ujhhgtgfeyxiexzf) {
            case 0:
                if (c0627Ujhhgtgfeyxiexzf.m1905Ujhhgtgfeyxiexzf() == EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf) {
                    C2726Ujhhgtgfeyxiexzf c2726Ujhhgtgfeyxiexzf = C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf;
                    final ArrayList arrayList = this.f8623Ujhhgtgfeyxiexzf;
                    final C2706feyxiexzfUjhhgtg c2706feyxiexzfUjhhgtg = new C2706feyxiexzfUjhhgtg(arrayList, this.f8624Ujhhgtgfeyxiexzf, this.f8625Ujhhgtgfeyxiexzf, 0);
                    c2726Ujhhgtgfeyxiexzf.getClass();
                    C0580Ujhhgtgfeyxiexzf.f2600Ujhhgtgfeyxiexzf.getClass();
                    final EditText editText = new EditText(C0580Ujhhgtgfeyxiexzf.m1855Ujhhgtgfeyxiexzf());
                    editText.setText(c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf);
                    String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    editText.setHint(MagicFactory.get(4928780297090106762L, strArr));
                    editText.setSelection(editText.getText().length());
                    C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                    c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = MagicFactory.get(4928780413054223754L, strArr);
                    c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = editText;
                    c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928780391579387274L, strArr), new InterfaceC3545feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛲ要点脸ᛱUjhhgtgᛱᛴ
                        @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
                        public final Object invoke() {
                            String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                            String string = AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(editText)).toString();
                            if (string == null) {
                                string = MagicFactory.get(4928778647822665098L, strArr2);
                            }
                            if (string.length() == 0) {
                                AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928778643527697802L, strArr2));
                            } else {
                                ArrayList arrayList2 = arrayList;
                                Iterator it = arrayList2.iterator();
                                int i = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i = -1;
                                        break;
                                    }
                                    C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf2 = (C0627Ujhhgtgfeyxiexzf) it.next();
                                    String str = c0627Ujhhgtgfeyxiexzf2.f2657Ujhhgtgfeyxiexzf;
                                    C0627Ujhhgtgfeyxiexzf c0627Ujhhgtgfeyxiexzf3 = c0627Ujhhgtgfeyxiexzf;
                                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, c0627Ujhhgtgfeyxiexzf3.f2657Ujhhgtgfeyxiexzf) && c0627Ujhhgtgfeyxiexzf2.f2658Ujhhgtgfeyxiexzf == c0627Ujhhgtgfeyxiexzf3.f2658Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0627Ujhhgtgfeyxiexzf2.f2659Ujhhgtgfeyxiexzf, c0627Ujhhgtgfeyxiexzf3.f2659Ujhhgtgfeyxiexzf)) {
                                        break;
                                    }
                                    i++;
                                }
                                if (i < 0) {
                                    AbstractC1150feyxiexzfUjhhgtg.m2621Ujhhgtgfeyxiexzf(null, 3, MagicFactory.get(4928778742311945610L, strArr2));
                                } else {
                                    arrayList2.set(i, C0627Ujhhgtgfeyxiexzf.m1903Ujhhgtgfeyxiexzf((C0627Ujhhgtgfeyxiexzf) arrayList2.get(i), 0, string, 27));
                                    C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf.getClass();
                                    if (C2726Ujhhgtgfeyxiexzf.m4036feyxiexzfUjhhgtg(arrayList2)) {
                                        c2706feyxiexzfUjhhgtg.invoke();
                                    }
                                }
                            }
                            return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                        }
                    });
                    c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928780370104550794L, strArr), new C2712feyxiexzfUjhhgtg(arrayList, c0627Ujhhgtgfeyxiexzf, c2706feyxiexzfUjhhgtg, 0));
                    AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                }
                break;
            default:
                C2726Ujhhgtgfeyxiexzf c2726Ujhhgtgfeyxiexzf2 = C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf;
                C0330Ujhhgtgfeyxiexzf c0330Ujhhgtgfeyxiexzf = this.f8625Ujhhgtgfeyxiexzf;
                C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg = this.f8624Ujhhgtgfeyxiexzf;
                ArrayList arrayList2 = this.f8623Ujhhgtgfeyxiexzf;
                C2706feyxiexzfUjhhgtg c2706feyxiexzfUjhhgtg2 = new C2706feyxiexzfUjhhgtg(c0330Ujhhgtgfeyxiexzf, c0976feyxiexzfUjhhgtg, arrayList2);
                c2726Ujhhgtgfeyxiexzf2.getClass();
                C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = MagicFactory.get(4928780486068667786L, strArr2);
                c0290Ujhhgtgfeyxiexzf2.f1722Ujhhgtgfeyxiexzf = MagicFactory.get(4928780464593831306L, strArr2) + c0627Ujhhgtgfeyxiexzf.f2659Ujhhgtgfeyxiexzf + MagicFactory.get(4928780438824027530L, strArr2);
                c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928780559083111818L, strArr2), new C2712feyxiexzfUjhhgtg(arrayList2, c2706feyxiexzfUjhhgtg2, c0627Ujhhgtgfeyxiexzf));
                AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                break;
        }
        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
    }
}

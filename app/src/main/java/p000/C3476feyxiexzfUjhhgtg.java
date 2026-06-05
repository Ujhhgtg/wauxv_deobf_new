package p000;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3476feyxiexzfUjhhgtg extends AbstractC0795feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f10804Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3472Ujhhgtgfeyxiexzf f10805Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0530Ujhhgtgfeyxiexzf f10806Ujhhgtgfeyxiexzf;

    public C3476feyxiexzfUjhhgtg(ArrayList arrayList, C3472Ujhhgtgfeyxiexzf c3472Ujhhgtgfeyxiexzf, C0530Ujhhgtgfeyxiexzf c0530Ujhhgtgfeyxiexzf) {
        this.f10804Ujhhgtgfeyxiexzf = arrayList;
        this.f10805Ujhhgtgfeyxiexzf = c3472Ujhhgtgfeyxiexzf;
        this.f10806Ujhhgtgfeyxiexzf = c0530Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2134Ujhhgtgfeyxiexzf() {
        return this.f10804Ujhhgtgfeyxiexzf.size();
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2139Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i) {
        final C3480feyxiexzfUjhhgtg c3480feyxiexzfUjhhgtg = (C3480feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg;
        C3485Ujhhgtgfeyxiexzf c3485Ujhhgtgfeyxiexzf = (C3485Ujhhgtgfeyxiexzf) this.f10804Ujhhgtgfeyxiexzf.get(i);
        c3480feyxiexzfUjhhgtg.f10811Ujhhgtgfeyxiexzf.setText(c3485Ujhhgtgfeyxiexzf.f10820Ujhhgtgfeyxiexzf);
        c3480feyxiexzfUjhhgtg.f10812Ujhhgtgfeyxiexzf.setText(c3485Ujhhgtgfeyxiexzf.f10823Ujhhgtgfeyxiexzf + " | " + c3485Ujhhgtgfeyxiexzf.f10824Ujhhgtgfeyxiexzf);
        MaterialCheckBox materialCheckBox = c3480feyxiexzfUjhhgtg.f10813Ujhhgtgfeyxiexzf;
        materialCheckBox.setOnCheckedChangeListener(null);
        materialCheckBox.setChecked(c3485Ujhhgtgfeyxiexzf.f10825Ujhhgtgfeyxiexzf);
        materialCheckBox.setOnCheckedChangeListener(new C2822feyxiexzfUjhhgtg(c3480feyxiexzfUjhhgtg, 2, this));
        final int i2 = 0;
        c3480feyxiexzfUjhhgtg.f10814Ujhhgtgfeyxiexzf.setOnClickListener(new View.OnClickListener() { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, IOException, InvocationTargetException {
                switch (i2) {
                    case 0:
                        int iM2172Ujhhgtgfeyxiexzf = c3480feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                        if (iM2172Ujhhgtgfeyxiexzf != -1) {
                            C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg = this;
                            c3476feyxiexzfUjhhgtg.f10805Ujhhgtgfeyxiexzf.invoke(c3476feyxiexzfUjhhgtg.f10804Ujhhgtgfeyxiexzf.get(iM2172Ujhhgtgfeyxiexzf));
                            break;
                        }
                        break;
                    default:
                        int iM2172Ujhhgtgfeyxiexzf2 = c3480feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                        if (iM2172Ujhhgtgfeyxiexzf2 != -1) {
                            C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg2 = this;
                            c3476feyxiexzfUjhhgtg2.f10806Ujhhgtgfeyxiexzf.invoke(c3476feyxiexzfUjhhgtg2.f10804Ujhhgtgfeyxiexzf.get(iM2172Ujhhgtgfeyxiexzf2));
                            break;
                        }
                        break;
                }
            }
        });
        final int i3 = 1;
        c3480feyxiexzfUjhhgtg.f10815feyxiexzfUjhhgtg.setOnClickListener(new View.OnClickListener() { // from class: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛴᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, IOException, InvocationTargetException {
                switch (i3) {
                    case 0:
                        int iM2172Ujhhgtgfeyxiexzf = c3480feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                        if (iM2172Ujhhgtgfeyxiexzf != -1) {
                            C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg = this;
                            c3476feyxiexzfUjhhgtg.f10805Ujhhgtgfeyxiexzf.invoke(c3476feyxiexzfUjhhgtg.f10804Ujhhgtgfeyxiexzf.get(iM2172Ujhhgtgfeyxiexzf));
                            break;
                        }
                        break;
                    default:
                        int iM2172Ujhhgtgfeyxiexzf2 = c3480feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
                        if (iM2172Ujhhgtgfeyxiexzf2 != -1) {
                            C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg2 = this;
                            c3476feyxiexzfUjhhgtg2.f10806Ujhhgtgfeyxiexzf.invoke(c3476feyxiexzfUjhhgtg2.f10804Ujhhgtgfeyxiexzf.get(iM2172Ujhhgtgfeyxiexzf2));
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final AbstractC0821feyxiexzfUjhhgtg mo2141Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int i) {
        return new C3480feyxiexzfUjhhgtg(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(viewGroup.getContext()).inflate(R.layout.item_float_action_button_menu, viewGroup, false));
    }
}

package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import de.robv.android.xposed.XposedBridge;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3662feyxiexzfUjhhgtg extends AbstractC0795feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public List f11655Ujhhgtgfeyxiexzf = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3677feyxiexzfUjhhgtg f11656Ujhhgtgfeyxiexzf;

    public C3662feyxiexzfUjhhgtg(C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg) {
        this.f11656Ujhhgtgfeyxiexzf = c3677feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static void m5358Ujhhgtgfeyxiexzf(C3662feyxiexzfUjhhgtg c3662feyxiexzfUjhhgtg, List list) {
        c3662feyxiexzfUjhhgtg.getClass();
        if (list == null) {
            list = C3312feyxiexzfUjhhgtg.f10349Ujhhgtgfeyxiexzf;
        }
        c3662feyxiexzfUjhhgtg.f11655Ujhhgtgfeyxiexzf = list;
        c3662feyxiexzfUjhhgtg.m2137Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2134Ujhhgtgfeyxiexzf() {
        return this.f11655Ujhhgtgfeyxiexzf.size();
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final long mo2135Ujhhgtgfeyxiexzf(int i) {
        return i;
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2139Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i) {
        if (abstractC0821feyxiexzfUjhhgtg instanceof C1123feyxiexzfUjhhgtg) {
            C0420Ujhhgtgfeyxiexzf.m1731Ujhhgtgfeyxiexzf(((C1123feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg).f4235Ujhhgtgfeyxiexzf);
        } else {
            m5359Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, AbstractC2856feyxiexzfUjhhgtg.m4240feyxiexzfUjhhgtg(i, this.f11655Ujhhgtgfeyxiexzf));
        }
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo2140Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i, List list) {
        if (list.isEmpty()) {
            mo2139Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, i);
        } else if (abstractC0821feyxiexzfUjhhgtg instanceof C1123feyxiexzfUjhhgtg) {
            C0420Ujhhgtgfeyxiexzf.m1731Ujhhgtgfeyxiexzf(((C1123feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg).f4235Ujhhgtgfeyxiexzf);
        } else {
            m5359Ujhhgtgfeyxiexzf(abstractC0821feyxiexzfUjhhgtg, AbstractC2856feyxiexzfUjhhgtg.m4240feyxiexzfUjhhgtg(i, this.f11655Ujhhgtgfeyxiexzf));
        }
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final AbstractC0821feyxiexzfUjhhgtg mo2141Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int i) {
        return i == R.id.BaseQuickAdapter_empty_view ? new C1123feyxiexzfUjhhgtg(viewGroup) : new C0781feyxiexzfUjhhgtg(AbstractC0615Ujhhgtgfeyxiexzf.m1881Ujhhgtgfeyxiexzf(viewGroup.getContext()).inflate(R.layout.item_rv_contact, viewGroup, false));
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ */
    public final void mo2143Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg) {
        int iM2172Ujhhgtgfeyxiexzf = abstractC0821feyxiexzfUjhhgtg.m2172Ujhhgtgfeyxiexzf();
        if ((abstractC0821feyxiexzfUjhhgtg instanceof C1123feyxiexzfUjhhgtg) || (iM2172Ujhhgtgfeyxiexzf != -1 && iM2172Ujhhgtgfeyxiexzf == R.id.BaseQuickAdapter_empty_view)) {
            View view = abstractC0821feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf;
            if (view.getLayoutParams() instanceof C1140feyxiexzfUjhhgtg) {
                ((C1140feyxiexzfUjhhgtg) view.getLayoutParams()).f4308Ujhhgtgfeyxiexzf = true;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final void m5359Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, Object obj) {
        C0781feyxiexzfUjhhgtg c0781feyxiexzfUjhhgtg = (C0781feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg;
        C3663feyxiexzfUjhhgtg c3663feyxiexzfUjhhgtg = (C3663feyxiexzfUjhhgtg) obj;
        if (c3663feyxiexzfUjhhgtg != null) {
            CheckBox checkBox = (CheckBox) c0781feyxiexzfUjhhgtg.m2095Ujhhgtgfeyxiexzf(R.id.itemContactCheckBoxSelect);
            checkBox.setChecked(c3663feyxiexzfUjhhgtg.f11660Ujhhgtgfeyxiexzf);
            checkBox.setOnCheckedChangeListener(new C2822feyxiexzfUjhhgtg(c3663feyxiexzfUjhhgtg, 1, this));
            c0781feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(3, c0781feyxiexzfUjhhgtg));
            C2443feyxiexzfUjhhgtg c2443feyxiexzfUjhhgtg = C2443feyxiexzfUjhhgtg.f7908Ujhhgtgfeyxiexzf;
            ImageView imageView = (ImageView) c0781feyxiexzfUjhhgtg.m2095Ujhhgtgfeyxiexzf(R.id.itemContactImageViewAvatar);
            String str = c3663feyxiexzfUjhhgtg.f11657Ujhhgtgfeyxiexzf;
            c2443feyxiexzfUjhhgtg.getClass();
            XposedBridge.invokeOriginalMethod(AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C2444feyxiexzfUjhhgtg.f7909Ujhhgtgfeyxiexzf), (Object) null, new Object[]{imageView, str, Float.valueOf(0.1f), Boolean.FALSE});
            ((TextView) c0781feyxiexzfUjhhgtg.m2095Ujhhgtgfeyxiexzf(R.id.itemContactTextViewName)).setText(c3663feyxiexzfUjhhgtg.f11658Ujhhgtgfeyxiexzf);
            ((TextView) c0781feyxiexzfUjhhgtg.m2095Ujhhgtgfeyxiexzf(R.id.itemContactTextViewDesc)).setText(c3663feyxiexzfUjhhgtg.f11659Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final void mo2142Ujhhgtgfeyxiexzf() {
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo2136Ujhhgtgfeyxiexzf(int i) {
        return i;
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo2138Ujhhgtgfeyxiexzf(RecyclerView recyclerView) {
    }
}

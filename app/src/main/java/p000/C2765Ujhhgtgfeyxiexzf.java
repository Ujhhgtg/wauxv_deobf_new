package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛴᛲ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2765Ujhhgtgfeyxiexzf extends AbstractC0795feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ArrayList f8758Ujhhgtgfeyxiexzf = new ArrayList();

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2134Ujhhgtgfeyxiexzf() {
        return this.f8758Ujhhgtgfeyxiexzf.size();
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2139Ujhhgtgfeyxiexzf(AbstractC0821feyxiexzfUjhhgtg abstractC0821feyxiexzfUjhhgtg, int i) {
        C2757feyxiexzfUjhhgtg c2757feyxiexzfUjhhgtg = (C2757feyxiexzfUjhhgtg) abstractC0821feyxiexzfUjhhgtg;
        C2755feyxiexzfUjhhgtg c2755feyxiexzfUjhhgtg = (C2755feyxiexzfUjhhgtg) this.f8758Ujhhgtgfeyxiexzf.get(i);
        C2764feyxiexzfUjhhgtg c2764feyxiexzfUjhhgtg = C2764feyxiexzfUjhhgtg.f8752Ujhhgtgfeyxiexzf;
        Context context = c2757feyxiexzfUjhhgtg.f3241Ujhhgtgfeyxiexzf.getContext();
        c2764feyxiexzfUjhhgtg.getClass();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        int color = Color.parseColor(MagicFactory.get(AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(context) ? 4928797644463015306L : 4928797738952295818L, strArr));
        LinearLayout linearLayout = c2757feyxiexzfUjhhgtg.f8736Ujhhgtgfeyxiexzf;
        Context context2 = linearLayout.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(MagicFactory.get(AbstractC3612feyxiexzfUjhhgtg.m5239Ujhhgtgfeyxiexzf(context2) ? 4928797592923407754L : 4928797549973734794L, strArr)));
        gradientDrawable.setCornerRadius((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(10, context2));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setOnClickListener(new ViewOnClickListenerC2974feyxiexzfUjhhgtg(1, c2755feyxiexzfUjhhgtg));
        ImageView imageView = c2757feyxiexzfUjhhgtg.f8737Ujhhgtgfeyxiexzf;
        imageView.setImageResource(c2755feyxiexzfUjhhgtg.f8728Ujhhgtgfeyxiexzf);
        imageView.setImageTintList(AbstractC1252feyxiexzfUjhhgtg.m2782Ujhhgtgfeyxiexzf(color));
        C2766feyxiexzfUjhhgtg c2766feyxiexzfUjhhgtg = C2766feyxiexzfUjhhgtg.f8759Ujhhgtgfeyxiexzf;
        imageView.setVisibility(c2766feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf() == EnumC2756feyxiexzfUjhhgtg.f8731Ujhhgtgfeyxiexzf.f8735Ujhhgtgfeyxiexzf ? 8 : 0);
        TextView textView = c2757feyxiexzfUjhhgtg.f8738Ujhhgtgfeyxiexzf;
        textView.setText(c2755feyxiexzfUjhhgtg.f8729Ujhhgtgfeyxiexzf);
        textView.setTextColor(color);
        textView.setVisibility(c2766feyxiexzfUjhhgtg.m4619Ujhhgtgfeyxiexzf() == EnumC2756feyxiexzfUjhhgtg.f8733Ujhhgtgfeyxiexzf.f8735Ujhhgtgfeyxiexzf ? 8 : 0);
    }

    @Override // p000.AbstractC0795feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final AbstractC0821feyxiexzfUjhhgtg mo2141Ujhhgtgfeyxiexzf(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        C0825feyxiexzfUjhhgtg c0825feyxiexzfUjhhgtg = new C0825feyxiexzfUjhhgtg(-2, -2);
        ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).leftMargin = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(3, context);
        ((ViewGroup.MarginLayoutParams) c0825feyxiexzfUjhhgtg).rightMargin = (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(3, context);
        linearLayout.setLayoutParams(c0825feyxiexzfUjhhgtg);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding((int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(6, context), (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(3, context), (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(6, context), (int) AbstractC3612feyxiexzfUjhhgtg.m5234Ujhhgtgfeyxiexzf(3, context));
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        return new C2757feyxiexzfUjhhgtg(linearLayout, imageView, textView);
    }
}

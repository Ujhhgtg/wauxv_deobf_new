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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᲁᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0649 extends AbstractC2537 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ArrayList f2524 = new ArrayList();

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final int mo2124() {
        return this.f2524.size();
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2125(AbstractC2563 abstractC2563, int i) {
        C0648 c0648 = (C0648) abstractC2563;
        C0646 c0646 = (C0646) this.f2524.get(i);
        C0653 c0653 = C0653.f2528;
        Context context = c0648.f8157.getContext();
        c0653.getClass();
        String[] strArr = AbstractC1471.f5234;
        int color = Color.parseColor(MagicFactory.get(AbstractC2234.m4176(context) ? -635431821507203L : -635474771180163L, strArr));
        LinearLayout linearLayout = c0648.f2521;
        Context context2 = linearLayout.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(MagicFactory.get(AbstractC2234.m4176(context2) ? -635345922161283L : -635388871834243L, strArr)));
        gradientDrawable.setCornerRadius((int) AbstractC2234.m4163(10, context2));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0111(c0646, 1));
        ImageView imageView = c0648.f2522;
        imageView.setImageResource(c0646.f2517);
        imageView.setImageTintList(AbstractC0738.m2266(color));
        C0650 c0650 = C0650.f2525;
        imageView.setVisibility(c0650.m2662() == EnumC0645.f2512.f2516 ? 8 : 0);
        TextView textView = c0648.f2523;
        textView.setText(c0646.f2518);
        textView.setTextColor(color);
        textView.setVisibility(c0650.m2662() == EnumC0645.f2514.f2516 ? 8 : 0);
    }

    @Override // p000.AbstractC2537
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final AbstractC2563 mo2126(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        C2547 c2547 = new C2547(-2, -2);
        ((ViewGroup.MarginLayoutParams) c2547).leftMargin = (int) AbstractC2234.m4163(3, context);
        ((ViewGroup.MarginLayoutParams) c2547).rightMargin = (int) AbstractC2234.m4163(3, context);
        linearLayout.setLayoutParams(c2547);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding((int) AbstractC2234.m4163(6, context), (int) AbstractC2234.m4163(3, context), (int) AbstractC2234.m4163(6, context), (int) AbstractC2234.m4163(3, context));
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        return new C0648(linearLayout, imageView, textView);
    }
}

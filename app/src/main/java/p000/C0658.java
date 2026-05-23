package p000;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲀᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0658 extends AbstractC2482 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final List f2522;

    public C0658(List list) {
        this.f2522 = list;
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final int mo2040() {
        return this.f2522.size();
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2041(AbstractC2508 abstractC2508, int i) {
        C0657 c0657 = (C0657) abstractC2508;
        C0655 c0655 = (C0655) this.f2522.get(i);
        C0663 c0663 = C0663.f2533;
        Context context = c0657.f8006.getContext();
        
        String[] strArr = AbstractC1574.f5469;
        int color = Color.parseColor(MagicFactory.get(AbstractC3681.m5331(context) ? -611023522364084L : -611066472037044L, strArr));
        LinearLayout linearLayout = c0657.f2519;
        Context context2 = linearLayout.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor(MagicFactory.get(AbstractC3681.m5331(context2) ? -610937623018164L : -610980572691124L, strArr)));
        gradientDrawable.setCornerRadius((int) AbstractC3681.m5322(10, context2));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0103(1, c0655));
        ImageView imageView = c0657.f2520;
        imageView.setImageResource(c0655.f2515);
        imageView.setImageTintList(AbstractC1460.m3212(color));
        C0659 c0659 = C0659.f2523;
        imageView.setVisibility(c0659.m2538() == EnumC0654.f2510.f2514 ? 8 : 0);
        TextView textView = c0657.f2521;
        textView.setText(c0655.f2516);
        textView.setTextColor(color);
        textView.setVisibility(c0659.m2538() == EnumC0654.f2512.f2514 ? 8 : 0);
    }

    @Override // p000.AbstractC2482
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final AbstractC2508 mo2042(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        C2492 c2492 = new C2492(-2, -2);
        ((ViewGroup.MarginLayoutParams) c2492).leftMargin = (int) AbstractC3681.m5322(3, context);
        ((ViewGroup.MarginLayoutParams) c2492).rightMargin = (int) AbstractC3681.m5322(3, context);
        linearLayout.setLayoutParams(c2492);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding((int) AbstractC3681.m5322(6, context), (int) AbstractC3681.m5322(3, context), (int) AbstractC3681.m5322(6, context), (int) AbstractC3681.m5322(3, context));
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        return new C0657(linearLayout, imageView, textView);
    }
}

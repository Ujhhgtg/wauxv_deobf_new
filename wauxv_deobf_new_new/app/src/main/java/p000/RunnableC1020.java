package p000;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲁᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1020 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f3725;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3726;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f3727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3728;

    public /* synthetic */ RunnableC1020(Object obj, int i, Object obj2, int i2) {
        this.f3725 = i2;
        this.f3727 = obj;
        this.f3726 = i;
        this.f3728 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3725) {
            case 0:
                C1021 c1021 = (C1021) this.f3727;
                c1021.f3730.mo3554(this.f3726, this.f3728);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f3727;
                C2735 c2735 = (C2735) this.f3728;
                int i = this.f3726;
                AbstractC2563 abstractC2563M228 = recyclerView.m228(i);
                if (abstractC2563M228 != null && abstractC2563M228.m4533() == i) {
                    View view = abstractC2563M228.f8157;
                    if (view.isAttachedToWindow() && view.getWidth() > 0 && view.getHeight() > 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(c2735.f8763.getColor(R.color.md_theme_primaryContainer));
                        colorDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
                        view.getOverlay().add(colorDrawable);
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(colorDrawable, "alpha", 0, Opcodes.FCMPG, 0, Opcodes.FCMPG, 0);
                        objectAnimatorOfInt.addListener(new C2732(view, colorDrawable));
                        objectAnimatorOfInt.setDuration(900L);
                        objectAnimatorOfInt.start();
                        break;
                    }
                }
                break;
        }
    }
}

package p000;

import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲁᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1017 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3718;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3720;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f3721;

    public /* synthetic */ RunnableC1017(Object obj, int i, Object obj2, int i2) {
        this.f3718 = i2;
        this.f3720 = obj;
        this.f3719 = i;
        this.f3721 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3718) {
            case 0:
                C1018 c1018 = (C1018) this.f3720;
                c1018.f3723.mo3485(this.f3719, this.f3721);
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f3720;
                C2675 c2675 = (C2675) this.f3721;
                int i = this.f3719;
                AbstractC2508 abstractC2508M228 = recyclerView.m228(i);
                if (abstractC2508M228 != null && abstractC2508M228.m4511() == i) {
                    View view = abstractC2508M228.f8006;
                    if (view.isAttachedToWindow() && view.getWidth() > 0 && view.getHeight() > 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(c2675.f8605.getColor(R.color.md_theme_primaryContainer));
                        colorDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
                        view.getOverlay().add(colorDrawable);
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(colorDrawable, "alpha", 0, 150, 0, 150, 0);
                        objectAnimatorOfInt.addListener(new C2672(view, colorDrawable));
                        objectAnimatorOfInt.setDuration(900L);
                        objectAnimatorOfInt.start();
                        break;
                    }
                }
                break;
        }
    }
}

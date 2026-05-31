package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᤝᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0349 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1728;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ View f1729;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0034 f1730;

    public /* synthetic */ RunnableC0349(View view, AbstractC0034 abstractC0034, int i) {
        this.f1728 = i;
        this.f1729 = view;
        this.f1730 = abstractC0034;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1728) {
            case 0:
                View view = this.f1729;
                ViewParent parent = view.getParent();
                AbstractC0034 abstractC0034 = this.f1730;
                if (parent == abstractC0034.m900()) {
                    AbstractC0034.m878(((AbstractC0034) view.getTag()).mo895() + "已处于显示状态，请勿重复执行 show() 指令。");
                } else {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    abstractC0034.m900().addView(view);
                }
                break;
            default:
                View view2 = this.f1729;
                if (view2.getParent() == null || !(view2.getParent() instanceof ViewGroup)) {
                    AbstractC0034 abstractC0035 = this.f1730;
                    if (abstractC0035.m900() != null) {
                        abstractC0035.m900().removeView(view2);
                    }
                } else {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                if (AbstractC0034.f971 != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC0034.f971);
                    for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                        AbstractC0034 abstractC0036 = (AbstractC0034) copyOnWriteArrayList.get(size);
                        if (abstractC0036.m898() == AbstractC0034.m884() && abstractC0036.f982 && abstractC0036.m897() != null) {
                            View viewFindViewById = abstractC0036.m897().findViewById(R.id.box_root);
                            if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).f1001) {
                                viewFindViewById.requestFocus();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}

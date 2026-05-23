package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.kongzue.dialogx.interfaces.AbstractC0027;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0374 implements Runnable {

    public final /* synthetic */ int f1757;

    public final /* synthetic */ View f1758;

    public final /* synthetic */ AbstractC0027 f1759;

    public /* synthetic */ RunnableC0374(View view, AbstractC0027 abstractC0027, int i) {
        this.f1757 = i;
        this.f1758 = view;
        this.f1759 = abstractC0027;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1757) {
            case 0:
                View view = this.f1758;
                ViewParent parent = view.getParent();
                AbstractC0027 abstractC0027 = this.f1759;
                if (parent == abstractC0027.m756()) {
                    AbstractC0027.m734(((AbstractC0027) view.getTag()).mo751() + "已处于显示状态，请勿重复执行 show() 指令。");
                } else {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    abstractC0027.m756().addView(view);
                }
                break;
            default:
                View view2 = this.f1758;
                if (view2.getParent() == null || !(view2.getParent() instanceof ViewGroup)) {
                    AbstractC0027 abstractC0028 = this.f1759;
                    if (abstractC0028.m756() != null) {
                        abstractC0028.m756().removeView(view2);
                    }
                } else {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                if (AbstractC0027.f905 != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC0027.f905);
                    for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                        AbstractC0027 abstractC0029 = (AbstractC0027) copyOnWriteArrayList.get(size);
                        if (abstractC0029.m754() == AbstractC0027.m740() && abstractC0029.f916 && abstractC0029.m753() != null) {
                            View viewFindViewById = abstractC0029.m753().findViewById(R.id.box_root);
                            if ((viewFindViewById instanceof DialogXBaseRelativeLayout) && ((DialogXBaseRelativeLayout) viewFindViewById).f935) {
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

package p000;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᲇᲀᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3653 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Field field = AbstractC3638.f11333;
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

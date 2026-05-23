package p000;

import android.transition.Transition;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1950 {
    public static void m3783(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void m3784(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}

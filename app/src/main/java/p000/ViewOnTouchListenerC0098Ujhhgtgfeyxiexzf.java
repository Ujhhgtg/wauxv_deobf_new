package p000;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ要点脸能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0098Ujhhgtgfeyxiexzf implements View.OnTouchListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1208Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f1209Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnTouchListenerC0098Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f1208Ujhhgtgfeyxiexzf = i;
        this.f1209Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f1208Ujhhgtgfeyxiexzf) {
            case 0:
                AbstractC0253Ujhhgtgfeyxiexzf abstractC0253Ujhhgtgfeyxiexzf = (AbstractC0253Ujhhgtgfeyxiexzf) this.f1209Ujhhgtgfeyxiexzf;
                RunnableC0102Ujhhgtgfeyxiexzf runnableC0102Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf.f1600Ujhhgtgfeyxiexzf;
                Handler handler = abstractC0253Ujhhgtgfeyxiexzf.f1604Ujhhgtgfeyxiexzf;
                C2351Ujhhgtgfeyxiexzf c2351Ujhhgtgfeyxiexzf = abstractC0253Ujhhgtgfeyxiexzf.f1608Ujhhgtgfeyxiexzf;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c2351Ujhhgtgfeyxiexzf != null && c2351Ujhhgtgfeyxiexzf.isShowing() && x >= 0 && x < c2351Ujhhgtgfeyxiexzf.getWidth() && y >= 0 && y < c2351Ujhhgtgfeyxiexzf.getHeight()) {
                    handler.postDelayed(runnableC0102Ujhhgtgfeyxiexzf, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(runnableC0102Ujhhgtgfeyxiexzf);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.f1209Ujhhgtgfeyxiexzf).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}

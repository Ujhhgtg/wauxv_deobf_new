package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3093Ujhhgtgfeyxiexzf extends C2343Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final float f9592Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Rect f9593Ujhhgtgfeyxiexzf;

    public C3093Ujhhgtgfeyxiexzf(Context context, float f) {
        super(context);
        this.f9592Ujhhgtgfeyxiexzf = f;
        this.f9593Ujhhgtgfeyxiexzf = new Rect();
    }

    private final Rect getDecreasedHitRect() {
        float width = getWidth();
        float f = this.f9592Ujhhgtgfeyxiexzf;
        float f2 = (width - f) / 2.0f;
        float height = (getHeight() - f) / 2.0f;
        int i = (int) f2;
        int i2 = (int) height;
        int width2 = (int) (getWidth() - f2);
        int height2 = (int) (getHeight() - height);
        Rect rect = this.f9593Ujhhgtgfeyxiexzf;
        rect.set(i, i2, width2, height2);
        return rect;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || getDecreasedHitRect().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}

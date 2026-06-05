package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2781feyxiexzfUjhhgtg extends AbstractC0826feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Paint f8788Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f8789Ujhhgtgfeyxiexzf;

    public C2781feyxiexzfUjhhgtg() {
        Paint paint = new Paint();
        this.f8788Ujhhgtgfeyxiexzf = paint;
        this.f8789Ujhhgtgfeyxiexzf = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.AbstractC0826feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo2000Ujhhgtgfeyxiexzf(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f8788Ujhhgtgfeyxiexzf;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f8789Ujhhgtgfeyxiexzf.iterator();
        while (it.hasNext()) {
            ((AbstractC0152Ujhhgtgfeyxiexzf) it.next()).getClass();
            paint.setColor(AbstractC2857Ujhhgtgfeyxiexzf.m4259Ujhhgtgfeyxiexzf(-65281, -16776961, 0.0f));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m811feyxiexzfUjhhgtg()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f729Ujhhgtgfeyxiexzf.mo1992Ujhhgtgfeyxiexzf(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f729Ujhhgtgfeyxiexzf.mo1988Ujhhgtgfeyxiexzf(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f729Ujhhgtgfeyxiexzf.mo1989Ujhhgtgfeyxiexzf(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f729Ujhhgtgfeyxiexzf.mo1990Ujhhgtgfeyxiexzf(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}

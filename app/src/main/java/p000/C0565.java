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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0565 extends AbstractC2488 {

    public final Paint f2296;

    public final List f2297;

    public C0565() {
        Paint paint = new Paint();
        this.f2296 = paint;
        this.f2297 = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p000.AbstractC2488
    public final void mo1959(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f2296;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f2297.iterator();
        while (it.hasNext()) {
            
            paint.setColor(AbstractC0752.m2223(-65281, -16776961, 0.0f));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m668()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f656.mo1964(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f656.mo1960(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).f656.mo1961(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).f656.mo1962(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}

package p000;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤞᛸᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3465 extends FrameLayout {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static WeakReference f10900;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Paint f10901;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Path f10902;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public float f10903;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public float f10904;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public float f10905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public float f10906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public float f10907;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public float f10908;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public float f10909;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean f10910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f10911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ImageView f10912;

    public C3465(Activity activity) {
        super(activity, null, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-1224624);
        this.f10901 = paint;
        this.f10902 = new Path();
        this.f10907 = 500.0f;
        this.f10908 = 100.0f;
        this.f10909 = 16.0f;
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        double d = 2;
        float f = ((-((float) Math.sqrt(((float) Math.pow(this.f10904 - this.f10908, d)) + ((float) Math.pow(this.f10903 - this.f10907, d))))) / 15) + 16.0f;
        this.f10909 = f;
        this.f10910 = f < 5.0f;
        double dAtan = (float) Math.atan((this.f10904 - this.f10908) / (this.f10903 - this.f10907));
        float fSin = this.f10909 * ((float) Math.sin(dAtan));
        float fCos = this.f10909 * ((float) Math.cos(dAtan));
        Path path = this.f10902;
        path.reset();
        path.moveTo(this.f10907 - fSin, this.f10908 + fCos);
        path.quadTo(this.f10905, this.f10906, this.f10903 - fSin, this.f10904 + fCos);
        path.lineTo(this.f10903 + fSin, this.f10904 - fCos);
        path.quadTo(this.f10905, this.f10906, this.f10907 + fSin, this.f10908 - fCos);
        path.close();
        if (!this.f10910 && this.f10911 && this.f10912 != null) {
            Paint paint = this.f10901;
            canvas.drawPath(path, paint);
            canvas.drawCircle(this.f10907, this.f10908, this.f10909, paint);
            canvas.drawCircle(this.f10903, this.f10904, this.f10909, paint);
        }
        super.onDraw(canvas);
    }
}
